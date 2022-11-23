package nosi.webapps.sgie.pages.dados_infra_carater_servico_basico;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Dados_infra_carater_servico_basico extends Model{		

	@RParam(rParamName = "p_formas_abastecimento_agua_")
	private String formas_abastecimento_agua_;

	@RParam(rParamName = "p_fonte_energia_eletrica")
	private String fonte_energia_eletrica;

	@RParam(rParamName = "p_formas_armazenamento_agua")
	private String formas_armazenamento_agua;

	@RParam(rParamName = "p_acesso_a_internet")
	private String acesso_a_internet;

	@RParam(rParamName = "p_data_utima_atualizacao")
	private String data_utima_atualizacao;

	@RParam(rParamName = "p_numero_de_salas_inoperantes")
	private Integer numero_de_salas_inoperantes;

	@RParam(rParamName = "p_porque_razao_as_salas_nao_funcionam")
	private String porque_razao_as_salas_nao_funcionam;

	@RParam(rParamName = "p_id")
	private String id;

	@RParam(rParamName = "p_esc_id")
	private String esc_id;
	
	public void setFormas_abastecimento_agua_(String formas_abastecimento_agua_){
		this.formas_abastecimento_agua_ = formas_abastecimento_agua_;
	}
	public String getFormas_abastecimento_agua_(){
		return this.formas_abastecimento_agua_;
	}
	
	public void setFonte_energia_eletrica(String fonte_energia_eletrica){
		this.fonte_energia_eletrica = fonte_energia_eletrica;
	}
	public String getFonte_energia_eletrica(){
		return this.fonte_energia_eletrica;
	}
	
	public void setFormas_armazenamento_agua(String formas_armazenamento_agua){
		this.formas_armazenamento_agua = formas_armazenamento_agua;
	}
	public String getFormas_armazenamento_agua(){
		return this.formas_armazenamento_agua;
	}
	
	public void setAcesso_a_internet(String acesso_a_internet){
		this.acesso_a_internet = acesso_a_internet;
	}
	public String getAcesso_a_internet(){
		return this.acesso_a_internet;
	}
	
	public void setData_utima_atualizacao(String data_utima_atualizacao){
		this.data_utima_atualizacao = data_utima_atualizacao;
	}
	public String getData_utima_atualizacao(){
		return this.data_utima_atualizacao;
	}
	
	public void setNumero_de_salas_inoperantes(Integer numero_de_salas_inoperantes){
		this.numero_de_salas_inoperantes = numero_de_salas_inoperantes;
	}
	public Integer getNumero_de_salas_inoperantes(){
		return this.numero_de_salas_inoperantes;
	}
	
	public void setPorque_razao_as_salas_nao_funcionam(String porque_razao_as_salas_nao_funcionam){
		this.porque_razao_as_salas_nao_funcionam = porque_razao_as_salas_nao_funcionam;
	}
	public String getPorque_razao_as_salas_nao_funcionam(){
		return this.porque_razao_as_salas_nao_funcionam;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}
	
	public void setEsc_id(String esc_id){
		this.esc_id = esc_id;
	}
	public String getEsc_id(){
		return this.esc_id;
	}



}
