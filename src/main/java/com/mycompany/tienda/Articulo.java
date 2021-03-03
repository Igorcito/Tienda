/**
 * 
 */
package com.mycompany.tienda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author IGOR
 *
 */
public class Articulo {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		int opcion = -1;
		
		ArrayList<Articulo> catalogo = new ArrayList<Articulo>();
		inicializaCatalogo(catalogo);
		
		//SALUDO:
		System.out.println("Hola.");
		
		//BUCLE DEL MENÚ:
		do {
				//MENÚ DE OPCIONES:
				System.out.println(" ");
				System.out.println("-------------- MENÚ --------------");
				System.out.println(" ");
				System.out.println("Dar de alta un artículo. (Pulsa 1)");
				System.out.println("Comprar un artículo.     (Pulsa 2)");
				System.out.println("Ir al carrito.           (Pulsa 3)");
				System.out.println("Salir.                   (Pulsa 0)");
				opcion = entrada.nextInt();
				
				switch(opcion) 
				{
					case 1: System.out.println("--- DAR DE ALTA UN ARTÍCULO. ---");
							addArticuloCatalogo(catalogo, entrada, entrada2);
							mostrarCatalogo(catalogo);
						break;
					case 2:	System.out.println("--- COMPRAR UN ARTÍCULO. ---");
					
						break; 
					case 3: System.out.println("--- IR AL CARRITO. ---");
					
						break;
					case 0:
							System.out.println("Muchas gracias por su compra.");
						break;
					default:
						System.out.println("Opción incorecta, inténtelo de nuevo.");
						break;
				}
				
			}while(opcion != 0);
	}	
		
	private static void inicializaCatalogo(ArrayList<Articulo> c) 
	{
		c.add(new Articulo("0001", "Monitor", 200.00F, 10));
		c.add(new Articulo("0002", "Teclado", 10.00F, 100));
		c.add(new Articulo("0003", "RJ45 2M", 4.50F, 50));
		c.add(new Articulo("0004", "Monitor", 20.00F, 15));
	}
	
	private static void addArticuloCatalogo(ArrayList<Articulo> c, Scanner entrada, Scanner entrada2)
	{
			System.out.println("Introduce el codigo del nuevo articulo:");
			String codigo = entrada2.nextLine();
			System.out.println("Introduce el nombre del nuevo articulo:");
			String nombre = entrada2.nextLine();
			System.out.println("Introduce el precio del nuevo articulo:");
			float precio = entrada.nextFloat();
			System.out.println("Introduce el stock del nuevo articulo:");
			int stock = entrada.nextInt();
			System.out.println();
			c.add(new Articulo(codigo, nombre, precio, stock)); //PARA AÑADIR EL ARTÍCULO NUEVO AL CATÁLOGO.
	}
	
	private static void mostrarCatalogo(ArrayList<Articulo> c)
	{
		for (Articulo a: c)
		{
			System.out.println(a);
		}
	}

	private static Articulo buscarArticuloPorCodigo(ArrayList<Articulo> c, String codigo)
	{
		for (Articulo a: c)
		{
			if( )
		}
	}
	
	private static void comprar(Scanner entrada, Scanner entrada2, Carrito Carro, ArrayList<Articulo> c)
	{
		//MOSTRAMOS CATÁLOGO.
		mostrarCatalogo(c);
		//PEDIMOS ARTÍCULO POR CÓDIGO, LO BUSCAMOS
		System.out.println("Introduce el código del artículo que quieres comprar.");
		String codigo = entrada2.nextLine();
		//	SI EXISTE > PEDIMOS CANTIDAD.
		if ()
		//		SI HAY CANTIDAD > VERIFICAMOS DISPONIBILIDAD (DE CANTIDAD).
		
		//			SI VERIFICAMOS > AÑADIMOS EL ARTÍCULO(S) AL CARRITO.
		//MOSTRAMOS CARRITO
		//REPETIR MIENTRAS.
	}
	
	private static void confirmarCarrito()
	{
		//MOSTRAMOS CARRITO ARTICULOS +  CANTIDADES + EL TOTAL.
		//PREGUNTAMOS CONFIRMACIÓN.
		//SI SE CONFIRMA
		//MODIFICAR EN EL CATÁLOGO EL STOCK DEL CARRITO, RESTANDO CANTIDADES AL STOCK PRINCIPAL.
		//CAMBIAR EL ESTADO DEL CARRITO A "CONFIRMADO".
		//MOSTRAMOS MENSAJE DE SEGUIR COMPRANDO/SALIR.
	}
	
	
	
	
	
	
}