//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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

        System.out.println(total / 3);
    }
}