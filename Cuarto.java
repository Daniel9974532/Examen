import javax.swing.JOptionPane;

public class Cuarto {

	public static void main(String[] args) {
		int area,base,altura;
		String resp;
		
		do {
						
			base=Integer.parseInt(JOptionPane.showInputDialog("ingrese el base del triangulo"));
			altura=Integer.parseInt(JOptionPane.showInputDialog("ingrese el altura del triangulo"));
			
			if (base>0&&altura>0) {
				area=(base*altura)/2;
				System.out.println("El area del triangulo es :"+area);
			}else {
				System.out.println("NO puede ingresar numeros negativos");
				break;
			}
			
			resp=JOptionPane.showInputDialog("Seguira ingresando datos??");

		} while (resp.contentEquals("si"));
		
		


	}

}
