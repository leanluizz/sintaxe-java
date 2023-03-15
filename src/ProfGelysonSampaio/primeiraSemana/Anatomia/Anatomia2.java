package ProfGelysonSampaio.primeiraSemana.Anatomia;

  // Toda Public Class tem que começar com uma "public static void main";
  // É PADRÃO

public class Anatomia2 {
	public static void main (String [] args) {
		String name = "Leandro";
		String sobrenome = "Gomes";
		System.out.println(nomeCompleto(name, sobrenome));
	}
	public static String nomeCompleto (String primeiroNome, String sobreNome) {
		return primeiroNome.concat(sobreNome);
	}
}