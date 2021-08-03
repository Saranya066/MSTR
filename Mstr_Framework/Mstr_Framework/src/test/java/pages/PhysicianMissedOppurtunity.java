package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class PhysicianMissedOppurtunity extends WebDriverServiceImpl {

	public PhysicianMissedOppurtunity clickPhysicianMissedOppurtunity() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Attending Physician Missed Opportunity')]")),
				"PhysicianMissedOppurtunity");

		Thread.sleep(10000);
		return this;
	}

// Quarter button selection
	public PhysicianMissedOppurtunity clickQtrcaretSymbol() throws InterruptedException {

		windowHandling();
		Thread.sleep(1000);

		iframeHandling();
		click(getDriver().findElement(By.xpath(
				"//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/span[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/img[1]")),
				"QtrcaretSymbol");
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//span[contains(text(),'2021 Q3')]")), "Quarter");
		defaultContent();
		return this;
	}

	// Hospital selection
	public PhysicianMissedOppurtunity clickHospital() throws InterruptedException {
		Thread.sleep(5000);

		iframeHandling();
		// Double click on element
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'RPT002:Reports Facility 2')]")),
				"Hospital");
		defaultContent();

		return this;
	}

	// Physician
	public PhysicianMissedOppurtunity clickPhysicianQtr() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath(
				"//tbody/tr[2]/td[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/img[1]")),
				"HospitalPhysicianQtr");
		click(getDriver().findElement(By.xpath(
				"//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[4]/span[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/img[1]")),
				"PhysicianQtr");
		// double click the Hospital
		doubleClick(getDriver().findElement(By.xpath("//span[contains(text(),'RPT002:Reports Facility 2')]")),
				"HospialPhysician");
		defaultContent();
		return this;
	}

	// Radio button- Patient Class
	public PhysicianMissedOppurtunity clickPatientClass() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Inpatient')]")), "PatientClass");
		defaultContent();
		return this;
	}

	// Run Document
	public PhysicianMissedOppurtunity clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr244']")), "RunDocument");
		defaultContent();
		Thread.sleep(60000);
		return this;
	}

	// report
	public PhysicianMissedOppurtunity clickReport() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "Report");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}
	//Assert verification
    public PhysicianMissedOppurtunity assertPhysicianMissedOppurtunity() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Report");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public PhysicianMissedOppurtunity backToReportsHome() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(3000);
        return this;
    }


}
