
package qc.ag.proyecto1.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
class TestTodo {

    
    public static void main(String[] args) {
      
        //Paso1.- abrir la sesion-factory
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
              
                Session sesion = factory.openSession();
        
                //Empezar una transa acción
        Transaction tranza = sesion.beginTransaction();
        
            // Haremos un insert
        Trabajador t = new Trabajador ("Juan", "Campos", "Martinez");
        sesion.save(t);
        
            //Liberamos la transaccion
        tranza.commit();
            
            //Cerramos la sesion, es decir devolvemos la libertar al borrador
        sesion.close();
    }
    
}
