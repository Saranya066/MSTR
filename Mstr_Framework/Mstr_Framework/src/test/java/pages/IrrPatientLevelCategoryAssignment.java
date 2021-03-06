package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class IrrPatientLevelCategoryAssignment extends WebDriverServiceImpl {

	public IrrPatientLevelCategoryAssignment clickIrrPatientLevelCategoryAssignment() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(
				By.xpath("//div[contains(text(),'IRR - Patient Level Category Assignment Agreement Rate')]")),
				"IrrPatientLevelCategoryAssignment");

		Thread.sleep(10000);
		return this;
	}

	// Hospital
	public IrrPatientLevelCategoryAssignment clickHospital() throws InterruptedException {
		windowHandling();
		iframeHandling();
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'RPT002:Reports Facility 2')]")),
				"Hospital");
		defaultContent();

		return this;

	}

	// Quarter selection
	public IrrPatientLevelCategoryAssignment clickQuarter() throws InterruptedException {
		
		

		iframeHandling();
		click(getDriver().findElement(By.xpath(
				"//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/span[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/img[1]")),
				"QtrcaretSymbol");
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//span[contains(text(),'2021 Q3')]")), "Quarter");
		defaultContent();
		return this;

	}

	// Run Document
	public IrrPatientLevelCategoryAssignment clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr202']")), "RunDocument");
		defaultContent();
		Thread.sleep(20000);
		return this;
	}

	// Report
	public IrrPatientLevelCategoryAssignment clickReport() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "Report");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}
	
	//Assert verification
    public IrrPatientLevelCategoryAssignment assertIrrPatientLevelCategoryAssignment() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Report");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public IrrPatientLevelCategoryAssignment backToReportsHome() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(1000);
        return this;
    }


}
