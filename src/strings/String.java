package strings;

public class String {

	public static void main(java.lang.String[] args) {
		java.lang.String nome = "dAniel";
		System.out.println("String em maiusculo: " + nome.toUpperCase());
		System.out.println("String em minusculo: " + nome.toLowerCase());
		System.out.println("O que tem na posicao 4? " + nome.charAt(4));
		System.out.println("Contem niel? " + nome.contains("niel"));
		System.out.println("Empty? " + nome.isEmpty());
		System.out.println("Blank? " + nome.isBlank());
		System.out.println("Tamanho do nome? " + nome.length());
		System.out.println("Onde comeca a string ni? " + nome.indexOf("ni"));
		System.out.println("Ultima posicao em que aparece ni? " + nome.lastIndexOf("ni"));
		System.out.println("Substitua 'l' por 'L': " + nome.replace("l", "L"));
		System.out.println("Concateca Strings: " + nome + " Tsuzuki");
		System.out.println("Concateca Strings: " + nome.concat(" Tsuzuki"));
	}	

}
