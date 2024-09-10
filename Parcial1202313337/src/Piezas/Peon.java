package Piezas;

public class Peon extends PiezaAjedrez

{	private boolean seMuevePrimero;

	public Peon(int fila, int columna) 
	{
        super(fila, columna);
        
        this.seMuevePrimero = true;
        
    }

    @Override
    public int calcularMovimientos() 
    {
    	if (seMuevePrimero) 
    	{ 
            seMuevePrimero = false; 
            return 2; //solo si el peon mueve 2 o tambien 1 en su primer mov
        }
        
    	return 1; // y aca si solo puede 1
    }
       
    }
