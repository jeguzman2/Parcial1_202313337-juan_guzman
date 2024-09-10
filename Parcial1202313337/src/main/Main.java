package main;
import Piezas.Alfil;
import Piezas.Peon;
import Piezas.Torre;
import Piezas.PiezaAjedrez;
//para probar
public class Main
{
	public static void main(String[] args) 
	{
		//coordenadas para probar
		Peon peon = new Peon(1, 1);
		
        Torre torre = new Torre(0, 0);
        
        Alfil alfil = new Alfil(2, 0);

        System.out.println("El peón puede moverse a " + peon.calcularMovimientos() + " casilla(s).");
        
        System.out.println("La torre puede moverse a " + torre.calcularMovimientos() + " casilla(s).");
        
        System.out.println("El alfil puede moverse a " + alfil.calcularMovimientos() + " casilla(s).");
    }
}
