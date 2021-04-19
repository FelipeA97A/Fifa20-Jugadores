package fifa20;
public class Carta {
	
	private String nombre;
	private int cod_jugador;
	private int rat;
	private String pos;
	private int precio;
	private int pac;
	private int sho;
	private int pas;
	private int dri;
	private int def;
	private int phy;
	private int pierna_mala;
	private int filigranas;
	
	
	public Carta() {
		
	}
	
	public Carta(String nombre, int cod_jugador, int rat, String pos, int precio, int pac, int sho, int pas, int dri,
			int def, int phy, int pierna_mala, int filigranas) {
		super();
		this.nombre = nombre;
		this.cod_jugador = cod_jugador;
		this.rat = rat;
		this.pos = pos;
		this.precio = precio;
		this.pac = pac;
		this.sho = sho;
		this.pas = pas;
		this.dri = dri;
		this.def = def;
		this.phy = phy;
		this.pierna_mala = pierna_mala;
		this.filigranas = filigranas;
	}
	
	public Carta(int rat, String pos, int precio, int pac, int sho, int pas, int dri,
			int def, int phy, int pierna_mala, int filigranas) {
		super();
		this.rat = rat;
		this.pos = pos;
		this.precio = precio;
		this.pac = pac;
		this.sho = sho;
		this.pas = pas;
		this.dri = dri;
		this.def = def;
		this.phy = phy;
		this.pierna_mala = pierna_mala;
		this.filigranas = filigranas;
	}
	public Carta(String nombre, int cod_jugador, int rat, String pos, int precio, int pac, int sho, int pas, int dri,
			int def, int phy, int pierna_mala, int filigranas, Jugador jugador) {
		super();
		this.nombre = nombre;
		this.cod_jugador = cod_jugador;
		this.rat = rat;
		this.pos = pos;
		this.precio = precio;
		this.pac = pac;
		this.sho = sho;
		this.pas = pas;
		this.dri = dri;
		this.def = def;
		this.phy = phy;
		this.pierna_mala = pierna_mala;
		this.filigranas = filigranas;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCod_jugador() {
		return cod_jugador;
	}

	public void setCod_jugador(int cod_jugador) {
		this.cod_jugador = cod_jugador;
	}

	public int getRat() {
		return rat;
	}

	public void setRat(int rat) {
		this.rat = rat;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPac() {
		return pac;
	}

	public void setPac(int pac) {
		this.pac = pac;
	}

	public int getSho() {
		return sho;
	}

	public void setSho(int sho) {
		this.sho = sho;
	}

	public int getPas() {
		return pas;
	}

	public void setPas(int pas) {
		this.pas = pas;
	}

	public int getDri() {
		return dri;
	}

	public void setDri(int dri) {
		this.dri = dri;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getPhy() {
		return phy;
	}

	public void setPhy(int phy) {
		this.phy = phy;
	}

	public int getPierna_mala() {
		return pierna_mala;
	}

	public void setPierna_mala(int pierna_mala) {
		this.pierna_mala = pierna_mala;
	}

	public int getFiligranas() {
		return filigranas;
	}

	public void setFiligranas(int filigranas) {
		this.filigranas = filigranas;
	}

	


	public void mostrarCarta() {
		System.out.println( "Carta: " + nombre + " - Precio: " + precio + "\n--------------------------------\nRat: " + rat + " - Posición: " + pos
				+ " - Pierna Mala: " + pierna_mala + " - Filigranas: " + filigranas + "\n--------------------------------\nPAC: "+pac+"\nSHO: " + sho + "\nPAS: " + pas + "\nDRI: " + dri + "\nDEF: "
				+ def + "\nPHY: " + phy +"\n");
	}
	
	public String colorRat() {
		String color = "background-color: #E9BC0B; color: black;";
		return color;
	}
	
	public String colorPac() {
		String color = "background-color: ";
		if (this.pac < 50) {
			color = color + "#F44336; color: white";
		} else if (this.pac < 70) {
			color = color + "#FB8C00; color: white;";
		} else if (this.pac < 80) {
			color = color + "#E9BC0B; color: black;";
		} else if (this.pac < 90) {
			color = color + "#4CAF50; color: white;";
		} else {
			color = color + "#09720D; color: white";
		}
		return color;
	}
	
	public String colorSho() {
		String color = "background-color: ";
		if (this.sho < 50) {
			color = color + "#F44336; color: white";
		} else if (this.sho < 70) {
			color = color + "#FB8C00; color: white;";
		} else if (this.sho < 80) {
			color = color + "#E9BC0B; color: black;";
		} else if (this.sho < 90) {
			color = color + "#4CAF50; color: white;";
		} else {
			color = color + "#09720D; color: white";
		}
		return color;
	}

	public String colorPas() {
		String color = "background-color: ";
		if (this.pas < 50) {
			color = color + "#F44336; color: white";
		} else if (this.pas < 70) {
			color = color + "#FB8C00; color: white;";
		} else if (this.pas < 80) {
			color = color + "#E9BC0B; color: black;";
		} else if (this.pas < 90) {
			color = color + "#4CAF50; color: white;";
		} else {
			color = color + "#09720D; color: white";
		}
		return color;
	}
	
	public String colorDri() {
		String color = "background-color: ";
		if (this.dri < 50) {
			color = color + "#F44336; color: white";
		} else if (this.dri < 70) {
			color = color + "#FB8C00; color: white;";
		} else if (this.dri < 80) {
			color = color + "#E9BC0B; color: black;";
		} else if (this.dri < 90) {
			color = color + "#4CAF50; color: white;";
		} else {
			color = color + "#09720D; color: white";
		}
		return color;
	}
	
	public String colorDef() {
		String color = "background-color: ";
		if (this.def < 50) {
			color = color + "#F44336; color: white";
		} else if (this.def < 70) {
			color = color + "#FB8C00; color: white;";
		} else if (this.def < 80) {
			color = color + "#E9BC0B; color: black;";
		} else if (this.def < 90) {
			color = color + "#4CAF50; color: white;";
		} else {
			color = color + "#09720D; color: white";
		}
		return color;
	}
	
	public String colorPhy() {
		String color = "background-color: ";
		if (this.phy < 50) {
			color = color + "#F44336; color: white";
		} else if (this.phy < 70) {
			color = color + "#FB8C00; color: white;";
		} else if (this.phy < 80) {
			color = color + "#E9BC0B; color: black;";
		} else if (this.phy < 90) {
			color = color + "#4CAF50; color: white;";
		} else {
			color = color + "#09720D; color: white";
		}
		return color;
	}
}
