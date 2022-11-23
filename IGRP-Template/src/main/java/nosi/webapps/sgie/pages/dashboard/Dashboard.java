package nosi.webapps.sgie.pages.dashboard;

import nosi.core.gui.components.IGRPLink;
import nosi.core.webapp.Report;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;
import nosi.core.gui.components.IGRPChart3D;

public class Dashboard extends Model{		

	@RParam(rParamName = "p_circlestatbox_1_title")
	private String circlestatbox_1_title;

	@RParam(rParamName = "p_circlestatbox_1_lbl")
	private String circlestatbox_1_lbl;

	@RParam(rParamName = "p_circlestatbox_1_val")
	private String circlestatbox_1_val;

	@RParam(rParamName = "p_circlestatbox_1_desc")
	private String circlestatbox_1_desc;

	@RParam(rParamName = "p_circlestatbox_1_url")
	private String circlestatbox_1_url;

	@RParam(rParamName = "p_circlestatbox_1_bg")
	private String circlestatbox_1_bg;

	@RParam(rParamName = "p_circlestatbox_2_title")
	private String circlestatbox_2_title;

	@RParam(rParamName = "p_circlestatbox_2_lbl")
	private String circlestatbox_2_lbl;

	@RParam(rParamName = "p_circlestatbox_2_val")
	private String circlestatbox_2_val;

	@RParam(rParamName = "p_circlestatbox_2_desc")
	private String circlestatbox_2_desc;

	@RParam(rParamName = "p_circlestatbox_2_url")
	private String circlestatbox_2_url;

	@RParam(rParamName = "p_circlestatbox_2_bg")
	private String circlestatbox_2_bg;

	@RParam(rParamName = "p_circlestatbox_3_title")
	private String circlestatbox_3_title;

	@RParam(rParamName = "p_circlestatbox_3_lbl")
	private String circlestatbox_3_lbl;

	@RParam(rParamName = "p_circlestatbox_3_val")
	private String circlestatbox_3_val;

	@RParam(rParamName = "p_circlestatbox_3_desc")
	private String circlestatbox_3_desc;

	@RParam(rParamName = "p_circlestatbox_3_url")
	private String circlestatbox_3_url;

	@RParam(rParamName = "p_circlestatbox_3_bg")
	private String circlestatbox_3_bg;

	@RParam(rParamName = "p_circlestatbox_4_title")
	private String circlestatbox_4_title;

	@RParam(rParamName = "p_circlestatbox_4_lbl")
	private String circlestatbox_4_lbl;

	@RParam(rParamName = "p_circlestatbox_4_val")
	private String circlestatbox_4_val;

	@RParam(rParamName = "p_circlestatbox_4_desc")
	private String circlestatbox_4_desc;

	@RParam(rParamName = "p_circlestatbox_4_url")
	private String circlestatbox_4_url;

	@RParam(rParamName = "p_circlestatbox_4_bg")
	private String circlestatbox_4_bg;

	@RParam(rParamName = "p_infopanel_1_title")
	private String infopanel_1_title;

	@RParam(rParamName = "p_infopanel_1_val")
	private String infopanel_1_val;

	@RParam(rParamName = "p_infopanel_1_url")
	private IGRPLink infopanel_1_url;
	@RParam(rParamName = "p_infopanel_1_url_desc")
	private String infopanel_1_url_desc;

	@RParam(rParamName = "p_infopanel_1_bg")
	private String infopanel_1_bg;

	@RParam(rParamName = "p_infopanel_1_icn")
	private String infopanel_1_icn;

	@RParam(rParamName = "p_infopanel_2_title")
	private String infopanel_2_title;

	@RParam(rParamName = "p_infopanel_2_val")
	private String infopanel_2_val;

	@RParam(rParamName = "p_infopanel_2_url")
	private IGRPLink infopanel_2_url;
	@RParam(rParamName = "p_infopanel_2_url_desc")
	private String infopanel_2_url_desc;

	@RParam(rParamName = "p_infopanel_2_bg")
	private String infopanel_2_bg;

	@RParam(rParamName = "p_infopanel_2_icn")
	private String infopanel_2_icn;

	@RParam(rParamName = "p_infopanel_3_title")
	private String infopanel_3_title;

	@RParam(rParamName = "p_infopanel_3_val")
	private String infopanel_3_val;

