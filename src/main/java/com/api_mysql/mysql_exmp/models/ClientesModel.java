package com.api_mysql.mysql_exmp.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class ClientesModel  {  //implements Serializable

    //private static final long serialVersionUID = 1L;

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, columnDefinition = "BIGINT(20)")
    private long id_cliente;
    private String n_cliente;
    private String rfc;

    public ClientesModel() {}

    public Long getId() {
        return id_cliente;
    }

    public void setId(Long id) {
        this.id_cliente = id;
    }

    public void Cliente (long Id, String Name, String Idleg) {
        this.id_cliente = Id;
        this.n_cliente = Name;
        this.rfc = Idleg;
    }

    public String getClientName () {
        return this.n_cliente;
    }

    public String getClientRfc () {
        return this.rfc;
    }    

    public void setClientName (String name) {
        this.n_cliente = name;
    }

    public void setClientRfc (String rfc) {
        this.rfc = rfc;
    } 

}


