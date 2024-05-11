package tabelasHash;

public class Main {
	public static void main(String[] args) {
		
		HashTable tabelaHash = new HashTable(10);
		
		// HashTable tabelaHash = new HashTable(2);
		
		tabelaHash.inserir("753.871.472-80", "Pedro");
		tabelaHash.inserir("123.456.789-10", "João");
		tabelaHash.inserir("400.289.220-00", "Ana");
		
		System.out.println(tabelaHash.recuperar("123.456.789-10"));
		System.out.println(tabelaHash.recuperar("753.871.472-80"));
		System.out.println(tabelaHash.recuperar("400.289.220-00"));
	}
}