	@RParam(rParamName = "p_infopanel_3_url")
	private IGRPLink infopanel_3_url;
	@RParam(rParamName = "p_infopanel_3_url_desc")
	private String infopanel_3_url_desc;

	@RParam(rParamName = "p_infopanel_3_bg")
	private String infopanel_3_bg;

	@RParam(rParamName = "p_infopanel_3_icn")
	private String infopanel_3_icn;

	@RParam(rParamName = "p_circlestatbox_5_title")
	private String circlestatbox_5_title;

	@RParam(rParamName = "p_circlestatbox_5_lbl")
	private String circlestatbox_5_lbl;

	@RParam(rParamName = "p_circlestatbox_5_val")
	private String circlestatbox_5_val;

	@RParam(rParamName = "p_circlestatbox_5_desc")
	private String circlestatbox_5_desc;

	@RParam(rParamName = "p_circlestatbox_5_url")
	private String circlestatbox_5_url;

	@RParam(rParamName = "p_circlestatbox_5_bg")
	private String circlestatbox_5_bg;

	@RParam(rParamName = "p_infopanel_4_title")
	private String infopanel_4_title;

	@RParam(rParamName = "p_infopanel_4_val")
	private String infopanel_4_val;

	@RParam(rParamName = "p_infopanel_4_url")
	private IGRPLink infopanel_4_url;
	@RParam(rParamName = "p_infopanel_4_url_desc")
	private String infopanel_4_url_desc;

	@RParam(rParamName = "p_infopanel_4_bg")
	private String infopanel_4_bg;

	@RParam(rParamName = "p_infopanel_4_icn")
	private String infopanel_4_icn;

	@RParam(rParamName = "p_infopanel_5_title")
	private String infopanel_5_title;

	@RParam(rParamName = "p_infopanel_5_val")
	private String infopanel_5_val;

	@RParam(rParamName = "p_infopanel_5_url")
	private IGRPLink infopanel_5_url;
	@RParam(rParamName = "p_infopanel_5_url_desc")
	private String infopanel_5_url_desc;

	@RParam(rParamName = "p_infopanel_5_bg")
	private String infopanel_5_bg;

	@RParam(rParamName = "p_infopanel_5_icn")
	private String infopanel_5_icn;

	@RParam(rParamName = "p_infopanel_6_title")
	private String infopanel_6_title;

	@RParam(rParamName = "p_infopanel_6_val")
	private String infopanel_6_val;

	@RParam(rParamName = "p_infopanel_6_url")
	private IGRPLink infopanel_6_url;
	@RParam(rParamName = "p_infopanel_6_url_desc")
	private String infopanel_6_url_desc;

	@RParam(rParamName = "p_infopanel_6_bg")
	private String infopanel_6_bg;

	@RParam(rParamName = "p_infopanel_6_icn")
	private String infopanel_6_icn;

	@RParam(rParamName = "p_infopanel_7_title")
	private String infopanel_7_title;

	@RParam(rParamName = "p_infopanel_7_val")
	private String infopanel_7_val;

	@RParam(rParamName = "p_infopanel_7_url")
	private IGRPLink infopanel_7_url;
	@RParam(rParamName = "p_infopanel_7_url_desc")
	private String infopanel_7_url_desc;

	@RParam(rParamName = "p_infopanel_7_bg")
	private String infopanel_7_bg;

	@RParam(rParamName = "p_infopanel_7_icn")
	private String infopanel_7_icn;

	@RParam(rParamName = "p_infopanel_8_title")
	private String infopanel_8_title;

	@RParam(rParamName = "p_infopanel_8_val")
	private String infopanel_8_val;

	@RParam(rParamName = "p_infopanel_8_url")
	private IGRPLink infopanel_8_url;
	@RParam(rParamName = "p_infopanel_8_url_desc")
	private String infopanel_8_url_desc;

	@RParam(rParamName = "p_infopanel_8_bg")
	private String infopanel_8_bg;

	@RParam(rParamName = "p_infopanel_8_icn")
	private String infopanel_8_icn;

	@RParam(rParamName = "p_circlestatbox_6_title")
	private String circlestatbox_6_title;

	@RParam(rParamName = "p_circlestatbox_6_lbl")
	private String circlestatbox_6_lbl;

	@RParam(rParamName = "p_circlestatbox_6_val")
	private String circlestatbox_6_val;

	@RParam(rParamName = "p_circlestatbox_6_desc")
	private String circlestatbox_6_desc;

