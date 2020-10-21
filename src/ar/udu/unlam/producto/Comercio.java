package ar.udu.unlam.producto;

import java.util.ArrayList;

public class Comercio {
			
		private String nombre;
		
	    private ArrayList <Producto> lista= new ArrayList <Producto> ();
		
	    
	  
	    
	    public Comercio(String nombre) {
			this.nombre=nombre;
	    	
		}
	    

		public Boolean agregarAListaDeProducto(Producto producto) {
			
			return  this.lista.add(producto);
		}



		public Integer obtenerCantidadDeProductos() {
			
			return this.lista.size();
		}



		public Producto buscarProductoPorCodigo(String codigo) {
	                     
			
			for (Producto producto : lista) {
				if (producto.getCodigo().equals(codigo))
					return producto;
				
			}
			
			
			
			return null;
			//Otra forma
			//for (int i = 0; i < this.lista.size(); i++) {
//				if (lista.get(i).getCodigo().equals(codigo))
//					return lista.get(i);
//			}
		}

	
}
