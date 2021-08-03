package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import services.WebDriverServiceImpl;

public class CmsPatientLevel extends WebDriverServiceImpl {

	public CmsPatientLevel clickCmsPatientLevel() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'CMS Patient Level')]")), "CmsPatientLevel");

		Thread.sleep(10000);
		return this;
	}

// Quarter button selection
	public CmsPatientLevel clickQtrcaretSymbol() throws InterruptedException {

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
	public CmsPatientLevel clickCmsCertificationNumber() throws InterruptedException {
		Thread.sleep(3000);

		iframeHandling();
		// Double click on element
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'AUTOM1:Automation Facility 1')]")),
				"CmsCertificationNumber");
		defaultContent();

		return this;
	}

	// Radio button- Patient Class
	public CmsPatientLevel clickPatientClass() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Inpatient')]")), "PatientClass");
		defaultContent();
		return this;
	}
	
	//CFG/Population Measure
	
		public CmsPatientLevel clickCFGPopulation() throws InterruptedException {

			iframeHandling();
			doubleClick(getDriver().findElement(By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[4]/span[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/span[1]/div[3]/div[1]/div[1]/div[1]")), "CFGPopulation");
			defaultContent();
			return this;
		}
		
	//Patient Status
		
		public CmsPatientLevel clickPatientStatus() throws InterruptedException {

			iframeHandling();
			click(getDriver().findElement(By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[5]/span[1]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/div[3]/div[1]/div[1]")), "PatientStatus");
			defaultContent();
			return this;
		}
		
		
		//Abstractor Verified
		
				public CmsPatientLevel clickAbstractorVerified() throws InterruptedException {

					iframeHandling();
					click(getDriver().findElement(By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[6]/span[1]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/div[3]/div[1]/div[1]")), "Abstractor Verified");
					defaultContent();
					return this;
				}
				
		
		
	

	// Run Document
	public CmsPatientLevel clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr206']")), "RunDocument");
		defaultContent();
		Thread.sleep(20000);
		return this;
	}

	// Cannot Calculate report
	public CmsPatientLevel clickCannotCalculate() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "CannotCalculate");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// Missing Measure report
	public CmsPatientLevel clickMissingMeasure() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout2")), "MissingMeasure");
		defaultContent();
		Thread.sleep(3000);
		return this;
	}

	// Missing Measure report
	public CmsPatientLevel clickPatient() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout3")), "Patient");
		Thread.sleep(3000);
		defaultContent();
		return this;
	}
	//Assert verification
    public CmsPatientLevel assertCmsPatientLevel() throws InterruptedException {
        Thread.sleep(1000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout2']")), "Missing Measure Data");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public CmsPatientLevel backToReportsHome() throws InterruptedException {
        Thread.sleep(1000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(1000);
        return this;
    }
}
