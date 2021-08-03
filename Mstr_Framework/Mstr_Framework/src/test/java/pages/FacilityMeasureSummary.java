package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class FacilityMeasureSummary extends WebDriverServiceImpl {

	public FacilityMeasureSummary clickFacilityMeasureSummary() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Facility Measure Summary')]")),
				"FacilityMeasureSummary");

		Thread.sleep(10000);
		return this;
	}

// Quarter button selection
	public FacilityMeasureSummary clickQtrcaretSymbol() throws InterruptedException {

		windowHandling();
		Thread.sleep(1000);

		iframeHandling();
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'2021 Q3')]")), "Quarter");
		defaultContent();
		return this;
	}

	

	// Radio button- Patient Class
	public FacilityMeasureSummary clickPatientClass() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Inpatient')]")), "PatientClass");
		defaultContent();
		return this;
	}

	// Run Document
	public FacilityMeasureSummary clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr128']")), "RunDocument");
		defaultContent();
		Thread.sleep(100000);
		return this;
	}

	//  report
	public FacilityMeasureSummary clickReport() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "Report");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}
	
	//Assert verification
    public FacilityMeasureSummary assertFacilityMeasureSummary() throws InterruptedException {
        Thread.sleep(1000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Report");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public FacilityMeasureSummary backToReportsHome() throws InterruptedException {
        Thread.sleep(1000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(1000);
        return this;
    }

	

}
