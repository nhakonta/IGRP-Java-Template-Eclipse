package nosi.webapps.sgie.pages.param_rampa_escada_corrim_interiro_e_exterior;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Param_rampa_escada_corrim_interiro_e_exterior extends Model{		

	@RParam(rParamName = "p_descricao")
	private String descricao;

	@RParam(rParamName = "p_id_rampa")
	private String id_rampa;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	public String getDescricao(){
		return this.descricao;
	}
	
	public void setId_rampa(String id_rampa){
		this.id_rampa = id_rampa;
	}
	public String getId_rampa(){
		return this.id_rampa;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String table_1_text_1;
		private String id_rampa_tbl;
		public void setTable_1_text_1(String table_1_text_1){
			this.table_1_text_1 = table_1_text_1;
		}
		public String getTable_1_text_1(){
			return this.table_1_text_1;
		}

		public void setId_rampa_tbl(String id_rampa_tbl){
			this.id_rampa_tbl = id_rampa_tbl;
		}
		public String getId_rampa_tbl(){
			return this.id_rampa_tbl;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
