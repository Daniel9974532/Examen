import java.util.ArrayList;
		import java.util.Iterator;

		import javax.swing.JOptionPane;

		public class Segu {

			String mes,resp;
			double venta,total;
			int cont=0,altas=0,bajas=0;
			
			
			public Segu(){
				datos();
			}

			public void datos() {
				cont=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de meses"));
				String[] meses=new String[cont];
				double[] ventas=new double[cont];
				
				for (int i = 0; i < cont; i++) {
					mes=JOptionPane.showInputDialog("Ingrese mes");
					meses[i]=mes;
					venta=Double.parseDouble(JOptionPane.showInputDialog("Ingrese las ventas en el mes "));
					ventas[i]=venta;
					total=venta+venta;
				}
		        for (int i = 1; i < cont; i++) {
		            if (ventas[i] > ventas[altas]) {
		                altas = i;
		            }
		            if (ventas[i] < ventas[bajas]) {
		                bajas = i;
		            }
		        }
		        System.out.println("La cantidad de meses ingresados fueron :"+cont);
		        System.out.println("Las ventas totales fueron :"+total);
		        System.out.println("mes ventas altas en el mes de: "+meses[altas]+" con un total de: "+ventas[altas]);
		        System.out.println("mes ventas bajas en el mes de: "+meses[bajas]+" con un total de: "+ventas[bajas]);
				
				
			}
		}
		
