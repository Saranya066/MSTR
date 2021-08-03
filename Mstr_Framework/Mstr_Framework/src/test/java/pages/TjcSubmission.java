package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class TjcSubmission extends WebDriverServiceImpl {

	public TjcSubmission clickTjcSubmission() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'TJC Submission')]")), "TjcSubmission");

		Thread.sleep(10000);
		return this;
	}

	// Cms Certification Number selection
	public TjcSubmission clickCmsCertificationNumber() throws InterruptedException {
		windowHandling();
		iframeHandling();
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'PRE00: Premier Memorial 2')]")),
				"CmsCertificationNumber");
		defaultContent();

		return this;

	}

	// Quarter selection
	public TjcSubmission clickQuarter() throws InterruptedException {
		iframeHandling();
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'2021')]")), "Quarter");
		defaultContent();

		return this;

	}

	// Run Document
	public TjcSubmission clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr169']")), "RunDocument");
		defaultContent();
		Thread.sleep(60000);
		return this;
	}

	// Detail Report
	public TjcSubmission clickDetail() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "Detail");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}
	//Assert verification
    public TjcSubmission assertTjcSubmission() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Detail");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public TjcSubmission backToReportsHome() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(3000);
        return this;
    }
}
