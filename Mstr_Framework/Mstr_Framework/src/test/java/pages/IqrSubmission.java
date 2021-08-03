package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class IqrSubmission extends WebDriverServiceImpl {

	public IqrSubmission clickIqrSubmission() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'CMS IQR Submission')]")), "IqrSubmission");

		Thread.sleep(10000);
		return this;
	}

	// Cms Certification Number selection
	public IqrSubmission clickCmsCertificationNumber() throws InterruptedException {
		windowHandling();
		iframeHandling();
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'AUTOM3:Automation Facility 3')]")),
				"CmsCertificationNumber");
		defaultContent();

		return this;

	}

	// Quarter selection
	public IqrSubmission clickQuarter() throws InterruptedException {
		iframeHandling();
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'2021 Q3')]")), "Quarter");
		defaultContent();

		return this;

	}

	// Run Document
	public IqrSubmission clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr103']")), "RunDocument");
		defaultContent();
		Thread.sleep(20000);
		return this;
	}

	// Summary Report
	public IqrSubmission clickSummary() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "Summary");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// Patient detail Report
	public IqrSubmission clickPatientDetail() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout2")), "PatientDetail");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}
	
	//Assert verification
    public IqrSubmission assertIqrSubmission() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Summary");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public IqrSubmission backToReportsHome() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(1000);
        return this;
    }

}
