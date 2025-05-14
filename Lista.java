import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		ArrayList<String>gerenciamento=new ArrayList<String>();
		boolean atv=true;
		Scanner sc=new Scanner(System.in);
		
		while(atv) {
			System.out.println("-".repeat(10) + " Sistema de Gerenciamento de Atividades " + "-".repeat(10));
			System.out.println(" \n Menu com as opções : \n ");
			System.out.println("Digite (1) para (Adicionar ➕) nova atividade.");
			System.out.println("Digite (2) para (Pesquisar 🔍) atividade por título.");
			System.out.println("Digite (3) para (Excluir 🗑️) atividade pelo título.");
			System.out.println("Digite (4) para (Atualizar 🆕) atividade pelo título.");
			System.out.println("Digite (5) para (Iniciar ▶️) atividade.");
			System.out.println("Digite (6) para (Finalizar ✅) atividade.");
			System.out.println("Digite (7) para (Listar 📝) atividades.");
			System.out.println("Digite (8) para (Sair ➡️) do sistema.");
			System.out.println("-".repeat(60));
			System.out.println("Escolha uma opção: ");
			
			int opcao=sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			case 1:{
				System.out.println("Digite um título para atividade: ");
				String titulo = sc.nextLine();
				System.out.println("Agora, crie uma descrição para a atividade: ");
				String descricao = sc.nextLine();
				System.out.println("Qual o status da atividade (pendente, em andamento ou concluída)?: ");
				String status = sc.nextLine();
				gerenciamento.add(titulo);
				gerenciamento.add(descricao);
				gerenciamento.add(status);
				System.out.println("Atividade criada com sucesso!");
				break;
            }

			case 2:{
				System.out.println("Digite o título da atividade: ");
				String pesquisa = sc.nextLine();
				if(gerenciamento.contains(pesquisa)) {
					int ind = gerenciamento.indexOf(pesquisa);
					System.out.println(pesquisa + " conta no sistema.");
					System.out.println("\nInformações da atividade: \nTítulo:  " + gerenciamento.get(ind) + "\nDescrição: " + gerenciamento.get(ind+1) + "\nStatus: " + gerenciamento.get(ind+2));
					}
				else {
					System.out.println("Nenhuma atividade encontrada!");
					}
				break;
			
			}
				
			case 3:{
				System.out.println("Digite o título da atividade que deseja remover: ");
				String remover = sc.nextLine();
				if (gerenciamento.remove(remover)) {
					System.out.println("Atividade removida com sucesso");
				break;
				}
			}
			
				
			case 4: {
				System.out.println("Digite o título da ativida que deseja atualizar: ");
				String updtitulo = sc.nextLine();
				
				int indTitulo = gerenciamento.indexOf(updtitulo);
				String updDescricao = gerenciamento.get(indTitulo + 1);
					
				int i = gerenciamento.indexOf(updtitulo);
				int x = gerenciamento.indexOf(updDescricao);
					
				if(i < 0 && x < 0) {
					System.out.println("Não há nenhuma atividade com esse título. Por favor,tente novamente.");
					}
				else {
					System.out.println("Digite um novo título para a atividade encontrada: ");
					String novoTitulo = sc.nextLine();
					System.out.println("Digite uma nova descrição para a atividade: ");
					String novaDescricao = sc.nextLine();
					gerenciamento.set(i,novoTitulo);
					gerenciamento.set(x,novaDescricao);
					System.out.println("Título e Descrição modificados com sucesso!");
					}
				break;
				}
				
			case 5: {
			   	    System.out.print("Digite o título da atividade que deseja iniciar: ");
				    String tituloIniciar = sc.nextLine();
				    boolean encontrada = false;

				    for (int i = 0; i < gerenciamento.size(); i++) {
				        String atividade = gerenciamento.get(i);
				        
				        if (atividade.contains("título: " + tituloIniciar)) {
				            encontrada = true;
				            if (atividade.contains("status: concluída")) {
				                System.out.println("Essa atividade já foi concluída:");
				                System.out.println(gerenciamento.get(i));
				            } else if (atividade.contains("status: em andamento")) {
				                System.out.println("Essa atividade já está em andamento:");
				                System.out.println(gerenciamento.get(i));
				            } else {
				                String original = gerenciamento.get(i);
				                String novaAtividade = original.replaceAll("", "Status: em andamento");
				                gerenciamento.set(i, novaAtividade);
				                System.out.println("Atividade atualizada para 'em andamento':");
				                System.out.println(novaAtividade);
				            }
				            break;
				        }
				    }

				    if (!encontrada) {
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



	

	



		
