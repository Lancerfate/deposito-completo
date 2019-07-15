package Deposito;

public class Productos 
{
	private String codigo;
	private String descripcion;
	private float precio;
	private int cantidadProductos;
	private String contrasenia;


	public Productos(String codigo, String descripcion, float precio, int cantidadProductos, String contrasenia) 
	{
		this.codigo= codigo;
	    this.descripcion= descripcion;
	    this.precio= precio;
	    this.cantidadProductos= cantidadProductos;
	    this.contrasenia = contrasenia;
	}
		
	
	public String toString()
	{
		return("El codigo del producto es " + codigo + " la descripcion es " + descripcion + " el precio es " + precio + " la cantidad de productos de este tipo son " + cantidadProductos) ;
	} 
		
		
	public void setCodigo(String codigo)
	{
		this.codigo= codigo ; 
	}
		
	public void setDescripcion(String descripcion)
	{
		this.descripcion= descripcion;
	}
		
	public void setPrecio(float precio)
	{
		this.precio= precio ; 
	}
		
	public void setcantidadProductos(int cantidadProductos)
	{
	    this.cantidadProductos= cantidadProductos ; 
	}	

	public String getCodigo()
	{
	    return codigo ; 
	}

	public String getDescripcion()
	{
	    return descripcion;
	} 

	public float getPrecio()
	{
	    return precio;
	}

	public int getCantidadProductos()
	{
		return cantidadProductos ; 
	}
	
	public String getContrasenia()
	{
		return contrasenia;
	}
	
	public void setContrasenia(String contrasenia)
	{
		this.contrasenia = contrasenia;
	}

}
