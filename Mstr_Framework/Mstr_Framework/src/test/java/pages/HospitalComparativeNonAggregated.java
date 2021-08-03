package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class HospitalComparativeNonAggregated extends WebDriverServiceImpl {

	public HospitalComparativeNonAggregated clickHospitalComparativeNonAggregated() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Hospital Comparative - Non-Aggregated')]")),
				"HospitalComparativeNonAggregated");

		Thread.sleep(10000);
		return this;
	}

// Quarter button selection
	public HospitalComparativeNonAggregated clickQtrcaretSymbol() throws InterruptedException {

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
	public HospitalComparativeNonAggregated clickHospital() throws InterruptedException {
		Thread.sleep(3000);

		iframeHandling();
		// Double click on element
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'RPT002:Reports Facility 2')]")),
				"Hospital");
		defaultContent();

		return this;
	}

	// Radio button- Patient Class
	public HospitalComparativeNonAggregated clickPatientClass() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Inpatient')]")), "PatientClass");
		defaultContent();
		return this;
	}

	// Run Document
	public HospitalComparativeNonAggregated clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr209']")), "RunDocument");
		defaultContent();
		Thread.sleep(60000);
		return this;
	}

	// All Comparative report
	public HospitalComparativeNonAggregated clickAllComparative() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "AllComparative");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// All Trended Graph report
	public HospitalComparativeNonAggregated clickAllTrendedGraph() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout2")), "AllTrendedGraph");
		defaultContent();
		Thread.sleep(3000);
		return this;
	}

	// All Trended Data report
	public HospitalComparativeNonAggregated clickAllTrendedData() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout3")), "AllTrendedData");
		defaultContent();
		Thread.sleep(7000);

		return this;
	}
	
	//Assert verification
    public HospitalComparativeNonAggregated assertHospitalComparativeNonAggregated() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Comparative");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public HospitalComparativeNonAggregated backToReportsHome() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(1000);
        return this;
    }


}
