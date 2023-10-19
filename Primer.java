import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Primer {

	
	String nombre,documento,telefono,resp,pais;
	int codigo=0;
	
	
	public Primer() {
		datos();
	}

	private void datos() {
		ArrayList info=new ArrayList();
		do {
			
			nombre=JOptionPane.showInputDialog("ingrese su nombre");
			documento=JOptionPane.showInputDialog("ingrese su documento");
			telefono=JOptionPane.showInputDialog("ingrese su telefono");
			codigo=Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo"));
			viaje();
			info.add("Nombre :"+nombre);
			info.add("documento :"+documento);
			info.add("Telefono :"+telefono);
			info.add("pais :"+pais);
			
			System.out.println(info);
			resp=JOptionPane.showInputDialog("Quieres ingresar otro usuario");
			
		} while (resp.contentEquals("si"));
		
		
	}

	private void viaje() {
		switch (codigo) {
		case 1: 
			 pais="Medellin hora y fecha de viaje 6 octubre 8pm";
			break;
			
		case 2: 
			pais="Bogota hora y fecha de viaje 10 noviembre 6pm";
			break;
			
		case 3: 
			pais="Cartagena hora y fecha de viaje 5 abril 2pm";

			break;
			
		case 4: 
			pais="Barranquilla hora y fecha de viaje 4 mayo 4am";

			break;
		
		default:
			System.out.println("codigo no valido");
		}
		
	}

}
