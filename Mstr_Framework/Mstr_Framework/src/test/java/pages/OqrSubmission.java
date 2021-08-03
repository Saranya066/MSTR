package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class OqrSubmission extends WebDriverServiceImpl {

	public OqrSubmission clickOqrSubmission() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'CMS OQR Submission')]")), "OqrSubmission");

		Thread.sleep(10000);
		return this;
	}

	// Cms Certification Number selection
	public OqrSubmission clickCmsCertificationNumber() throws InterruptedException {
		windowHandling();
		iframeHandling();
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'AUTOM3:Automation Facility 3')]")),
				"CmsCertificationNumber");
		defaultContent();

		return this;

	}

	// Quarter selection
	public OqrSubmission clickQuarter() throws InterruptedException {
		iframeHandling();
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'2021')]")), "Quarter");
		defaultContent();

		return this;

	}

	// Run Document
	public OqrSubmission clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr103']")), "RunDocument");
		defaultContent();
		Thread.sleep(20000);
		return this;
	}

	// Submission Report
	public OqrSubmission clickSubmission() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "Submission");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// Supplemental Information Report
	public OqrSubmission clickSupplementalInfo() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout2")), "SupplementalInfo");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// Op-29 Patient Detail Report
	public OqrSubmission clickOp29() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout3")), "Op29");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// Op-30 Patient Detail detail Report
	public OqrSubmission clickOp30() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout4")), "Op30");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// Op- 33 Patient Detail Report
	public OqrSubmission clickOp33() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout5")), "Op33");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}
	
	//Assert verification
    public OqrSubmission assertOqrSubmission() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Submission Report");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public OqrSubmission backToReportsHome() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(3000);
        return this;
    }

}
