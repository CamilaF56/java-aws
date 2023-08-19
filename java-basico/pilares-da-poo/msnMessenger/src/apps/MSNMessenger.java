package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN");
		salvarHistoricoMensagem();
	}
	
	@Override
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico no MSN");
	}

}
