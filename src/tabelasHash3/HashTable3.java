package tabelasHash3;

public class HashTable3 {

	private int tamArray;
	private ListaEncadeada[] array;
	
	public HashTable3(int tamArray) {
		this.tamArray = tamArray;
		array = new ListaEncadeada[tamArray];
	}
	
	public int hash(String chave) {
		byte bytesChave[] = chave.getBytes();
		int hashCode = 0;
		for(int i : bytesChave)
			hashCode += i;
		return hashCode % tamArray;
	}
	
	public void inserir(String chave, String valor) {
		int indiceArray = hash(chave);
		if(array[indiceArray] == null) {
			array[indiceArray] = new ListaEncadeada(chave, valor);
			return;
		}
		Nodo aux = array[indiceArray].getInicio();
		while(aux != null) {
			if(aux.getChave() == chave) {
				aux.setValor(valor);
				return;
			}
			aux = aux.getProx();
		}
		array[indiceArray].add(chave, valor);
	}
	
	public String recuperar(String chave) {
		int indiceArray = hash(chave);
		if(array[indiceArray] == null)
			return null;
		Nodo aux = array[indiceArray].getInicio();
		while(aux != null) {
			if(aux.getChave() == chave)
				return aux.getValor();
			aux = aux.getProx();
		}
		return null;
	}
	
	// Exercício
	
	public boolean chaveExiste(String chave) {
		int indiceArray = hash(chave);
		if(array[indiceArray] == null)
			return false;
		Nodo aux = array[indiceArray].getInicio();
		while(aux != null) {
			if(aux.getChave().equals(chave))
				return true;
			aux = aux.getProx();
		}
		return false;
	}
	
	// Método para remover uma chave e valor da tabela hash
	
	public void remover(String chave) {
		
		// Forma do professor
		
		int indiceArray = hash(chave);
		array[indiceArray].deleteComValor(chave);
		
		// Forma que fiz
		
		/*
		if(chaveExiste(chave)) {
			int indiceArray = hash(chave);
			Nodo aux = array[indiceArray].getInicio();
			
			if(aux.getChave().equals(chave)) {
				if(aux.getProx() == null)
					array[indiceArray] = null;
				else
					array[indiceArray].setInicio(aux.getProx());
				return;
			}
			
			while(aux.getProx() != null) {
				if(aux.getProx().getChave().equals(chave)) {
					aux.setProx(aux.getProx().getProx());
					return;
				}
				aux = aux.getProx();
			}
		}
		*/
	}
	
}