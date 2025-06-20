package desafio_poo;

public class Safari implements NavegadorInternet{
	private String paginaAtual;

	public Safari(String paginaAtual) {
		this.paginaAtual = paginaAtual;
	}
	
	public Safari() {
		this.paginaAtual = "/";
	}
	
	@Override
	public void exibirPagina(String url) {
		this.paginaAtual = url;
		System.out.println("Acessando " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Uma nova aba foi aberta.");	
	}

	@Override
	public void atualizarPagina() {
		System.out.println("A página " + this.paginaAtual + " foi atualizada.");
	}

}
