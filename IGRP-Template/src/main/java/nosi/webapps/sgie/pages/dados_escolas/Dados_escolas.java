package nosi.webapps.sgie.pages.dados_escolas;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Dados_escolas extends Model{		

	@RParam(rParamName = "p_view_cabecalho_escola")
	private String view_cabecalho_escola;

	@RParam(rParamName = "p_codigo_sige")
	private String codigo_sige;

	@RParam(rParamName = "p_nivel_de_ensino")
	private String nivel_de_ensino;

	@RParam(rParamName = "p_diretora")
	private String diretora;

	@RParam(rParamName = "p_morada")
	private String morada;

	@RParam(rParamName = "p_lugar")
	private String lugar;

	@RParam(rParamName = "p_esc_id")
	private String esc_id;

	@RParam(rParamName = "p_view_1_img")
	private String view_1_img;

	@RParam(rParamName = "p_telefone")
	private String telefone;

	@RParam(rParamName = "p_e_mail")
	private String e_mail;

	@RParam(rParamName = "p_concelho")
	private String concelho;

	@RParam(rParamName = "p_coordenadas_gps")
	private String coordenadas_gps;

	@RParam(rParamName = "p_numero_de_alunos")
	private String numero_de_alunos;

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setView_cabecalho_escola(String view_cabecalho_escola){
		this.view_cabecalho_escola = view_cabecalho_escola;
	}
	public String getView_cabecalho_escola(){
		return this.view_cabecalho_escola;
	}
	
	public void setCodigo_sige(String codigo_sige){
		this.codigo_sige = codigo_sige;
	}
	public String getCodigo_sige(){
		return this.codigo_sige;
	}
	
	public void setNivel_de_ensino(String nivel_de_ensino){
		this.nivel_de_ensino = nivel_de_ensino;
	}
	public String getNivel_de_ensino(){
		return this.nivel_de_ensino;
	}
	
	public void setDiretora(String diretora){
		this.diretora = diretora;
	}
	public String getDiretora(){
		return this.diretora;
	}
	
	public void setMorada(String morada){
		this.morada = morada;
	}
	public String getMorada(){
		return this.morada;
	}
	
	public void setLugar(String lugar){
		this.lugar = lugar;
	}
	public String getLugar(){
		return this.lugar;
	}
	
	public void setEsc_id(String esc_id){
		this.esc_id = esc_id;
	}
	public String getEsc_id(){
		return this.esc_id;
	}
	
	public void setView_1_img(String view_1_img){
		this.view_1_img = view_1_img;
	}
	public String getView_1_img(){
		return this.view_1_img;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	public String getTelefone(){
		return this.telefone;
	}
	
	public void setE_mail(String e_mail){
		this.e_mail = e_mail;
	}
	public String getE_mail(){
		return this.e_mail;
	}
	
	public void setConcelho(String concelho){
		this.concelho = concelho;
	}
	public String getConcelho(){
		return this.concelho;
	}
	
	public void setCoordenadas_gps(String coordenadas_gps){
		this.coordenadas_gps = coordenadas_gps;
	}
	public String getCoordenadas_gps(){
		return this.coordenadas_gps;
	}
	
	public void setNumero_de_alunos(String numero_de_alunos){
		this.numero_de_alunos = numero_de_alunos;
	}
	public String getNumero_de_alunos(){
		return this.numero_de_alunos;
	}
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String id_seguimento;
		private String data_avaliacao;
		private String utilizador;
		private String esc_id_tbl;
		public void setId_seguimento(String id_seguimento){
			this.id_seguimento = id_seguimento;
		}
		public String getId_seguimento(){
			return this.id_seguimento;
		}

		public void setData_avaliacao(String data_avaliacao){
			this.data_avaliacao = data_avaliacao;
		}
		public String getData_avaliacao(){
			return this.data_avaliacao;
		}

		public void setUtilizador(String utilizador){
			this.utilizador = utilizador;
		}
		public String getUtilizador(){
			return this.utilizador;
		}

		public void setEsc_id_tbl(String esc_id_tbl){
			this.esc_id_tbl = esc_id_tbl;
		}
		public String getEsc_id_tbl(){
			return this.esc_id_tbl;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
