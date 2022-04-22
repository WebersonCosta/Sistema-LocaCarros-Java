package LocaCarrosPC;
import java.util.Scanner;
import java.util.Locale;

/*
Sistema l�gico de uma empresa fict�cia de loca��o de carros que 
fiz para uma avalia��o enquanto estudava l�gica de programa��o no
curso t�cnico em desenvolvimento de sitemas no SENAI
*/

public class LocaCarrosCL {
	static Scanner scanner = new Scanner(System.in);
	static Locale ptBr = new Locale("pt","BR");
	
//Fun��o para o cabe�alho que vai se repetir em todas as etapas do c�digo.	
	// Fun��o de cabe�alho que vai se repetir em todas as etapas do programa.
	static void cabecalho(){
		System.out.println(" \n\n\n\n----------------------------------------------------------------------------- \n");
		System.out.println(" ********************************* LocaCarros ******************************** \n");
		System.out.println(" _____________________________________________________________________________ \n");
	}
//Fun��o com op��es de forma de pagamento que o cliente pode escolher.
	static void formPag(){
		System.out.println(" - - - - - - - - - - - - Como deseja fazer o pagamento ? - - - - - - - - - - -\n\n");
		System.out.println(" [ 1 ]  Pagamento � vista:  8%% de desconto \n");
		System.out.println(" [ 2 ]  Pagamento � praso:  Parcelamento de at� 5 vezes \n");
		System.out.println(" _____________________________________________________________________________ \n");
	}
//Fun��o com as vantagens que o cliente que escolheu pagar � vista ter�.	
	static void pagAVista(){
		System.out.println(" - - - - - - - - - - - - Pagamento � vista selecionado - - - - - - - - - - - - \n");
		System.out.println(" _____________________________________________________________________________ \n\n");
		System.out.println(" Com o pagamento � vista voc� tem direito a um desconto de 8%% do valor do \n");
		System.out.println(" valor total da loca��o. \n\n");
		System.out.println("  * VALOR COM DESCONTO  \n");
	}
//Fun��o com as vantagens que o cliente que escolheu pagar a prazo ter�
	static void pagAPrazo(){
		System.out.println(" - - - - - - - - - - - - Pagamento � pr�zo selecionado - - - - - - - - - - - - \n");
		System.out.println(" _____________________________________________________________________________ \n\n");
		System.out.println(" Com o pagamento � pr�zo voc� tem direito a parcelar em at� cinco(5) vezes. \n");
	}
//Fun��o para escolher em quantas parcelas o cliente pagar� a loca��o.
	static void parcelado(){
		System.out.println(" _____________________________________________________________________________ \n\n");
		System.out.println(" - - - - - - - - - - - Deseja parcelar em quantas vezes? - - - - - - - - - - -\n");
		System.out.println(" _____________________________________________________________________________ \n\n");
	}
//Fun��o para confirmar dados e finalizar o pagamento.
	static void finalizarPagamento(){
		
		System.out.println(" _____________________________________________________________________________ \n\n");								
		System.out.println(" Informe seu primeiro nome para confirmar a loca��o do ve�culo: \n");
		System.out.println(" _____________________________________________________________________________ \n\n");
		String nome = scanner.nextLine();
		System.out.println("----------------------\n");
		System.out.println(" _____________________________________________________________________________ \n\n");
		System.out.println(" Informe um n�mero de contado valido para que possamos nos comunicar:. \n\n");
		int numero = scanner.nextInt();
		scanner.close();
	}
//Fun��o para agrade�er a prefer�ncia.
	static void Alugado(){
		System.out.println("  - - - - - - - - - - - -    LOCA��O CONCLU�DA!!!   - - - - - - - - - - - - - \n");
		System.out.println("  - - - - - - - - - -     OBRIGADO POR NOS ESCOLHER     - - - - - - - - - - - \n");
		System.out.println(" _____________________________________________________________________________ \n\n");
		System.out.println(" Deseja voltar para o menu principal? \n\n");
		System.out.println("   �  1 - [  SIM  ] \n   �  2 - [  N�O  ] \n");
		System.out.println(" _____________________________________________________________________________ \n\n");
	}
//Fun��o para escolhas inv�lidas que porventura o cliente possa fazer. 
	static void Default(){
		System.out.println(" Op��o inv�lida, escolha uma das op��es abaixo. \n");
		System.out.println(" _____________________________________________________________________________ \n\n");
		System.out.println(" Deseja voltar para o menu principal? \n");
		System.out.println("   �  1 - [  SIM  ] \n   �  2 - [  N�O  ] \n");
		System.out.println(" _____________________________________________________________________________ \n\n");
	}
	public static void main(String[] args) {
		int escolhaMenu, grupoCarros, veiculo, resposta_1 = 1;
		while(resposta_1 < 2) {
			cabecalho();
			System.out.println(" - - - O QUE VOC� DESEJA? - - - \n");
			System.out.println(" [ 1 ] Conhecer nossos servi�os \n [ 2 ] Conhcer nossa empresa \n");
			System.out.println(" _____________________________________________________________________________ \n");
			escolhaMenu = scanner.nextInt();
			
			//Cat�logo de carros ou informa��es da empresa.
			
			switch(escolhaMenu) {
			case 1:
				cabecalho();
				System.out.println(" A LocaCarros disponibiliza para seus clientes um cat�logo variado de\n");
				System.out.println(" carros para loca��o e com pre��s bem acess�veis \n");
				System.out.println(" _____________________________________________________________________________ \n\n");
				System.out.println(" - - - - - - - - - - - - ESCOLHA UMA DAS CATEGORIAS  - - - - - - - - - - - - - \n\n");
				System.out.println(" [1] Grupo A: Renaut KWID e Fiat Mobi                     | Di�ria: R$ 92,69. \n");
				System.out.println(" [2] Grupo B: Renaut Logan, Chevrolet Onix e Hyndai HB20s | Di�ria: R$ 95,69. \n");
				System.out.println(" [3] Grupo C: Fiat Cronos e Volkswagen Virtus             | Di�ria: R$ 116,70. \n");
				grupoCarros = scanner.nextInt();
				
				//Cat�logo de carros por grupo.
				
				switch(grupoCarros) {
				
				//Carros do grupo A
				
				case 1:
					cabecalho();
					System.out.println(" Voc� escolheu os carros do Grupo A. Qual desses ve�culos lhe intere��? \n");
					System.out.println(" _____________________________________________________________________________ \n");
					System.out.println(" [1] Renaut KWID \n [2] Fiat Mobi \n");
					veiculo = scanner.nextInt();
					
				break;
				
				//Carros do grupo B
				
				case 2:
					cabecalho();
					System.out.println(" Voc� escolheu os carros do Grupo B. Qual desses ve�culos lhe intere��? \n");
					System.out.println(" _____________________________________________________________________________ \n");
					System.out.println(" [1] Renaut Logan \n [2] Chevrolet Onix \n [3] Hyndai HB20s \n");		
					veiculo = scanner.nextInt();
				break;
				
				//Carros do grupo C
				
				case 3:
					cabecalho();
					System.out.println(" Voc� escolheu os carros do Grupo C. Qual desses ve�culos lhe intere��? \n");
					System.out.println(" _____________________________________________________________________________ \n");
					System.out.println(" [1] Fiat Cronos \n [2] Volkswagen Virtus \n");
					veiculo = scanner.nextInt();
				break;
				
				//Escolha inv�lida
				
				default:
					cabecalho();
					Default();
					resposta_1 = scanner.nextInt();
				}
			break;
			case 2:
				cabecalho();
				System.out.println(" - - - - - - - - - - - - - - - -  Quem somos n�s?  - - - - - - - - - - - - - - \n");
				System.out.println(" A LocaCarros � uma empresa que atua no mercado h� 15 anos, sendo uma das\n");
				System.out.println(" melhores empresas para aluguel de carros. N�o cobramos taxas de servi�o\n");
				System.out.println(" e sempre buscamos o conforto para nossos clientes.\n\n");
				System.out.println(" - - - - - - - - - - - - - - -  Como nos contactar? - - -  - - - - - - - - - - \n");
				System.out.println(" Voc� pode nos contactar atraves de nosso n�mero de contato que est� \n logo abaixo, voc� rapinamente ser� atendido. \n");
				System.out.println("  (85) 9 9987-9987 \n");
				System.out.println("  ```````````````` \n");
				System.out.println(" - - - - - - - - - - - - Onde voc� pode nos encontrar? - - - - - - - - - - - - \n");
				System.out.println(" Endere�o: Rua Cavalcante Peixoto, no 1255, Jardim Americano. \n");
				System.out.println(" _____________________________________________________________________________ \n");
				System.out.println(" Deseja voltar para o menu principal? \n");
				System.out.println("   �  1 - [  SIM  ] \n   �  2 - [  N�O  ] \n");
				resposta_1 = scanner.nextInt();
			break;
			default:
				cabecalho();
				Default();
				resposta_1 = scanner.nextInt();
			}
		}
		cabecalho();
		System.out.println(" ****************************    Volte Sempre  ******************************* \n");
		System.out.println(" _____________________________________________________________________________ \n");
		
	}
}
