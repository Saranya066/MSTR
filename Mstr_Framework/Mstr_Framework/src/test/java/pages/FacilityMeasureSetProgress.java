package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class FacilityMeasureSetProgress extends WebDriverServiceImpl {
	public FacilityMeasureSetProgress clickFacilityMeasureStatus() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Facility Measure-Set Progress')]")),
				"FacilityMeasureSetProgress");
		Thread.sleep(10000);
		return this;

	}

	// Quarter button selection
	public FacilityMeasureSetProgress clickQtrcaretSymbol() throws InterruptedException {
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
	public FacilityMeasureSetProgress clickRunDocument() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr166']")), "RunDocument");
		defaultContent();
		Thread.sleep(60000);
		return this;
	}

	// Coverpage report
	public FacilityMeasureSetProgress clickCoverPage() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout0")), "CoverPage");
		defaultContent();
		Thread.sleep(2000);
		return this;
	}
	
	//Assert verification
    public FacilityMeasureSetProgress assertFacilityMeasureSetProgress() throws InterruptedException {
        Thread.sleep(1000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Report");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public FacilityMeasureSetProgress backToReportsHome() throws InterruptedException {
        Thread.sleep(1000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(1000);
        return this;
    }

}
