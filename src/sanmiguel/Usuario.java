package sanmiguel;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@Table(name="usuario")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="usuario_id", unique=true, nullable=false)
	private int usuarioId;
	
	/*@Column(name="usuario_idR")
	private int usuarioIdR;*/


	@Column(nullable=false, length=30)
	private String pais;
	
	@Column(length=25)
	private String nombre;
	
	
	
	//bi-directional many-to-one association to Estimacion
	@OneToMany(mappedBy="usuario")
	private List<Estimacion> estimacions;

	public Usuario() {
	}

	
	
	public int getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
	
	/*public int getUsuarioIdR() {
		return usuarioIdR;
	}

	public void setUsuarioIdR(int usuarioIdR) {
		this.usuarioIdR = this.usuarioId;
	}*/

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public List<Estimacion> getEstimacions() {
		return this.estimacions;
	}

	public void setEstimacions(List<Estimacion> estimacions) {
		this.estimacions = estimacions;
	}

	public Estimacion addEstimacion(Estimacion estimacion) {
		getEstimacions().add(estimacion);
		estimacion.setUsuario(this);

		return estimacion;
	}

	public Estimacion removeEstimacion(Estimacion estimacion) {
		getEstimacions().remove(estimacion);
		estimacion.setUsuario(null);

		return estimacion;
	}

}