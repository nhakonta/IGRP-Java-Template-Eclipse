package nosi.webapps.sgie.pages.lista_escolas;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Lista_escolas extends Model{		

	@RParam(rParamName = "p_nome_escola")
	private String nome_escola;

	@RParam(rParamName = "p_esc_id")
	private String esc_id;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setNome_escola(String nome_escola){
		this.nome_escola = nome_escola;
	}
	public String getNome_escola(){
		return this.nome_escola;
	}
	
	public void setEsc_id(String esc_id){
		this.esc_id = esc_id;
	}
	public String getEsc_id(){
		return this.esc_id;
	}


	public static class Table_1 extends IGRPTable.Table{
		private Integer codigo;
		private String nome;
		private String morada;
		private String nivel_ensino;
		private String telefone;
		private String esc_id_tbl;
		public void setCodigo(Integer codigo){
			this.codigo = codigo;
		}
		public Integer getCodigo(){
			return this.codigo;
		}

		public void setNome(String nome){
			this.nome = nome;
		}
		public String getNome(){
			return this.nome;
		}

		public void setMorada(String morada){
			this.morada = morada;
		}
		public String getMorada(){
			return this.morada;
		}

		public void setNivel_ensino(String nivel_ensino){
			this.nivel_ensino = nivel_ensino;
		}
		public String getNivel_ensino(){
			return this.nivel_ensino;
		}

		public void setTelefone(String telefone){
			this.telefone = telefone;
		}
		public String getTelefone(){
			return this.telefone;
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
