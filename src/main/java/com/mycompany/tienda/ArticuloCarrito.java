/**
 * 
 */
package com.mycompany.tienda;

/**
 * @author IGOR
 *
 */
public class ArticuloCarrito {

	
		//ATRIBUTOS:
		Articulo elemento;
		int cantidad;
		
		
		//CONSTRUCTOR POR DEFECTO:
		public ArticuloCarrito()
		{
			
		}			
		
		//CONSTRUCTOR CON PARÁMETROS:
		public ArticuloCarrito(Articulo articulo, int cantidad)
		{
			this.elemento = articulo;
			this.cantidad = cantidad;
		}
		
		@Override
		public String toString ()
		{
			return this.elemento + "x" + this.cantidad + "\n";
		}
		
		
}
