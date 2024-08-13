package main;

import java.util.Scanner;
import Exercicios.Aluno;

public class AppAluno {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();

		int opcao;
		
		do {
			
			System.out.println(
					 "\nSelecione uma das opções abaixo"
					+ "\n1 - Exibir dados dos alunos"
					+ "\n2- Alterar a primeira nota do aluno"
					+ "\n3 - Imprimir Cadastro"
					+ "\n4 - Sair");
			opcao = sc.nextInt();
			sc.nextLine();
			
				switch(opcao) {
					case 1:
						aluno1.toString();
						aluno2.toString();
						break;
					
					case 2:
						System.out.println("Insira a nova nota: ");
						aluno1.setNota1(sc.nextInt());
						aluno1.toString();

						break;
					case 3:
						
						
					
					case 4:
					
					default:
			
				}
				
		}while(opcao != 5);
	
	
	
	

	

}
}