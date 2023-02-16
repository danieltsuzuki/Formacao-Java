package lacosDeRepeticao;

public class For {

	public static void main(String[] args) {
		for (int i = 0; i<10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n--------------");
		
		for (int i = 10; i>0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n--------------");
		
		String nome = "Daniel";
		
		for (int i = 0; i<nome.length(); i++) {
			System.out.print(nome.charAt(i) + " ");
		}
		
		
	}

}
