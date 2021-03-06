import java.util.Scanner;

import Models.Geladeira;
import Models.Mesa;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("--- ADICIONANDO OBJETOS PARA A CASA ---");

		int option;

		do {
			System.out.println("1 - Cadastro de Objetos");
			System.out.println("0 - Sair");

			Scanner scanner = new Scanner(System.in);

			System.out.println("Qual opera??o voc? deseja realizar: ");
			option = scanner.nextInt();

			process(option);
		} while (option != 0);

	}

	public static void process(int option) throws Exception {
		switch (option) {
		case 1: {
			Scanner scanner = new Scanner(System.in);

			System.out.println("----------------------------------------------");
			System.out.println("Vamos adicionar uma Geladeira: ");

			System.out.println("Digite o modelo da geladeira: ");
			String modelo = scanner.nextLine();

			System.out.println("Qual ? a cor da geladeira: ");
			String cor = scanner.nextLine();

			System.out.println("Qual o peso da Geladeira: ");
			Double peso = scanner.nextDouble();
			
			
			System.out.println("-------");
			
			
			System.out.println("Agora vamos adicionar uma mesa ...");
			System.out.println("Digite a largura da mesa: ");
			Double largura = scanner.nextDouble();

			System.out.println("Digite o comprimento da mesa: ");
			Double comprimento = scanner.nextDouble();

			System.out.println("Qual ? a cor da mesa: ");
			String corMesa = scanner.next();

			System.out.println("A mesa possui cadeiras [sim/nao]?: ");
			String possuiCadeiras = scanner.next();
			Boolean cadeiras=false;
			
			if ((possuiCadeiras=="sim") || (possuiCadeiras=="Sim") || (possuiCadeiras=="SIM"))
				cadeiras=true;
			else if ((possuiCadeiras=="nao") || (possuiCadeiras=="Nao") || (possuiCadeiras=="NAO"))
				cadeiras = false;
						
			Geladeira novaGeladeira = new Geladeira(modelo, cor, peso);
			Mesa novaMesa = new Mesa(largura, comprimento, corMesa, cadeiras);

			
			System.out.println("?tens criados com sucesso: ");
			System.out.println("Geladeira ...");
			System.out.println("--- modelo " + novaGeladeira.getModelo());
			System.out.println("--- cor: " + novaGeladeira.getCor());
			System.out.println("--- peso: " + novaGeladeira.getPeso());

			System.out.println("Mesa ...");
			System.out.println("--- largura: " + novaMesa.getLargura());
			System.out.println("--- comprimento: " + novaMesa.getComprimento());
			System.out.println("--- cor: " + novaMesa.getCor());
			System.out.println("--- cadeiras: " + possuiCadeiras);
			System.out.println("----------------------------------------------");
		}
		}
	}
}
