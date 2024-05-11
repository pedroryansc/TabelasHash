package tabelasHash2;

public class HashTable2 {

	private int tamArray;
	private Nodo[] array;
	
	public HashTable2(int tamArray) {
		this.tamArray = tamArray;
		array = new Nodo[tamArray];
	}
	
	private int hash(String chave) {
		byte bytesChave[] = chave.getBytes();
		int hashCode = 0;
		for(int i : bytesChave)
			hashCode += i;
		return hashCode % tamArray;
	}
	
	private int hash(String chave, int numColisoes) {
		byte bytesChave[] = chave.getBytes();
		int hashCode = 0;
		for(int i : bytesChave)
			hashCode += i;
		return (hashCode + numColisoes) % tamArray;
	}
	
	public void inserir(String chave, String valor) {
		int indiceArray = hash(chave);
		if(array[indiceArray] == null) {
			array[indiceArray] = new Nodo(chave, valor);
			return;
		}
		if(array[indiceArray].getChave() == chave) {
			array[indiceArray].setValor(valor);
			return;
		}
		// Colisão
		int numColisoes = 1;
		int novoIndice = 0;
		while(array[indiceArray].getChave() != chave) {
			novoIndice = hash(chave, numColisoes);
			if(array[novoIndice] == null) {
				array[novoIndice] = new Nodo(chave, valor);
				return;
			}
			if(array[novoIndice].getChave() == chave) {
				array[indiceArray].setValor(valor);
				return;
			}
			numColisoes++;
			indiceArray = novoIndice;
		}
	}
	
	public String recuperar(String chave) {
		int indiceArray = hash(chave);
		if(array[indiceArray] == null) {
			System.out.println("Chave não está na tabela.");
			return "";
		}
		if(array[indiceArray].getChave() == chave)
			return array[indiceArray].getValor();
		
		int numColisoes = 1;
		while(array[indiceArray].getChave() != chave) {
			int novoIndice = hash(chave, numColisoes);
			if(array[novoIndice] == null) {
				System.out.println("Chave não está na tabela.");
				return "";
			}
			if(array[novoIndice].getChave() == chave) {
				return array[novoIndice].getValor();
			}
			numColisoes++;
			indiceArray = novoIndice;
		}
		return "";
	}
}