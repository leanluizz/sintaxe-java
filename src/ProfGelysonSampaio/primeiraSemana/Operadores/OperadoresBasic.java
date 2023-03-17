package ProfGelysonSampaio.primeiraSemana.Operadores;

public class OperadoresBasic {
    public static void main (String [] args){
        System.out.println(OperadoresAritimeticos(5, 2, "+"));
        System.out.println(OperadoresAritimeticos(10, 8, "-"));
    }
    public static int OperadoresAritimeticos(int n1, int n2, String op){

        int result = 0;
        switch (op) {
            case "+" :
                return result += n1 + n2;
            case "-":
                return result += n1 - n2;
            case "*":
                return result += n1 * n2;
            case ":":
                return result += n1 / n2;
            default:
                break;
        }
        return result;
    }
}
