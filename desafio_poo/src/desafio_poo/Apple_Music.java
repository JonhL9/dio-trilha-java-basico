package desafio_poo;

import java.util.ArrayList;
import java.util.List;

public class Apple_Music implements ReprodutorMusical{

	private List<String> musicasFavoritas;
	private String musicaAtual;

	
	public Apple_Music(List<String> musicasFavoritas, String musicaAtual) {
		super();
		this.musicasFavoritas = musicasFavoritas;
		this.musicaAtual = musicaAtual;
	}
	public Apple_Music() {
		super();
		this.musicasFavoritas = new ArrayList<>();
		this.musicaAtual = "";
	}

	public void favoritar() {
		this.musicasFavoritas.add(this.musicaAtual);
		System.out.println("A música " + this.musicaAtual + " foi adicionada aos favoritos.");
		
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando " + this.musicaAtual);	
	}

	@Override
	public void pausar() {
		System.out.println("A música " + this.musicaAtual + " foi pausada.");
	}

	@Override
	public void selecionarMusica(String musica) {
		this.musicaAtual = musica;
		System.out.println("A " + musica + " foi selecionada.");	
	}

}
