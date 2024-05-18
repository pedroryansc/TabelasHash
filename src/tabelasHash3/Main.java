package tabelasHash3;

public class Main {
	public static void main(String[] args) {
		
		HashTable3 tabelaHash3 = new HashTable3(3);
		
		tabelaHash3.inserir("753.871.472-80", "Pedro");
		tabelaHash3.inserir("123.456.789-10", "João");
		tabelaHash3.inserir("400.289.220-00", "Ana");
		
		tabelaHash3.remover("123.456.789-10");
		tabelaHash3.remover("753.871.472-80");
		
		System.out.println(tabelaHash3.recuperar("123.456.789-10"));
		System.out.println(tabelaHash3.recuperar("753.871.472-80"));
		System.out.println(tabelaHash3.recuperar("400.289.220-00"));
		
	}
}