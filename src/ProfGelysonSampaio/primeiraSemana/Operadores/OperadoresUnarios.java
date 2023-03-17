package ProfGelysonSampaio.primeiraSemana.Operadores;

public class OperadoresUnarios{
    public static void main (String [] args){
        int number = 5;

        int positive = + number;
        int negative = - number;

        int decremento = -- number;
        int incremento = ++ number;

        boolean x = 5 + 5 == 10;
        boolean y = 5 + 5 == 5;

        boolean or = x || y; // Uma das equações necessita ser true se não ele retorna false
        boolean and = x && y;
    boolean yes = true;
        boolean not = !yes;

        System.out.println(incremento);
        System.out.println("+" + positive);
        System.out.println(negative);
        
        System.out.println(not);
        System.out.println(or);
        System.out.println(and);
    }
}