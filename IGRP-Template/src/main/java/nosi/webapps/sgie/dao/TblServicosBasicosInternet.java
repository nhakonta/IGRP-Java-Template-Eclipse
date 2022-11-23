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
@Table(name = "tbl_servicos_basicos_internet", schema = "pgie")
@NamedQuery(name = "TblServicosBasicosInternet.findAll", query = "SELECT t FROM TblServicosBasicosInternet t")
public class TblServicosBasicosInternet extends BaseActiveRecord<TblServicosBasicosInternet> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@ManyToOne
	@JoinColumn(name = "formas_abastecimento_agua_id", foreignKey = @ForeignKey(name = "fk1"))
	private TblAuxAbastecimentoAgua formasAbastecimentoAguaId;
	@ManyToOne
	@JoinColumn(name = "fonte_energia_id", foreignKey = @ForeignKey(name = "fk2"))
	private TblAuxFonteEnergia fonteEnergiaId;
	@ManyToOne
	@JoinColumn(name = "formas_armazena_agua_id", foreignKey = @ForeignKey(name = "fk3"))
	private TblAuxArmazenamentoAgua formasArmazenaAguaId;
	@ManyToOne
	@JoinColumn(name = "acesso_internet_id", foreignKey = @ForeignKey(name = "fk4"))
	private TblAuxAcessoInternet acessoInternetId;
	@Column(name = "num_sala_inoperante")
	private Integer numSalaInoperante;
	@ManyToOne
	@JoinColumn(name = "razao_salas_inop_id", foreignKey = @ForeignKey(name = "fk5"))
	private TblAuxRazaoSalasInoperantes razaoSalasInopId;
	@ManyToOne
	@JoinColumn(name = "esc_id", foreignKey = @ForeignKey(name = "fk6"))
	private TblAuxEscolas escId;
	@Column(name = "user_id")
	private Integer userId;
	@Column(name = "data")
	private LocalDate data;
	@Size(max = 1)
	@Column(name = "estado")
	private String estado;

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public TblAuxAbastecimentoAgua getFormasAbastecimentoAguaId() { 
		return this.formasAbastecimentoAguaId;
	}

	public void setFormasAbastecimentoAguaId(TblAuxAbastecimentoAgua formasAbastecimentoAguaId) {
		 this.formasAbastecimentoAguaId = formasAbastecimentoAguaId;
	}

	public TblAuxFonteEnergia getFonteEnergiaId() { 
		return this.fonteEnergiaId;
	}

	public void setFonteEnergiaId(TblAuxFonteEnergia fonteEnergiaId) {
		 this.fonteEnergiaId = fonteEnergiaId;
	}

	public TblAuxArmazenamentoAgua getFormasArmazenaAguaId() { 
		return this.formasArmazenaAguaId;
	}

	public void setFormasArmazenaAguaId(TblAuxArmazenamentoAgua formasArmazenaAguaId) {
		 this.formasArmazenaAguaId = formasArmazenaAguaId;
	}

	public TblAuxAcessoInternet getAcessoInternetId() { 
		return this.acessoInternetId;
	}

	public void setAcessoInternetId(TblAuxAcessoInternet acessoInternetId) {
		 this.acessoInternetId = acessoInternetId;
	}

	public Integer getNumSalaInoperante() { 
		return this.numSalaInoperante;
	}

	public void setNumSalaInoperante(Integer numSalaInoperante) {
		 this.numSalaInoperante = numSalaInoperante;
	}

	public TblAuxRazaoSalasInoperantes getRazaoSalasInopId() { 
		return this.razaoSalasInopId;
	}

	public void setRazaoSalasInopId(TblAuxRazaoSalasInoperantes razaoSalasInopId) {
		 this.razaoSalasInopId = razaoSalasInopId;
	}

	public TblAuxEscolas getEscId() { 
		return this.escId;
	}

	public void setEscId(TblAuxEscolas escId) {
		 this.escId = escId;
	}

	public Integer getUserId() { 
		return this.userId;
	}

	public void setUserId(Integer userId) {
		 this.userId = userId;
	}

	public LocalDate getData() { 
		return this.data;
	}

	public void setData(LocalDate data) {
		 this.data = data;
	}

	public String getEstado() { 
		return this.estado;
	}

	public void setEstado(String estado) {
		 this.estado = estado;
	}

}