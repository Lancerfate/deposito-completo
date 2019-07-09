package Deposito;

public class Productos 
{
	private String codigo;
	private String descripcion;
	private float precio;
	private int cantidadProductos;


	public Productos(String codigo, String descripcion, float precio, int cantidadProductos) 
	{
		this.codigo= codigo;
	    this.descripcion= descripcion;
	    this.precio= precio;
	    this.cantidadProductos= cantidadProductos;
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

}
