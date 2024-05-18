package tabelasHashJava;

import java.util.HashMap;

public class hashTableJava {
	public static void main(String[] args) {
		
		HashMap<String, Integer> alunos = new HashMap<>();
		
		// Inserindo elementos na HashMap
		
		alunos.put("João", 25);
		alunos.put("Maria", 21);
		alunos.put("Pedro", 20);
		
		System.out.println("Idade de Maria: " + alunos.get("Maria") + "\n");
		
		for(HashMap.Entry<String, Integer> input : alunos.entrySet()) {
			System.out.println("Nome: " + input.getKey());
			System.out.println("Idade: " + input.getValue() + "\n");
		}
		
	}
}