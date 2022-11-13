package Easy;

import javax.swing.JOptionPane;

public class Execucao {

    public static void main(String[] args) {
        // Exercicio02_easy exercicio02_easy = new Exercicio02_easy();
        // String palavra = exercicio02_easy.retornaPalavra("Aline Ayrão");
        // System.out.println(palavra);
        // System.out.println(exercicio02_easy.retornaPalavra("Aline Ayrão"));

        // String primeiroValor = JOptionPane.showInputDialog("Digite um valor");
        // String segundoValor = JOptionPane.showInputDialog("Digite outro valor");
        // Exercicio03_easy exercicio03_easy = new Exercicio03_easy();
        // System.out.println(exercicio03_easy.retornaValorTrocado(primeiroValor,
        // segundoValor));

        // String numeroDigitadoUsuario = JOptionPane.showInputDialog("Digite um
        // numero");
        // int numeroDigitado = Integer.parseInt(numeroDigitadoUsuario);
        // Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
        // System.out.println(exercicio04_easy.calcularDobro(numeroDigitado));

        // String dig1 = JOptionPane.showInputDialog("Digite o primeiro numero");
        // String dig2 = JOptionPane.showInputDialog("Digite o segungo numero");
        // String dig3 = JOptionPane.showInputDialog("Digite o terceiro numero");

        // int num1 = Integer.parseInt(dig1);
        // int num2 = Integer.parseInt(dig2);
        // int num3 = Integer.parseInt(dig3);

        // Exercicio05_easy exercicio05_easy = new Exercicio05_easy();
        // System.out.println("A Soma é: " + exercicio05_easy.soma(num1, num2, num3));
        // System.out.println("A subtração é: " + exercicio05_easy.subtracao(num1, num2,
        // num3));
        // System.out.println("A multiplicação é: " +
        // exercicio05_easy.multiplicacao(num1, num2, num3));
        // int soma = exercicio05_easy.soma(num1, num2, num3);
        // System.out.println("A média é: " + exercicio05_easy.media(soma));

        String nota1Stg, nota2Stg;
        nota1Stg = JOptionPane.showInputDialog("Por Favor Digite a primeira nota");
        nota2Stg = JOptionPane.showInputDialog("Por Favor Digite a segunda nota");

        double nota1 = Double.parseDouble(nota1Stg);
        double nota2 = Double.parseDouble(nota2Stg);

        Exercicio06_easy exercicio06_easy = new Exercicio06_easy();
        System.out.println(exercicio06_easy.verificaAprovacao(nota1, nota2));

    }
}
