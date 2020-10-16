package com.api_mysql.mysql_exmp.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "movimientos")
public class MovimientosModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, columnDefinition = "BIGINT(20)")
    private long folio;

    private long id_credito;
    private long id_cuenta;
    private String tp_movimiento;

	private float monto_capt;
	private float monto_ints;

	private Date fch_movimiento;

	private String estado;
    private String id_motivo;
    
    public MovimientosModel () {}

    public MovimientosModel (Long idx, Long idc, String tp, float mc, float mi, Date fm, String edo, String mtvo) {
        this.id_credito = idx;
        this.id_cuenta = idc;
        this.tp_movimiento =tp;
        this.monto_capt = mc;
        this.monto_ints = mi;
        this.fch_movimiento = fm;
        this.estado = edo;
        this.id_motivo = mtvo;
    }

    public Long getIdx() { return this.id_credito; }
    public Long getIdc() { return this.id_cuenta; }
    public String getTp() { return this.tp_movimiento; }
    public float getCap() { return this.monto_capt; }
    public float getInts() { return this.monto_ints; }
    public String getEstado() { return this.estado; }
    public Date getFchMov() { return this.fch_movimiento; }
    public String getMtvo() { return this.id_motivo; }

    public void setIdx(Long id) { this.id_credito = id; }
    public void setIdc(Long id) { this.id_cuenta = id; }
    public void setTp(String c) { this.tp_movimiento = c; }
    public void setCap(float id) { this.monto_capt = id; }
    public void setInts(float id) { this.monto_ints = id; }
    public void setEstado(String c) { this.estado = c; }
    public void setFchMov(Date d) { this.fch_movimiento = d; }
    public void setMtvo(String s) { this.id_motivo = s; }
}
