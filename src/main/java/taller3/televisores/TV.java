package taller3.televisores;

public class TV {
	
	private Marca marca;
	private static int canal;
	private static int precio;
	private boolean estado;
	private static int volumen;
	private Control control;
	private static int numTV;
	
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		canal = 1;
		volumen = 1;
		precio = 500;
		numTV++;
    }
	public void setMarca (Marca marca) {
		this.marca = marca;
	}
	public Marca getMarca () {
		return this.marca;
	}
	public void setControl (Control control) {
		this.control = control;
	}
	public Control getControl () {
		return this.control;
	}
	public void setPrecio (int precio) {
		this.precio = precio;
	}
	public int getPrecio () {
		return this.precio;
	}
	public void setVolumen (int volumen) {
		if (this.estado == true) {
			if (volumen >= 0 && volumen <= 7) {
				this.volumen = volumen;
			}
		}
	}
	public int getVolumen () {
		return this.volumen;
	}
	public void setCanal (int canal) {
		if (this.estado == true) {
			if (canal >= 1 && canal <= 120) {
				this.canal = canal;
			}
		}	
	}
	public int getCanal () {
		return this.canal;
	}
	public static void setNumTV (int cantidad) {
		TV.numTV = cantidad;
	}
	public static int getNumTV () {
		return TV.numTV;
	}	
	public void turnOn () {
		this.estado = true;
	}
	public void turnOff () {
		this.estado = false;
	}
	public boolean getEstado () {
		return this.estado;
	}
	public void canalUp () {
		if (this.estado == true && this.canal < 120) {
			this.canal++; 
		}
	}
	public void canalDown () {
		if (this.estado == true && this.canal > 1) {
			this.canal--;  
		}	
	}
	public void volumenUp () {
		if (this.estado == true && this.volumen < 7) {
			this.volumen++;  
		}	
	}
	public void volumenDown () {
		if (this.estado == true && this.volumen > 0) {
			this.volumen--;  
		}	
	}	
}

