package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class PatientDataExtract extends WebDriverServiceImpl {
	public PatientDataExtract clickPatientDataExtract() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'The Patient Data Extract Report Builder')]")),
				"PatientDataExtract");

		Thread.sleep(10000);
		defaultContent();
		return this;
	}

	// Hospital selection
	public PatientDataExtract clickHospital() throws InterruptedException {
		windowHandling();
		iframeHandling();
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'PRE00:PREMIER, INC.')]")), "Hospital");
		Thread.sleep(5000);
		defaultContent();

		return this;

	}

	// Time
	public PatientDataExtract clickTime() throws InterruptedException {



		iframeHandling();
		click(getDriver().findElement(By.xpath(
				"//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[4]/span[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/img[1]")),
				"QtrcaretSymbol");
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//span[contains(text(),'2021 Q3')]")), "Time");
		defaultContent();
		return this;
	}

	// Run Document
	public PatientDataExtract clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr248']")), "RunDocument");
		defaultContent();
		Thread.sleep(20000);
		return this;
	}
	
	//Back to Reports Home
    public PatientDataExtract backToReportsHome() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(1000);
        return this;
    }


}
