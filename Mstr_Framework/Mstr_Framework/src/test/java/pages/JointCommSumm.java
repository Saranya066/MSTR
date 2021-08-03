package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class JointCommSumm extends WebDriverServiceImpl {

	public JointCommSumm clickJointCommSumm() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'The Joint Commission Summary')]")),
				"JointCommSumm");

		Thread.sleep(10000);
		return this;
	}

// Quarter button selection
	public JointCommSumm clickQtrcaretSymbol() throws InterruptedException {

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

	// HCO selection
	public JointCommSumm clickHco() throws InterruptedException {
		iframeHandling();
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath(" //div[contains(text(),'AUTOH3: Automation Facility 3')]")),
				"Hco");
		defaultContent();

		return this;

	}

	// Radio button- Patient Class
	public JointCommSumm clickPatientClass() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Inpatient')]")), "PatientClass");
		defaultContent();
		return this;
	}

	// Run Document
	public JointCommSumm clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr223']")), "RunDocument");
		defaultContent();
		Thread.sleep(20000);
		return this;
	}

	// Report
	public JointCommSumm clickReport() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "Report");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}
	
	//Assert verification
    public JointCommSumm assertJointCommSumm() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Report");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public JointCommSumm backToReportsHome() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(3000);
        return this;
    }

}
