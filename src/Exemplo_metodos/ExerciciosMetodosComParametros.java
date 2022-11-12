package Exemplo_metodos;

public class ExerciciosMetodosComParametros {
    public static void main(String[] args) {
        System.out.println(exibirNomeEIdade(36, "Aline"));
        System.out.println(retornarPalavra("teste"));
        System.out.println(retornarDobro(10));
        System.out.println(retornarNomeSobrenome("Aline", "Ayrão"));
        System.out.println(retornarSalario("Aline"));

        //sem retorno
        exibirNomeEIdadeSemRetorno(33, "Aline");
        retornarPalavraSemRetorno("teste");
        retornarDobroSemRetorno(10);
        retornarNomeSobrenomeSemRetorno("Aline", "Ayrão");
        retornarSalarioSemRetorno("Aline");
    }
    public static String exibirNomeEIdade(int idade, String nome){
        return "Nome: "+nome + " - Idade: "+idade;
    }
    public static String retornarPalavra(String palavra){
        return palavra;
    }
    public static int retornarDobro(int numero){
        return numero*2;
    }
    public static String retornarNomeSobrenome(String nome, String sobrenome){
        return nome + " "+sobrenome;
    }
    public static double retornarSalario(String nome){
        return 2000.00;
    }
    //mais 5 sem retorno
    public static void exibirNomeEIdadeSemRetorno(int idade, String nome){
        System.out.println("Nome: "+nome + " - Idade: "+idade);
    }
    public static void retornarPalavraSemRetorno(String palavra){
        System.out.println( palavra);
    }
    public static void retornarDobroSemRetorno(int numero){
        System.out.println( numero*2);
    }
    public static void retornarNomeSobrenomeSemRetorno(String nome, String sobrenome){
        System.out.println( nome + " "+sobrenome);
    }
    public static void retornarSalarioSemRetorno(String nome){
        System.out.println( 2000.00);
    }
}
