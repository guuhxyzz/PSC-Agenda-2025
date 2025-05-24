package psc.agenda;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Contato> agenda = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		boolean condicao = true;
		
		while(condicao) {
			
			
			try {
				System.out.println("=== AGENDA ===");
				System.out.println("0 - Sair da agenda");
				System.out.println("1 - Listar contatos");
				System.out.println("2 - Adicionar contato");
				System.out.println("3 - Remover contato");
				int opcao = scanner.nextInt();
				
				switch(opcao) {
				case 0:
					condicao = false;
					break;
				case 1:
					if (agenda.isEmpty()) {
						System.out.println("Nenhum contato salvo na agenda");
						continue;
					}
					
					int contador = 1;
					
					for (Contato item : agenda) {
						System.out.println(contador + " - " + item.exibirContato());
						contador++;
					}
					break;
				case 2:
					do {
						try {
							System.out.print("\nDigite o nome do contato: ");
							String nome = scanner.next();
							
							System.out.print("\nDigite o sobrenome: ");
							String sobrenome = scanner.next();
							
							System.out.print("\nDigite o DDD do número: ");
							String dddString = scanner.next();
							
							if (dddString.length() != 2) {
								System.out.println("Um DDD tem apenas 2 digitos");
								continue;
							}
							
							System.out.print("\nDigite o número: ");
							int numero = scanner.nextInt();
							
							int ddd = Integer.parseInt(dddString);
							
							Contato novoContato = new Contato(nome, sobrenome, ddd, numero);
							agenda.add(novoContato);
							
							System.out.println("Contato adiconado com sucesso");
							break;	
							
						} catch(InputMismatchException e) {
							System.out.println("ERRO: Digte um valor valido");
							scanner.nextLine();
						}
						
					} while (true);
				continue;
				case 3:
					try {
						do {
							if (agenda.isEmpty()) {
								System.out.println("Você não contatos para remover!");
								break;
							}
							System.out.print("Digite a posição do contato: ");
							int removerContato = scanner.nextInt();
							removerContato--;
							
							if (removerContato > agenda.size()) {
								System.out.println("Valor não encontrado");
							}
							
							agenda.remove(removerContato);
							break;
						} while(true);
						
						
					} catch(InputMismatchException e) {
						System.out.println("ERRO: Digte um valor valido");
					}
				}
				
			} catch(InputMismatchException e) {
				System.out.println("ERRO: Digte apenas números");
			}	
		}
		scanner.close();
	}

}
