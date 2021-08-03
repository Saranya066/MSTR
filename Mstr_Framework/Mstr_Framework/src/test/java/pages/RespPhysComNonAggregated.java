package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class RespPhysComNonAggregated extends WebDriverServiceImpl {

	public RespPhysComNonAggregated clickRespPhysComNonAggregated() throws InterruptedException {

		iframeHandling();
		click(getDriver()
				.findElement(By.xpath("//div[contains(text(),'Responsible Physician Comparative - Non-Aggregated')]")),
				"RespPhysComNonAggregated");

		Thread.sleep(10000);
		return this;
	}

// Quarter button selection
	public RespPhysComNonAggregated clickQtrcaretSymbol() throws InterruptedException {

		windowHandling();
		Thread.sleep(1000);

		iframeHandling();
		click(getDriver().findElement(By.xpath(
				"//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/span[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/img[1]")),
				"QtrcaretSymbol");
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//span[contains(text(),'2021 Q3')]")), "Quarter");
		defaultContent();
		return this;
	}

	// Hospital selection
	public RespPhysComNonAggregated clickHospital() throws InterruptedException {
		Thread.sleep(5000);

		iframeHandling();
		// Double click on element
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'RPT002:Reports Facility 2')]")),
				"Hospital");
		defaultContent();

		return this;
	}

	// Physician
	public RespPhysComNonAggregated clickPhysicianQtr() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath(
				"//tbody/tr[2]/td[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/img[1]")),
				"HospitalPhysicianQtr");
		click(getDriver().findElement(By.xpath(
				"//tbody/tr[2]/td[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/img[1]")),
				"PhysicianQtr");
		// double click the Hospital
		doubleClick(getDriver().findElement(By.xpath("//span[contains(text(),'RPT002:Reports Facility 2')]")),
				"HospialPhysician");
		defaultContent();
		return this;
	}

	// Radio button- Patient Class
	public RespPhysComNonAggregated clickPatientClass() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Inpatient')]")), "PatientClass");
		defaultContent();
		return this;
	}

	// Run Document
	public RespPhysComNonAggregated clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr244']")), "RunDocument");
		defaultContent();
		Thread.sleep(20000);
		return this;
	}

	// Comparative report
	public RespPhysComNonAggregated clickComparative() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "Comparative");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// All Trended Graph report
	public RespPhysComNonAggregated clickAllTrendedGraph() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout2")), "AllTrendedGraph");
		defaultContent();
		Thread.sleep(3000);
		return this;
	}

	// PhysTrendedData report
	public RespPhysComNonAggregated clickPhysTrendedData() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//span[@id='tbLayout3']")), "PhysTrendedData");
		defaultContent();
		Thread.sleep(20000);

		return this;
	}
	//Assert verification
    public RespPhysComNonAggregated assertRespPhysComAggregated() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.id("tbLayout1")), "Comparative");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public RespPhysComNonAggregated backToReportsHome() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(3000);
        return this;
    }
}
