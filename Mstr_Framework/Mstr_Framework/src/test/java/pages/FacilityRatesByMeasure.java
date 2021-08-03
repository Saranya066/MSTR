package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class FacilityRatesByMeasure extends WebDriverServiceImpl {

	public FacilityRatesByMeasure clickFacilityRatesByMeasure() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[141]/div[1]")),
				"FacilityRatesByMeasure");

		Thread.sleep(10000);
		return this;
	}

// Quarter button selection
	public FacilityRatesByMeasure clickQtrcaretSymbol() throws InterruptedException {

		windowHandling();
		Thread.sleep(1000);

		iframeHandling();
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'2021 Q3')]")), "Quarter");
		defaultContent();
		return this;
	}
	//Facility Group...Hospital button selection
	public FacilityRatesByMeasure clickFacilityGrpHospital() throws InterruptedException {


		iframeHandling();
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//span[contains(text(),'Reports Client 2')]")), "FacilityGrpHospital");
		defaultContent();
		return this;
	}
	

	

	// Run Document
	public FacilityRatesByMeasure clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr158']")), "RunDocument");
		defaultContent();
		Thread.sleep(60000);
		return this;
	}

	//  Cover Rates By Measure Report
	public FacilityRatesByMeasure clickCoverRatesByMeasure() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "CoverRatesByMeasure");
		defaultContent();
		Thread.sleep(10000);
		return this;
	}
	
	//Assert verification
    public FacilityRatesByMeasure assertFacilityRatesByMeasure() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Facility Rates by Measure");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public FacilityRatesByMeasure backToReportsHome() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(1000);
        return this;
    }


	

}
