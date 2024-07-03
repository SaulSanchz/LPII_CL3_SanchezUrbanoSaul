package TestEntidades;

import java.util.List;

import Dao.ClassProductoImp;
import model.TblProductocl3;

public class TestEntidadProducto {

	public static void main(String[] args) {
		
		//realizamos la respectiva instancia de las clases...
		TblProductocl3 productocl3=new TblProductocl3();
		ClassProductoImp crud=new ClassProductoImp();
						
		//testeamos el metodo listado
		List<TblProductocl3> listado=crud.ListadoProducto();
		//aplicamos un bucle for...
		for(TblProductocl3 lis:listado){
							
		//imprimimos por pantalla
		System.out.println("Nombre: "+lis.getNombrecl3()+
							" Precio de venta: "+lis.getPrecioventacl3()+" Precio de compra: "+lis.getPreciocompcl3()
							+" Estado: "+lis.getEstadocl3()+" Descripción: "+lis.getDescripcl3());
				}

	}

}
