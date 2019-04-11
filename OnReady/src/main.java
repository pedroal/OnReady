import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<auto> autos = new ArrayList<auto>();
		
		
		cargarLista(autos);
		
		
		for(int i = 0 ; i < autos.size() ; i++)
		{
			if(autos.get(i).getCilindrada() == null)
			{
				System.out.println("Marca:  " + autos.get(i).getMarca() + "  //  " + "Modelo:  " + autos.get(i).getModelo() + "  //  " 
				+ "Puertas:  " + autos.get(i).getPuertas() + "  //  " + "Precio:  $" + autos.get(i).getPrecio());
			}
			else
			{
				System.out.println("Marca:  " + autos.get(i).getMarca() + "  //  " + "Modelo:  " + autos.get(i).getModelo() + "  //  " 
				+ "Puertas:  " + autos.get(i).getCilindrada() + "  //  " + "Precio:  $" + autos.get(i).getPrecio());
			}
		}
		
		System.out.println("=====================================================================================");
		
		
		Collections.sort(autos);
		String marcabarata = null;
		String marcacara = null;
		String modelocaro = null;
		String modelobarato = null;
		
		for(int j = 0 ; j < autos.size() ; j++)
		{
			marcabarata = autos.get(0).getMarca();
			modelobarato = autos.get(0).getModelo();
			
			marcacara = autos.get(autos.size()-1).getMarca();
			modelocaro = autos.get(autos.size()-1).getModelo();
		}
		
		System.out.println("Vehiculo mas caro : " + marcacara + "  " + modelocaro );
		System.out.println("Vehiculo mas barato : " + marcabarata + "  " + modelobarato);
		
		
		for(int x = 0 ; x < autos.size(); x++)
		{
			if(autos.get(x).getModelo().contains("Y"))
			{
				System.out.println("Vehículo que contiene en el modelo la letra 'Y' : " +autos.get(x).getMarca() + " " + autos.get(x).getModelo() + 
						" " + autos.get(x).getPrecio());
			}
		}
		
		System.out.println("=====================================================================================");
		System.out.println();
		System.out.println("Vehiculos ordenados por precio de mayor a menor: ");
		for(int k = autos.size()-1 ; k >= 0 ;  k--)
		{
			System.out.println(autos.get(k).getMarca() + "  " + autos.get(k).getModelo());
		}
 
	}

	
	private static void cargarLista(List<auto> autos) {
		// TODO Auto-generated method stub
		
		auto a1 = new auto();
		auto a2 = new auto();
		auto a3 = new auto();
		auto a4 = new auto();
		

		a1.setMarca("Peugeot");
		a1.setModelo("206");
		a1.setPuertas(4);
		a1.setPrecio(200000);
		
		autos.add(a1);

		a2.setMarca("Honda");
		a2.setModelo("Titan");
		a2.setCilindrada("125c");
		a2.setPrecio(60000);
		
		autos.add(a2);
		
		a3.setMarca("Peugeot");
		a3.setModelo("208");
		a3.setPuertas(5);
		a3.setPrecio(250000);
		
		autos.add(a3);
		
		a4.setMarca("Yamaha");
		a4.setModelo("YBR");
		a4.setCilindrada("160c");
		a4.setPrecio(80500.50);
		
		autos.add(a4);
		
		
	}

}