	@RParam(rParamName = "p_circlestatbox_6_url")
	private String circlestatbox_6_url;

	@RParam(rParamName = "p_circlestatbox_6_bg")
	private String circlestatbox_6_bg;

	@RParam(rParamName = "p_view_1_text_1")
	private String view_1_text_1;

	@RParam(rParamName = "p_view_1_text_3")
	private String view_1_text_3;

	@RParam(rParamName = "p_view_1_text_4")
	private String view_1_text_4;

	@RParam(rParamName = "p_view_1_text_6")
	private String view_1_text_6;

	@RParam(rParamName = "p_view_1_text_7")
	private String view_1_text_7;

	@RParam(rParamName = "p_view_1_text_5")
	private String view_1_text_5;

	@RParam(rParamName = "p_view_1_text_2")
	private String view_1_text_2;

	@RParam(rParamName = "p_view_1_img")
	private String view_1_img;
	
	private List<Chart_1> chart_1 = new ArrayList<>();	
	public void setChart_1(List<Chart_1> chart_1){
		this.chart_1 = chart_1;
	}
	public List<Chart_1> getChart_1(){
		return this.chart_1;
	}

	
	public void setCirclestatbox_1_title(String circlestatbox_1_title){
		this.circlestatbox_1_title = circlestatbox_1_title;
	}
	public String getCirclestatbox_1_title(){
		return this.circlestatbox_1_title;
	}
	
	public void setCirclestatbox_1_lbl(String circlestatbox_1_lbl){
		this.circlestatbox_1_lbl = circlestatbox_1_lbl;
	}
	public String getCirclestatbox_1_lbl(){
		return this.circlestatbox_1_lbl;
	}
	
	public void setCirclestatbox_1_val(String circlestatbox_1_val){
		this.circlestatbox_1_val = circlestatbox_1_val;
	}
	public String getCirclestatbox_1_val(){
		return this.circlestatbox_1_val;
	}
	
	public void setCirclestatbox_1_desc(String circlestatbox_1_desc){
		this.circlestatbox_1_desc = circlestatbox_1_desc;
	}
	public String getCirclestatbox_1_desc(){
		return this.circlestatbox_1_desc;
	}
	
	public void setCirclestatbox_1_url(String circlestatbox_1_url){
		this.circlestatbox_1_url = circlestatbox_1_url;
	}
	public String getCirclestatbox_1_url(){
		return this.circlestatbox_1_url;
	}
	
	public void setCirclestatbox_1_bg(String circlestatbox_1_bg){
		this.circlestatbox_1_bg = circlestatbox_1_bg;
	}
	public String getCirclestatbox_1_bg(){
		return this.circlestatbox_1_bg;
	}
	
	public void setCirclestatbox_2_title(String circlestatbox_2_title){
		this.circlestatbox_2_title = circlestatbox_2_title;
	}
	public String getCirclestatbox_2_title(){
		return this.circlestatbox_2_title;
	}
	
	public void setCirclestatbox_2_lbl(String circlestatbox_2_lbl){
		this.circlestatbox_2_lbl = circlestatbox_2_lbl;
	}
	public String getCirclestatbox_2_lbl(){
		return this.circlestatbox_2_lbl;
	}
	
	public void setCirclestatbox_2_val(String circlestatbox_2_val){
		this.circlestatbox_2_val = circlestatbox_2_val;
	}
	public String getCirclestatbox_2_val(){
		return this.circlestatbox_2_val;
	}
	
	public void setCirclestatbox_2_desc(String circlestatbox_2_desc){
		this.circlestatbox_2_desc = circlestatbox_2_desc;
	}
	public String getCirclestatbox_2_desc(){
		return this.circlestatbox_2_desc;
	}
	
	public void setCirclestatbox_2_url(String circlestatbox_2_url){
		this.circlestatbox_2_url = circlestatbox_2_url;
	}
	public String getCirclestatbox_2_url(){
		return this.circlestatbox_2_url;
	}
	
	public void setCirclestatbox_2_bg(String circlestatbox_2_bg){
		this.circlestatbox_2_bg = circlestatbox_2_bg;
	}
	public String getCirclestatbox_2_bg(){
		return this.circlestatbox_2_bg;
	}
	
