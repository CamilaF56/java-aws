package messenger;

import java.util.Scanner;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			ServicoMensagemInstantanea msg = null;
			String resp1 = null;

			do {

				System.out.println("Digite o nome do app de mensagem que deseja escolher: Telegram, MSN e Facebook");
				String appEscolhido = ler.nextLine();

				if (appEscolhido.equalsIgnoreCase("msn")) {
					msg = new MSNMessenger();
				} else if (appEscolhido.equalsIgnoreCase("facebook")) {
					msg = new FacebookMessenger();
				} else if (appEscolhido.equalsIgnoreCase("telegram")) {
					msg = new Telegram();
				} else {
					System.out.println("ERROR: Sistema de Mensagem escolhido não encontrado");
					return;
				}

				String resp2 = null;
				do {

					System.out.println("Deseja receber mensagem ou enviar?");
					String desejaFazer = ler.nextLine();

					if (desejaFazer.equalsIgnoreCase("enviar")) {
						msg.enviarMensagem();
					} else if (desejaFazer.equalsIgnoreCase("receber")) {
						msg.receberMensagem();
					} else {
						System.out.println("ERROR: Tal ação não pode ser feita no momemento");
						return;
					}

					System.out.println("Deseja enviar ou receber mais mensagens?");
					resp2 = ler.nextLine();

				} while (resp2.equalsIgnoreCase("sim"));

				System.out.println("Deseja selecionar outro app?");
				resp1 = ler.nextLine();

			} while (resp1.equalsIgnoreCase("sim"));
		}

		System.out.println("Finalizando sistema...");
	}

}
