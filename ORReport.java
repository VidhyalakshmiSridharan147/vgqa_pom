package glint;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

public class ORReport extends Base {

	public ORReport(RemoteWebDriver driver) {
		this.driver = driver;

	}

	public String ORRTitle() {
		WebElement title = driver.findElement(By.xpath(properties.getProperty("ORRTitle.xpath")));
		String title1 = title.getText();
		//System.out.println(title1);
		Assert.assertEquals(title1, "Overall Results");
//		ExtentTest test = extentReport.createTest("ESR title");
//		test.info("Title of the page");
		return title1;

	}
	
	

	public void exportoptions() throws InterruptedException {
		driver.findElement(By.xpath(properties.getProperty("addfilter.xpath"))).click();
		Thread.sleep(5000);
		iwait();
		WebElement surveyselect = driver.findElement(By.xpath(properties.getProperty("Surveyselect.xpath")));
		iwait();
		surveyselect.click();
		Thread.sleep(5000);
		driver.findElement(By.id(properties.getProperty("survey2.id"))).click();
		Thread.sleep(5000);
		iwait();
		WebElement sur = driver.findElement(By.xpath(properties.getProperty("Surveyselect.xpath")));
		iwait();
		sur.click();
		Thread.sleep(5000);
		driver.findElement(By.id(properties.getProperty("survey1.id"))).click();

		driver.findElement(By.xpath(properties.getProperty("closefilters.xpath"))).click();
		
		driver.findElement(By.xpath(properties.getProperty("exportlist.xpath"))).click();
		
	}

