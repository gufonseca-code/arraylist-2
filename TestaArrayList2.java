import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TestaArrayList2 {

    static Scanner input = new Scanner(System.in);

    static void adiciona(ArrayList<Contato> contatos) {
        System.out.println("Insira o nome, email e telefone do contato: ");
        input.nextLine();
        String nome = input.nextLine();
        String email = input.nextLine();
        String telefone = input.nextLine();

        contatos.add(new Contato(nome, telefone, email));
    }

    static String verificarQuantidade(ArrayList<Contato> contatos) {
        return "Lista tem: " + contatos.size() + " contato(s)";
    }

    static ArrayList<Contato> imprimiContatos(ArrayList<Contato> contatos) {
        return contatos;
    }

    static Contato obterContatoPosicao(ArrayList<Contato> contatos) {
        System.out.println("Qual posição você gostaria de visualizar? ");
        input.nextLine();
        int opcao = input.nextInt();
        return contatos.get(opcao);
    }

    static String verificarSeExiste(ArrayList<Contato> contatos) {
        System.out.println("Insira o nome, email e telefone do contato: ");
        input.nextLine();
        String nome = input.nextLine();
        String email = input.nextLine();
        String telefone = input.nextLine();

        if (contatos.contains(new Contato(nome, telefone, email))) {
            return "Contato existe";
        }
        return "Contato não existe";
    }

    static void removerContato(ArrayList<Contato> contatos) {
        System.out.println("Qual a posição do contato que você gostaria de remover? ");
        input.nextLine();
        int posicao = input.nextInt();
        contatos.remove(posicao);
    }

    static void adicionaQualquerPosicao(ArrayList<Contato> contatos) {
        System.out.println("Insira o nome, email e telefone do contato: ");
        input.nextLine();
        String nome = input.nextLine();
        String email = input.nextLine();
        String telefone = input.nextLine();

        System.out.println("Insira qual posição você deseja inserir? ");
        int posicao = input.nextInt();
        contatos.add(posicao, new Contato(nome, email, telefone));
    }

    static void duplicarTamanho(ArrayList<Contato> contatos) {
        contatos.ensureCapacity(contatos.size() * 2);
    }

    static String pesquisaPorNome(ArrayList<Contato> contatos) {
        System.out.println("Qual o nome do contato que você gostaria de pesquisar? ");
        input.nextLine();
        String nome = input.nextLine();
        for (Contato contato : contatos) {
            if (Objects.equals(contato, new Contato(nome, "", ""))) {
                return contato.toString();
            }
        }
        return "Não existe";
    }

    static String pesquisaPorEmail(ArrayList<Contato> contatos) {
        System.out.println("Qual o e-mail do contato que você gostaria de pesquisar? ");
        input.nextLine();
        String email = input.nextLine();
        for (Contato contato : contatos) {
            if (Objects.equals(contato, new Contato("", "", email))) {
                return contato.toString();
            }
        }
        return "Não existe";
    }

    static String pesquisaPorTelefone(ArrayList<Contato> contatos) {
        System.out.println("Qual o telefone do contato que você gostaria de pesquisar? ");
        input.nextLine();
        String telefone = input.nextLine();
        for (Contato contato : contatos) {
            if (Objects.equals(contato, new Contato("", telefone, ""))) {
                return contato.toString();
            }
        }
        return "Não existe";
    }

    static void ordenarPorNome(ArrayList<Contato> contatos) {
        contatos.sort(Contato.CompareNome);
    }

    static void ordenarPorEmail(ArrayList<Contato> contatos) {
        contatos.sort(Contato.CompareEmail);
    }

    static void ordenarPorTelefone(ArrayList<Contato> contatos) {
        contatos.sort(Contato.CompareTelefone);
    }

    public static void main(String[] args) {

        ArrayList<Contato> lista = new ArrayList<>();
        boolean run = true;

        System.out.println("""
                ************************************************** \
                
                --------------------Bem-vindo--------------------- \
                
                ************************************************** \
                """);

        while(run) {

            System.out.println("""                   
                    \nEscolha o que deseja fazer: \
                    
                    1- Adicionar contato; \
                    
                    2- Verificar quantidade de contatos; \
                    
                    3- Imprimir contatos; \
                    
                    4- Obter contato de uma posição específica; \
                    
                    5- Verificar se existe o contato; \
                    
                    6- Adicionar contato em qualquer posição; \
                    
                    7- Duplicar tamanho de vetor; \
                    
                    8- Remover contato; \
                    
                    9- Pesquisar por nome; \
                    
                    10- Pesquisar por email; \
                    
                    11- Pesquisar por telefone; \
                    
                    12- Ordenar por nome; \
                    
                    13- Ordenar por email; \
                    
                    14- Ordenar por telefone; \
                    
                    0- Sair.\s""");
            int option = input.nextInt();


            switch (option) {
                case 1:
                    adiciona(lista);
                    break;

                case 2:
                    System.out.println(verificarQuantidade(lista));
                    break;

                case 3:
                    System.out.println(imprimiContatos(lista));
                    break;

                case 4:
                    System.out.println(obterContatoPosicao(lista));
                    break;

                case 5:
                    System.out.println(verificarSeExiste(lista));
                    break;

                case 6:
                    adicionaQualquerPosicao(lista);
                    break;

                case 7:
                    duplicarTamanho(lista);
                    break;

                case 8:
                    removerContato(lista);
                    break;

                case 9:
                    System.out.println(pesquisaPorNome(lista));
                    break;

                case 10:
                    System.out.println(pesquisaPorEmail(lista));
                    break;

                case 11:
                    System.out.println(pesquisaPorTelefone(lista));
                    break;

                case 12:
                    ordenarPorNome(lista);
                    break;

                case 13:
                    ordenarPorEmail(lista);
                    break;

                case 14:
                    ordenarPorTelefone(lista);
                    break;

                case 0:
                    run = false;
            }
        }
    }
}
