package desafio_poo;

public class Iphone {
	private NavegadorInternet navegador;
	private AparelhoTelefonico telefone;
	private ReprodutorMusical reprodutor;
	
	
	public NavegadorInternet getNavegador() {
		return navegador;
	}
	public void setNavegador(NavegadorInternet navegador) {
		this.navegador = navegador;
	}
	public AparelhoTelefonico getTelefone() {
		return telefone;
	}
	public void setTelefone(AparelhoTelefonico telefone) {
		this.telefone = telefone;
	}
	public ReprodutorMusical getReprodutor() {
		return reprodutor;
	}
	public void setReprodutor(ReprodutorMusical reprodutor) {
		this.reprodutor = reprodutor;
	}
	
	public Iphone() {
		this.navegador = new Safari();
		this.reprodutor = new Apple_Music();
		this.telefone = new AparelhoTelefonico();
	}
	
	public Iphone(NavegadorInternet navegador, AparelhoTelefonico telefone, ReprodutorMusical reprodutor) {
		super();
		this.navegador = navegador;
		this.telefone = telefone;
		this.reprodutor = reprodutor;
	}
	
	
}
