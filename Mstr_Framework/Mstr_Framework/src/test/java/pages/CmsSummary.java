package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class CmsSummary extends WebDriverServiceImpl {
	public CmsSummary clickCmsSummary() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'CMS Summary')]")), "CmsSummary");
		Thread.sleep(10000);
		return this;
	}

	// Quarter button selection
	public CmsSummary clickQtrcaretSymbol() throws InterruptedException {
		windowHandling();
		Thread.sleep(3000);
		System.out.println("before switch");

		iframeHandling();
		System.out.println("After switch");
		click(getDriver().findElement(By.xpath(
				"//tbody/tr[2]/td[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/img[1]")),
				"QtrcaretSymbol");

		// double click the Quarter option:Q3 2021

		doubleClick(getDriver().findElement(By.xpath("//span[contains(text(),'2021 Q2')]")), "Quarter");
		defaultContent();

		return this;
	}

	// Hospital selection
	public CmsSummary clickCmsCertificationNumber() throws InterruptedException {
		Thread.sleep(3000);

		iframeHandling();
		// Double click on element
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'AUTOM2:Automation Facility 2')]")),
				"CmsCertificationNumber");
		defaultContent();

		return this;
	}

	// Radio button- Patient Class
	public CmsSummary clickPatientClass() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Outpatient')]")), "PatientClass");
		defaultContent();
		return this;

	}

	// Run Document
	public CmsSummary clickRunDocument() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr206']")), "RunDocument");
		defaultContent();
		Thread.sleep(20000);
		return this;

	}

	// Cannot Calculate report
	public CmsSummary clickCannotCalculate() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "CannotCalculate");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// Report
	public CmsSummary clickReport() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "Report");
		defaultContent();
		Thread.sleep(2000);
		return this;
	}
	
	//Assert verification
    public CmsSummary assertCmsSummary() throws InterruptedException {
        Thread.sleep(1000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Report");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public CmsSummary backToReportsHome() throws InterruptedException {
        Thread.sleep(1000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(1000);
        return this;
    }
}
