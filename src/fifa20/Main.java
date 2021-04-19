package fifa20;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BDController controlador = new BDController();
		ArrayList<Carta> cartas = controlador.dameCartas();
		ArrayList<Jugador> jugadores = controlador.dameJugadores();
		System.out.println(controlador.dameCartaSimple(jugadores.get(5).getCod_jugador()).getNombre());
		System.out.println(jugadores.get(5).getCod_jugador());
	}

}
