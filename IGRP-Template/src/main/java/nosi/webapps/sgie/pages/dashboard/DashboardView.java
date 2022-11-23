package nosi.webapps.sgie.pages.dashboard;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import nosi.core.webapp.Core;

public class DashboardView extends View {

	public Field circlestatbox_1_title;
	public Field circlestatbox_1_lbl;
	public Field circlestatbox_1_val;
	public Field circlestatbox_1_desc;
	public Field circlestatbox_1_url;
	public Field circlestatbox_1_bg;
	public Field circlestatbox_2_title;
	public Field circlestatbox_2_lbl;
	public Field circlestatbox_2_val;
	public Field circlestatbox_2_desc;
	public Field circlestatbox_2_url;
	public Field circlestatbox_2_bg;
	public Field circlestatbox_3_title;
	public Field circlestatbox_3_lbl;
	public Field circlestatbox_3_val;
	public Field circlestatbox_3_desc;
	public Field circlestatbox_3_url;
	public Field circlestatbox_3_bg;
	public Field circlestatbox_4_title;
	public Field circlestatbox_4_lbl;
	public Field circlestatbox_4_val;
	public Field circlestatbox_4_desc;
	public Field circlestatbox_4_url;
	public Field circlestatbox_4_bg;
	public Field infopanel_1_title;
	public Field infopanel_1_val;
	public Field infopanel_1_url;
	public Field infopanel_1_bg;
	public Field infopanel_1_icn;
	public Field infopanel_2_title;
	public Field infopanel_2_val;
	public Field infopanel_2_url;
	public Field infopanel_2_bg;
	public Field infopanel_2_icn;
	public Field infopanel_3_title;
	public Field infopanel_3_val;
	public Field infopanel_3_url;
	public Field infopanel_3_bg;
	public Field infopanel_3_icn;
	public Field circlestatbox_5_title;
	public Field circlestatbox_5_lbl;
	public Field circlestatbox_5_val;
	public Field circlestatbox_5_desc;
	public Field circlestatbox_5_url;
	public Field circlestatbox_5_bg;
	public Field infopanel_4_title;
	public Field infopanel_4_val;
	public Field infopanel_4_url;
	public Field infopanel_4_bg;
	public Field infopanel_4_icn;
	public Field infopanel_5_title;
	public Field infopanel_5_val;
	public Field infopanel_5_url;
	public Field infopanel_5_bg;
	public Field infopanel_5_icn;
	public Field infopanel_6_title;
	public Field infopanel_6_val;
	public Field infopanel_6_url;
	public Field infopanel_6_bg;
	public Field infopanel_6_icn;
	public Field infopanel_7_title;
	public Field infopanel_7_val;
	public Field infopanel_7_url;
	public Field infopanel_7_bg;
	public Field infopanel_7_icn;
	public Field infopanel_8_title;
	public Field infopanel_8_val;
	public Field infopanel_8_url;
	public Field infopanel_8_bg;
	public Field infopanel_8_icn;
	public Field circlestatbox_6_title;
	public Field circlestatbox_6_lbl;
	public Field circlestatbox_6_val;
	public Field circlestatbox_6_desc;
	public Field circlestatbox_6_url;
	public Field circlestatbox_6_bg;
	public Field view_1_text_1;
	public Field view_1_text_3;
	public Field view_1_text_4;
	public Field view_1_text_6;
	public Field view_1_text_7;
	public Field view_1_text_5;
	public Field view_1_text_2;
	public Field view_1_img;
	public IGRPCircleStatBox circlestatbox_1;
	public IGRPCircleStatBox circlestatbox_2;
	public IGRPCircleStatBox circlestatbox_3;
	public IGRPCircleStatBox circlestatbox_4;
	public IGRPForm infopanel_1;
	public IGRPForm infopanel_2;
	public IGRPForm infopanel_3;
	public IGRPCircleStatBox circlestatbox_5;
	public IGRPForm infopanel_4;
	public IGRPForm infopanel_5;
	public IGRPForm infopanel_6;
	public IGRPForm infopanel_7;
	public IGRPForm infopanel_8;
	public IGRPCircleStatBox circlestatbox_6;
	public IGRPChart chart_1;
	public IGRPView view_1;


