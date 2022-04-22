package LocaCarrosPC;
import java.util.Scanner;
import java.util.Locale;

/*
Sistema lógico de uma empresa fictícia de locação de carros que 
fiz para uma avaliação enquanto estudava lógica de programação no
curso técnico em desenvolvimento de sitemas no SENAI
*/

public class LocaCarrosCL {
	static Scanner scanner = new Scanner(System.in);
	static Locale ptBr = new Locale("pt","BR");
	
//Função para o cabeçalho que vai se repetir em todas as etapas do código.	
	// Função de cabeçalho que vai se repetir em todas as etapas do programa.
	static void cabecalho(){
		System.out.println(" \n\n\n\n----------------------------------------------------------------------------- \n");
		System.out.println(" ********************************* LocaCarros ******************************** \n");
		System.out.println(" _____________________________________________________________________________ \n");
	}
//Função com opções de forma de pagamento que o cliente pode escolher.
	static void formPag(){
		System.out.println(" - - - - - - - - - - - - Como deseja fazer o pagamento ? - - - - - - - - - - -\n\n");
		System.out.println(" [ 1 ]  Pagamento à vista:  8%% de desconto \n");
		System.out.println(" [ 2 ]  Pagamento à praso:  Parcelamento de até 5 vezes \n");
		System.out.println(" _____________________________________________________________________________ \n");
	}
//Função com as vantagens que o cliente que escolheu pagar à vista terá.	
	static void pagAVista(){
		System.out.println(" - - - - - - - - - - - - Pagamento à vista selecionado - - - - - - - - - - - - \n");
		System.out.println(" _____________________________________________________________________________ \n\n");
		System.out.println(" Com o pagamento à vista você tem direito a um desconto de 8%% do valor do \n");
		System.out.println(" valor total da locação. \n\n");
		System.out.println("  * VALOR COM DESCONTO  \n");
	}
//Função com as vantagens que o cliente que escolheu pagar a prazo terá
	static void pagAPrazo(){
		System.out.println(" - - - - - - - - - - - - Pagamento à prázo selecionado - - - - - - - - - - - - \n");
		System.out.println(" _____________________________________________________________________________ \n\n");
		System.out.println(" Com o pagamento à prázo você tem direito a parcelar em até cinco(5) vezes. \n");
	}
//Função para escolher em quantas parcelas o cliente pagará a locação.
	static void parcelado(){
		System.out.println(" _____________________________________________________________________________ \n\n");
		System.out.println(" - - - - - - - - - - - Deseja parcelar em quantas vezes? - - - - - - - - - - -\n");
		System.out.println(" _____________________________________________________________________________ \n\n");
	}
//Função para confirmar dados e finalizar o pagamento.
	static void finalizarPagamento(){
		
		System.out.println(" _____________________________________________________________________________ \n\n");								
		System.out.println(" Informe seu primeiro nome para confirmar a locação do veículo: \n");
		System.out.println(" _____________________________________________________________________________ \n\n");
		String nome = scanner.nextLine();
		System.out.println("----------------------\n");
		System.out.println(" _____________________________________________________________________________ \n\n");
		System.out.println(" Informe um número de contado valido para que possamos nos comunicar:. \n\n");
		int numero = scanner.nextInt();
		scanner.close();
	}
//Função para agradeçer a preferência.
	static void Alugado(){
		System.out.println("  - - - - - - - - - - - -    LOCAÇÃO CONCLUÍDA!!!   - - - - - - - - - - - - - \n");
		System.out.println("  - - - - - - - - - -     OBRIGADO POR NOS ESCOLHER     - - - - - - - - - - - \n");
		System.out.println(" _____________________________________________________________________________ \n\n");
		System.out.println(" Deseja voltar para o menu principal? \n\n");
		System.out.println("   °  1 - [  SIM  ] \n   °  2 - [  NÂO  ] \n");
		System.out.println(" _____________________________________________________________________________ \n\n");
	}
//Função para escolhas inválidas que porventura o cliente possa fazer. 
	static void Default(){
		System.out.println(" Opção inválida, escolha uma das opções abaixo. \n");
		System.out.println(" _____________________________________________________________________________ \n\n");
		System.out.println(" Deseja voltar para o menu principal? \n");
		System.out.println("   °  1 - [  SIM  ] \n   °  2 - [  NÂO  ] \n");
		System.out.println(" _____________________________________________________________________________ \n\n");
	}
	public static void main(String[] args) {
		int escolhaMenu, grupoCarros, veiculo, resposta_1 = 1;
		while(resposta_1 < 2) {
			cabecalho();
			System.out.println(" - - - O QUE VOCÊ DESEJA? - - - \n");
			System.out.println(" [ 1 ] Conhecer nossos serviços \n [ 2 ] Conhcer nossa empresa \n");
			System.out.println(" _____________________________________________________________________________ \n");
			escolhaMenu = scanner.nextInt();
			
			//Catálogo de carros ou informações da empresa.
			
			switch(escolhaMenu) {
			case 1:
				cabecalho();
				System.out.println(" A LocaCarros disponibiliza para seus clientes um catálogo variado de\n");
				System.out.println(" carros para locação e com preçõs bem acessíveis \n");
				System.out.println(" _____________________________________________________________________________ \n\n");
				System.out.println(" - - - - - - - - - - - - ESCOLHA UMA DAS CATEGORIAS  - - - - - - - - - - - - - \n\n");
				System.out.println(" [1] Grupo A: Renaut KWID e Fiat Mobi                     | Diária: R$ 92,69. \n");
				System.out.println(" [2] Grupo B: Renaut Logan, Chevrolet Onix e Hyndai HB20s | Diária: R$ 95,69. \n");
				System.out.println(" [3] Grupo C: Fiat Cronos e Volkswagen Virtus             | Diária: R$ 116,70. \n");
				grupoCarros = scanner.nextInt();
				
				//Catálogo de carros por grupo.
				
				switch(grupoCarros) {
				
				//Carros do grupo A
				
				case 1:
					cabecalho();
					System.out.println(" Você escolheu os carros do Grupo A. Qual desses veículos lhe intereçã? \n");
					System.out.println(" _____________________________________________________________________________ \n");
					System.out.println(" [1] Renaut KWID \n [2] Fiat Mobi \n");
					veiculo = scanner.nextInt();
					
				break;
				
				//Carros do grupo B
				
				case 2:
					cabecalho();
					System.out.println(" Você escolheu os carros do Grupo B. Qual desses veículos lhe intereçã? \n");
					System.out.println(" _____________________________________________________________________________ \n");
					System.out.println(" [1] Renaut Logan \n [2] Chevrolet Onix \n [3] Hyndai HB20s \n");		
					veiculo = scanner.nextInt();
				break;
				
				//Carros do grupo C
				
				case 3:
					cabecalho();
					System.out.println(" Você escolheu os carros do Grupo C. Qual desses veículos lhe intereçã? \n");
					System.out.println(" _____________________________________________________________________________ \n");
					System.out.println(" [1] Fiat Cronos \n [2] Volkswagen Virtus \n");
					veiculo = scanner.nextInt();
				break;
				
				//Escolha inválida
				
				default:
					cabecalho();
					Default();
					resposta_1 = scanner.nextInt();
				}
			break;
			case 2:
				cabecalho();
				System.out.println(" - - - - - - - - - - - - - - - -  Quem somos nós?  - - - - - - - - - - - - - - \n");
				System.out.println(" A LocaCarros é uma empresa que atua no mercado há 15 anos, sendo uma das\n");
				System.out.println(" melhores empresas para aluguel de carros. Não cobramos taxas de serviço\n");
				System.out.println(" e sempre buscamos o conforto para nossos clientes.\n\n");
				System.out.println(" - - - - - - - - - - - - - - -  Como nos contactar? - - -  - - - - - - - - - - \n");
				System.out.println(" Você pode nos contactar atraves de nosso número de contato que está \n logo abaixo, você rapinamente será atendido. \n");
				System.out.println("  (85) 9 9987-9987 \n");
				System.out.println("  ```````````````` \n");
				System.out.println(" - - - - - - - - - - - - Onde você pode nos encontrar? - - - - - - - - - - - - \n");
				System.out.println(" Endereço: Rua Cavalcante Peixoto, no 1255, Jardim Americano. \n");
				System.out.println(" _____________________________________________________________________________ \n");
				System.out.println(" Deseja voltar para o menu principal? \n");
				System.out.println("   °  1 - [  SIM  ] \n   °  2 - [  NÂO  ] \n");
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
