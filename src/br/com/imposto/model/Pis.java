package br.com.imposto.model;

import java.util.Observable;

public class Pis extends Observable implements Imposto{
	
	private float aliquota = 0.65f;
	private float valorPis;
	
	@Override
	public void calcularImposto(float valor) {
		setChanged();
		valorPis = valor * aliquota;
		notifyObservers(valorPis);
	}
	public float getValorPis() {
		return valorPis;
	}

}
