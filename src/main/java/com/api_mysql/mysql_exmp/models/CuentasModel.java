package com.api_mysql.mysql_exmp.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "cuentas")
public class CuentasModel   {   // implements Serializable
 
    //private static final long serialVersionUID = 1L;

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cuenta", unique = true, nullable = false, columnDefinition = "BIGINT(20)")
    private long id_cuenta;
    
    private String tp_cuenta;
    private Long id_cliente;
    private String estado;
    private Date fch_alta;
    private float Saldo;
    
    public CuentasModel () {}

    public CuentasModel (String tp, Long idc, String edo, Date fcha, float Sdo) {
        this.tp_cuenta = tp;
        this.id_cliente = idc;
        this.estado = edo;
        this.fch_alta = fcha;
        this.Saldo = Sdo;
    }

    public Long getId() { return this.id_cuenta; }
    public String getTp_cuenta() { return this.tp_cuenta; }
    public Long getIdCte() { return this.id_cliente; }
    public String getEstado() { return this.estado; }
    public Date getFch_alta() { return this.fch_alta; }
    public float getSaldo() { return this.Saldo; }

    public void setId(Long id) { this.id_cuenta = id; }
    public void setTp_cuenta(String c) { this.tp_cuenta = c; }
    public void setIdCte(Long id) { this.id_cliente = id; }
    public void setEstado(String c) { this.estado = c; }
    public void setFch_alta(Date d) { this.fch_alta = d; }
    public void setSaldo(float s) { this.Saldo = s; }

    @Override
    public String toString() { 
        return "Cuenta [id_cuenta="+id_cuenta+", id_cliente="+id_cliente+"]";
    }
 
}
