package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class SepsisBundlePerformance extends WebDriverServiceImpl {

	public SepsisBundlePerformance clickSepsisBundlePerformance() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Sepsis Bundle')]")), "SepsisBundlePerformance");

		Thread.sleep(10000);
		return this;
	}

// Quarter button selection
	public SepsisBundlePerformance clickQtrcaretSymbol() throws InterruptedException {

		windowHandling();
		Thread.sleep(1000);

		iframeHandling();
		click(getDriver().findElement(By.xpath(
				"//tbody/tr[2]/td[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/img[1]")),
				"QtrcaretSymbol");
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//span[contains(text(),'2021 Q3')]")), "Quarter");
		defaultContent();
		return this;
	}

	// Hospital selection
	public SepsisBundlePerformance clickFacilityHospital() throws InterruptedException {
		Thread.sleep(5000);

		iframeHandling();
		// Double click on element
		doubleClick(getDriver().findElement(By.xpath("//span[contains(text(),'Reports Client 2')]")),
				"FacilityHospital");
		defaultContent();

		return this;
	}

	// Run Document
	public SepsisBundlePerformance clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr151']")), "RunDocument");
		defaultContent();
		Thread.sleep(20000);
		return this;
	}

	// Sepsis Bundle Performance report
	public SepsisBundlePerformance clickSepBundlePerform() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "AllComparative");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// Sepsis 3Hr/6Hr Bundle report
	public SepsisBundlePerformance clickSepsisbundle() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout2")), "Sepsisbundle");
		defaultContent();
		Thread.sleep(3000);
		return this;
	}

	// PhysTrendedData report
	public SepsisBundlePerformance clickPhysTrendedData() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//span[@id='tbLayout3']")), "PhysTrendedData");
		defaultContent();
		Thread.sleep(60000);

		return this;
	}
	
	//Assert verification
    public SepsisBundlePerformance assertSepsisBundlePerformance() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Sepsis Bundle Performance");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public SepsisBundlePerformance backToReportsHome() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(3000);
        return this;
    }


}
