package br.com.imposto.view;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
		panel.add(btnCalcular);
		frame.add("South", panel);
		
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
	
	public static class CloseListener extends WindowAdapter {
		public void windowClosing(WindowEvent event) {
			event.getWindow().setVisible(false);
			System.exit(0);
		}
	}
	
}
