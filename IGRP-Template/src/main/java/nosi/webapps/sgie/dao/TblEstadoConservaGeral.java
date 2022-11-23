package nosi.webapps.sgie.dao;

import javax.persistence.NamedQuery;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;
import javax.persistence.Column;
import nosi.base.ActiveRecord.BaseActiveRecord;

/**
 * @author: Nositeste 23-11-2022
*/

@Entity
@Table(name = "tbl_estado_conserva_geral", schema = "pgie")
@NamedQuery(name = "TblEstadoConservaGeral.findAll", query = "SELECT t FROM TblEstadoConservaGeral t")
public class TblEstadoConservaGeral extends BaseActiveRecord<TblEstadoConservaGeral> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@ManyToOne
	@JoinColumn(name = "estado_conserva", foreignKey = @ForeignKey(name = "fk1"))
	private TblAuxAnomalias estadoConserva;
	@ManyToOne
	@JoinColumn(name = "localizacao_lote", foreignKey = @ForeignKey(name = "fk4"))
	private TblAuxLocalizacaoLote localizacaoLote;
	@Column(name = "aspeto_exterior_edificio")
	private String aspetoExteriorEdificio;
	@ManyToOne
	@JoinColumn(name = "esc_id", foreignKey = @ForeignKey(name = "fk3"))
	private TblAuxEscolas escId;
	@Column(name = "data")
	private LocalDate data;
	@Column(name = "user_id")
	private Integer userId;
	@Size(max = 1)
	@Column(name = "estado")
	private String estado;

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public TblAuxAnomalias getEstadoConserva() { 
		return this.estadoConserva;
	}

	public void setEstadoConserva(TblAuxAnomalias estadoConserva) {
		 this.estadoConserva = estadoConserva;
	}

	public TblAuxLocalizacaoLote getLocalizacaoLote() { 
		return this.localizacaoLote;
	}

	public void setLocalizacaoLote(TblAuxLocalizacaoLote localizacaoLote) {
		 this.localizacaoLote = localizacaoLote;
	}

	public String getAspetoExteriorEdificio() { 
		return this.aspetoExteriorEdificio;
	}

	public void setAspetoExteriorEdificio(String aspetoExteriorEdificio) {
		 this.aspetoExteriorEdificio = aspetoExteriorEdificio;
	}

	public TblAuxEscolas getEscId() { 
		return this.escId;
	}

	public void setEscId(TblAuxEscolas escId) {
		 this.escId = escId;
	}

	public LocalDate getData() { 
		return this.data;
	}

	public void setData(LocalDate data) {
		 this.data = data;
	}

	public Integer getUserId() { 
		return this.userId;
	}

	public void setUserId(Integer userId) {
		 this.userId = userId;
	}

	public String getEstado() { 
		return this.estado;
	}

	public void setEstado(String estado) {
		 this.estado = estado;
	}

}