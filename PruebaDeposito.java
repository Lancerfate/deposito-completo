package Deposito;

import java.util.Scanner;

public class PruebaDeposito {

	public static void main(String[] args) 
	{
		/*Productos producto1= new Productos("A981", "aaa", 150, 55) ; 
		Productos producto2= new Productos("A982", "aab", 100, 25) ;
		Productos producto3= new Productos("A983", "aac", 50, 15) ; */
		
		
		/*Deposito miDeposito= new Deposito(5) ; 
		miDeposito.agregarProducto(producto1);
		miDeposito.agregarProducto(producto2);
		miDeposito.agregarProducto(producto3);
		miDeposito.verListaProductos();
	    System.out.println(miDeposito.buscarProducto("a983")) ;  
		
		miDeposito.ordenarPorPrecio();
	    miDeposito.verListaProductos();*/
	
	
	  Scanner teclado= new Scanner(System.in); 
	  int opcion= 0 ; 
	
	  System.out.println("¿Cuantos productos entraran en su deposito?");
	  int productosDeposito= teclado.nextInt() ; 
	  Deposito miDeposito= new Deposito(productosDeposito) ; 
	  
	  do
	  {
		  System.out.println("Ingrese 1 si quiere ingresar un producto");
		  System.out.println("Ingrese 2 si quiere saber si hay un producto en su deposito");
		  System.out.println("Ingrese 3 si quiere ordenar los productos por precio");
		  System.out.println("Ingrese 4 si quiere ordenar los productos por su cantidad");
		  System.out.println("Ingrese 5 si quiere ordenar los productos por su codigo.");
		  System.out.println("Ingrese 6 si desea saber el precio promedio");
		  System.out.println("Ingrese 7 si desea obtener el producto mas caro");
		  System.out.println("Ingrese 8 si desea eliminar un producto.");
		  System.out.println("Ingrese 9 si quiere ver en su deposito");
		  System.out.println("Ingrese 0 si desea salir.");
		  opcion= teclado.nextInt() ; 
		  
		  
		  switch(opcion) 
		  {
		  case 1:
			  System.out.println("Ingrese el codigo del producto.");
			  String codigo= teclado.next(); 
		      System.out.println("Ingrese la descripcion del producto");
		      String descripcion=teclado.next();
		      System.out.println("Ingrese el precio del producto");
		      float precio=teclado.nextFloat();
		      System.out.println("Ingrese la cantidad de productos.");
		      int cantidadProductos=teclado.nextInt();
		     
		      Productos miProducto= new Productos (codigo, descripcion, precio, cantidadProductos);
			  miDeposito.agregarProducto(miProducto);
		      break;
		   
		  case 2:
			  System.out.println("Ingrese el codigo del producto que desea saber si esta en el deposito");
			  String codigoABuscar=teclado.next() ; 
			  
			  System.out.println(miDeposito.buscarProducto(codigoABuscar));
			  
			  
			  break;
		
		  case 3:
			  
			  miDeposito.ordenarPorPrecio();
			  System.out.println("Los productos se ordenaron por precio.");
			  
               break;
			  
		  case 4:
			  miDeposito.ordenarPorCantidad();
			  System.out.println("Los productos se ordenaron por cantidad.");
			  break;
		  case 5:
			  miDeposito.ordenarPorCodigo();
			  System.out.println("Los productos se ordenaron por codigo.");
			  break;
		  case 6:
			  miDeposito.calcularPrecioPromedio();
			  break;
		  case 7:
			  System.out.println("El producto mas caro es :");
			  System.out.println(miDeposito.obtenerProductoCaro());
			  break;
		  case 8:
			  System.out.println("Ingrese el codigo del producto que desea eliminar: ");
			  String codigoEliminar = teclado.next();
			  
			  miDeposito.eliminarProducto(codigoEliminar);
			  System.out.println("El producto se ha eliminado.");
			  break;
		  case 9:
			  System.out.println("Estos productos se encuentran en su deposito");
              
			  miDeposito.verListaProductos(); 
			  break;
		  }
		  
	  }while(opcion!=0) ;	
		
		/*Deposito miDeposito = new Deposito(5);
		Productos miProducto = new Productos("A987", "AAA", 17.5f, 98);
		Productos miProducto1 = new Productos("B987", "AAA", 17.5f, 98);
		Productos miProducto2 = new Productos("C987", "AAA", 17.5f, 98);
		Productos miProducto3 = new Productos("D987", "AAA", 17.5f, 98);
		Productos miProducto4 = new Productos("E987", "AAA", 17.5f, 98);
		
		miDeposito.agregarProducto(miProducto);
		miDeposito.agregarProducto(miProducto2);
		miDeposito.agregarProducto(miProducto3);
		miDeposito.agregarProducto(miProducto4);
		miDeposito.agregarProducto(miProducto1);
		
		miDeposito.verListaProductos();
		System.out.println("--------|-----------");
		miDeposito.eliminarProducto("A987");
		miDeposito.verListaProductos();*/
	  
	}
		

}


