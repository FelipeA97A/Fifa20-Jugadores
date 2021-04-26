package fifa20;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BDController controlador = new BDController();
		ArrayList<Carta> cartas = controlador.dameCartas();
		String[] e = cartas.get(3).colorBar();
		for (int ç = 0; ç < e.length; ç++) {
			System.out.println(e[ç]);
		}
	}

}
