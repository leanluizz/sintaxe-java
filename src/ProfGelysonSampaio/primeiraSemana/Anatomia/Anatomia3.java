package ProfGelysonSampaio.primeiraSemana.Anatomia;

   // Exercício de Metodos

public class Anatomia3 {
    public static void main(String[] args) {
        int Adony = Notas(5, 3, "Gabriel");
        int Gabriel = Notas(1, 2, "Adony");
        System.out.println(Gabriel);
        System.out.println(Adony);
    }

    public static int Notas(int nota1, int nota2, String nome) {
        int Média = 5;
        int result = nota1 + nota2;
        if (result < Média) {
            System.out.println("Desculpe " + nome +  "mas você não passou, sua nota é = " + result);
        } else {
            System.out.println("Parabéns " + nome + " você passou, sua nota é = " + result);
        }
        return result;
    }
}
