package nosi.webapps.sgie.pages.dashboard;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class DashboardController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dashboard model = new Dashboard();
		model.load();
		model.setCirclestatbox_1_title("Circle Box Title");
		model.setCirclestatbox_1_lbl("percent");
		model.setCirclestatbox_1_val("77.8");
		model.setCirclestatbox_1_desc("Some Text Here");
		model.setCirclestatbox_1_url("http://www.example.com");
		model.setCirclestatbox_1_bg("cp-cyan");
		model.setCirclestatbox_2_title("Circle Box Title");
		model.setCirclestatbox_2_lbl("percent");
		model.setCirclestatbox_2_val("79.2");
		model.setCirclestatbox_2_desc("Some Text Here");
		model.setCirclestatbox_2_url("http://www.example.com");
		model.setCirclestatbox_2_bg("cp-cyan");
		model.setCirclestatbox_3_title("Circle Box Title");
		model.setCirclestatbox_3_lbl("percent");
		model.setCirclestatbox_3_val("39.4");
		model.setCirclestatbox_3_desc("Some Text Here");
		model.setCirclestatbox_3_url("http://www.example.com");
		model.setCirclestatbox_3_bg("cp-cyan");
		model.setCirclestatbox_4_title("Circle Box Title");
		model.setCirclestatbox_4_lbl("percent");
		model.setCirclestatbox_4_val("90.1");
		model.setCirclestatbox_4_desc("Some Text Here");
		model.setCirclestatbox_4_url("http://www.example.com");
		model.setCirclestatbox_4_bg("cp-cyan");
		model.setCirclestatbox_5_title("Circle Box Title");
		model.setCirclestatbox_5_lbl("percent");
		model.setCirclestatbox_5_val("63.4");
		model.setCirclestatbox_5_desc("Some Text Here");
		model.setCirclestatbox_5_url("http://www.example.com");
		model.setCirclestatbox_5_bg("cp-cyan");
		model.setCirclestatbox_6_title("Circle Box Title");
		model.setCirclestatbox_6_lbl("percent");
		model.setCirclestatbox_6_val("31.7");
		model.setCirclestatbox_6_desc("Some Text Here");
		model.setCirclestatbox_6_url("http://www.example.com");
		model.setCirclestatbox_6_bg("cp-cyan");
		model.setInfopanel_1_title("Infopanel");
		model.setInfopanel_1_val("71");
		model.setInfopanel_1_url(Core.getIGRPLink("sgie","Dashboard","index"));
		model.setInfopanel_1_bg("cp-cyan");
		model.setInfopanel_1_icn("fa-info");
		model.setInfopanel_2_title("Infopanel");
		model.setInfopanel_2_val("56");
		model.setInfopanel_2_url(Core.getIGRPLink("sgie","Dashboard","index"));
		model.setInfopanel_2_bg("cp-cyan");
		model.setInfopanel_2_icn("fa-info");
		model.setInfopanel_3_title("Infopanel");
		model.setInfopanel_3_val("98");
		model.setInfopanel_3_url(Core.getIGRPLink("sgie","Dashboard","index"));
		model.setInfopanel_3_bg("cp-cyan");
		model.setInfopanel_3_icn("fa-info");
		model.setInfopanel_4_title("Infopanel");
		model.setInfopanel_4_val("9");
		model.setInfopanel_4_url(Core.getIGRPLink("sgie","Dashboard","index"));
		model.setInfopanel_4_bg("cp-cyan");
		model.setInfopanel_4_icn("fa-info");
		model.setInfopanel_5_title("Infopanel");
		model.setInfopanel_5_val("92");
		model.setInfopanel_5_url(Core.getIGRPLink("sgie","Dashboard","index"));
		model.setInfopanel_5_bg("cp-cyan");
		model.setInfopanel_5_icn("fa-info");
		model.setInfopanel_6_title("Infopanel");
		model.setInfopanel_6_val("98");
		model.setInfopanel_6_url(Core.getIGRPLink("sgie","Dashboard","index"));
		model.setInfopanel_6_bg("cp-cyan");
		model.setInfopanel_6_icn("fa-info");
		model.setInfopanel_7_title("Infopanel");
		model.setInfopanel_7_val("54");
		model.setInfopanel_7_url(Core.getIGRPLink("sgie","Dashboard","index"));
		model.setInfopanel_7_bg("cp-cyan");
		model.setInfopanel_7_icn("fa-info");
		model.setInfopanel_8_title("Infopanel");
		model.setInfopanel_8_val("66");
		model.setInfopanel_8_url(Core.getIGRPLink("sgie","Dashboard","index"));
		model.setInfopanel_8_bg("cp-cyan");
		model.setInfopanel_8_icn("fa-info");
		model.setView_1_img("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg");
		DashboardView view = new DashboardView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.chart_1.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		model.setCirclestatbox_1_url(Core.getIGRPLink("your app","your page","your action"));
		model.setCirclestatbox_2_url(Core.getIGRPLink("your app","your page","your action"));
		model.setCirclestatbox_3_url(Core.getIGRPLink("your app","your page","your action"));
		model.setCirclestatbox_4_url(Core.getIGRPLink("your app","your page","your action"));
		model.setCirclestatbox_5_url(Core.getIGRPLink("your app","your page","your action"));
		model.setCirclestatbox_6_url(Core.getIGRPLink("your app","your page","your action"));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
