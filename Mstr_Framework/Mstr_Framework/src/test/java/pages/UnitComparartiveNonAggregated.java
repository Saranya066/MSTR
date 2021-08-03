package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class UnitComparartiveNonAggregated extends WebDriverServiceImpl {

	public UnitComparartiveNonAggregated clickUnitComparartiveNonAggregated() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Unit Comparative - Non-Aggregated')]")),
				"UnitComparartiveNonAggregated");

		Thread.sleep(10000);
		return this;
	}

// Quarter button selection
	public UnitComparartiveNonAggregated clickQtrcaretSymbol() throws InterruptedException {

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
	public UnitComparartiveNonAggregated clickHospital() throws InterruptedException {
		Thread.sleep(5000);

		iframeHandling();
		// Double click on element
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'RPT002:Reports Facility 2')]")),
				"Hospital");
		defaultContent();

		return this;
	}

	// Unit
	public UnitComparartiveNonAggregated clickPhysicianQtr() throws InterruptedException {

		iframeHandling();
		doubleClick(getDriver().findElement(By.xpath(
				"//span[contains(text(),'RPT002:Reports Facility 2')]")),
				"HospitalPhysicianQtr");
		
		defaultContent();
		return this;
	}

	// Radio button- Patient Class
	public UnitComparartiveNonAggregated clickPatientClass() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Inpatient')]")), "PatientClass");
		defaultContent();
		return this;
	}

	// Run Document
	public UnitComparartiveNonAggregated clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr245']")), "RunDocument");
		defaultContent();
		Thread.sleep(60000);
		return this;
	}

	// Unit Comparative report
	public UnitComparartiveNonAggregated clickAllComparative() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "UnitComparative");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// All Trended Graph report
	public UnitComparartiveNonAggregated clickAllTrendedGraph() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout2")), "AllTrendedGraph");
		defaultContent();
		Thread.sleep(3000);
		return this;
	}

	// All Trended Data report
	public UnitComparartiveNonAggregated clickAllTrendedData() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout3")), "AllTrendedData");
		defaultContent();
		Thread.sleep(7000);

		return this;
	}
	
	//Assert verification
    public UnitComparartiveNonAggregated assertUnitComparartiveNonAggregated() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Unit Comparative");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public UnitComparartiveNonAggregated backToReportsHome() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(3000);
        return this;
    }




}
