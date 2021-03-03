package Programas.Exercicios_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1_section_10 {

	public static void main(String[] args) {
		// Declare
		 Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int x = 0;
		// Begin
		System.out.println("Digite a quantidade de alunos que estar�o dispostos a alugarem quartos:\n");
		int n = scan.nextInt();
		Exercicio_1_section_10_classe vag[] = new Exercicio_1_section_10_classe[n]; 

		do {
			
			System.out.println("\nBem vindo ao pensionato, seguem abaixo as op��es dispon�veis para sua valida��o: \n"
					+ "1 - Cheque quais quartos est�o dispon�veis\n" + "2 - Alterar informa��es do contrato\n"
					+ "3 - Vagar um quarto\n" + "4 - Sair da aplica��o\n");
			System.out.flush();
			x = scan.nextInt();

			switch (x) {
			case 1:
				cadastra_quarto(vag,scan);
				break;

			case 2:
			    altera_cont(vag);
				break;
				
			case 3:
				vaga_quarto(vag);
				break;	
				
			case 4:
				System.out.println("Saindo da aplica��o, obrigado pela prefer�ncia\n\n"); 
				break;		

			default:
				System.out.println("Esta op��o n�o se encontra dispon�vel, tente novamente com as que s�o v�lidas via menu \n\n");
				
				break;
			}

		} while (x != 4);
		scan.close();
		
		
		
		

	}
	
	static private boolean checa_disp(int n_quarto, Exercicio_1_section_10_classe vec[]) {
		
		if (vec[n_quarto-1]!=null) {
			
			System.out.println("voc� est� com sorte hoje!! este est� quarto vago\n");
			return true; 
		                           } else {
		    System.out.println("Aparentemente este quarto se encontra ocupado, tente novamente seguindo a lista de vacancia\n");
		    return false;
			                              }
		       		
	                                                                                     }
	
   static private boolean checa_disp(int n_quarto, Exercicio_1_section_10_classe vec[], int vld) {
		
		if (vec[n_quarto-1]!=null) {
			System.out.println("Este contrato � valido, continue com as valida��es\n");
			return true;
		                           }else {
			System.out.println("Aparentemente n�o existe contrato vinculado a este quarto , tente novamente seguindo a lista de vacancia\n");
			return false;
			                              }
		       		
	                                                                                               }
	
	
   static private void lista_quartos_vagos(Exercicio_1_section_10_classe vec[]) {
	   for (int i = 0; i < vec.length; i++) {
			if (vec[i] == null) {
				if (i == 2 || i == 3 || i == 4) {
					System.out.println("\nQuarto " + (i+1) + "- Vago (Com vista para o mar)\n");
				                                } else
					System.out.println("\nQuarto " + (i+1) + "- Vago\n");
			                    } else
				System.out.println("\nQuarto " + (i+1) + "- Ocupado\n");
		                                    }
                                                                                 }
    
   static private void altera_cont(Exercicio_1_section_10_classe vec[]) {
    	Scanner scan = new Scanner (System.in);
    	int quarto = 0;
    	System.out.println("\nDigite o n�mero do quarto alugado que sofrer� a altera��o nas informa��es do contrato:\n ");
    	quarto = scan.nextInt();
    	if (checa_disp(quarto,vec,1)) {
    		
    		//Altera o nome do residente (INI)
    		System.out.println("\nDeseja alterar o nome do residente? (S/N)\n");
    		char checa_vld;
    		checa_vld = scan.next().charAt(0);
    		
    		while (checa_vld  != 'S'&&checa_vld  != 'N') {
    			
    			System.out.println("\nAparentemente a op��o digitada n�o est� dispon�vel para valida��o, alterne entre (S/N)\n");
    			checa_vld = scan.next().charAt(0);
    			
    		                                             }
    		
    		if (checa_vld == 'S') {
				System.out.println("\nDigite o novo nome: \n");
				String new_name = scan.next();
				vec[quarto-1].setnome(new_name);
				System.out.println(vec[quarto-1].toString());
				                  }
    		//Altera o nome do residente (FIM)
    		
    		
    		//Altera o email do residente (INI)
    		System.out.println("\nDeseja alterar o email do residente? (S/N)\n");
    		checa_vld = scan.next().charAt(0);
    		
    		while (checa_vld  != 'S'&&checa_vld  != 'N') {
    			
    			System.out.println("\nAparentemente a op��o digitada n�o est� dispon�vel para valida��o, alterne entre (S/N)\n");
    			checa_vld = scan.next().charAt(0);
    			
    		                                             }
    		
    		if (checa_vld == 'S') {
				System.out.println("\nDigite o novo email: \n");
				String new_email = scan.next();
				vec[quarto-1].setemail(new_email);
				System.out.println(vec[quarto-1].toString());
				                  }
    		//Altera o email do residente (FIM)
    		
    		
    		//Altera o quarto do residente (INI)
    		System.out.println("\nDeseja alterar o quarto do residente? (S/N)\n");
    		checa_vld = scan.next().charAt(0);
    		
    		while (checa_vld  != 'S'&& checa_vld  != 'N') {
    			
    			System.out.println("\nAparentemente a op��o digitada n�o est� dispon�vel para valida��o, alterne entre (S/N)\n");
    			checa_vld = scan.next().charAt(0);
    			
    		                                             }
    		
    		if (checa_vld == 'S') {
				System.out.println("\nDigite o novo quarto: \n");
				int new_quarto = scan.nextInt();
				scan.close();
				
				if (checa_disp(new_quarto-1,vec)) {
					vec[quarto-1].setquarto(new_quarto-1);
				                                }
				System.out.println(vec[new_quarto-1].toString());
				                  }
    		//Altera o quarto do residente (FIM)
    		
    		                          }
                                                                      }
    
   static private void cadastra_quarto(Exercicio_1_section_10_classe vec[], Scanner scan) {
	   
	   
	   lista_quartos_vagos(vec);
         
	   System.out.println("Dentre as op��es dispon�veis, deseja alugar algum quarto ? S/N \n");
		
		char checa_vld = scan.next().charAt(0);
		
		while (checa_vld != 'S' && checa_vld != 'N' ) {
			
			System.out.println("\nAparentemente a op��o digitada n�o est� dispon�vel para valida��o, alterne entre (S/N)\n");
			checa_vld = scan.next().charAt(0);
		                                             }
		if (checa_vld == 'S') {
			String nome;
			String email;
			int quarto = 0;
			System.out.println("\nDigite o nome do aluno a ser cadastrado:\n ");
			nome = scan.next();
			System.out.println("\nDigite o email do aluno a ser cadastrado:\n ");
			email = scan.next();
			System.out.println("\nDigite o numero do quarto que ser� alugado:\n ");
			quarto = scan.nextInt();
			
			
			while(quarto > vec.length || quarto-1 < 0) {
				
				System.out.println(
						"\nEsta op��o de quarto n�o existe, favor use a lista de vacancia passada anteriormente como refer�ncia "
								+ "e digite novamente o n�mero do quarto:   \n");
				quarto = scan.nextInt();
				
			                                                 }
			

			while (vec[quarto - 1] != null) {
				System.out.println(
						"\nAparentemente voc� escolheu um quarto que ja est� ocupado, favor use a lista de vacancia passada anteriormente como refer�ncia "
								+ "e digite novamente o n�mero do quarto:   \n");
				quarto = scan.nextInt();

			                                }
											  

			vec[quarto - 1] = new Exercicio_1_section_10_classe(nome, email, quarto);
			System.out.println(vec[quarto - 1].toString());

		                      }
		   
                                                                               }
   
   static private void vaga_quarto(Exercicio_1_section_10_classe vec[]) {
	   
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Qual quarto voc� deseja vagar?");
	   int quarto = scan.nextInt();
	   while(vec[quarto-1] == null) {
		   System.out.println("Este quarto ja est� vazio, valide novamente suas credenciais e digite novamente a referencia \n");
		   quarto = scan.nextInt();
	                                }
	   scan.close();
	   vec[quarto] = null;
	   
	   
                                                                         }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   


}
