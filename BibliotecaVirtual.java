import java.util.ArrayList;

public class BibliotecaVirtual {
    private static ArrayList<String> nombresLivros = new ArrayList<>();
    private static ArrayList<String> autores = new ArrayList<>();
    private static ArrayList<Integer> anosPublicacao = new ArrayList<>();

    // Função principal
    public static void main(String[] args) {
        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Detalhes do livro");
            System.out.println("4 - Sair");

            int escolha = Integer.parseInt(System.console().readLine());

            switch (escolha) {
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    detalhesLivro();
                    break;
                case 4:
                    System.out.println("Encerrando sistema...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    // Função para adicionar livro
    private static void adicionarLivro() {
        System.out.println("Digite o nome do livro:");
        String nome = System.console().readLine();
        System.out.println("Digite o autor do livro:");
        String autor = System.console().readLine();
        System.out.println("Digite o ano de publicação do livro:");
        int ano = Integer.parseInt(System.console().readLine());

        nombresLivros.add(nome);
        autores.add(autor);
        anosPublicacao.add(ano);

        System.out.println("Livro adicionado com sucesso!");
    }

    // Função para listar livros
    private static void listarLivros() {
        if (nombresLivros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado ainda.");
        } else {
            System.out.println("Lista de livros cadastrados:");
            for (int i = 0; i < nombresLivros.size(); i++) {
                System.out.println((i + 1) + " - " + nombresLivros.get(i));
            }
        }
    }

    // Função para detalhar livro
    private static void detalhesLivro() {
        if (nombresLivros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado ainda.");
            return;
        }

        System.out.println("Digite o número do livro que deseja detalhar:");
        int numeroLivro = Integer.parseInt(System.console().readLine());
        if (numeroLivro < 1 || numeroLivro > nombresLivros.size()) {
            System.out.println("Número de livro inválido.");
            return;
        }

        String nome = nombresLivros.get(numeroLivro - 1);
        String autor = autores.get(numeroLivro - 1);
        int ano = anosPublicacao.get(numeroLivro - 1);

        System.out.println("Detalhes do livro:");
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + ano);
    }
}
