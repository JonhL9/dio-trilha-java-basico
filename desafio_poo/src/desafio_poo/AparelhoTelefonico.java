package desafio_poo;

import java.util.ArrayList;
import java.util.List;

public class AparelhoTelefonico {
	private List<Contato> contatos;
	
	public AparelhoTelefonico(List<Contato> contatos) {
		this.contatos = contatos;
	}
	public AparelhoTelefonico() {
		this.contatos = new ArrayList<>();
	}
	
	public void adicionarContato(String nome, String numero) {
		Contato novoContato = new Contato(nome, numero);
		this.contatos.add(novoContato);
		System.out.println("Novo contato adicionado.");
	}
	
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero);
	}

	public void atender() {
		System.out.println("Atendeu ligação.");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado.");
	}
}