	public void setCirclestatbox_3_title(String circlestatbox_3_title){
		this.circlestatbox_3_title = circlestatbox_3_title;
	}
	public String getCirclestatbox_3_title(){
		return this.circlestatbox_3_title;
	}
	
	public void setCirclestatbox_3_lbl(String circlestatbox_3_lbl){
		this.circlestatbox_3_lbl = circlestatbox_3_lbl;
	}
	public String getCirclestatbox_3_lbl(){
		return this.circlestatbox_3_lbl;
	}
	
	public void setCirclestatbox_3_val(String circlestatbox_3_val){
		this.circlestatbox_3_val = circlestatbox_3_val;
	}
	public String getCirclestatbox_3_val(){
		return this.circlestatbox_3_val;
	}
	
	public void setCirclestatbox_3_desc(String circlestatbox_3_desc){
		this.circlestatbox_3_desc = circlestatbox_3_desc;
	}
	public String getCirclestatbox_3_desc(){
		return this.circlestatbox_3_desc;
	}
	
	public void setCirclestatbox_3_url(String circlestatbox_3_url){
		this.circlestatbox_3_url = circlestatbox_3_url;
	}
	public String getCirclestatbox_3_url(){
		return this.circlestatbox_3_url;
	}
	
	public void setCirclestatbox_3_bg(String circlestatbox_3_bg){
		this.circlestatbox_3_bg = circlestatbox_3_bg;
	}
	public String getCirclestatbox_3_bg(){
		return this.circlestatbox_3_bg;
	}
	
	public void setCirclestatbox_4_title(String circlestatbox_4_title){
		this.circlestatbox_4_title = circlestatbox_4_title;
	}
	public String getCirclestatbox_4_title(){
		return this.circlestatbox_4_title;
	}
	
	public void setCirclestatbox_4_lbl(String circlestatbox_4_lbl){
		this.circlestatbox_4_lbl = circlestatbox_4_lbl;
	}
	public String getCirclestatbox_4_lbl(){
		return this.circlestatbox_4_lbl;
	}
	
	public void setCirclestatbox_4_val(String circlestatbox_4_val){
		this.circlestatbox_4_val = circlestatbox_4_val;
	}
	public String getCirclestatbox_4_val(){
		return this.circlestatbox_4_val;
	}
	
	public void setCirclestatbox_4_desc(String circlestatbox_4_desc){
		this.circlestatbox_4_desc = circlestatbox_4_desc;
	}
	public String getCirclestatbox_4_desc(){
		return this.circlestatbox_4_desc;
	}
	
	public void setCirclestatbox_4_url(String circlestatbox_4_url){
		this.circlestatbox_4_url = circlestatbox_4_url;
	}
	public String getCirclestatbox_4_url(){
		return this.circlestatbox_4_url;
	}
	
	public void setCirclestatbox_4_bg(String circlestatbox_4_bg){
		this.circlestatbox_4_bg = circlestatbox_4_bg;
	}
	public String getCirclestatbox_4_bg(){
		return this.circlestatbox_4_bg;
	}
	
	public void setInfopanel_1_title(String infopanel_1_title){
		this.infopanel_1_title = infopanel_1_title;
	}
	public String getInfopanel_1_title(){
		return this.infopanel_1_title;
	}
	
	public void setInfopanel_1_val(String infopanel_1_val){
		this.infopanel_1_val = infopanel_1_val;
	}
	public String getInfopanel_1_val(){
		return this.infopanel_1_val;
	}
	
	public IGRPLink setInfopanel_1_url(String app,String page,String action){
		this.infopanel_1_url = new IGRPLink(app,page,action);
		return this.infopanel_1_url;
	}
	public IGRPLink getInfopanel_1_url(){
		return this.infopanel_1_url;
	}
	public void setInfopanel_1_url_desc(String infopanel_1_url_desc){
		this.infopanel_1_url_desc = infopanel_1_url_desc;
	}
	public String getInfopanel_1_url_desc(){
		return this.infopanel_1_url_desc;
	}
	public IGRPLink setInfopanel_1_url(String link){
		this.infopanel_1_url = new IGRPLink(link);
		return this.infopanel_1_url;
	}
	public IGRPLink setInfopanel_1_url(Report link){
		this.infopanel_1_url = new IGRPLink(link);
		return this.infopanel_1_url;
	}
	
	public void setInfopanel_1_bg(String infopanel_1_bg){
		this.infopanel_1_bg = infopanel_1_bg;
	}
	public String getInfopanel_1_bg(){
		return this.infopanel_1_bg;
	}
	
