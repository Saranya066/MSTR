package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class JointCommHbips extends WebDriverServiceImpl {
	public JointCommHbips clickJointCommHbips() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'The Joint Commission HBIPS')]")),
				"FacilityMeasureStatus");
		Thread.sleep(10000);
		return this;
	}

	// Quarter button selection
	public JointCommHbips clickQuarter() throws InterruptedException {
		windowHandling();
		Thread.sleep(3000);

		iframeHandling();
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'2021 Q3')]")), "Quarter");
		defaultContent();

		return this;
	}

	// HCO
	public JointCommHbips clickHco() throws InterruptedException {

		iframeHandling();
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'AUTOH4:Automation facility 3')]")), "Hco");
		defaultContent();

		return this;
	}

	// Run Document
	public JointCommHbips clickRunDocument() throws InterruptedException {

		iframeHandling();
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//input[@id='id_mstr103']")), "Hco");
		defaultContent();
		Thread.sleep(60000);
		return this;
	}

	// Population report
	public JointCommHbips clickPopulation() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "Population");
		defaultContent();
		Thread.sleep(10000);
		return this;
	}

	// MeasurecResults report
	public JointCommHbips clickMeasureResults() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout2")), "MeasureResults");
		defaultContent();
		Thread.sleep(10000);
		return this;
	}

	// Patient detail report
	public JointCommHbips clickPatientdetail() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout3")), "Patientdetail");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}
	
	//Assert verification
    public JointCommHbips assertJointCommHbips() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Population");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public JointCommHbips backToReportsHome() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(3000);
        return this;
    }

}
