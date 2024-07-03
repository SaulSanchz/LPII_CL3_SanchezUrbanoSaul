package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl3;

public class ClassProductoImp implements IProducto  {

	public void RegistrarProducto(TblProductocl3 producto) {
		
		//establecer conexion con la unidad de persistencia...
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LP2_CL3_SanchezUrbanoSaul");
		//permite gestionar entidades
		EntityManager em=fabr.createEntityManager();
		//iniciar transaccion
		em.getTransaction().begin();
		//registramos
		em.persist(producto);
		//emitimos mensaje por consola
		System.out.println("Producto registrado en la BD correctamente");
		//confirmamos
		em.getTransaction().commit();
		//cerramos la transaccion
		em.close();		
	}

	public void ActualizarProducto(TblProductocl3 producto) {
		
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LP2_CL3_SanchezUrbanoSaul");
		//permite gestionar entidades
		EntityManager em=fabr.createEntityManager();
		//iniciar transaccion
		em.getTransaction().begin();
		//actualizamos
		em.merge(producto);
		//comfirmamos 
		em.getTransaction().commit();
		//cerramos
		em.close();	
	}

	public void EliminarProducto(TblProductocl3 producto) {
		
		//establecemos la conexion con unidad de persistencia.
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LP2_CL3_SanchezUrbanoSaul");
		//gestionar las entidades
		EntityManager em=fabr.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos el codigo a eliminar
		TblProductocl3 elim=em.merge(producto);
		//procedemos a eliminar el registro
		em.remove(elim);
		//emitimos mensaje por consola
		System.out.println("Producto eliminado de la base de datos");
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
	}

	public TblProductocl3 BuscarProducto(TblProductocl3 producto) {
		//establecemos la conexion con la unidad de persistencia..
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LP2_CL3_SanchezUrbanoSaul");
		//gestionar las entidads
		EntityManager em=fabr.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos el codigo a buscar
		TblProductocl3 busproducto=em.find(TblProductocl3.class,producto.getIdproductocl3());
		//confirmamos 
		em.getTransaction().commit();
		//cerramos
		em.close();
		return busproducto;
	}

	public List<TblProductocl3> ListadoProducto() {
		//establecemos la conexion con la unidad de persistencia..
        EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LP2_CL3_SanchezUrbanoSaul");
        //gestionamos las entidads
        EntityManager em=fabr.createEntityManager();
        //iniciamos la transaccion
        em.getTransaction().begin();
        //recuperamos los productos  de la base de datos
        //utilizando jpql
        List<TblProductocl3> listadoproductos=em.createQuery("select c from TblProductocl3 c",TblProductocl3.class).getResultList();
        //confirmamos la transaccion
        em.getTransaction().commit();
        //cerramos
        em.close();
		return listadoproductos;

	}

}
