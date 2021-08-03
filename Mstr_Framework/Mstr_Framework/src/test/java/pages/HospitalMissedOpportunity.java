package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class HospitalMissedOpportunity extends WebDriverServiceImpl {

	public HospitalMissedOpportunity clickHospitalMissedOpportunity() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Hospital Missed Opportunity')]")),
				"HospitalMissedOpportunity");

		Thread.sleep(10000);
		return this;
	}

// Quarter button selection
	public HospitalMissedOpportunity clickQtrcaretSymbol() throws InterruptedException {

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
	public HospitalMissedOpportunity clickHospital() throws InterruptedException {
		Thread.sleep(3000);

		iframeHandling();
		// Double click on element
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'RPT002:Reports Facility 2')]")),
				"Hospital");
		defaultContent();

		return this;
	}

	// Radio button- Patient Class
	public HospitalMissedOpportunity clickPatientClass() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Inpatient')]")), "PatientClass");
		defaultContent();
		return this;
	}

	// Run Document
	public HospitalMissedOpportunity clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr205']")), "RunDocument");
		defaultContent();
		Thread.sleep(60000);
		return this;
	}

	// report
	public HospitalMissedOpportunity clickReport() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "Report");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}
		
		//Assert verification
	    public HospitalMissedOpportunity assertHospitalMissedOpportunity() throws InterruptedException {
	        Thread.sleep(3000);
	        iframeHandling();
	       
	       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Report");
	        defaultContent();
	        return this;
	    }
	    
	    //Back to Reports Home
	    public HospitalMissedOpportunity backToReportsHome() throws InterruptedException {
	        Thread.sleep(3000);
	        iframeHandling();
	        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
	        
	        defaultContent();
	        Thread.sleep(1000);
	        return this;
	    }

	

}
