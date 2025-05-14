import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		ArrayList<String>gerenciamento=new ArrayList<String>();
		boolean atv=true;
		Scanner sc=new Scanner(System.in);
		
		while(atv) {
			System.out.println("Gerenciamento de atividade"+"-".repeat(10));
			System.out.println("1-Adicionar ➕ atividade.");
			System.out.println("2-Pesquisar 🔍 por título.");
			System.out.println("3-Atualizar ✏️ atividade por título.");
			System.out.println("4-remover ❌ atividade por título.");
			System.out.println("5-iniciar ▶️ atividade.");
			System.out.println("6- Finalizar ✅ atividade.");
			System.out.println("7-listar 📄 atividade.");
			System.out.println("8-Sair 🚪 do sistema...");
			System.out.println("-".repeat(40));
            System.out.println("digite sua opção: ");
			int opcao=sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			case 1:{
				System.out.print("Digite o título: ");
                String titulo = sc.nextLine();
                System.out.print("Digite a descrição: ");
                String descricao = sc.nextLine();
                System.out.print("Digite o status: ");
                String status = sc.nextLine();

                String atividade = "Título: " + titulo + " | Descrição: " + descricao + " | Status: " + status;
                gerenciamento.add(atividade);
                System.out.println("Atividade adicionada com sucesso!");
                break;
            }

			case 2:{
				 System.out.print("Digite o título da atividade que deseja pesquisar: ");
                 String tituloBuscar = sc.nextLine().toLowerCase();
                 boolean encontrada = false;

                 for (String atividade : gerenciamento) {
                     if (atividade.toLowerCase().contains("título: " + tituloBuscar)) {
                         System.out.println("Atividade encontrada:");
                         System.out.println(atividade);
                         encontrada = true;
                         break;
                     }
                 }

                 if (!encontrada) {
                     System.out.println("Atividade não encontrada.");
                 }
                 break;
             }
			case 3:{
				System.out.println("digite o titulo da atividade que deseja atualizar: ");
				String TituloAntigo=sc.nextLine();
				if (gerenciamento.contains(TituloAntigo)) {
                    System.out.print("Digite o novo título: ");
					String novoTitulo=sc.nextLine();
					int index = gerenciamento.indexOf(TituloAntigo);
					gerenciamento.set(index, novoTitulo);
                    System.out.println("Atividade atualizada.");
				  } else {
                      System.out.println("Atividade não encontrada.");
                  }
                  break;

					}
				

			case 4: {
				System.out.println("Digite o título da atividade que deseja remover: ");
				String remover = sc.nextLine();
				if (gerenciamento.remove(remover)) {
					System.out.println("Atividade removida com sucesso");
				break;
				}
			}
			case 5: {
			    System.out.print("Digite o título da atividade que deseja iniciar: ");
			    String tituloIniciar = sc.nextLine();
			    if (gerenciamento.contains(tituloIniciar)) {
                    System.out.println("Atividade marcada como 'em andamento': " + tituloIniciar);
			    } else {
                    System.out.println("Atividade não encontrada.");
                }
                break;
			
			    	 }

			case 6:{
				System.out.println("digite o titulo da atividade que deseja fnalizar: ");
				String TituloFinalizar=sc.nextLine();
				 if (gerenciamento.contains(TituloFinalizar)) {
                     System.out.println("Atividade marcada como 'concluída': " + TituloFinalizar);
                 } else {
                     System.out.println("Atividade não encontrada.");
                 }
                 break;
			}

					
			case 7:{
				System.out.println("1-Listar Todas as Atividades");
				System.out.println("2-Listar Apenas Atividades Pendentes");
				System.out.println("3-Listar Apenas Atividades Em andamento");
				System.out.println("4-Listar Apenas Atividades Concluídas");
				System.out.println("5-Voltar ao Menu Principal");
				System.out.println("Digite sua opção: ");
				int opcaoAtv=sc.nextInt();
				sc.nextLine();
				switch(opcaoAtv) {
				case 1:
					for (String atividade : gerenciamento) {
		                System.out.println(atividade);
					}
					break;
				
					
				case 2:
					 for (String atividade : gerenciamento) {
			                if (atividade.toLowerCase().contains("pendente")) {
			                    System.out.println(atividade);
			                }
			            }
			            break;
				 case 3:
					 for (String atividade : gerenciamento) {
			                if (atividade.toLowerCase().contains("em andamento")) {
			                    System.out.println(atividade);
			                }
			            }
			            break;
                 case 4:
                	 for (String atividade : gerenciamento) {
                         if (atividade.toLowerCase().contains("concluída")) {
                             System.out.println(atividade);
                         }
                     }
                     break;
                 case 5:
                     break;
                 default:
                     System.out.println("Opção inválida.");
                     
                
             }
         }
         break;
			case 8:
	            System.out.println("Saindo do sistema,Obrigado!");
	            break;
	        default:
	            System.out.println("Opção inválida.");
	    } 

		}
		sc.close();
	}

	

	}


