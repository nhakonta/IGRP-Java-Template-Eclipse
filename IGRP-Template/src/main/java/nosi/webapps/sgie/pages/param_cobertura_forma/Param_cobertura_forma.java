package nosi.webapps.sgie.pages.param_cobertura_forma;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Param_cobertura_forma extends Model{		

	@RParam(rParamName = "p_descricao")
	private String descricao;

	@RParam(rParamName = "p_id_cobertura_forma")
	private String id_cobertura_forma;
	
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
	
	public void setId_cobertura_forma(String id_cobertura_forma){
		this.id_cobertura_forma = id_cobertura_forma;
	}
	public String getId_cobertura_forma(){
		return this.id_cobertura_forma;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String lista;
		private String id_cobertura_forma_tbl;
		public void setLista(String lista){
			this.lista = lista;
		}
		public String getLista(){
			return this.lista;
		}

		public void setId_cobertura_forma_tbl(String id_cobertura_forma_tbl){
			this.id_cobertura_forma_tbl = id_cobertura_forma_tbl;
		}
		public String getId_cobertura_forma_tbl(){
			return this.id_cobertura_forma_tbl;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
