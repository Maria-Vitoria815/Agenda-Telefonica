package lista;

public class Celula {
	
	public Celula proxima;
	public Celula anterior;
	public Object elemento;
	
	


	public Celula(Celula proxima, Celula anterior, Object elemento) {
		this.proxima = proxima;
		this.anterior = anterior;
		this.elemento = elemento;
	}


	
	
	public Celula(Celula proxima, Object elemento) {
		super();
		this.proxima = proxima;
		this.elemento = elemento;
	}

	

	public Celula(Object elemento) {
		this.elemento = elemento;
	}

	
	
	public Celula() {}



	public Celula getProxima() {
		return proxima;
	}


	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}


	public Celula getAnterior() {
		return anterior;
	}


	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}


	public Object getElemento() {
		return elemento;
	}


	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}


	@Override
	public String toString() {
		return "Celula [proxima=" + proxima + ", anterior=" + anterior + ", elemento=" + elemento + "]";
	}
	

}
