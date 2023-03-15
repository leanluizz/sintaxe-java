package ProfGelysonSampaio.primeiraSemana.Variaveis;

public class VariaveisMatématicas {
    public static void main (String [] args){
        byte Byte = 22;  // Aceita até 2 números não decimais
        short Short = 3333;  // Aceita até 4 números não decimais
        long Long = 444444444; // Aceita até 9 números não decimais
        int Inteiro = 1111111111; // Aceita até 10 número não decimal

        float Float = 5.5f;
        double Decimal = 6.6;

        int Nulo; // ERRO pois ele retornara null
        int CEP = 0363000; // Nunca comece um inteiro com 0
       // long CPF = 02838782334; // Tipo long não aceita começar com 0

        int numero1 = 1;
        //short numero = numero1; // JAVA é fortemente tipado nunca mescle os tipos de variaveis sem usar o cast que vem no exemplo logo abaixo

        int numero2 = 2;
        short cast = (short) numero2; 
        System.out.println("Variavel numero2 é igual a = " + cast);
        System.out.println(CEP); // Output: 124416
    }
}
