package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class FacilityRates extends WebDriverServiceImpl {
	public FacilityRates clickFacilityMeasureStatus() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Facility Rates')]")), "FacilityRates");
		Thread.sleep(10000);
		return this;

	}

	// Quarter button selection
	public FacilityRates clickQtrcaretSymbol() throws InterruptedException {
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

	// Run Document
	public FacilityRates clickRunDocument() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr162']")), "RunDocument");
		defaultContent();
		Thread.sleep(60000);
		return this;

	}

	// Rate Based measure report
	public FacilityRates clickRateBasedMeasure() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "RateBasedMeasure");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// Missing measure report
	public FacilityRates clickMissingMeasure() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout2")), "MissingMeasure");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// Continuous measure report
	public FacilityRates clickContinuousMeasures() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout3")), "ContinuousMeasures");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// Hbips Event measure report
	public FacilityRates clickHbipseventMeasures() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout4")), "HbipseventMeasures");
		defaultContent();
		Thread.sleep(2000);
		return this;
	}
	
	//Assert verification
    public FacilityRates assertFacilityRates() throws InterruptedException {
        Thread.sleep(1000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Rate Based Measures");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public FacilityRates backToReportsHome() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(2000);
        return this;
    }
}
