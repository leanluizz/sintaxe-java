package ProfGelysonSampaio.primeiraSemana.Operadores;

public class OperadoresDeComparacao {
    public static void main (String [] args){
        int maior = 5;
        int menor = 4;

        int five = 5;

        String right = menor < maior ? "Yeah!" : "Is not";
        String left = maior > menor ? "Yeah!" : "Is not";
        String equal = maior >= five ? "Yeah!" : "Is not";
        String isEqual = maior <= five ? "Yeah!" : "Is not";
        String difference = maior != menor ? "Yeah!" : "Is not";
        String is = maior == five ? "Yeah!" : "Is not";

        System.out.println(right);
        System.out.println(left);
        System.out.println(equal);
        System.out.println(isEqual);
        System.out.println(difference);
        System.out.println(is);
    }
}
