import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class auto implements Comparable<auto>{
	//probando
	private String marca;
	private String modelo;
	private int puertas;
	private double precio;
	private String cilindrada;
	
	public auto() {}
	
	public auto(String m, String mo, int p, double pre, String c)
	{
		marca = m;
		modelo = mo;
		puertas = p;
		precio = pre;
		cilindrada = c;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getPuertas() {
		return puertas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setMarca(String m) {
		marca = m;
	}

	public void setModelo(String mo) {
		modelo = mo;
	}

	public void setPuertas(int p) {
		puertas = p;
	}

	public void setPrecio(double pre) {
		precio = pre;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String c) {
		cilindrada = c;
	}

	@Override
	public int compareTo(auto o) {
		// TODO Auto-generated method stub
		if(precio < o.precio)
		{
			return -1;
		}
		if(precio > o.precio)
		{
			return 1;
		}
		return 0;
		
	}


	

}