	public void savereport() throws InterruptedException {
		exportoptions();
		iwait();
		
		driver.findElement(By.xpath(properties.getProperty("savereport.xpath"))).click();
		driver.findElement(By.xpath(properties.getProperty("savebutton.xpath"))).click();
		
		
		
		//driver.findElement(By.xpath(properties.getProperty("More.xpath"))).click();
		iwait();
		//iwait();
		/*
		 * String As =
		 * driver.findElement(By.id(properties.getProperty("Addsection.id"))).getText();
		 * Assert.assertEquals(As, "Add section"); String sc =
		 * driver.findElement(By.id(properties.getProperty("searchcomments.id"))).
		 * getText(); Assert.assertEquals(sc, "Search Comments");
		 */

	}
	public void saveasreport() throws InterruptedException {
		exportoptions();
		iwait();
		
		driver.findElement(By.xpath(properties.getProperty("saveasreport.xpath"))).click();
		driver.findElement(By.xpath(properties.getProperty("savefileinput.xpath"))).sendKeys("saireport1");
		
		driver.findElement(By.xpath(properties.getProperty("saveasbutton.xpath"))).click();
		//driver.findElement(By.xpath(properties.getProperty("More.xpath"))).click();
		iwait();
		//iwait();
		/*
		 * String As =
		 * driver.findElement(By.id(properties.getProperty("Addsection.id"))).getText();
		 * Assert.assertEquals(As, "Add section"); String sc =
		 * driver.findElement(By.id(properties.getProperty("searchcomments.id"))).
		 * getText(); Assert.assertEquals(sc, "Search Comments");
		 */

	}
	public void newreport() throws InterruptedException {
		//exportoptions();
		iwait();
		
		driver.findElement(By.xpath("//button[@class='btnCta btnWithVgIcon glintButton ng-star-inserted']")).click();
		
		

	}
	public void Showsubset() throws InterruptedException {
		
		
		driver.findElement(By.xpath(properties.getProperty("newreport.xpath"))).click();
		iwait();
		driver.findElement(By.xpath(properties.getProperty("reportdropdown.xpath"))).click();
		iwait();
		driver.findElement(By.xpath(properties.getProperty("overalloption.xpath"))).click();
		iwait();
		//driver.findElement(By.id(properties.getProperty("questionselect.xpath"))).click();
		//iwait();
			//driver.findElement(By.xpath(properties.getProperty("recdropdown.xpath"))).click();
			//Thread.sleep(5000);
		
			//driver.findElement(By.id(properties.getProperty("viewquestion.xpath"))).click();
			/*
			 * WebElement surveyselect =
			 * driver.findElement(By.xpath(properties.getProperty("Surveyselect.xpath")));
			 * iwait(); surveyselect.click(); Thread.sleep(5000);
			 * driver.findElement(By.id(properties.getProperty("survey2.id"))).click();
			 * 
			 * driver.findElement(By.id(properties.getProperty("viewquestion.xpath"))).click
			 * ();
			 */

			
			
			
		
	}
public void AdvFilter_QuestionRsponse() throws InterruptedException {
		
		
	driver.findElement(By.xpath("//button[@class=\"addFilterButtonPanel ng-star-inserted\"]")).click();
	Thread.sleep(3000);
	//button[@class="inlineBtnLink advancedToggle glintButton"]
	driver.findElement(By.xpath("//button[@class=\"inlineBtnLink advancedToggle glintButton\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class=\"btnCta glintButton\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[text()=\"Add Filters\"])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@id=\"tab-QUESTION_RESPONSE\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[text()=\"Acceptance\"])[1]")).click();
	Thread.sleep(3000);
	String Fav1=driver.findElement(By.xpath("//*[@id=\"filterPanelMain\"]/div[1]/div/div[2]/div/glint-survey-filters-list/glint-advanced-survey-filters/div/div/glint-survey-filters/glint-add-filter/glint-filter-editor/div/glint-filter-editor-filter-values/fieldset/div[1]/label")).getText();
	String neut=driver.findElement(By.xpath("//*[@id=\"filterPanelMain\"]/div[1]/div/div[2]/div/glint-survey-filters-list/glint-advanced-survey-filters/div/div/glint-survey-filters/glint-add-filter/glint-filter-editor/div/glint-filter-editor-filter-values/fieldset/div[2]/label")).getText();
	String UFav=driver.findElement(By.xpath("//*[@id=\"filterPanelMain\"]/div[1]/div/div[2]/div/glint-survey-filters-list/glint-advanced-survey-filters/div/div/glint-survey-filters/glint-add-filter/glint-filter-editor/div/glint-filter-editor-filter-values/fieldset/div[3]/label")).getText();
	System.out.println("Fv1" +Fav1);
	System.out.println("Neu" +neut);
	System.out.println("UFv1" +UFav);
    Assert.assertEquals(Fav1,"Favorable"); 
    Assert.assertEquals(neut,"Neutral");
    Assert.assertEquals(UFav,"Unfavorable");
    driver.close();
			
			
		
	}
	
	public void Addsection() throws InterruptedException {
		savereport();
		driver.findElement(By.id(properties.getProperty("Addsection.id"))).click();
		iwait();
		driver.findElement(By.xpath(properties.getProperty("pulseresultsection.xpath"))).click();
		iwait();
		scrollintoElement(driver.findElement(By.xpath(properties.getProperty("addsectionheader.xpath"))));

	}