	public void setInfopanel_1_icn(String infopanel_1_icn){
		this.infopanel_1_icn = infopanel_1_icn;
	}
	public String getInfopanel_1_icn(){
		return this.infopanel_1_icn;
	}
	
	public void setInfopanel_2_title(String infopanel_2_title){
		this.infopanel_2_title = infopanel_2_title;
	}
	public String getInfopanel_2_title(){
		return this.infopanel_2_title;
	}
	
	public void setInfopanel_2_val(String infopanel_2_val){
		this.infopanel_2_val = infopanel_2_val;
	}
	public String getInfopanel_2_val(){
		return this.infopanel_2_val;
	}
	
	public IGRPLink setInfopanel_2_url(String app,String page,String action){
		this.infopanel_2_url = new IGRPLink(app,page,action);
		return this.infopanel_2_url;
	}
	public IGRPLink getInfopanel_2_url(){
		return this.infopanel_2_url;
	}
	public void setInfopanel_2_url_desc(String infopanel_2_url_desc){
		this.infopanel_2_url_desc = infopanel_2_url_desc;
	}
	public String getInfopanel_2_url_desc(){
		return this.infopanel_2_url_desc;
	}
	public IGRPLink setInfopanel_2_url(String link){
		this.infopanel_2_url = new IGRPLink(link);
		return this.infopanel_2_url;
	}
	public IGRPLink setInfopanel_2_url(Report link){
		this.infopanel_2_url = new IGRPLink(link);
		return this.infopanel_2_url;
	}
	
	public void setInfopanel_2_bg(String infopanel_2_bg){
		this.infopanel_2_bg = infopanel_2_bg;
	}
	public String getInfopanel_2_bg(){
		return this.infopanel_2_bg;
	}
	
	public void setInfopanel_2_icn(String infopanel_2_icn){
		this.infopanel_2_icn = infopanel_2_icn;
	}
	public String getInfopanel_2_icn(){
		return this.infopanel_2_icn;
	}
	
	public void setInfopanel_3_title(String infopanel_3_title){
		this.infopanel_3_title = infopanel_3_title;
	}
	public String getInfopanel_3_title(){
		return this.infopanel_3_title;
	}
	
	public void setInfopanel_3_val(String infopanel_3_val){
		this.infopanel_3_val = infopanel_3_val;
	}
	public String getInfopanel_3_val(){
		return this.infopanel_3_val;
	}
	
	public IGRPLink setInfopanel_3_url(String app,String page,String action){
		this.infopanel_3_url = new IGRPLink(app,page,action);
		return this.infopanel_3_url;
	}
	public IGRPLink getInfopanel_3_url(){
		return this.infopanel_3_url;
	}
	public void setInfopanel_3_url_desc(String infopanel_3_url_desc){
		this.infopanel_3_url_desc = infopanel_3_url_desc;
	}
	public String getInfopanel_3_url_desc(){
		return this.infopanel_3_url_desc;
	}
	public IGRPLink setInfopanel_3_url(String link){
		this.infopanel_3_url = new IGRPLink(link);
		return this.infopanel_3_url;
	}
	public IGRPLink setInfopanel_3_url(Report link){
		this.infopanel_3_url = new IGRPLink(link);
		return this.infopanel_3_url;
	}
	
	public void setInfopanel_3_bg(String infopanel_3_bg){
		this.infopanel_3_bg = infopanel_3_bg;
	}
	public String getInfopanel_3_bg(){
		return this.infopanel_3_bg;
	}
	
	public void setInfopanel_3_icn(String infopanel_3_icn){
		this.infopanel_3_icn = infopanel_3_icn;
	}
	public String getInfopanel_3_icn(){
		return this.infopanel_3_icn;
	}
	
	public void setCirclestatbox_5_title(String circlestatbox_5_title){
		this.circlestatbox_5_title = circlestatbox_5_title;
	}
	public String getCirclestatbox_5_title(){
		return this.circlestatbox_5_title;
	}
	
	public void setCirclestatbox_5_lbl(String circlestatbox_5_lbl){
		this.circlestatbox_5_lbl = circlestatbox_5_lbl;
	}
	public String getCirclestatbox_5_lbl(){
		return this.circlestatbox_5_lbl;
	}
	
