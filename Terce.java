import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Terce {

	String nombre,documento,resp;
	int horas=0,total,años;
	double resultado;
	
	public Terce() {
		datos();
	}

	private void datos() {
		ArrayList info=new ArrayList();
		do {
			
			nombre=JOptionPane.showInputDialog("Ingrese su nombre");
			documento=JOptionPane.showInputDialog("Ingrese su documento");
			horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
			años=Integer.parseInt(JOptionPane.showInputDialog("Años trabajados"));

			calcular();
			info.add("Nombre :"+nombre);
			info.add("Documento :"+documento);
			info.add("horas :"+horas);
			info.add("Dinero :"+total);
			info.add("Total con Descuento :"+resultado);
			info.add("Años :"+años);
			
			System.out.println(info);
			
			resp=JOptionPane.showInputDialog("Seguira ingresando usuarios?'");

		} while (resp.equalsIgnoreCase("si"));
		
		
	}

	private void calcular() {

		total=horas*2000;
		if (años>4) {
			resultado =total-(total*0.10);		
			System.out.println(resultado);
		}
		
	}

}
