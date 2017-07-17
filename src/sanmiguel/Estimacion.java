package sanmiguel;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the estimacion database table.
 * 
 */
@Entity
@Table(name="estimacion")
@NamedQuery(name="Estimacion.findAll", query="SELECT e FROM Estimacion e")
public class Estimacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="estim_id", unique=true, nullable=false)
	private int estimId;

	@Column(name="bjas_x_pta_mes")
	private float bjasXPtaMes;

	@Column(name="bjas_x_pta_temp")
	private float bjasXPtaTemp;

	@Column(name="calidad_prct")
	private float calidadPrct;

	@Column(length=10)
	private String fecha;

	@Column(length=25)
	private String finca;

	@Column(name="limones_x_bdja")
	private float limonesXBdja;

	@Column(length=25)
	private String lote;

	@Column(length=140)
	private String observaciones;

	@Column(length=10)
	private String tamaño;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usuario_id")//, referencedColumnName="usuario_id")
	private Usuario usuario;

	public Estimacion() {
	}

	
	
	
	
	public int getEstimId() {
		return this.estimId;
	}

	public void setEstimId(int estimId) {
		this.estimId = estimId;
	}

	public float getBjasXPtaMes() {
		return this.bjasXPtaMes;
	}

	public void setBjasXPtaMes(float bjasXPtaMes) {
		this.bjasXPtaMes = bjasXPtaMes;
	}

	public float getBjasXPtaTemp() {
		return this.bjasXPtaTemp;
	}

	public void setBjasXPtaTemp(float bjasXPtaTemp) {
		this.bjasXPtaTemp = bjasXPtaTemp;
	}

	public float getCalidadPrct() {
		return this.calidadPrct;
	}

	public void setCalidadPrct(float calidadPrct) {
		this.calidadPrct = calidadPrct;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getFinca() {
		return this.finca;
	}

	public void setFinca(String finca) {
		this.finca = finca;
	}

	public float getLimonesXBdja() {
		return this.limonesXBdja;
	}

	public void setLimonesXBdja(float limonesXBdja) {
		this.limonesXBdja = limonesXBdja;
	}

	public String getLote() {
		return this.lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getTamaño() {
		return this.tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}