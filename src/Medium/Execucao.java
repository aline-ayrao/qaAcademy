package Medium;

import javax.swing.JOptionPane;

public class Execucao {
    public static void main(String[] args) {
        // Exercicio01_medium exercicio01_medium = new Exercicio01_medium();
        // exercicio01_medium.exibeParOuImpar();

        // Exercicio02_medium exercicio02_medium = new Exercicio02_medium();
        // double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
        // double valorJuros, valorTotal;
        // valorJuros = exercicio02_medium.calculaInvestimentoJurosCompostos(valorInvestimento);
        // valorTotal = exercicio02_medium.calculaValorTotalInvestimento(valorInvestimento,valorJuros);
        
        // System.out.println("O valor do investimento é: R$"+ valorInvestimento);
        // System.out.println("O valor do juros é: R$"+(valorJuros));
        // System.out.println("O valor total do investimento: R$"+ (valorJuros + valorInvestimento));

        // Exercicio03_medium exercicio03_medium = new Exercicio03_medium();
        // exercicio03_medium.somaNumerosAcumulados();

        // Exercicio04_medium exercicio04_medium = new Exercicio04_medium();
        // exercicio04_medium.multiplicacaoNumerosAteMil();

        Exercicio05_medium exercicio05_medium = new Exercicio05_medium();
        int menorNumero = exercicio05_medium.exibeMenorNumero();
                System.out.println("O numero: " + menorNumero + " é o menor.");
    }

}