	public void ExportList() throws InterruptedException {
		exportoptions();
		driver.findElement(By.xpath(properties.getProperty("Reportexportdropdown.xpath"))).click();
		iwait();
		iwait();
		List<WebElement> list = driver.findElements(By.xpath(properties.getProperty("dropdownlist")));
		System.out.println(list.size());
		for (WebElement webElement : list) {
			String name = webElement.getText();
			System.out.println(name);
			// Assert.assertEquals(name, false);
		}
	}
	public void AddCloseFilter() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='btnCta btnWithVgIcon glintButton ng-star-inserted']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='menuButton text small glintButton']")).click();
		Thread.sleep(3000);;
		driver.findElement(By.id("option3")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='input ng-pristine ng-valid ng-touched']")).sendKeys("gender");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//em[text()='Gender']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ng-pristine ng-valid ng-touched']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btnSm btnCta glintButton ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='deleteFilterButton btnIcon glintButton ng-star-inserted']")).click();
		Thread.sleep(1000);
		
	}
	public void Exportppt() throws InterruptedException {
		exportoptions();
		driver.findElement(By.xpath(properties.getProperty("Reportexportdropdown.xpath"))).click();
		iwait();
//		String ppt = driver.findElement(By.id(properties.getProperty("Exporttoppt.id"))).getText();
//		iwait();
//		Assert.assertEquals(ppt, "Export Report to PowerPoint");
//		String pdf = driver.findElement(By.id(properties.getProperty("Exporttopdf.id"))).getText();
//		Assert.assertEquals(pdf, "Export Report to PDF");
//		String Img = driver.findElement(By.id(properties.getProperty("Exportstoimage.id"))).getText();
//		Assert.assertEquals(Img, "Export Report to Images");
//		String csv = driver.findElement(By.id(properties.getProperty("Exporttocsv.id"))).getText();
//		Assert.assertEquals(csv, "Export Report to Spreadsheet");
		iwait();
		driver.findElement(By.id(properties.getProperty("Exporttoppt.id"))).click();
		iwait();
		driver.findElement(By.xpath(properties.getProperty("exportpptexport.xpath"))).click();

		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());
			}

		}
		driver.switchTo().window(parent);

	}

	public void Exportpdf() throws InterruptedException {
		exportoptions();
		driver.findElement(By.xpath(properties.getProperty("Reportexportdropdown.xpath"))).click();
		iwait();
		iwait();
		driver.findElement(By.id(properties.getProperty("Exporttopdf.id"))).click();
		iwait();
		driver.findElement(By.xpath(properties.getProperty("exportpdfgeneratepdf.xpath"))).click();
		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

			}

		}
		driver.switchTo().window(parent);
	}

	public void Exportimages() throws InterruptedException {
		exportoptions();
		driver.findElement(By.xpath(properties.getProperty("Reportexportdropdown.xpath"))).click();
		iwait();
		iwait();
		driver.findElement(By.id(properties.getProperty("Exporttoimage.id"))).click();
		iwait();

		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

			}

		}
		driver.switchTo().window(parent);
	}

	public void Exportcsv() throws InterruptedException {
		exportoptions();
		driver.findElement(By.xpath(properties.getProperty("Reportexportdropdown.xpath"))).click();
		iwait();
		iwait();
		driver.findElement(By.id(properties.getProperty("Exporttocsv.id"))).click();
		iwait();

		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

				// driver.close();
			}

		}
		driver.switchTo().window(parent);
	}

	public void verifydefaultSection() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='btnCta btnWithVgIcon glintButton ng-star-inserted']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='menuButton text small glintButton']")).click();
		Thread.sleep(3000);;
		driver.findElement(By.id("option3")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btnWithVgIcon subtleBtn footerButton glintButton ng-star-inserted']")).click();
		Thread.sleep(3000);
	}

	public void surveyoverview() throws InterruptedException {
		exportoptions();
		List<WebElement> Sectionnames = driver.findElements(By.xpath(properties.getProperty("surveyoveview.xpath")));
		int countofsection = Sectionnames.size();
		System.out.println(countofsection);
		for (WebElement ele : Sectionnames) {
			String name = ele.getText();
			System.out.println(name);
		}
	}

	public void Historysection() throws InterruptedException {
		exportoptions();
		List<WebElement> Sectionnames = driver.findElements(By.xpath(properties.getProperty("historysection.xpath")));
		int countofsection = Sectionnames.size();
		System.out.println(countofsection);
		for (WebElement ele : Sectionnames) {
			String name = ele.getText();
			Assert.assertEquals("History", name);
			System.out.println(name);
		}
	}

	public void scores() throws InterruptedException {
		exportoptions();
		List<WebElement> Sectionnames = driver.findElements(By.xpath(properties.getProperty("scores.xpath")));
		int countofsection = Sectionnames.size();
		System.out.println(countofsection);
		for (WebElement ele : Sectionnames) {
			String name = ele.getText();
			Assert.assertEquals("Scores", name);
			System.out.println(name);
		}
	}

	public void Question() throws InterruptedException {
		exportoptions();
		List<WebElement> Sectionnames = driver.findElements(By.xpath(properties.getProperty("Questionsection.xpath")));
		int countofsection = Sectionnames.size();
		System.out.println(countofsection);
		for (WebElement ele : Sectionnames) {
			String name = ele.getText();
			Assert.assertEquals("", name);
			System.out.println(name);
		}
	}

	public void Manager() throws InterruptedException {
		exportoptions();
		iwait();
		WebElement e = driver
				.findElement(By.xpath("//select[@id='glintDropdown_a6cb6f0a-2a24-4a30-a694-bbf254b67f2a']"));
		e.click();
		// System.out.println(e);
		iwait();
		iwait();
		// scrollintoElement(driver.findElement(By.xpath("//button[@class='disabled
		// commentCountBtn']")));
//		iwait();
//		iwait();
//		Select dropdown = new Select(
//				driver.findElement(By.xpath("//select[@id='glintDropdown_a6cb6f0a-2a24-4a30-a694-bbf254b67f2a']")));
//		dropdown.selectByVisibleText("attribute 19");

	}

	public void Historyhoverover() throws InterruptedException {
		exportoptions();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath(" //p[text()=\"History\"]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		WebElement e = driver.findElement(By.xpath("//*[@aria-label='Score 50 Company_updated 50 Pulsed on Nov 13']"));
		e.click();
		e.getText();

		WebElement tooltip1 = driver
				.findElement(By.xpath(" //div[text()=\" Score 47  Company_updated 47  Pulsed on Nov 13 \"]"));
		Actions act = new Actions(driver);
		act.moveToElement(tooltip1).build().perform();
		act.moveToElement(tooltip1);
		String TT1 = tooltip1.getText();
		System.out.println(TT1);

	}

	public void addsection2() {
		WebElement as = driver.findElement(By.xpath("//button[@data-id='addSectionButton']"));
		as.getText();
		System.out.println(as);
		// Assert.assertEquals(as, "Add section");
	}

	public void grouped() {
		iwait();
		WebElement g = driver.findElement(By.xpath("(//input[@class='ng-untouched ng-pristine ng-valid'])[1]"));
		iwait();
		g.isSelected();

	}

	public void ungrouped() {
		WebElement g = driver.findElement(By.xpath("(//input[@class='ng-untouched ng-pristine ng-valid'])[2]"));
		iwait();
		g.isSelected();
		iwait();
		Assert.assertEquals(false, false);

	}

	public void managergrouped() {
		iwait();
		WebElement g = driver.findElement(By.xpath("(//input[@class='ng-untouched ng-pristine ng-valid'])[1]"));
		iwait();
		g.isSelected();

	}

	public void managerungrouped() {
		WebElement g = driver.findElement(By.xpath("(//input[@class='ng-untouched ng-pristine ng-valid'])[2]"));
		iwait();
		g.isSelected();
		iwait();
		Assert.assertEquals(false, false);
	}

	public void SaveReport() {
		iwait();
		driver.findElement(By.xpath(properties.getProperty("Reportexportdropdown.xpath"))).click();
		iwait();
		driver.findElement(By.id("option4")).click();
		iwait();
		WebElement pagetext = driver.findElement(By.xpath("//label[text()=\"What do you want to name this report?\"]"));
		String s = pagetext.getText();
		Assert.assertEquals(s, "What do you want to name this report?");
		WebElement name = driver.findElement(By.id("saveDialogTitle"));
		name.clear();
		name.sendKeys("Executive Summary Report Automation Copy");
		iwait();
		driver.findElement(By.xpath("//button[@class=\"btnCta glintButton\"]")).click();
		WebElement savedcopy = driver.findElement(By.xpath(" //h1[@class='reportTitle']"));
		String name1 = savedcopy.getText();
		Assert.assertEquals(name1, "Executive Summary Report Automation Copy");
	}

	public void filterthereport() throws InterruptedException {
		driver.findElement(By.xpath(properties.getProperty("addfilter.xpath"))).click();
		Thread.sleep(3000);
		iwait();
		driver.findElement(By.xpath("//span[text()=\"Add Filters\"]")).click();
		iwait();
		driver.findElement(By.xpath("//div[text()=\"Gender\"]")).click();
		iwait();
		driver.findElement(By.xpath("//label[text()=\" FeMale \"]")).click();
		iwait();
		driver.findElement(By.xpath("//button[text()=\" Done \"]")).click();
		iwait();
		driver.findElement(By.xpath(properties.getProperty("closefilters.xpath"))).click();
		WebElement e = driver.findElement(By.xpath("//div[text()=\" Gender\"]"));
		String s = e.getText();
		Assert.assertEquals(s, "Gender:");
	}

	public void Repondentscount() {
		WebElement Rcount = driver.findElement(By.xpath("(//*[text()= \" 377 \"])[1]"));
		String c = Rcount.getText();
		Assert.assertEquals(c, "377");
	}

	public void Benchmark() {
		WebElement b = driver.findElement(By.xpath("//div[@class='benchmarkDisplayContainer ng-star-inserted']"));
		String s = b.getText();
		Assert.assertEquals(s, "Benchmark:");
		WebElement name = driver.findElement(By.xpath("//button[text()=\" Company_updated \"]"));
		String n = b.getText();
		System.out.println(n);
	
		
	}
	public void Removesection() {
		iwait();
		iwait();
		driver.findElement(By.xpath("(//div[@class='vg-icon ng-star-inserted'])[20]")).click();
		iwait();
		driver.findElement(By.xpath("//option[text()=\"Remove\"]")).click();
		iwait();
		WebElement e=driver.findElement(By.xpath(properties.getProperty("scores.xpath")));
		String s=e.getText();
		Assert.assertEquals(s, false);
//		Select dropdown = new Select(
//				driver.findElement(By.xpath("(//div[@class='menuButton overflow glintButton'])[1]")));
//		dropdown.selectByVisibleText("Remove");
	}
	
	public void rolluphierarchy() {
		driver.findElement(By.linkText("Reports")).click();
		iwait();
		driver.findElement(By.xpath("//div[@class=\"header managerReport\"]")).click();
		iwait();
		driver.findElement(By.linkText("Roll-up Hierarchy")).click();
		iwait();
		driver.close();
	}
	
	
	public void pageredirection() {
		driver.findElement(By.linkText("Reports")).click();

		iwait();
		
		driver.findElement(By.xpath("//div[@class=\"header managerReport\"]")).click();

		iwait();

        driver.findElement(By.xpath("(//li[@class='ng-star-inserted'])[9]")).click();
		
        iwait();
	}
	public void manager_redirection() {
		driver.findElement(By.linkText("Reports")).click();

		iwait();
		
		driver.findElement(By.xpath("//div[@class=\"header managerReport\"]")).click();

		iwait();

        driver.findElement(By.xpath("(//button[@class='managerLabel'])[3]")).click();
		
        iwait();
	}
	public void department_hierarchy_filter() {
		driver.findElement(By.linkText("Reports")).click();

		iwait();
		
		driver.findElement(By.xpath("//div[@class=\"header managerReport\"]")).click();

		iwait();
		
		driver.findElement(By.xpath("//button[@class='addFilterButtonPanel ng-star-inserted']")).click();

		iwait();
		
		driver.findElement(By.xpath("//button[@class='btnWithIcon addFiltersButton glintButton ng-star-inserted']")).click();

		iwait();
		
		driver.findElement(By.xpath("(//div[@class='menuButton glintButton'])[2]")).click();
		
		iwait();
		
        driver.findElement(By.xpath("//li[@class='focusPlaceholder ng-star-inserted']")).click();
		
        iwait();
		
        driver.findElement(By.xpath("(//li[@class='item ng-star-inserted'])[2]")).click();
		
        iwait();
		
        driver.findElement(By.xpath("(//div[@class='filterEditorRow ng-star-inserted'])[1]")).click();
		
        iwait();
		
		driver.close();
	}
	
	
	public void select_department_hierarchy() {
		driver.findElement(By.linkText("Reports")).click();

		 iwait();
		
		driver.findElement(By.xpath("//div[@class=\"header managerReport\"]")).click();

		 iwait();
		
		driver.findElement(By.xpath("//button[@class='addFilterButtonPanel ng-star-inserted']")).click();

		 iwait();
		
		driver.findElement(By.xpath("//button[@class='btnWithIcon addFiltersButton glintButton ng-star-inserted']")).click();

		 iwait();
		
		driver.findElement(By.xpath("(//div[@class='menuButton glintButton'])[2]")).click();
		
		 iwait();
		
        driver.findElement(By.xpath("//li[@class='focusPlaceholder ng-star-inserted']")).click();
		
		iwait();
		
        driver.findElement(By.xpath("(//li[@class='item ng-star-inserted'])[2]")).click();
		
        iwait();
		
		driver.close();
	}
	
	public void select_dropdown() {
		driver.findElement(By.linkText("Reports")).click();

		iwait();
		
		driver.findElement(By.xpath("//div[@class=\"header managerReport\"]")).click();

		iwait();
		
		driver.findElement(By.xpath("//button[@class='addFilterButtonPanel ng-star-inserted']")).click();

		iwait();
		
		driver.findElement(By.xpath("//button[@class='btnWithIcon addFiltersButton glintButton ng-star-inserted']")).click();

		iwait();
		
		driver.findElement(By.xpath("(//div[@class='menuButton glintButton'])[2]")).click();
		
		iwait();
		
        driver.findElement(By.xpath("//li[@class='focusPlaceholder ng-star-inserted']")).click();
		
		iwait();
		
		driver.close();
	}
	
	public void select_filter() {
		driver.findElement(By.linkText("Reports")).click();

		iwait();
		
		driver.findElement(By.xpath("//div[@class=\"header managerReport\"]")).click();

		iwait();
		
		driver.findElement(By.xpath("//button[@class='addFilterButtonPanel ng-star-inserted']")).click();

		iwait();
		
		driver.findElement(By.xpath("//button[@class='btnWithIcon addFiltersButton glintButton ng-star-inserted']")).click();

		iwait();
		
		driver.findElement(By.xpath("(//div[@class='menuButton glintButton'])[2]")).click();
		
		iwait();
		
		driver.close();

	}
	
	public void manager_count() {
		driver.findElement(By.linkText("Reports")).click();

		iwait();
		
		driver.findElement(By.xpath("//div[@class=\"header managerReport\"]")).click();

		iwait();
		
		driver.findElement(By.xpath("//button[@class='addFilterButtonPanel ng-star-inserted']")).click();

		iwait();
		
		driver.close();

	}
	
	
	public void reportsettings_groupbydropdown() {
		driver.findElement(By.linkText("Reports")).click();

		iwait();
		
		driver.findElement(By.xpath("//div[@class=\"header managerReport\"]")).click();

		iwait();

		driver.findElement(By.xpath("//button[@class='btnWithVgIcon btnSlim glintButton ng-star-inserted']\r\n")).click();
		
		iwait();
		
		driver.findElement(By.xpath("(//div[@class='menuButton glintButton'])[2]")).click();
		
		iwait();
		
		driver.close();

	}
	
	public void settings_groupbydropdown() {
		driver.findElement(By.linkText("Reports")).click();

		iwait();
		
		driver.findElement(By.xpath("//div[@class=\"header managerReport\"]")).click();

		iwait();

		driver.findElement(By.xpath("//button[@class='btnWithVgIcon btnSlim glintButton ng-star-inserted']\r\n")).click();
		
		iwait();
		
		driver.findElement(By.xpath("(//div[@class='menuButton glintButton'])[3]")).click();
		
		iwait();
		
		driver.close();

	}
	
	public void settings_slider() {
		driver.findElement(By.linkText("Reports")).click();

		iwait();
		
		driver.findElement(By.xpath("//div[@class=\"header managerReport\"]")).click();

		iwait();
		driver.findElement(By.xpath("//button[@class='btnWithVgIcon btnSlim glintButton ng-star-inserted']\r\n")).click();
		
		iwait();
		
		driver.close();

	}
	
	
	
	public void accept_Feedback() {
		driver.findElement(By.linkText("Reports")).click();

		iwait();
		
		driver.findElement(By.xpath("//div[@class=\"header managerReport\"]")).click();

		iwait();

		driver.findElement(By.xpath("(//button[@class='menuButton text small glintButton'])[4]")).click();
		
		iwait();
		
		driver.close();

	}
	
	
	
	public void response_RateReport() throws InterruptedException {
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Engagement test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();

	}
	
	
	
	public void select_resreporttype() throws InterruptedException {
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Engagement test']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.//span[text()='New Report']]")).click();
		//driver.findElement(By.xpath("//button[@class='btnCta btnWithVgIcon glintButton ng-star-inserted']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='menuButton text small glintButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("option4")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"btnWithVgIcon subtleBtn footerButton glintButton ng-star-inserted\"]")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();

	}
	
	
	public void addfilter_resreporttype() throws InterruptedException {
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btnCta btnWithVgIcon glintButton ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='menuButton text small glintButton']")).click();
	 	Thread.sleep(2000);
		driver.findElement(By.id("option4")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btnWithIcon addFiltersButton glintButton ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Question Responses")).click();
		WebElement uploadElement = driver.findElement(By.cssSelector(".list>li"));
		uploadElement.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(), ' Benefits ')]//input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(), 'Accountability')]//input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"btnSm btnCta glintButton ng-star-inserted\"]")).click();

	}
	public void backbutton_resreporttype() throws InterruptedException {
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btnCta btnWithVgIcon glintButton ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='menuButton text small glintButton']")).click();
	 	Thread.sleep(2000);
		driver.findElement(By.id("option4")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btnWithIcon addFiltersButton glintButton ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Question Responses")).click();
		WebElement uploadElement = driver.findElement(By.cssSelector(".list>li"));
		uploadElement.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(), ' Benefits ')]//input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(), 'Accountability')]//input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"btnSm btnCta glintButton ng-star-inserted\"]")).click();

	}
	
	
	
	public void reportsettings_resreporttype() throws InterruptedException {
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='btnWithVgIcon btnSlim glintButton ng-star-inserted']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"configureSection\"]/glint-slidey/div/div[3]/div/div/section/div/glint-report-section-form/form/div/div/div[2]/label/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btnCta glintButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("dropdownTrigger_glintDropdown_d0326e97-aa9b-4d82-b155-d8b8b031821f")).click();
		
		driver.findElement(By.xpath("//*[@class='btnCta btnWithVgIcon glintButton ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='inlineBtnLink glintButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btnIcon slideyClose glintButton']")).click();

	}
	
	public void exportsharepdf_resreporttype() throws InterruptedException {
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Engagement test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@aria-label=\"Report Export Options Menu\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id=\"option1\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' Generate PDF ']")).click();

	}
	
	public void exportsavereport_resreporttype() throws InterruptedException {
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Engagement test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@aria-label=\"Report Export Options Menu\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id=\"option1\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' Generate PDF ']")).click();

	}
	public void exportsaveppt_resreporttype() throws InterruptedException {
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Engagement test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@aria-label=\"Report Export Options Menu\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id=\"option0\"]")).click();
		Thread.sleep(1000);

	}
	public void view_resreporttype() throws InterruptedException {
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Engagement test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()=' View Report '])[1]")).click();
	}
	public void moreoptions_resreporttype() throws InterruptedException {
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Engagement test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"menuButton glintButton btnSlim\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='option0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Comments']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class=\"plus glintIcon\"])[2]")).click();
	}
	
	public void sorting_resreporttype() throws InterruptedException {
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Engagement test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class=\"menuButton text glintButton\"])[1]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[text()='Alphabetical']")).click();
		driver.findElement(By.xpath("//li[@id=\"option3\"]")).click();
	}
}
