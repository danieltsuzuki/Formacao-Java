package condicionais;

public class Condicionais {

	public static void main(String[] args) {
		int idade1 = 19;
		String nome1 = "Maria";
		
		int idade2 = 17;
		String nome2 = "Joao";
		
		if (idade1 >= 18) {
			System.out.println(nome1 + " e maior de idade");
		}else {
			System.out.println(nome1 + " e menor de idade");
		}
		
		if (idade2 >= 18) {
			System.out.println(nome2 + " e maior de idade");
		}else {
			System.out.println(nome2 + " e menor de idade");
		}
		
		boolean dia = false;
		
		if (dia) {
			System.out.println("Esta de dia");
		}else System.out.println("Esta a noite");
		
	}

}
