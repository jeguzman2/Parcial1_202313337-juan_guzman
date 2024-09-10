package Piezas;

public class Alfil extends PiezaAjedrez
{
	public Alfil(int fila, int columna) 
	{
        super(fila, columna);
    }

    @Override
    public int calcularMovimientos() 
    {
    	
        int movimientos = 0; 
        
        //aca se calcula las direcciones del alfil
        
        //math.min retorna el num menor 
        
        // diagonales en las direcciones posibles
        movimientos += Math.min(7 - fila, 7 - columna); 
        
        movimientos += Math.min(fila, columna);         
        
        movimientos += Math.min(7 - fila, columna);     
        
        movimientos += Math.min(fila, 7 - columna);     

        return movimientos;
       
    }
}
