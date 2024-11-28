package vivaglint;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import glint.ORReport;
import glint.Login1;

public class ORR extends Vivalogin {
	Login1 login;
	ORReport orr;

	@BeforeClass
	void setObject() {
		login = new Login1(driver);
         orr = new ORReport(driver);

		login.login(prop.getProperty("email"), prop.getProperty("clientid"), prop.getProperty("password"));
	login.survey(prop.getProperty("survey"));
	}

	@Test
	public void Tc_01() throws IOException {

		ExtentTest test = extentReport.createTest("Tc_01");
		test.log(Status.PASS, "Title: " + orr.ORRTitle());
         orr.ORRTitle();
		Assert.assertEquals("Overall Results", orr.ORRTitle());
		test.addScreenCaptureFromPath(Screenshot("Tc_01"));
	}

	@Test
	public void Tc_02() throws IOException, InterruptedException {
		orr.exportoptions();
		orr.Screenshot("Tc_02");
	}

	@Test
	public void Tc_03() throws IOException, InterruptedException {
		orr.savereport();
		orr.Screenshot("Tc_03");
		
	}

	@Test
	public void Tc_04() throws IOException, InterruptedException {
		orr.saveasreport();
		orr.Screenshot("Tc_04");
	}

	@Test
	public void Tc_05() throws InterruptedException {
		orr.newreport();
	}

	@Test
	public void Tc_06() throws IOException, InterruptedException {
		orr.Exportppt();
		orr.Screenshot("Tc_06");
	}
	
	@Test
	public void Tc_040() throws IOException, InterruptedException {
		orr.Showsubset();
		orr.Screenshot("Tc_040");
	}
	
	@Test
	public void Tc_041() throws IOException, InterruptedException {
		orr.AdvFilter_QuestionRsponse();
		orr.Screenshot("Tc_041");
	}
	@Test
	public void Tc_042() throws IOException, InterruptedException {
		orr.AddCloseFilter();
		orr.Screenshot("Tc_042");
	}

	@Test
	public void Tc_07() throws IOException, InterruptedException {
		orr.Exportpdf();
		orr.Screenshot("Tc_07");
	}

	@Test
	public void Tc_08() throws IOException, InterruptedException {
		orr.Exportimages();
		orr.Screenshot("Tc_08");
	}

	@Test
	public void Tc_09() throws IOException, InterruptedException {
		orr.Exportcsv();
		orr.Screenshot("Tc_09");
	}

	@Test
	public void Tc_10() throws IOException, InterruptedException {
		orr.verifydefaultSection();
		orr.Screenshot("Tc_010");

	}

	@Test
	public void Tc_11() throws IOException, InterruptedException {
		orr.surveyoverview();
		orr.Screenshot("Tc_011");
	}

	@Test
	public void Tc_12() throws IOException, InterruptedException {
		orr.Historyhoverover();
		orr.Screenshot("Tc_012");
	}

	@Test
	public void Tc_13() throws IOException, InterruptedException {
		orr.Historysection();
		orr.Screenshot("Tc_013");
	}

	@Test
	public void Tc_14() throws IOException, InterruptedException {
		orr.scores();
		orr.Screenshot("Tc_014");
	}

	@Test
	public void Tc_15() throws IOException, InterruptedException {
		orr.Question();
		orr.Screenshot("Tc_015");
	}
// Manager Reports -Giri
	@Test
	public void Tc_16() throws IOException, InterruptedException {
		orr.rolluphierarchy();
		orr.Screenshot("Tc_016");
	}
	
	@Test
	public void Tc_17() throws IOException, InterruptedException {
		orr.pageredirection();
		orr.Screenshot("Tc_017");
	}

	@Test
	public void Tc_18() throws IOException, InterruptedException {
		orr.manager_redirection();
		orr.Screenshot("Tc_018");
	}
	@Test
	public void Tc_19() throws IOException, InterruptedException {
		orr.department_hierarchy_filter();
		orr.Screenshot("Tc_019");
	}
	
	@Test
	public void Tc_20() throws IOException, InterruptedException {
		orr.select_department_hierarchy();
		orr.Screenshot("Tc_020");
	}
	
	@Test
	public void Tc_21() throws IOException, InterruptedException {
		orr.select_dropdown();
		orr.Screenshot("Tc_021");
	}
	
	@Test
	public void Tc_22() throws IOException, InterruptedException {
		orr.select_filter();
		orr.Screenshot("Tc_022");
	}
	
	
	
	@Test
	public void Tc_23() throws IOException, InterruptedException {
		orr.manager_count();
		orr.Screenshot("Tc_023");
	}
	
	@Test
	public void Tc_24() throws IOException, InterruptedException {
		orr.reportsettings_groupbydropdown();
		orr.Screenshot("Tc_024");
	}
	
	
	
	@Test
	public void Tc_25() throws IOException, InterruptedException {
		orr.settings_groupbydropdown();
		orr.Screenshot("Tc_025");
	}
	
	@Test
	public void Tc_26() throws IOException, InterruptedException {
		orr.settings_slider();
		orr.Screenshot("Tc_026");
	}
	
	@Test
	public void Tc_27() throws IOException, InterruptedException {
		orr.accept_Feedback();
		orr.Screenshot("Tc_027");
	}
	
	//Response rate report -Lavanya
	@Test
	public void Tc_28() throws IOException, InterruptedException {
		orr.response_RateReport();
		orr.Screenshot("Tc_028");
	}
	
	@Test
	public void Tc_29() throws IOException, InterruptedException {
		orr.select_resreporttype();
		orr.Screenshot("Tc_029");
		
	}
	@Test
	public void Tc_30() throws IOException, InterruptedException {
		orr.addfilter_resreporttype();
		orr.Screenshot("Tc_030");
		
	}
	
	@Test
	public void Tc_31() throws IOException, InterruptedException {
		orr.backbutton_resreporttype();
		orr.Screenshot("Tc_031");
		
	}
	@Test
	public void Tc_32() throws IOException, InterruptedException {
		orr.reportsettings_resreporttype();
		orr.Screenshot("Tc_032");
		
	}
	@Test
	public void Tc_33() throws IOException, InterruptedException {
		orr.exportsharepdf_resreporttype();
		orr.Screenshot("Tc_033");
		
	}
	@Test
	public void Tc_34() throws IOException, InterruptedException {
		orr.exportsavereport_resreporttype();
		orr.Screenshot("Tc_034");
		
	}
	@Test
	public void Tc_35() throws IOException, InterruptedException {
		orr.exportsaveppt_resreporttype();
		orr.Screenshot("Tc_035");
		
	}
	@Test
	public void Tc_36() throws IOException, InterruptedException {
		orr.view_resreporttype();
		orr.Screenshot("Tc_036");
		
	}
	
	@Test
	public void Tc_37() throws IOException, InterruptedException {
		orr.moreoptions_resreporttype();
		orr.Screenshot("Tc_037");
		
	}
	
	@Test
	public void Tc_38() throws IOException, InterruptedException {
		orr.moreoptions_resreporttype();
		orr.Screenshot("Tc_038");
		
	}
	
	@Test
	public void Tc_39() throws IOException, InterruptedException {
		orr.sorting_resreporttype();
		orr.Screenshot("Tc_039");
		
	}
}
