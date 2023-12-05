package br.com.imposto.view;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class TelaPis implements TelaImposto {

	private TextField txtValor;
	private Button btnCalcular;
	
	public TelaPis() {
		Frame frame = new Frame ("Calculo Imposto Pis");
		frame.add("North", new Label("Valor para calcular"));
		txtValor = new TextField();
		frame.add("Center", txtValor);
		
		Panel panel = new Panel();
		btnCalcular = new Button("Calcular");
		frame.add("South", btnCalcular);
		
		frame.addWindowListener(new CloseListener());
		frame.setSize(200,150);
		frame.setLocation(100,100);
		frame.setVisible(true);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public float getValor() {
		// TODO Auto-generated method stub
		return 0;
	}

}
