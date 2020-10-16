
   El ejemplo esta desarrollado utilizando Maven, SripngBoot y Hibernate <JAVAX>

   Se crea una base de datos en MySQL (democreds) con las siguientes tablas
   Clientes : Almacena la informacon del cliente
   Cuentas :  Almacena la informacion de las cuentas que abre el liente
   Creditos : Almacena la informacion de los creditos y su estado y balance
   Movimientos : Registra los movimientos que realiza el cliente (Aperturas, solicitudes, pagos y creditos, etc)
         script en **\src\main\resources\templates\BaseDatos.sql

         NOTA: El manejo de la coneccion DLL a MySQL esta como validate, por lo que la 
               estructura de la base de datos debe estar ya creada.

   Auxiliares
     Estados_Cuentas
	 Estados_creditos
	 Motivos
	 Tipos_movimiento
	 Tipos_cuentas

   El sitio consta de la siguiente estructura

        controllers       //  Codigo que controla el flujo del sitio
	models            //  Entidades utilizadas en la aplicacion
	repositories      //  Conexion de las entidades con la base de datos
	services          //  Microservicios implementados
        templates         //  Paginas prediseñadas <en segunda version>

Micro servicios implementados
     Clientes
         lista Clientes:   Acceder por la ruta  localhost:8080/Cliente
         lista Clientes por id:  Acceder por la localhost:8080/Cliente/{id}
         guardar cliente:   Acceder por la  localhost:8080/Cliente
                            Nota enviar por metodo POST la estructura JSON
                             {"id": 1,
                             "clientName":
                              "Bruce Wynne",
                              "clientRfc": "WYBB380510BTM"}
                             para pruebas se uso el programa postman

     Cuentas
         lista Cuentas:   Acceder por la  localhost:8080/Cuenta
         lista Cuenta por id:  Acceder por la  localhost:8080/Cuenta/{id}
         guardar cuenta:   Acceder por la  localhost:8080/Cuenta
                            Nota enviar por metodo POST la estructura JSON  
                        {
                         "tp_cuenta": "DB",
                         "estado": "01",
                         "fch_alta": "2020-05-10",
                        "id": 1204523,
                        "saldo": 1000.0,
                        "idCte": 1}   
                        para pruebas se uso el programa postman       

     creditos
         lista Creditos:  Acceder por la  localhost:8080/Credito
         lista Credito por id: Acceder por la  localhost:8080/Credito/{id}
         guardar credito:   Acceder por la  localhost:8080/Credito
                            Nota enviar por metodo POST la estructura JSON    
                            {
                             "id_cliente": 1,
                             "tp_credito": "01",
                             "estado": "01",
                             "fch_solc": "2020-08-05",
                             "fch_inic": "2020-08-26",
                             "fch_fin": "2021-10-21",
                             "plazo": 12,
                             "tasa": 1.0,
                             "monto_solc": 5000000.0,
                             "monto_intrs": 250000.0,
                             "saldo_intrs": 0.0,
                             "saldo_penal": 0.0,
                             "id": 1,
                             "monto_cap": 5000000.0,
                             "saldo_cap": 0.0
                             }
                             para pruebas se uso el programa postman         

     Movimientos
         lista Movimiento:  Acceder por la localhost:8080/Movimiento
         lista Movimiento por id: Acceder por la  localhost:8080/Movimiento/{id}
         guardar Movimiento: Acceder por la  localhost:8080/Movimiento
                            Nota enviar por metodo POST la estructura JSON 
                            {
                              "estado": "01",
                              "tp": "DB",
                              "cap": 100000.0,
                              "fchMov": "2020-10-01",
                              "mtvo": "00",
                              "ints": 120.0,
                              "idc": 1012501235,
                              "idx": 0
                            }           

    NOTAS.  Los servicios son ejemplos, no se hacen validaciones ni estan sujetos a mayor
    seguridad. La integridad referencial y funcional esta limitada para facilitar el desarrollo
    del ejercicio.                                                                               