	public void setCirclestatbox_5_val(String circlestatbox_5_val){
		this.circlestatbox_5_val = circlestatbox_5_val;
	}
	public String getCirclestatbox_5_val(){
		return this.circlestatbox_5_val;
	}
	
	public void setCirclestatbox_5_desc(String circlestatbox_5_desc){
		this.circlestatbox_5_desc = circlestatbox_5_desc;
	}
	public String getCirclestatbox_5_desc(){
		return this.circlestatbox_5_desc;
	}
	
	public void setCirclestatbox_5_url(String circlestatbox_5_url){
		this.circlestatbox_5_url = circlestatbox_5_url;
	}
	public String getCirclestatbox_5_url(){
		return this.circlestatbox_5_url;
	}
	
	public void setCirclestatbox_5_bg(String circlestatbox_5_bg){
		this.circlestatbox_5_bg = circlestatbox_5_bg;
	}
	public String getCirclestatbox_5_bg(){
		return this.circlestatbox_5_bg;
	}
	
	public void setInfopanel_4_title(String infopanel_4_title){
		this.infopanel_4_title = infopanel_4_title;
	}
	public String getInfopanel_4_title(){
		return this.infopanel_4_title;
	}
	
	public void setInfopanel_4_val(String infopanel_4_val){
		this.infopanel_4_val = infopanel_4_val;
	}
	public String getInfopanel_4_val(){
		return this.infopanel_4_val;
	}
	
	public IGRPLink setInfopanel_4_url(String app,String page,String action){
		this.infopanel_4_url = new IGRPLink(app,page,action);
		return this.infopanel_4_url;
	}
	public IGRPLink getInfopanel_4_url(){
		return this.infopanel_4_url;
	}
	public void setInfopanel_4_url_desc(String infopanel_4_url_desc){
		this.infopanel_4_url_desc = infopanel_4_url_desc;
	}
	public String getInfopanel_4_url_desc(){
		return this.infopanel_4_url_desc;
	}
	public IGRPLink setInfopanel_4_url(String link){
		this.infopanel_4_url = new IGRPLink(link);
		return this.infopanel_4_url;
	}
	public IGRPLink setInfopanel_4_url(Report link){
		this.infopanel_4_url = new IGRPLink(link);
		return this.infopanel_4_url;
	}
	
	public void setInfopanel_4_bg(String infopanel_4_bg){
		this.infopanel_4_bg = infopanel_4_bg;
	}
	public String getInfopanel_4_bg(){
		return this.infopanel_4_bg;
	}
	
	public void setInfopanel_4_icn(String infopanel_4_icn){
		this.infopanel_4_icn = infopanel_4_icn;
	}
	public String getInfopanel_4_icn(){
		return this.infopanel_4_icn;
	}
	
	public void setInfopanel_5_title(String infopanel_5_title){
		this.infopanel_5_title = infopanel_5_title;
	}
	public String getInfopanel_5_title(){
		return this.infopanel_5_title;
	}
	
	public void setInfopanel_5_val(String infopanel_5_val){
		this.infopanel_5_val = infopanel_5_val;
	}
	public String getInfopanel_5_val(){
		return this.infopanel_5_val;
	}
	
	public IGRPLink setInfopanel_5_url(String app,String page,String action){
		this.infopanel_5_url = new IGRPLink(app,page,action);
		return this.infopanel_5_url;
	}
	public IGRPLink getInfopanel_5_url(){
		return this.infopanel_5_url;
	}
	public void setInfopanel_5_url_desc(String infopanel_5_url_desc){
		this.infopanel_5_url_desc = infopanel_5_url_desc;
	}
	public String getInfopanel_5_url_desc(){
		return this.infopanel_5_url_desc;
	}
	public IGRPLink setInfopanel_5_url(String link){
		this.infopanel_5_url = new IGRPLink(link);
		return this.infopanel_5_url;
	}
	public IGRPLink setInfopanel_5_url(Report link){
		this.infopanel_5_url = new IGRPLink(link);
		return this.infopanel_5_url;
	}
	
	public void setInfopanel_5_bg(String infopanel_5_bg){
		this.infopanel_5_bg = infopanel_5_bg;
	}
	public String getInfopanel_5_bg(){
		return this.infopanel_5_bg;
	}
	
	public void setInfopanel_5_icn(String infopanel_5_icn){
		this.infopanel_5_icn = infopanel_5_icn;
	}
	public String getInfopanel_5_icn(){
		return this.infopanel_5_icn;
	}
	
