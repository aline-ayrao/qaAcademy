package Easy;

import javax.swing.JOptionPane;

public class Execucao {
    
    public static void main(String[] args) {
        // Exercicio02_easy exercicio02_easy = new Exercicio02_easy();
        // String palavra = exercicio02_easy.retornaPalavra("Aline Ayrão");
        // System.out.println(palavra);
        //System.out.println(exercicio02_easy.retornaPalavra("Aline Ayrão"));

        // String primeiroValor = JOptionPane.showInputDialog("Digite um valor");
        // String segundoValor = JOptionPane.showInputDialog("Digite outro valor");
        // Exercicio03_easy exercicio03_easy = new Exercicio03_easy();
        // System.out.println(exercicio03_easy.retornaValorTrocado(primeiroValor, segundoValor));

       String numeroDigitadoUsuario = JOptionPane.showInputDialog("Digite um numero");
       int numeroDigitado = Integer.parseInt(numeroDigitadoUsuario);
       Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
       System.out.println(exercicio04_easy.calcularDobro(numeroDigitado));
       
    }
}
