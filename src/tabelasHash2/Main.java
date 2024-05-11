package tabelasHash2;

public class Main {
	public static void main(String[] args) {
		
		HashTable2 tabelaHash2 = new HashTable2(2);
		
		tabelaHash2.inserir("753.871.472-80", "Pedro");
		tabelaHash2.inserir("123.456.789-10", "João");
		tabelaHash2.inserir("400.289.220-00", "Ana");
		
		System.out.println(tabelaHash2.recuperar("123.456.789-10"));
		System.out.println(tabelaHash2.recuperar("753.871.472-80"));
		System.out.println(tabelaHash2.recuperar("400.289.220-00"));
	}
}