package tabelasHash3;

public class ListaEncadeada {

	private Nodo inicio;
	
	public ListaEncadeada(String chave, String valor) {
		inicio = new Nodo(chave, valor);
	}
	
	public void add(String chave, String valor) {
		Nodo novo = new Nodo(chave, valor);
		novo.setProx(inicio);
		inicio = novo;
	}
	
	public void deleteComValor(String chave) {
		if(inicio.getChave() == chave) {
			inicio = inicio.getProx();
			return;
		}
		Nodo aux = inicio;
		while(aux.getProx() != null) {
			if(aux.getProx().getChave() == chave) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux = aux.getProx();
		}
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
}