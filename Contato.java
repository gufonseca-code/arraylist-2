import java.util.Comparator;

public class Contato implements Comparable<Contato> {
    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return " [Nome: " + getNome() + ", Telefone: " + getTelefone() + ", e-mail: " + getEmail() + "]";
    }  

    public static Comparator<Contato> CompareNome = (o1, o2) -> {
        String nome1 = o1.getNome().toUpperCase();
        String nome2 = o2.getNome().toUpperCase();

        return nome1.compareTo(nome2);
    };

    public static Comparator<Contato> CompareEmail = (o1, o2) -> {
        String email1 = o1.getEmail().toUpperCase();
        String email2 = o2.getEmail().toUpperCase();

        return email1.compareTo(email2);
    };

    public static Comparator<Contato> CompareTelefone = (o1, o2) -> {
        int telefone1 = Integer.parseInt(o1.getTelefone());
        int telefone2 = Integer.parseInt(o2.getTelefone());

        return telefone1 - telefone2;
    };

    /*
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Contato outro = (Contato) obj;

        if (nome == null) {
            if (outro.nome != null) {
                return false;
            }
        } 
        else if (!nome.equals(outro.nome)) {
                return false;
        }

        if (email == null) {
            if (outro.email != null) {
                return false;
            }
        }
        else if (!email.equals(outro.email)) {
                return false;
        }
        
        if (telefone == null) {
            if (outro.telefone != null) {
                return false;
            }
        }
        else if (!telefone.equals(outro.telefone)) {
                return false;
        }

        return true;
    }
*/

     // Método equals sobrecarregado para comparar por tipo (nome, email ou telefone)
     @Override
     public boolean equals(Object obj) {
         if (this == obj) {
             return true;
         }
         if (obj == null || getClass() != obj.getClass()) {
             return false;
         }
         Contato outro = (Contato) obj;
 
         // Aqui você pode alterar a lógica para definir qual critério deseja usar na comparação
         // Exemplo: comparar pelo nome
         return this.nome.equalsIgnoreCase(outro.getNome()) ||
                this.email.equalsIgnoreCase(outro.getEmail()) ||
                this.telefone.equals(outro.getTelefone());
     }

    // Implementação da interface Comparable, comparando o nome dos contatos
    @Override
    public int compareTo(Contato outro) {
        return this.nome.compareToIgnoreCase(outro.getNome());  // Ordena por nome de forma case-insensitive
    }


}