	public DashboardView(){

		this.setPageTitle("Dashboard");
			
		circlestatbox_1 = new IGRPCircleStatBox("circlestatbox_1","");

		circlestatbox_2 = new IGRPCircleStatBox("circlestatbox_2","");

		circlestatbox_3 = new IGRPCircleStatBox("circlestatbox_3","");

		circlestatbox_4 = new IGRPCircleStatBox("circlestatbox_4","");

		infopanel_1 = new IGRPForm("infopanel_1","");

		infopanel_2 = new IGRPForm("infopanel_2","");

		infopanel_3 = new IGRPForm("infopanel_3","");

		circlestatbox_5 = new IGRPCircleStatBox("circlestatbox_5","");

		infopanel_4 = new IGRPForm("infopanel_4","");

		infopanel_5 = new IGRPForm("infopanel_5","");

		infopanel_6 = new IGRPForm("infopanel_6","");

		infopanel_7 = new IGRPForm("infopanel_7","");

		infopanel_8 = new IGRPForm("infopanel_8","");

		circlestatbox_6 = new IGRPCircleStatBox("circlestatbox_6","");

		chart_1 = new IGRPChart("chart_1","Chart");

		view_1 = new IGRPView("view_1","");

		circlestatbox_1_title = new TextField(model,"circlestatbox_1_title");
		circlestatbox_1_title.setLabel(gt("Circle Box Title"));
		circlestatbox_1_title.propertie().add("name","p_circlestatbox_1_title").add("type","text").add("maxlength","4000");
		
		circlestatbox_1_lbl = new TextField(model,"circlestatbox_1_lbl");
		circlestatbox_1_lbl.setLabel(gt("Percent Text"));
		circlestatbox_1_lbl.propertie().add("name","p_circlestatbox_1_lbl").add("type","text").add("maxlength","4000");
		
		circlestatbox_1_val = new TextField(model,"circlestatbox_1_val");
		circlestatbox_1_val.setLabel(gt("Percent Value"));
		circlestatbox_1_val.propertie().add("name","p_circlestatbox_1_val").add("type","text").add("maxlength","4000");
		
		circlestatbox_1_desc = new TextField(model,"circlestatbox_1_desc");
		circlestatbox_1_desc.setLabel(gt("Description"));
		circlestatbox_1_desc.propertie().add("name","p_circlestatbox_1_desc").add("type","text").add("maxlength","4000");
		
		circlestatbox_1_url = new TextField(model,"circlestatbox_1_url");
		circlestatbox_1_url.setLabel(gt("Link"));
		circlestatbox_1_url.propertie().add("name","p_circlestatbox_1_url").add("type","text").add("maxlength","4000");
		
		circlestatbox_1_bg = new TextField(model,"circlestatbox_1_bg");
		circlestatbox_1_bg.setLabel(gt("Background"));
		circlestatbox_1_bg.propertie().add("name","p_circlestatbox_1_bg").add("type","text").add("maxlength","4000");
		
		circlestatbox_2_title = new TextField(model,"circlestatbox_2_title");
		circlestatbox_2_title.setLabel(gt("Circle Box Title"));
		circlestatbox_2_title.propertie().add("name","p_circlestatbox_2_title").add("type","text").add("maxlength","4000");
		
		circlestatbox_2_lbl = new TextField(model,"circlestatbox_2_lbl");
		circlestatbox_2_lbl.setLabel(gt("Percent Text"));
		circlestatbox_2_lbl.propertie().add("name","p_circlestatbox_2_lbl").add("type","text").add("maxlength","4000");
		
		circlestatbox_2_val = new TextField(model,"circlestatbox_2_val");
		circlestatbox_2_val.setLabel(gt("Percent Value"));
		circlestatbox_2_val.propertie().add("name","p_circlestatbox_2_val").add("type","text").add("maxlength","4000");
		
		circlestatbox_2_desc = new TextField(model,"circlestatbox_2_desc");
		circlestatbox_2_desc.setLabel(gt("Description"));
		circlestatbox_2_desc.propertie().add("name","p_circlestatbox_2_desc").add("type","text").add("maxlength","4000");
		
		circlestatbox_2_url = new TextField(model,"circlestatbox_2_url");
		circlestatbox_2_url.setLabel(gt("Link"));
		circlestatbox_2_url.propertie().add("name","p_circlestatbox_2_url").add("type","text").add("maxlength","4000");
		
		circlestatbox_2_bg = new TextField(model,"circlestatbox_2_bg");
		circlestatbox_2_bg.setLabel(gt("Background"));
		circlestatbox_2_bg.propertie().add("name","p_circlestatbox_2_bg").add("type","text").add("maxlength","4000");
		
		circlestatbox_3_title = new TextField(model,"circlestatbox_3_title");
		circlestatbox_3_title.setLabel(gt("Circle Box Title"));
		circlestatbox_3_title.propertie().add("name","p_circlestatbox_3_title").add("type","text").add("maxlength","4000");
		
		circlestatbox_3_lbl = new TextField(model,"circlestatbox_3_lbl");
		circlestatbox_3_lbl.setLabel(gt("Percent Text"));
		circlestatbox_3_lbl.propertie().add("name","p_circlestatbox_3_lbl").add("type","text").add("maxlength","4000");
		
		circlestatbox_3_val = new TextField(model,"circlestatbox_3_val");
		circlestatbox_3_val.setLabel(gt("Percent Value"));
		circlestatbox_3_val.propertie().add("name","p_circlestatbox_3_val").add("type","text").add("maxlength","4000");
		
		circlestatbox_3_desc = new TextField(model,"circlestatbox_3_desc");
		circlestatbox_3_desc.setLabel(gt("Description"));
		circlestatbox_3_desc.propertie().add("name","p_circlestatbox_3_desc").add("type","text").add("maxlength","4000");
		
		circlestatbox_3_url = new TextField(model,"circlestatbox_3_url");
		circlestatbox_3_url.setLabel(gt("Link"));
		circlestatbox_3_url.propertie().add("name","p_circlestatbox_3_url").add("type","text").add("maxlength","4000");
		
		circlestatbox_3_bg = new TextField(model,"circlestatbox_3_bg");
		circlestatbox_3_bg.setLabel(gt("Background"));
		circlestatbox_3_bg.propertie().add("name","p_circlestatbox_3_bg").add("type","text").add("maxlength","4000");
		
		circlestatbox_4_title = new TextField(model,"circlestatbox_4_title");
		circlestatbox_4_title.setLabel(gt("Circle Box Title"));
		circlestatbox_4_title.propertie().add("name","p_circlestatbox_4_title").add("type","text").add("maxlength","4000");
		
		circlestatbox_4_lbl = new TextField(model,"circlestatbox_4_lbl");
		circlestatbox_4_lbl.setLabel(gt("Percent Text"));
		circlestatbox_4_lbl.propertie().add("name","p_circlestatbox_4_lbl").add("type","text").add("maxlength","4000");
		
		circlestatbox_4_val = new TextField(model,"circlestatbox_4_val");
		circlestatbox_4_val.setLabel(gt("Percent Value"));
		circlestatbox_4_val.propertie().add("name","p_circlestatbox_4_val").add("type","text").add("maxlength","4000");
		
		circlestatbox_4_desc = new TextField(model,"circlestatbox_4_desc");
		circlestatbox_4_desc.setLabel(gt("Description"));
		circlestatbox_4_desc.propertie().add("name","p_circlestatbox_4_desc").add("type","text").add("maxlength","4000");
		
		circlestatbox_4_url = new TextField(model,"circlestatbox_4_url");
		circlestatbox_4_url.setLabel(gt("Link"));
		circlestatbox_4_url.propertie().add("name","p_circlestatbox_4_url").add("type","text").add("maxlength","4000");
		
		circlestatbox_4_bg = new TextField(model,"circlestatbox_4_bg");
		circlestatbox_4_bg.setLabel(gt("Background"));
		circlestatbox_4_bg.propertie().add("name","p_circlestatbox_4_bg").add("type","text").add("maxlength","4000");
		
		infopanel_1_title = new TextField(model,"infopanel_1_title");
		infopanel_1_title.setLabel(gt("Title"));
		infopanel_1_title.propertie().add("name","p_infopanel_1_title").add("type","text").add("maxlength","4000");
		
		infopanel_1_val = new TextField(model,"infopanel_1_val");
		infopanel_1_val.setLabel(gt("Value"));
		infopanel_1_val.propertie().add("name","p_infopanel_1_val").add("type","text").add("maxlength","4000");
		
		infopanel_1_url = new LinkField(model,"infopanel_1_url");
		infopanel_1_url.setLabel(gt(""));
		infopanel_1_url.propertie().add("name","p_infopanel_1_url").add("type","link").add("maxlength","4000");
		
		infopanel_1_bg = new TextField(model,"infopanel_1_bg");
		infopanel_1_bg.setLabel(gt("Background"));
		infopanel_1_bg.propertie().add("name","p_infopanel_1_bg").add("type","text").add("maxlength","4000");
		
		infopanel_1_icn = new TextField(model,"infopanel_1_icn");
		infopanel_1_icn.setLabel(gt("Icon"));
		infopanel_1_icn.propertie().add("name","p_infopanel_1_icn").add("type","text").add("maxlength","4000");
		
		infopanel_2_title = new TextField(model,"infopanel_2_title");
		infopanel_2_title.setLabel(gt("Title"));
		infopanel_2_title.propertie().add("name","p_infopanel_2_title").add("type","text").add("maxlength","4000");
		
		infopanel_2_val = new TextField(model,"infopanel_2_val");
		infopanel_2_val.setLabel(gt("Value"));
		infopanel_2_val.propertie().add("name","p_infopanel_2_val").add("type","text").add("maxlength","4000");
		
		infopanel_2_url = new LinkField(model,"infopanel_2_url");
		infopanel_2_url.setLabel(gt(""));
		infopanel_2_url.propertie().add("name","p_infopanel_2_url").add("type","link").add("maxlength","4000");
		
		infopanel_2_bg = new TextField(model,"infopanel_2_bg");
		infopanel_2_bg.setLabel(gt("Background"));
		infopanel_2_bg.propertie().add("name","p_infopanel_2_bg").add("type","text").add("maxlength","4000");
		
		infopanel_2_icn = new TextField(model,"infopanel_2_icn");
		infopanel_2_icn.setLabel(gt("Icon"));
		infopanel_2_icn.propertie().add("name","p_infopanel_2_icn").add("type","text").add("maxlength","4000");
		
		infopanel_3_title = new TextField(model,"infopanel_3_title");
		infopanel_3_title.setLabel(gt("Title"));
		infopanel_3_title.propertie().add("name","p_infopanel_3_title").add("type","text").add("maxlength","4000");
		
		infopanel_3_val = new TextField(model,"infopanel_3_val");
		infopanel_3_val.setLabel(gt("Value"));
		infopanel_3_val.propertie().add("name","p_infopanel_3_val").add("type","text").add("maxlength","4000");
		
		infopanel_3_url = new LinkField(model,"infopanel_3_url");
		infopanel_3_url.setLabel(gt(""));
		infopanel_3_url.propertie().add("name","p_infopanel_3_url").add("type","link").add("maxlength","4000");
		
		infopanel_3_bg = new TextField(model,"infopanel_3_bg");
		infopanel_3_bg.setLabel(gt("Background"));
		infopanel_3_bg.propertie().add("name","p_infopanel_3_bg").add("type","text").add("maxlength","4000");
		
		infopanel_3_icn = new TextField(model,"infopanel_3_icn");
		infopanel_3_icn.setLabel(gt("Icon"));
		infopanel_3_icn.propertie().add("name","p_infopanel_3_icn").add("type","text").add("maxlength","4000");
		
		circlestatbox_5_title = new TextField(model,"circlestatbox_5_title");
		circlestatbox_5_title.setLabel(gt("Circle Box Title"));
		circlestatbox_5_title.propertie().add("name","p_circlestatbox_5_title").add("type","text").add("maxlength","4000");
		
		circlestatbox_5_lbl = new TextField(model,"circlestatbox_5_lbl");
		circlestatbox_5_lbl.setLabel(gt("Percent Text"));
		circlestatbox_5_lbl.propertie().add("name","p_circlestatbox_5_lbl").add("type","text").add("maxlength","4000");
		
		circlestatbox_5_val = new TextField(model,"circlestatbox_5_val");
		circlestatbox_5_val.setLabel(gt("Percent Value"));
		circlestatbox_5_val.propertie().add("name","p_circlestatbox_5_val").add("type","text").add("maxlength","4000");
		
		circlestatbox_5_desc = new TextField(model,"circlestatbox_5_desc");
		circlestatbox_5_desc.setLabel(gt("Description"));
		circlestatbox_5_desc.propertie().add("name","p_circlestatbox_5_desc").add("type","text").add("maxlength","4000");
		
		circlestatbox_5_url = new TextField(model,"circlestatbox_5_url");
		circlestatbox_5_url.setLabel(gt("Link"));
		circlestatbox_5_url.propertie().add("name","p_circlestatbox_5_url").add("type","text").add("maxlength","4000");
		
		circlestatbox_5_bg = new TextField(model,"circlestatbox_5_bg");
		circlestatbox_5_bg.setLabel(gt("Background"));
		circlestatbox_5_bg.propertie().add("name","p_circlestatbox_5_bg").add("type","text").add("maxlength","4000");
		
		infopanel_4_title = new TextField(model,"infopanel_4_title");
		infopanel_4_title.setLabel(gt("Title"));
		infopanel_4_title.propertie().add("name","p_infopanel_4_title").add("type","text").add("maxlength","4000");
		
		infopanel_4_val = new TextField(model,"infopanel_4_val");
		infopanel_4_val.setLabel(gt("Value"));
		infopanel_4_val.propertie().add("name","p_infopanel_4_val").add("type","text").add("maxlength","4000");
		
		infopanel_4_url = new LinkField(model,"infopanel_4_url");
		infopanel_4_url.setLabel(gt(""));
		infopanel_4_url.propertie().add("name","p_infopanel_4_url").add("type","link").add("maxlength","4000");
		
		infopanel_4_bg = new TextField(model,"infopanel_4_bg");
		infopanel_4_bg.setLabel(gt("Background"));
		infopanel_4_bg.propertie().add("name","p_infopanel_4_bg").add("type","text").add("maxlength","4000");
		
		infopanel_4_icn = new TextField(model,"infopanel_4_icn");
		infopanel_4_icn.setLabel(gt("Icon"));
		infopanel_4_icn.propertie().add("name","p_infopanel_4_icn").add("type","text").add("maxlength","4000");
		
		infopanel_5_title = new TextField(model,"infopanel_5_title");
		infopanel_5_title.setLabel(gt("Title"));
		infopanel_5_title.propertie().add("name","p_infopanel_5_title").add("type","text").add("maxlength","4000");
		
		infopanel_5_val = new TextField(model,"infopanel_5_val");
		infopanel_5_val.setLabel(gt("Value"));
		infopanel_5_val.propertie().add("name","p_infopanel_5_val").add("type","text").add("maxlength","4000");
		
		infopanel_5_url = new LinkField(model,"infopanel_5_url");
		infopanel_5_url.setLabel(gt(""));
		infopanel_5_url.propertie().add("name","p_infopanel_5_url").add("type","link").add("maxlength","4000");
		
		infopanel_5_bg = new TextField(model,"infopanel_5_bg");
		infopanel_5_bg.setLabel(gt("Background"));
		infopanel_5_bg.propertie().add("name","p_infopanel_5_bg").add("type","text").add("maxlength","4000");
		
		infopanel_5_icn = new TextField(model,"infopanel_5_icn");
		infopanel_5_icn.setLabel(gt("Icon"));
		infopanel_5_icn.propertie().add("name","p_infopanel_5_icn").add("type","text").add("maxlength","4000");
		
		infopanel_6_title = new TextField(model,"infopanel_6_title");
		infopanel_6_title.setLabel(gt("Title"));
		infopanel_6_title.propertie().add("name","p_infopanel_6_title").add("type","text").add("maxlength","4000");
		
		infopanel_6_val = new TextField(model,"infopanel_6_val");
		infopanel_6_val.setLabel(gt("Value"));
		infopanel_6_val.propertie().add("name","p_infopanel_6_val").add("type","text").add("maxlength","4000");
		
		infopanel_6_url = new LinkField(model,"infopanel_6_url");
		infopanel_6_url.setLabel(gt(""));
		infopanel_6_url.propertie().add("name","p_infopanel_6_url").add("type","link").add("maxlength","4000");
		
		infopanel_6_bg = new TextField(model,"infopanel_6_bg");
		infopanel_6_bg.setLabel(gt("Background"));
		infopanel_6_bg.propertie().add("name","p_infopanel_6_bg").add("type","text").add("maxlength","4000");
		
		infopanel_6_icn = new TextField(model,"infopanel_6_icn");
		infopanel_6_icn.setLabel(gt("Icon"));
		infopanel_6_icn.propertie().add("name","p_infopanel_6_icn").add("type","text").add("maxlength","4000");
		
		infopanel_7_title = new TextField(model,"infopanel_7_title");
		infopanel_7_title.setLabel(gt("Title"));
		infopanel_7_title.propertie().add("name","p_infopanel_7_title").add("type","text").add("maxlength","4000");
		
		infopanel_7_val = new TextField(model,"infopanel_7_val");
		infopanel_7_val.setLabel(gt("Value"));
		infopanel_7_val.propertie().add("name","p_infopanel_7_val").add("type","text").add("maxlength","4000");
		
		infopanel_7_url = new LinkField(model,"infopanel_7_url");
		infopanel_7_url.setLabel(gt(""));
		infopanel_7_url.propertie().add("name","p_infopanel_7_url").add("type","link").add("maxlength","4000");
		
		infopanel_7_bg = new TextField(model,"infopanel_7_bg");
		infopanel_7_bg.setLabel(gt("Background"));
		infopanel_7_bg.propertie().add("name","p_infopanel_7_bg").add("type","text").add("maxlength","4000");
		
		infopanel_7_icn = new TextField(model,"infopanel_7_icn");
		infopanel_7_icn.setLabel(gt("Icon"));
		infopanel_7_icn.propertie().add("name","p_infopanel_7_icn").add("type","text").add("maxlength","4000");
		
		infopanel_8_title = new TextField(model,"infopanel_8_title");
		infopanel_8_title.setLabel(gt("Title"));
		infopanel_8_title.propertie().add("name","p_infopanel_8_title").add("type","text").add("maxlength","4000");
		
		infopanel_8_val = new TextField(model,"infopanel_8_val");
		infopanel_8_val.setLabel(gt("Value"));
		infopanel_8_val.propertie().add("name","p_infopanel_8_val").add("type","text").add("maxlength","4000");
		
		infopanel_8_url = new LinkField(model,"infopanel_8_url");
		infopanel_8_url.setLabel(gt(""));
		infopanel_8_url.propertie().add("name","p_infopanel_8_url").add("type","link").add("maxlength","4000");
		
		infopanel_8_bg = new TextField(model,"infopanel_8_bg");
		infopanel_8_bg.setLabel(gt("Background"));
		infopanel_8_bg.propertie().add("name","p_infopanel_8_bg").add("type","text").add("maxlength","4000");
		
		infopanel_8_icn = new TextField(model,"infopanel_8_icn");
		infopanel_8_icn.setLabel(gt("Icon"));
		infopanel_8_icn.propertie().add("name","p_infopanel_8_icn").add("type","text").add("maxlength","4000");
		
		circlestatbox_6_title = new TextField(model,"circlestatbox_6_title");
		circlestatbox_6_title.setLabel(gt("Circle Box Title"));
		circlestatbox_6_title.propertie().add("name","p_circlestatbox_6_title").add("type","text").add("maxlength","4000");
		
		circlestatbox_6_lbl = new TextField(model,"circlestatbox_6_lbl");
		circlestatbox_6_lbl.setLabel(gt("Percent Text"));
		circlestatbox_6_lbl.propertie().add("name","p_circlestatbox_6_lbl").add("type","text").add("maxlength","4000");
		
		circlestatbox_6_val = new TextField(model,"circlestatbox_6_val");
		circlestatbox_6_val.setLabel(gt("Percent Value"));
		circlestatbox_6_val.propertie().add("name","p_circlestatbox_6_val").add("type","text").add("maxlength","4000");
		
		circlestatbox_6_desc = new TextField(model,"circlestatbox_6_desc");
		circlestatbox_6_desc.setLabel(gt("Description"));
		circlestatbox_6_desc.propertie().add("name","p_circlestatbox_6_desc").add("type","text").add("maxlength","4000");
		
		circlestatbox_6_url = new TextField(model,"circlestatbox_6_url");
		circlestatbox_6_url.setLabel(gt("Link"));
		circlestatbox_6_url.propertie().add("name","p_circlestatbox_6_url").add("type","text").add("maxlength","4000");
		
		circlestatbox_6_bg = new TextField(model,"circlestatbox_6_bg");
		circlestatbox_6_bg.setLabel(gt("Background"));
		circlestatbox_6_bg.propertie().add("name","p_circlestatbox_6_bg").add("type","text").add("maxlength","4000");
		
		view_1_text_1 = new TextField(model,"view_1_text_1");
		view_1_text_1.setLabel(gt("Text"));
		view_1_text_1.propertie().add("name","p_view_1_text_1").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		view_1_text_3 = new TextField(model,"view_1_text_3");
		view_1_text_3.setLabel(gt("Text"));
		view_1_text_3.propertie().add("name","p_view_1_text_3").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		view_1_text_4 = new TextField(model,"view_1_text_4");
		view_1_text_4.setLabel(gt("Text"));
		view_1_text_4.propertie().add("name","p_view_1_text_4").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		view_1_text_6 = new TextField(model,"view_1_text_6");
		view_1_text_6.setLabel(gt("Text"));
		view_1_text_6.propertie().add("name","p_view_1_text_6").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		view_1_text_7 = new TextField(model,"view_1_text_7");
		view_1_text_7.setLabel(gt("Text"));
		view_1_text_7.propertie().add("name","p_view_1_text_7").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		view_1_text_5 = new TextField(model,"view_1_text_5");
		view_1_text_5.setLabel(gt("Text"));
		view_1_text_5.propertie().add("name","p_view_1_text_5").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		view_1_text_2 = new TextField(model,"view_1_text_2");
		view_1_text_2.setLabel(gt("Text"));
		view_1_text_2.propertie().add("name","p_view_1_text_2").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		view_1_img = new TextField(model,"view_1_img");
		view_1_img.setLabel(gt(""));
		view_1_img.propertie().add("type","text").add("name","p_view_1_img").add("maxlength","300");
		


		
		chart_1.setCaption("");
		chart_1.setChart_type("line");
		chart_1.setXaxys("Eixo de X");
		chart_1.setYaxys("Eixo de Y");
		chart_1.setUrl("#");
		//ex: chart_1.addColor("#7c31e3").addColor("#b952b5").addColor("#35c30e").addColor("#7c4e53");

	}
		
