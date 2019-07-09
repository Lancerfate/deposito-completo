package Deposito;

public class Deposito 
{
	private	Productos listaProductos [] ; 
	private int cantidadProductosIngresados ; 	
	
	public Deposito(int productosDeposito) 
	{      //pasamos cuantos productos va a tener deposito   
		listaProductos= new Productos[productosDeposito] ; //inicializo el array con la cantidad de productos 
	    cantidadProductosIngresados= 0 ; 	
	}
			
	public void agregarProducto (Productos producto)
	{
		if(validarProducto(producto.getCodigo()) == true)
		{
			if(buscarProducto(producto.getCodigo()) == false || cantidadProductosIngresados == 0)
			{
				for(int i=0; i<listaProductos.length; i++) 
				{
					if(listaProductos[i]== null)
					{
						listaProductos[i]= producto;
						cantidadProductosIngresados++ ; 
						break;
					}	 
			 
				}
			}
			else 
			{
				System.out.println("El codigo del producto ya existe");
			}
		}
		else
		{
			System.out.println("El codigo no cumple con los requisitos.");
		}
	}	
			
	public void verListaProductos()
	{
	   for(int i=0; i<listaProductos.length; i ++)
	   {
	    	System.out.println(listaProductos[i]);
	   }
	}
		
	public boolean buscarProducto (String codigo)
	{
		for(int i=0; i<cantidadProductosIngresados; i++)
		{
			if(codigo.equalsIgnoreCase(listaProductos[i].getCodigo())) //ignora si la palabra esta en mayuscula o minuscula 
				{
					System.out.println("El producto " + listaProductos[i].getCodigo() + " se encuentra en la posicion " + i );
					return true;
			    }
				
		}
		return false;
	}
			
	public void ordenarPorPrecio()
	{
		for(int i=0 ; i<cantidadProductosIngresados; i++) 
	    {
			for(int j=0; j<cantidadProductosIngresados-1; j++)
	    	{
				if(listaProductos[j].getPrecio()> listaProductos[j+1].getPrecio())
	    		{
					Productos temporal;
	    			temporal= listaProductos[j];
	    			listaProductos[j]= listaProductos[j+1];
	    			listaProductos[j+1]= temporal ;
	    		}
	    	}	
	    }	
	    		
	}
	   
	public void ordenarPorCantidad()
	{
	    for(int i=0 ; i<cantidadProductosIngresados; i++) 
	    {
	    	for(int j=0; j<cantidadProductosIngresados-1; j++)
	    	{
	    		if(listaProductos[j].getCantidadProductos()> listaProductos[j+1].getCantidadProductos())
	    		{
	    			Productos temporal;
	    			temporal= listaProductos[j];
	    			listaProductos[j]= listaProductos[j+1];
	    			listaProductos[j+1]= temporal ; 
	    			
	    		}
	    	}	
	    }	
	    		
	}
	
	    
	public boolean validarProducto(String codigo)
	{
		if(Character.isLetter(codigo.charAt(0)) == true && codigo.length() == 4 )
		{
			return true;
		}
		return false;
	}
	
	public void calcularPrecioPromedio()
	{
		double sumaPrecios = 0;
		
		for(int i = 0; i < cantidadProductosIngresados ; i++)
		{
			sumaPrecios += listaProductos[i].getPrecio();
			
		}
		System.out.println("El precio promedio es: " + (sumaPrecios/cantidadProductosIngresados));
	}
	
	public Productos obtenerProductoCaro()
	{
		Productos productoCaro = null;
		
		for(int i = 0; i < cantidadProductosIngresados; i++)
		{
			if(i == 0)
			{
				productoCaro = listaProductos[i];
			}
			else
			{
				if(listaProductos[i].getPrecio() > productoCaro.getPrecio())
				{
					productoCaro = listaProductos[i];
				}
			}
		}
		
		return productoCaro;
	}
	    
}