	public void setInfopanel_6_title(String infopanel_6_title){
		this.infopanel_6_title = infopanel_6_title;
	}
	public String getInfopanel_6_title(){
		return this.infopanel_6_title;
	}
	
	public void setInfopanel_6_val(String infopanel_6_val){
		this.infopanel_6_val = infopanel_6_val;
	}
	public String getInfopanel_6_val(){
		return this.infopanel_6_val;
	}
	
	public IGRPLink setInfopanel_6_url(String app,String page,String action){
		this.infopanel_6_url = new IGRPLink(app,page,action);
		return this.infopanel_6_url;
	}
	public IGRPLink getInfopanel_6_url(){
		return this.infopanel_6_url;
	}
	public void setInfopanel_6_url_desc(String infopanel_6_url_desc){
		this.infopanel_6_url_desc = infopanel_6_url_desc;
	}
	public String getInfopanel_6_url_desc(){
		return this.infopanel_6_url_desc;
	}
	public IGRPLink setInfopanel_6_url(String link){
		this.infopanel_6_url = new IGRPLink(link);
		return this.infopanel_6_url;
	}
	public IGRPLink setInfopanel_6_url(Report link){
		this.infopanel_6_url = new IGRPLink(link);
		return this.infopanel_6_url;
	}
	
	public void setInfopanel_6_bg(String infopanel_6_bg){
		this.infopanel_6_bg = infopanel_6_bg;
	}
	public String getInfopanel_6_bg(){
		return this.infopanel_6_bg;
	}
	
	public void setInfopanel_6_icn(String infopanel_6_icn){
		this.infopanel_6_icn = infopanel_6_icn;
	}
	public String getInfopanel_6_icn(){
		return this.infopanel_6_icn;
	}
	
	public void setInfopanel_7_title(String infopanel_7_title){
		this.infopanel_7_title = infopanel_7_title;
	}
	public String getInfopanel_7_title(){
		return this.infopanel_7_title;
	}
	
	public void setInfopanel_7_val(String infopanel_7_val){
		this.infopanel_7_val = infopanel_7_val;
	}
	public String getInfopanel_7_val(){
		return this.infopanel_7_val;
	}
	
	public IGRPLink setInfopanel_7_url(String app,String page,String action){
		this.infopanel_7_url = new IGRPLink(app,page,action);
		return this.infopanel_7_url;
	}
	public IGRPLink getInfopanel_7_url(){
		return this.infopanel_7_url;
	}
	public void setInfopanel_7_url_desc(String infopanel_7_url_desc){
		this.infopanel_7_url_desc = infopanel_7_url_desc;
	}
	public String getInfopanel_7_url_desc(){
		return this.infopanel_7_url_desc;
	}
	public IGRPLink setInfopanel_7_url(String link){
		this.infopanel_7_url = new IGRPLink(link);
		return this.infopanel_7_url;
	}
	public IGRPLink setInfopanel_7_url(Report link){
		this.infopanel_7_url = new IGRPLink(link);
		return this.infopanel_7_url;
	}
	
	public void setInfopanel_7_bg(String infopanel_7_bg){
		this.infopanel_7_bg = infopanel_7_bg;
	}
	public String getInfopanel_7_bg(){
		return this.infopanel_7_bg;
	}
	
	public void setInfopanel_7_icn(String infopanel_7_icn){
		this.infopanel_7_icn = infopanel_7_icn;
	}
	public String getInfopanel_7_icn(){
		return this.infopanel_7_icn;
	}
	
	public void setInfopanel_8_title(String infopanel_8_title){
		this.infopanel_8_title = infopanel_8_title;
	}
	public String getInfopanel_8_title(){
		return this.infopanel_8_title;
	}
	
	public void setInfopanel_8_val(String infopanel_8_val){
		this.infopanel_8_val = infopanel_8_val;
	}
	public String getInfopanel_8_val(){
		return this.infopanel_8_val;
	}
	
