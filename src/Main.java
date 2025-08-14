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
    }
}