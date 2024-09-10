package Piezas;
//esta es la clase padre
public abstract class PiezaAjedrez
{
    protected int fila;
    protected int columna;

    public PiezaAjedrez(int fila, int columna) 
    {
        this.fila = fila;
        this.columna = columna;
    }

    public abstract int calcularMovimientos();
}


