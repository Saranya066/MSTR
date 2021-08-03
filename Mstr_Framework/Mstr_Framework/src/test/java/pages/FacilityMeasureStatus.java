package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class FacilityMeasureStatus extends WebDriverServiceImpl {
	public FacilityMeasureStatus clickFacilityMeasureStatus() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Facility Measure Status')]")),
				"FacilityMeasureStatus");
		Thread.sleep(10000);
		return this;

	}

	// Quarter button selection
	public FacilityMeasureStatus clickQtrcaretSymbol() throws InterruptedException {
		windowHandling();
		Thread.sleep(3000);

		iframeHandling();

		click(getDriver().findElement(By.xpath(
				"//tbody/tr[2]/td[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/img[1]")),
				"QtrcaretSymbol");

		// double click the Quarter option:Q3 2021

		doubleClick(getDriver().findElement(By.xpath("//span[contains(text(),'2021 Q3')]")), "Quarter");
		defaultContent();

		return this;
	}

	// Radio button- Patient Class
	public FacilityMeasureStatus clickPatientClass() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Outpatient')]")), "PatientClass");
		defaultContent();
		return this;
	}

	// Run Document
	public FacilityMeasureStatus clickRunDocument() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr182']")), "RunDocument");
		defaultContent();
		Thread.sleep(60000);
		return this;
	}

	// Coverpage report
	public FacilityMeasureStatus clickCoverPage() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout0")), "CoverPage");
		defaultContent();
		Thread.sleep(2000);
		return this;
	}
	
	//Assert verification
    public FacilityMeasureStatus assertFacilityMeasureStatus() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Report");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public FacilityMeasureStatus backToReportsHome() throws InterruptedException {
        Thread.sleep(1000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(1000);
        return this;
    }


}
