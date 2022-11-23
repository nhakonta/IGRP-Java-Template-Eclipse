package nosi.webapps.sgie.pages.dados_infra_carater_exterior;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Dados_infra_carater_exterior extends Model{		

	@RParam(rParamName = "p_acesso_automovel")
	private String acesso_automovel;

	@RParam(rParamName = "p_sistema_de_rega")
	private String sistema_de_rega;

	@RParam(rParamName = "p_lugares_de_estacionamento")
	private String lugares_de_estacionamento;

	@RParam(rParamName = "p_manual")
	private String manual;

	@RParam(rParamName = "p_arvores_de_folha_perene")
	private String arvores_de_folha_perene;

	@RParam(rParamName = "p_arvores_de_folha_caduca")
	private String arvores_de_folha_caduca;

	@RParam(rParamName = "p_arvores_de_fruto")
	private String arvores_de_fruto;

	@RParam(rParamName = "p_arbustos")
	private String arbustos;

	@RParam(rParamName = "p_canteiros_floridos")
	private String canteiros_floridos;

	@RParam(rParamName = "p_quantidade_canteiros_floridos")
	private Integer quantidade_canteiros_floridos;

	@RParam(rParamName = "p_campos_de_futebol")
	private String campos_de_futebol;

	@RParam(rParamName = "p_campos_de_basquetebol")
	private String campos_de_basquetebol;

	@RParam(rParamName = "p_campos_de_voleibol")
	private String campos_de_voleibol;

	@RParam(rParamName = "p_recreio_coberto_exterior")
	private String recreio_coberto_exterior;

	@RParam(rParamName = "p_pavilhao_polivalente_exterior")
	private String pavilhao_polivalente_exterior;

	@RParam(rParamName = "p_pavilhao_interior")
	private String pavilhao_interior;

	@RParam(rParamName = "p_outras_instalacoes_exteriores")
	private String outras_instalacoes_exteriores;
	
	public void setAcesso_automovel(String acesso_automovel){
		this.acesso_automovel = acesso_automovel;
	}
	public String getAcesso_automovel(){
		return this.acesso_automovel;
	}
	
	public void setSistema_de_rega(String sistema_de_rega){
		this.sistema_de_rega = sistema_de_rega;
	}
	public String getSistema_de_rega(){
		return this.sistema_de_rega;
	}
	
	public void setLugares_de_estacionamento(String lugares_de_estacionamento){
		this.lugares_de_estacionamento = lugares_de_estacionamento;
	}
	public String getLugares_de_estacionamento(){
		return this.lugares_de_estacionamento;
	}
	
	public void setManual(String manual){
		this.manual = manual;
	}
	public String getManual(){
		return this.manual;
	}
	
	public void setArvores_de_folha_perene(String arvores_de_folha_perene){
		this.arvores_de_folha_perene = arvores_de_folha_perene;
	}
	public String getArvores_de_folha_perene(){
		return this.arvores_de_folha_perene;
	}
	
	public void setArvores_de_folha_caduca(String arvores_de_folha_caduca){
		this.arvores_de_folha_caduca = arvores_de_folha_caduca;
	}
	public String getArvores_de_folha_caduca(){
		return this.arvores_de_folha_caduca;
	}
	
	public void setArvores_de_fruto(String arvores_de_fruto){
		this.arvores_de_fruto = arvores_de_fruto;
	}
	public String getArvores_de_fruto(){
		return this.arvores_de_fruto;
	}
	
	public void setArbustos(String arbustos){
		this.arbustos = arbustos;
	}
	public String getArbustos(){
		return this.arbustos;
	}
	
	public void setCanteiros_floridos(String canteiros_floridos){
		this.canteiros_floridos = canteiros_floridos;
	}
	public String getCanteiros_floridos(){
		return this.canteiros_floridos;
	}
	
	public void setQuantidade_canteiros_floridos(Integer quantidade_canteiros_floridos){
		this.quantidade_canteiros_floridos = quantidade_canteiros_floridos;
	}
	public Integer getQuantidade_canteiros_floridos(){
		return this.quantidade_canteiros_floridos;
	}
	
	public void setCampos_de_futebol(String campos_de_futebol){
		this.campos_de_futebol = campos_de_futebol;
	}
	public String getCampos_de_futebol(){
		return this.campos_de_futebol;
	}
	
	public void setCampos_de_basquetebol(String campos_de_basquetebol){
		this.campos_de_basquetebol = campos_de_basquetebol;
	}
	public String getCampos_de_basquetebol(){
		return this.campos_de_basquetebol;
	}
	
	public void setCampos_de_voleibol(String campos_de_voleibol){
		this.campos_de_voleibol = campos_de_voleibol;
	}
	public String getCampos_de_voleibol(){
		return this.campos_de_voleibol;
	}
	
	public void setRecreio_coberto_exterior(String recreio_coberto_exterior){
		this.recreio_coberto_exterior = recreio_coberto_exterior;
	}
	public String getRecreio_coberto_exterior(){
		return this.recreio_coberto_exterior;
	}
	
	public void setPavilhao_polivalente_exterior(String pavilhao_polivalente_exterior){
		this.pavilhao_polivalente_exterior = pavilhao_polivalente_exterior;
	}
	public String getPavilhao_polivalente_exterior(){
		return this.pavilhao_polivalente_exterior;
	}
	
	public void setPavilhao_interior(String pavilhao_interior){
		this.pavilhao_interior = pavilhao_interior;
	}
	public String getPavilhao_interior(){
		return this.pavilhao_interior;
	}
	
	public void setOutras_instalacoes_exteriores(String outras_instalacoes_exteriores){
		this.outras_instalacoes_exteriores = outras_instalacoes_exteriores;
	}
	public String getOutras_instalacoes_exteriores(){
		return this.outras_instalacoes_exteriores;
	}



}
