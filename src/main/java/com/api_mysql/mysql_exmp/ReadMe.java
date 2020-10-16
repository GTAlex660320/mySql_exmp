package com.api_mysql.mysql_exmp;

import java.util.Date;
import javax.persistence.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.api_mysql.mysql_exmp.models.ClientesModel;
import com.api_mysql.mysql_exmp.models.CuentasModel;


@RestController
public class ReadMe {

   private static EntityManager manager;
   private static EntityManagerFactory emf;

   public String request_txt;
   public String response_txt;

   @RequestMapping ("/")
   public String saludo () {
       response_txt = "Hola, demo de API con MySQL <br> Para mayor informacion ir a localhost:8080/readme";
       return response_txt;
   }

   @RequestMapping ("/readme")
   public String readme () {
       request_txt = "<body><head> Ejemplo de API rest. </head></body>";
       return request_txt;
   }


   @RequestMapping ("/test")
   public String test () {
       //testAddCliente.run();
       return "Hecho 1.1.1";
   }


   @RequestMapping ("addCliente")
   public ResponseEntity<ClientesModel> addCliente() { 
      emf = Persistence.createEntityManagerFactory ("Persistencia");
      manager = emf.createEntityManager ();
      ClientesModel cliente =  new ClientesModel();
      cliente.setId (2L);
      cliente.setClientName ("HALL JORDAN");
      cliente.setClientRfc ("GATA660320");

      manager.getTransaction().begin();    
        manager.persist(cliente);     
      manager.getTransaction().commit();

      return ResponseEntity.ok(cliente);
   }

   @RequestMapping ("addCuenta")
   public ResponseEntity<CuentasModel> addCcuenta() { 
    emf = Persistence.createEntityManagerFactory ("Persistencia");
    manager = emf.createEntityManager ();
    CuentasModel cuenta =  new CuentasModel();

    /* Aqui se taería la info del front */
    cuenta.setId(1204523L);
    cuenta.setTp_cuenta("DB");
    cuenta.setIdCte(1L); 
    cuenta.setEstado("01"); 
    cuenta.setFch_alta(new Date(2020, 10, 16) );
    cuenta.setSaldo(1000); 
    /* */

    manager.getTransaction().begin();    
      manager.persist(cuenta);     
    manager.getTransaction().commit();

    return ResponseEntity.ok(cuenta);
 }

}
