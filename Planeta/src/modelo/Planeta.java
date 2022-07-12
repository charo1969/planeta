/**
 * Ejercicio sobre los planetas.
 */
package modelo;

public class Planeta {

	private String nombre;
	private int satelite;
	private double masa;
	private double volumen;
	private int diametro;
	private int distancia;
	private String tipoPlaneta;
	private boolean observableASV;

	public static final double UA = 149597870; // constante

	// constructor sin parámetros
	public Planeta() {

		this.nombre = null;
		this.satelite = 0;
		this.masa = 0;
		this.volumen = 0;
		this.diametro = 0;
		this.distancia = 0;
		this.tipoPlaneta = "Terrestre";
		compruebaTipo();
		this.observableASV = false;

	}

	// método comprobarTipo de planeta y por defecto es Terrestre.
	protected void compruebaTipo() {
		/*
		 * if(this.tipoPlaneta.equals("Gaseoso") || this.tipoPlaneta.equals("Terrestre")
		 * || this.tipoPlaneta.equals("Enano")) { this.tipoPlaneta = tipoPlaneta; }else
		 * { this.tipoPlaneta = "Terrestre"; }
		 */
		if (!this.tipoPlaneta.equals("Gaseoso") && !this.tipoPlaneta.equals("Terrestre")
				&& !this.tipoPlaneta.equals("Enano")) {
			this.tipoPlaneta = "Terrestre";

		}
		// OTRA FORMA

		/*
		 * public String compruebaTipo(String tipoPlaneta){
		 * 
		 * if(tipoPlaneta.equalsIgnoreCase("GASEOSO") ||
		 * (tipoPlaneta.equalsIgnoreCase("ENANO")){ return tipoPlaneta.toUpperCase(); }
		 * return "TERRESTRE"; }
		 * 
		 * 
		 */

	}

	// constructor con parámetros
	public Planeta(String nombre, int satelite, double masa, double volumen, int diametro, int distancia,
			String tipoPlaneta, boolean observableASV) {
		super();
		this.nombre = nombre;
		this.satelite = satelite;
		this.masa = masa;
		this.volumen = volumen;
		this.diametro = diametro;
		this.distancia = distancia;
		this.tipoPlaneta = tipoPlaneta;
		compruebaTipo();
		this.observableASV = false;
	}

	// constructor copia
	public Planeta(Planeta p) {
		this.nombre = p.nombre;
		this.satelite = p.satelite;
		this.masa = p.masa;
		this.volumen = p.volumen;
		this.diametro = p.diametro;
		this.distancia = p.distancia;
		this.observableASV = p.observableASV;
		this.tipoPlaneta = p.tipoPlaneta;
		compruebaTipo();
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", satelite=" + satelite + ", masa=" + masa + ", volumen=" + volumen + ", diametro="
				+ diametro + ", distancia=" + distancia + ", tipoPlaneta=" + tipoPlaneta + ", observableASV="
				+ observableASV + ".";
	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSatelite() {
		return satelite;
	}

	public void setSatelite(int satelite) {
		this.satelite = satelite;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public String getTipoPlaneta() {
		return tipoPlaneta;
	}

	public void setTipoPlaneta(String tipoPlaneta) {
		this.tipoPlaneta = tipoPlaneta;
	}

	public boolean isObservableASV() {
		return observableASV;
	}

	public void setObservableASV(boolean observableASV) {
		this.observableASV = observableASV;
	}

	// método calculaDensidad. Es masa/volumen,

	public double calculaDensidad() {

		return this.masa / this.volumen;
	}

	// método siEsPlanetaExterior

	public boolean esPlanetaExterior() {

		double resUA = this.distancia / (UA / 1000000.0);

		if (resUA > 3.4) {

			return true;
		} else {

			return false;
		}

	}

}