	public IGRPLink setInfopanel_8_url(String app,String page,String action){
		this.infopanel_8_url = new IGRPLink(app,page,action);
		return this.infopanel_8_url;
	}
	public IGRPLink getInfopanel_8_url(){
		return this.infopanel_8_url;
	}
	public void setInfopanel_8_url_desc(String infopanel_8_url_desc){
		this.infopanel_8_url_desc = infopanel_8_url_desc;
	}
	public String getInfopanel_8_url_desc(){
		return this.infopanel_8_url_desc;
	}
	public IGRPLink setInfopanel_8_url(String link){
		this.infopanel_8_url = new IGRPLink(link);
		return this.infopanel_8_url;
	}
	public IGRPLink setInfopanel_8_url(Report link){
		this.infopanel_8_url = new IGRPLink(link);
		return this.infopanel_8_url;
	}
	
	public void setInfopanel_8_bg(String infopanel_8_bg){
		this.infopanel_8_bg = infopanel_8_bg;
	}
	public String getInfopanel_8_bg(){
		return this.infopanel_8_bg;
	}
	
	public void setInfopanel_8_icn(String infopanel_8_icn){
		this.infopanel_8_icn = infopanel_8_icn;
	}
	public String getInfopanel_8_icn(){
		return this.infopanel_8_icn;
	}
	
	public void setCirclestatbox_6_title(String circlestatbox_6_title){
		this.circlestatbox_6_title = circlestatbox_6_title;
	}
	public String getCirclestatbox_6_title(){
		return this.circlestatbox_6_title;
	}
	
	public void setCirclestatbox_6_lbl(String circlestatbox_6_lbl){
		this.circlestatbox_6_lbl = circlestatbox_6_lbl;
	}
	public String getCirclestatbox_6_lbl(){
		return this.circlestatbox_6_lbl;
	}
	
	public void setCirclestatbox_6_val(String circlestatbox_6_val){
		this.circlestatbox_6_val = circlestatbox_6_val;
	}
	public String getCirclestatbox_6_val(){
		return this.circlestatbox_6_val;
	}
	
	public void setCirclestatbox_6_desc(String circlestatbox_6_desc){
		this.circlestatbox_6_desc = circlestatbox_6_desc;
	}
	public String getCirclestatbox_6_desc(){
		return this.circlestatbox_6_desc;
	}
	
	public void setCirclestatbox_6_url(String circlestatbox_6_url){
		this.circlestatbox_6_url = circlestatbox_6_url;
	}
	public String getCirclestatbox_6_url(){
		return this.circlestatbox_6_url;
	}
	
	public void setCirclestatbox_6_bg(String circlestatbox_6_bg){
		this.circlestatbox_6_bg = circlestatbox_6_bg;
	}
	public String getCirclestatbox_6_bg(){
		return this.circlestatbox_6_bg;
	}
	
	public void setView_1_text_1(String view_1_text_1){
		this.view_1_text_1 = view_1_text_1;
	}
	public String getView_1_text_1(){
		return this.view_1_text_1;
	}
	
	public void setView_1_text_3(String view_1_text_3){
		this.view_1_text_3 = view_1_text_3;
	}
	public String getView_1_text_3(){
		return this.view_1_text_3;
	}
	
	public void setView_1_text_4(String view_1_text_4){
		this.view_1_text_4 = view_1_text_4;
	}
	public String getView_1_text_4(){
		return this.view_1_text_4;
	}
	
	public void setView_1_text_6(String view_1_text_6){
		this.view_1_text_6 = view_1_text_6;
	}
	public String getView_1_text_6(){
		return this.view_1_text_6;
	}
	
	public void setView_1_text_7(String view_1_text_7){
		this.view_1_text_7 = view_1_text_7;
	}
	public String getView_1_text_7(){
		return this.view_1_text_7;
	}
	
	public void setView_1_text_5(String view_1_text_5){
		this.view_1_text_5 = view_1_text_5;
	}
	public String getView_1_text_5(){
		return this.view_1_text_5;
	}
	
	public void setView_1_text_2(String view_1_text_2){
		this.view_1_text_2 = view_1_text_2;
	}
	public String getView_1_text_2(){
		return this.view_1_text_2;
	}
	
	public void setView_1_img(String view_1_img){
		this.view_1_img = view_1_img;
	}
	public String getView_1_img(){
		return this.view_1_img;
	}


	public static class Chart_1 extends IGRPChart3D{
		public Chart_1(String eixoX, String eixoY, Object eixoZ) {
			super(eixoX, eixoY,eixoZ);
		}
		public Chart_1() {
		}
	}

	public void loadChart_1(BaseQueryInterface query) {
		this.setChart_1(this.loadTable(query,Chart_1.class));
	}

}
