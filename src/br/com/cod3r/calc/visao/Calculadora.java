package br.com.cod3r.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{

	public Calculadora() {
		
		organizarLayout();
		
		setTitle("Calculadora");
		setSize(250, 350); // tamanho
		setDefaultCloseOperation(EXIT_ON_CLOSE); // encerrar a aplicação assim que a janela (tela) for fechada
		setLocationRelativeTo(null); // para a tela ficar centralizada, assim que for aberta
		setVisible(true); // para a tela ficar visivel
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60));
		add(display, BorderLayout.NORTH);  // adicionar display no norte
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER); // adicionar teclado no norte
	}

	public static void main(String[] args) { // método main para inicializar a calculadora
		new Calculadora();
	}
}
