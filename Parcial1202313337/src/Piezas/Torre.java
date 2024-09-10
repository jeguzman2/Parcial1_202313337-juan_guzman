package Piezas;

public class Torre extends PiezaAjedrez
{
	public Torre(int fila, int columna)
	{
        super(fila, columna);
    }

    @Override
    public int calcularMovimientos() 
    {
    	return 14; // la imagen muesta que se puede mover 14 casillas
    }
}
