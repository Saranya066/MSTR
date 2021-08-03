package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class JointCommPatLevel extends WebDriverServiceImpl {

	public JointCommPatLevel clickJointCommPatLevel() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'The Joint Commission Patient Level')]")),
				"JointCommPatLevel");

		Thread.sleep(10000);
		return this;
	}

// Quarter button selection
	public JointCommPatLevel clickQtrcaretSymbol() throws InterruptedException {

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

	// HCO selection
	public JointCommPatLevel clickHco() throws InterruptedException {
		iframeHandling();

		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'77300:Premier Hospital')]")), "Hco");
		defaultContent();

		return this;
	}

	// Radio button- Patient Class
	public JointCommPatLevel clickPatientClass() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Inpatient')]")), "PatientClass");
		defaultContent();
		return this;
	}

	// Run Document
	public JointCommPatLevel clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr205']")), "RunDocument");
		defaultContent();
		Thread.sleep(20000);
		return this;
	}

	// Cannot Calculate report
	public JointCommPatLevel clickCannotCalculate() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "CannotCalculate");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// Missing Measure Data report
	public JointCommPatLevel clickMissingMeasureData() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout2")), "MissingMeasureData");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// Patient report
	public JointCommPatLevel clickPatient() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout3")), "Patient");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}
	
	//Assert verification
    public JointCommPatLevel assertJointCommPatLevel() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Cannot Calculate");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public JointCommPatLevel backToReportsHome() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(3000);
        return this;
    }

}
