package Medium;

import javax.swing.JOptionPane;

public class Execucao {
    public static void main(String[] args) {
        // Exercicio01_medium exercicio01_medium = new Exercicio01_medium();
        // exercicio01_medium.exibeParOuImpar();

        Exercicio02_medium exercicio02_medium = new Exercicio02_medium();
        double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
        double valorJuros, valorTotal;
        valorJuros = exercicio02_medium.calculaInvestimentoJurosCompostos(valorInvestimento);
        valorTotal = exercicio02_medium.calculaValorTotalInvestimento(valorInvestimento,valorJuros);
        
        System.out.println("O valor do investimento é: R$"+ valorInvestimento);

        System.out.println("O valor do juros é: R$"+(valorJuros));

        System.out.println("O valor total do investimento: R$"+ (valorJuros + valorInvestimento));


    }

}