package taller3.televisores;

public class TV {
	
	private Marca marca;
	private static int canal = 1;
	private static int precio = 500;
	private boolean estado;
	private static int volumen = 1;
	private Control control;
	private static int numTV;
	
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
    }
	public void setMarca (Marca marca) {
		this.marca = marca;
	}
	public Marca getMarca () {
		return marca;
	}
	public void setControl (Control control) {
		this.control = control;
	}
	public Control getControl () {
		return control;
	}
	public void setPrecio (int pre) {
		precio = pre;
	}
	public int getPrecio () {
		return precio;
	}
	public void setVolumen (int volumen) {
		if (this.estado == true) {
			if (volumen >= 0 && volumen <= 7) {
				this.volumen = volumen;
			}
		}
	}
	public int getVolumen () {
		return volumen;
	}
	public void setCanal (int canal) {
		if (this.estado == true) {
			if (canal >= 1 && canal <= 120) {
				this.canal = canal;
			}
		}	
	}
	public int getCanal () {
		return canal;
	}
	public static void setNumTV (int cantidad) {
		numTV = cantidad;
	}
	public static int getNumTV () {
		return numTV;
	}	
	public void turnOn () {
		estado = true;
	}
	public void turnOff () {
		estado = false;
	}
	public boolean getEstado () {
		return estado;
	}
	public void canalUp () {
		if (this.estado == true && this.canal < 120) {
			canal++; 
		}
	}
	public void canalDown () {
		if (this.estado == true && this.canal > 1) {
			canal--;  
		}	
	}
	public void volumenUp () {
		if (this.estado == true && this.volumen < 7) {
			volumen++;  
		}	
	}
	public void volumenDown () {
		if (this.estado == true && this.volumen > 0) {
			volumen--;  
		}	
	}	
}

