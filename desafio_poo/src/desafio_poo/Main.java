package desafio_poo;

public class Main {

	public static void main(String[] args) {
		Iphone myPhone = new Iphone();
		
		System.out.println("Teste de funcionalidades\n");
		myPhone.getTelefone().ligar("180");
		myPhone.getTelefone().atender();
		myPhone.getTelefone().iniciarCorreioVoz();
		myPhone.getTelefone().adicionarContato("Fulano", "(00)0000-0000");
		System.out.println("");
		myPhone.getReprodutor().selecionarMusica("Oceano - Djavan");
		myPhone.getReprodutor().tocar();
		myPhone.getReprodutor().pausar();
		((Apple_Music) (myPhone.getReprodutor())).favoritar();
		System.out.println("");
		myPhone.getNavegador().adicionarNovaAba();
		myPhone.getNavegador().exibirPagina("https://www.google.com/");
		myPhone.getNavegador().exibirPagina("https://www.apple.com/br/");
		myPhone.getNavegador().atualizarPagina();

	}

}
