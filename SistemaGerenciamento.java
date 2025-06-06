import java.util.ArrayList;
import java.util.Scanner;

public class SistemaGerenciamento {
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
				System.err.println("Digite o título para remover a atividade: ");
				String remocao = sc.nextLine();
				if(gerenciamento.contains(remocao)) {
					System.out.println("Atividade encontrada.\n Removendo atividade...");
					int inTitulo = gerenciamento.indexOf(remocao);
					String t = gerenciamento.get(inTitulo);
					String d = gerenciamento.get(inTitulo+1);
					String s = gerenciamento.get(inTitulo+2);
					
					gerenciamento.remove(t);
					gerenciamento.remove(d);
					gerenciamento.remove(s);
					System.out.println("Atividade removida com sucesso!");
						}
				else {
						System.out.println("Atividade não foi encontrada.");
						}
				break;
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

				System.out.println("Digite o título da atividade: ");
				String tituloAtividade = sc.nextLine();
				if(gerenciamento.contains(tituloAtividade)){
					if(gerenciamento.get(2).equals("pendente")) {
						System.out.println("Atividade pendente.");
						String statusAntigo = "pendente";
						int s = gerenciamento.indexOf(statusAntigo);
						String novoStatus = "em andamento";
						gerenciamento.set(s,novoStatus);
						System.out.println("Atividade foi iniciada com sucesso!");
						}
						}
				else {
					System.out.println("Não há nenhuma atividade com esse título.");
					}
					break;
			   	  }

			case 6:{
				System.out.println("Digite o título da atividade: ");
				String tituloAtividade = sc.nextLine();
				if(gerenciamento.contains(tituloAtividade)){
					if(gerenciamento.get(2).equals("em andamento")) {
						System.out.println("Atividade em andamento.");
						String statusAntigo = "em andamento";
						int s = gerenciamento.indexOf(statusAntigo);
						String novoStatus = "concluida";
						gerenciamento.set(s,novoStatus);
						System.out.println("Atividade foi concluida com sucesso!");
						}
						}
				else {
					System.out.println("Não há nenhuma atividade com esse título.");
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
						int opcaoAtv = sc.nextInt();
						sc.nextLine();

						if (opcaoAtv == 5) 
							break;
					    boolean encontrouAlguma = false;
					    for (int i = 0; i < gerenciamento.size(); i += 3) {
						    if (i + 2 >= gerenciamento.size()) 
						    	break;

						    String titulo = gerenciamento.get(i);
						    String descricao = gerenciamento.get(i + 1);
						    String status = gerenciamento.get(i + 2);

						    boolean exibir = false;

						    switch (opcaoAtv) {
						        case 1:
						            exibir = true;
						            break;
						        case 2:
						            if (status.equals("pendente")) exibir = true;
						            break;
						        case 3:
						            if (status.equals("em andamento")) exibir = true;
						            break;
						        case 4:
						            if (status.equals("concluída") || status.equals("concluida")) exibir = true;
						            break;
						        default:
						            System.out.println("Opção inválida.");
						            return; 
						    }

						    if (exibir) {
						        encontrouAlguma = true;
						        System.out.println("Título: " + titulo);
						        System.out.println("Descrição: " + descricao);
						        System.out.println("Status: " + status);
						        System.out.println("-".repeat(60));
						    }
						}
						if (!encontrouAlguma) {
						    switch (opcaoAtv) {
						        case 1:
						            System.out.println("Nenhuma atividade encontrada.");
						            break;
						        case 2:
						            System.out.println("Nenhuma atividade pendente encontrada.");
						            break;
						        case 3:
						            System.out.println("Nenhuma atividade em andamento encontrada.");
						            break;
						        case 4:
						            System.out.println("Nenhuma atividade concluída encontrada.");
						            break;
						    }
						}

						}
					break;
			case 8:{
				 System.out.println("Saindo do sistema,Obrigado!");
		            return;
		    		}
			 default:
		            System.out.println("Opção inválida.");
	           
				}

		}
		sc.close();
	}

}



		
	


	



		
	



		
	
				
		
