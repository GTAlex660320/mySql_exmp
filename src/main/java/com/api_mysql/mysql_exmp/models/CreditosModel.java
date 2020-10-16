
package com.api_mysql.mysql_exmp.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "creditos")
public class CreditosModel implements Serializable {

    private static final long serialVersionUID = 1L;   

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, columnDefinition = "BIGINT(20)")
    private long id_credito;
    private long id_cliente;
    
    private String tp_credito;
    private String estado;
    private Date fch_solc;
    private Date fch_inic;
    private Date fch_fin;

    private int plazo;
    private float tasa;
    private float monto_solc;
    private float monto_capt;
    private float monto_intrs;

    private float saldo_capt;
    private float saldo_intrs;
    private float saldo_penal;
 

    public CreditosModel() {}

    public Long getId() { return this.id_credito; }
    public Long getId_cliente() { return this.id_cliente; }
    
    public String getTp_credito() { return this.tp_credito; }
    public String getEstado() { return this.estado; }
    public Date getFch_solc() { return this.fch_solc; }
    public Date getFch_inic() { return this.fch_inic; }
    public Date getFch_fin() { return this.fch_fin; }

    public int getPlazo() { return this.plazo; }
    public float getTasa() { return this.tasa; }
    public float getMonto_solc() { return this.monto_solc; }
    public float getMonto_cap() { return this.monto_capt; }
    public float getMonto_intrs() { return this.monto_intrs; }

    public float getSaldo_cap() { return this.saldo_capt; }
    public float getSaldo_intrs() { return this.saldo_intrs; }
    public float getSaldo_penal() { return this.saldo_penal; }
 

    public void setId(Long id) { this.id_credito = id; }
    public void setId_cliente(Long id) { this.id_cliente =id; }
    
    public void setTp_credito(String c) { this.tp_credito = c; }
    public void setEstado(String c) { this.estado = c; }
    public void setFch_solc(Date d) { this.fch_solc = d; }
    public void setFch_inic(Date d) { this.fch_inic = d; }
    public void setFch_fin(Date d) { this.fch_fin = d; }

    public void setPlazo(int n) { this.plazo = n; }
    public void setTasa(float n) { this.tasa = n; }
    public void setMonto_solc(float n) { this.monto_solc = n; }
    public void setMonto_cap(float n) { this.monto_capt = n; }
    public void setMonto_intrs(float n) { this.monto_intrs = n; }

    public void setSaldo_cap(float n) { this.saldo_capt = n; }
    public void setSaldo_intrs(float n) { this.saldo_intrs = n; }
    public void setSaldo_penal(float n) { this.saldo_penal = n; }
 
}
