import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner input = new Scanner(System.in);
    static List<Livro> livros = new ArrayList<>();
    static int codigoLivro = 2;

    public static void conversorTemperatura(int temperatura) {
        double fahrenheit = (temperatura * 1.8) + 32;
        double kelvin = temperatura + 273.15;
        System.out.println("Celsius: " + temperatura + "ºC" + "\nFahrenheit: " + fahrenheit + "ºF" + "\nKelvin: " + kelvin + "ºK");
    }

    public static void cadastrarLivro() {
        Livro livroNovo = new Livro();
        livroNovo.codigo = codigoLivro;
        System.out.println("Digite o titulo do livro: ");
        livroNovo.titulo = input.nextLine();

        System.out.println("Digite o autor do livro: ");
        livroNovo.autor = input.nextLine();

        System.out.println("Digite o número de páginas do livro: ");
        livroNovo.numeroPaginas = input.nextInt();
        input.nextLine(); // <-- limpa o "Enter"

        System.out.println("Digite o preço do livro: ");
        livroNovo.preco = input.nextDouble();
        input.nextLine();

        System.out.println("Digite a categoria do livro: ");
        livroNovo.categoria = input.nextLine();

        System.out.println("Obrigado! Gostaria de cadastrar um novo livro? Digite 1 para SIM e 2 para NÃO \n");
        livros.add(livroNovo);
        codigoLivro++;
        if (input.nextLine().equals("1")) {
            cadastrarLivro();
        }
    }

    public static void listarLivros() {
        for(Livro livro : livros) {
            System.out.println("Codigo: " + livro.codigo + "\nTitulo: " + livro.titulo + "\nAutor: " + livro.autor + "\nNúmero de Páginas: " + livro.numeroPaginas + "\nPreço: R$" + livro.preco + "\nCategoria: "  + livro.categoria + "\n");
        }
    }

    public static void atualizarLivro() {
        System.out.println("Digite o código do livro que quer atualizar: ");
        int codigoDesejado = input.nextInt();
        input.nextLine();
        Livro livroSelecionado = livros.get(codigoDesejado);

        System.out.println("Este é o livro selecionado ? Digite 1 para SIM e 2 para NÃO! \n" + livroSelecionado.titulo);

        if(!input.nextLine().equals("1")) {
            atualizarLivro();
        }

        System.out.println("Digite o novo titulo do livro: ");
        livroSelecionado.titulo = input.nextLine();

        System.out.println("Digite o novo autor do livro: ");
        livroSelecionado.autor = input.nextLine();

        System.out.println("Digite o novo número de páginas do livro: ");
        livroSelecionado.numeroPaginas = input.nextInt();
        input.nextLine();

        System.out.println("Digite o novo preço do livro: ");
        livroSelecionado.preco = input.nextDouble();
        input.nextLine();

        System.out.println("Digite a nova categoria do livro: ");
        livroSelecionado.categoria = input.nextLine();

        int idx = codigoDesejado;
        if (idx >= 0 && idx < livros.size()) {
            livros.set(idx, livroSelecionado);
        } else {
            System.out.println("Índice fora dos limites.");
        }
    }

    public static void deletarLivro() {
        System.out.println("Digite o código do livro que quer deletar: ");
        int codigoDesejado = input.nextInt();
        int idx = codigoDesejado;
        if (idx >= 0 && idx < livros.size()) {
            livros.remove(idx);
            System.out.println("Livro removido com sucesso!");
        }
    }

    public static void main(String[] args) {
        int quantidadePassos = 500;
        double alturaEmMetros = 1.50;
        String nome = "Thayná";
//        int alturaEmCentimetros = 150;
//        alturaEmMetros = alturaEmCentimetros;
//        System.out.println(alturaEmMetros / 100);
        String sugestao = "";
        if(quantidadePassos < 100) {
            sugestao = "Sugiro que você tente aumentar a meta!";
            System.out.println(sugestao);
        } else {
            sugestao = "Parabéns";
        }
        //Testando classes
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Thayná";
        pessoa.altura = 1.50;
        pessoa.idade = 17;
        pessoa.peso = 70.00;
        pessoa.sexo = 'F';
        System.out.println("Nome: " + pessoa.nome + "\nAltura: " + pessoa.altura + "\nIdade: " + pessoa.idade + "\nSexo: " + pessoa.sexo + "\nPeso: " + pessoa.peso);

        //Testando conversão de tipos
        double valorVendaDouble = 19.5;
        int valorVendaInteger = (int) valorVendaDouble;
        System.out.println(valorVendaInteger);

        //Testando calculos
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.0;
        double total = nota1 + nota2 + nota3;

        System.out.println("Média: " + total / 3);

        //Testando Métodos
        conversorTemperatura(20);

        //Utilizando entrada de dados do usuário e criando um CRUD

        Livro livro1 = new Livro();
        livro1.codigo = 0;
        livro1.titulo = "Ordem Paranormal: Iniciação";
        livro1.autor = "Cellbit";
        livro1.numeroPaginas = 257;
        livro1.preco = 160.00;
        livro1.categoria = "Mistério";

        livros.add(livro1);

        Livro livro2 = new Livro();
        livro2.codigo = 1;
        livro2.titulo = "Ordem Paranormal: O Segredo Na Floresta";
        livro2.autor = "Cellbit";
        livro2.numeroPaginas = 257;
        livro2.preco = 160.00;
        livro2.categoria = "Mistério";

        livros.add(livro2);

//        int opcao;
//
//        do {
//            System.out.println("--- Menu CRUD do Livro ---");
//            System.out.println("1 - Criar");
//            System.out.println("2 - Listar");
//            System.out.println("3 - Atualizar");
//            System.out.println("4 - Deletar");
//            System.out.println("0 - Sair");
//            System.out.print("Escolha: ");
//            opcao = input.nextInt();
//            input.nextLine(); // limpa o buffer
//
//            switch (opcao) {
//                case 1 -> cadastrarLivro();
//                case 2 -> listarLivros();
//                case 3 -> atualizarLivro();
//                case 4 -> deletarLivro();
//                case 0 -> System.out.println("Saindo...");
//                default -> System.out.println("Opção inválida!");
//            }
//        } while (opcao != 0);
//
//        input.close();
        List<Produto> produtos = new ArrayList<>();
        Produto p1 = new Produto();
        p1.nome = "Cookies";
        p1.descricao = "Cookies deliciosos";
        p1.preco = 50.00;

        Produto p2 = new Produto();
        p2.nome = "Suco de Maçã";
        p2.descricao = "Suco favorito da Sarinha";
        p2.preco = 60.00;

        Produto p3 = new Produto();
        p3.nome = "Suco de Maracujá";
        p3.descricao = "Suco favorito da Gu";
        p3.preco = 250.00;

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        List<Produto> economico = new ArrayList<>();
        List<Produto> intermediario = new ArrayList<>();
        List<Produto> premium = new ArrayList<>();

        //Aplicando o for em arrays de objetos
        for (Produto produto : produtos) {
            if(produto.preco <= 50) economico.add(produto);
            if(produto.preco > 50.01 && produto.preco <= 200) intermediario.add(produto);
            if(produto.preco > 200)  premium.add(produto);
        }
        for (Produto produto : economico) {
            System.out.println("\nItens ecônomicos: " + "\nNome: " + produto.nome + "\nDescrição: " +  produto.descricao + "\nPreço: R$" + produto.preco);
        }
        for (Produto produto : intermediario) {
            System.out.println("\nItens intemediário: " + "\nNome: " + produto.nome + "\nDescrição: " +  produto.descricao + "\nPreço: R$" + produto.preco);
        }
        for (Produto produto : premium) {
            System.out.println("\nItens premium: " + "\nNome: " + produto.nome + "\nDescrição: " +  produto.descricao + "\nPreço: R$" + produto.preco);
        }
    }
}