	@Override
	public void render(){
		
		circlestatbox_1.addField(circlestatbox_1_title);
		circlestatbox_1.addField(circlestatbox_1_lbl);
		circlestatbox_1.addField(circlestatbox_1_val);
		circlestatbox_1.addField(circlestatbox_1_desc);
		circlestatbox_1.addField(circlestatbox_1_url);
		circlestatbox_1.addField(circlestatbox_1_bg);

		circlestatbox_2.addField(circlestatbox_2_title);
		circlestatbox_2.addField(circlestatbox_2_lbl);
		circlestatbox_2.addField(circlestatbox_2_val);
		circlestatbox_2.addField(circlestatbox_2_desc);
		circlestatbox_2.addField(circlestatbox_2_url);
		circlestatbox_2.addField(circlestatbox_2_bg);

		circlestatbox_3.addField(circlestatbox_3_title);
		circlestatbox_3.addField(circlestatbox_3_lbl);
		circlestatbox_3.addField(circlestatbox_3_val);
		circlestatbox_3.addField(circlestatbox_3_desc);
		circlestatbox_3.addField(circlestatbox_3_url);
		circlestatbox_3.addField(circlestatbox_3_bg);

		circlestatbox_4.addField(circlestatbox_4_title);
		circlestatbox_4.addField(circlestatbox_4_lbl);
		circlestatbox_4.addField(circlestatbox_4_val);
		circlestatbox_4.addField(circlestatbox_4_desc);
		circlestatbox_4.addField(circlestatbox_4_url);
		circlestatbox_4.addField(circlestatbox_4_bg);

		infopanel_1.addField(infopanel_1_title);
		infopanel_1.addField(infopanel_1_val);
		infopanel_1.addField(infopanel_1_url);
		infopanel_1.addField(infopanel_1_bg);
		infopanel_1.addField(infopanel_1_icn);

		infopanel_2.addField(infopanel_2_title);
		infopanel_2.addField(infopanel_2_val);
		infopanel_2.addField(infopanel_2_url);
		infopanel_2.addField(infopanel_2_bg);
		infopanel_2.addField(infopanel_2_icn);

		infopanel_3.addField(infopanel_3_title);
		infopanel_3.addField(infopanel_3_val);
		infopanel_3.addField(infopanel_3_url);
		infopanel_3.addField(infopanel_3_bg);
		infopanel_3.addField(infopanel_3_icn);

		circlestatbox_5.addField(circlestatbox_5_title);
		circlestatbox_5.addField(circlestatbox_5_lbl);
		circlestatbox_5.addField(circlestatbox_5_val);
		circlestatbox_5.addField(circlestatbox_5_desc);
		circlestatbox_5.addField(circlestatbox_5_url);
		circlestatbox_5.addField(circlestatbox_5_bg);

		infopanel_4.addField(infopanel_4_title);
		infopanel_4.addField(infopanel_4_val);
		infopanel_4.addField(infopanel_4_url);
		infopanel_4.addField(infopanel_4_bg);
		infopanel_4.addField(infopanel_4_icn);

		infopanel_5.addField(infopanel_5_title);
		infopanel_5.addField(infopanel_5_val);
		infopanel_5.addField(infopanel_5_url);
		infopanel_5.addField(infopanel_5_bg);
		infopanel_5.addField(infopanel_5_icn);

		infopanel_6.addField(infopanel_6_title);
		infopanel_6.addField(infopanel_6_val);
		infopanel_6.addField(infopanel_6_url);
		infopanel_6.addField(infopanel_6_bg);
		infopanel_6.addField(infopanel_6_icn);

		infopanel_7.addField(infopanel_7_title);
		infopanel_7.addField(infopanel_7_val);
		infopanel_7.addField(infopanel_7_url);
		infopanel_7.addField(infopanel_7_bg);
		infopanel_7.addField(infopanel_7_icn);

		infopanel_8.addField(infopanel_8_title);
		infopanel_8.addField(infopanel_8_val);
		infopanel_8.addField(infopanel_8_url);
		infopanel_8.addField(infopanel_8_bg);
		infopanel_8.addField(infopanel_8_icn);

		circlestatbox_6.addField(circlestatbox_6_title);
		circlestatbox_6.addField(circlestatbox_6_lbl);
		circlestatbox_6.addField(circlestatbox_6_val);
		circlestatbox_6.addField(circlestatbox_6_desc);
		circlestatbox_6.addField(circlestatbox_6_url);
		circlestatbox_6.addField(circlestatbox_6_bg);


		view_1.addField(view_1_text_1);
		view_1.addField(view_1_text_3);
		view_1.addField(view_1_text_4);
		view_1.addField(view_1_text_6);
		view_1.addField(view_1_text_7);
		view_1.addField(view_1_text_5);
		view_1.addField(view_1_text_2);
		view_1.addField(view_1_img);

		this.addToPage(circlestatbox_1);
		this.addToPage(circlestatbox_2);
		this.addToPage(circlestatbox_3);
		this.addToPage(circlestatbox_4);
		this.addToPage(infopanel_1);
		this.addToPage(infopanel_2);
		this.addToPage(infopanel_3);
		this.addToPage(circlestatbox_5);
		this.addToPage(infopanel_4);
		this.addToPage(infopanel_5);
		this.addToPage(infopanel_6);
		this.addToPage(infopanel_7);
		this.addToPage(infopanel_8);
		this.addToPage(circlestatbox_6);
		this.addToPage(chart_1);
		this.addToPage(view_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		circlestatbox_1_title.setValue(model);
		circlestatbox_1_lbl.setValue(model);
		circlestatbox_1_val.setValue(model);
		circlestatbox_1_desc.setValue(model);
		circlestatbox_1_url.setValue(model);
		circlestatbox_1_bg.setValue(model);
		circlestatbox_2_title.setValue(model);
		circlestatbox_2_lbl.setValue(model);
		circlestatbox_2_val.setValue(model);
		circlestatbox_2_desc.setValue(model);
		circlestatbox_2_url.setValue(model);
		circlestatbox_2_bg.setValue(model);
		circlestatbox_3_title.setValue(model);
		circlestatbox_3_lbl.setValue(model);
		circlestatbox_3_val.setValue(model);
		circlestatbox_3_desc.setValue(model);
		circlestatbox_3_url.setValue(model);
		circlestatbox_3_bg.setValue(model);
		circlestatbox_4_title.setValue(model);
		circlestatbox_4_lbl.setValue(model);
		circlestatbox_4_val.setValue(model);
		circlestatbox_4_desc.setValue(model);
		circlestatbox_4_url.setValue(model);
		circlestatbox_4_bg.setValue(model);
		infopanel_1_title.setValue(model);
		infopanel_1_val.setValue(model);
		infopanel_1_url.setValue(model);
		infopanel_1_bg.setValue(model);
		infopanel_1_icn.setValue(model);
		infopanel_2_title.setValue(model);
		infopanel_2_val.setValue(model);
		infopanel_2_url.setValue(model);
		infopanel_2_bg.setValue(model);
		infopanel_2_icn.setValue(model);
		infopanel_3_title.setValue(model);
		infopanel_3_val.setValue(model);
		infopanel_3_url.setValue(model);
		infopanel_3_bg.setValue(model);
		infopanel_3_icn.setValue(model);
		circlestatbox_5_title.setValue(model);
		circlestatbox_5_lbl.setValue(model);
		circlestatbox_5_val.setValue(model);
		circlestatbox_5_desc.setValue(model);
		circlestatbox_5_url.setValue(model);
		circlestatbox_5_bg.setValue(model);
		infopanel_4_title.setValue(model);
		infopanel_4_val.setValue(model);
		infopanel_4_url.setValue(model);
		infopanel_4_bg.setValue(model);
		infopanel_4_icn.setValue(model);
		infopanel_5_title.setValue(model);
		infopanel_5_val.setValue(model);
		infopanel_5_url.setValue(model);
		infopanel_5_bg.setValue(model);
		infopanel_5_icn.setValue(model);
		infopanel_6_title.setValue(model);
		infopanel_6_val.setValue(model);
		infopanel_6_url.setValue(model);
		infopanel_6_bg.setValue(model);
		infopanel_6_icn.setValue(model);
		infopanel_7_title.setValue(model);
		infopanel_7_val.setValue(model);
		infopanel_7_url.setValue(model);
		infopanel_7_bg.setValue(model);
		infopanel_7_icn.setValue(model);
		infopanel_8_title.setValue(model);
		infopanel_8_val.setValue(model);
		infopanel_8_url.setValue(model);
		infopanel_8_bg.setValue(model);
		infopanel_8_icn.setValue(model);
		circlestatbox_6_title.setValue(model);
		circlestatbox_6_lbl.setValue(model);
		circlestatbox_6_val.setValue(model);
		circlestatbox_6_desc.setValue(model);
		circlestatbox_6_url.setValue(model);
		circlestatbox_6_bg.setValue(model);
		view_1_text_1.setValue(model);
		view_1_text_3.setValue(model);
		view_1_text_4.setValue(model);
		view_1_text_6.setValue(model);
		view_1_text_7.setValue(model);
		view_1_text_5.setValue(model);
		view_1_text_2.setValue(model);
		view_1_img.setValue(model);	

		chart_1.loadModel(((Dashboard) model).getChart_1());
		}
}
