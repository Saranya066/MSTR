package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class IpfqrSubmission extends WebDriverServiceImpl {

	public IpfqrSubmission clickIpfqrSubmission() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'CMS IPFQR Submission')]")), "IpfqrSubmission");

		Thread.sleep(10000);
		return this;
	}

// Quarter button selection
	public IpfqrSubmission clickQtrcaretSymbol() throws InterruptedException {

		windowHandling();
		Thread.sleep(1000);

		iframeHandling();
		click(getDriver().findElement(By.xpath(
				"//tbody/tr[2]/td[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/img[1]")),
				"QtrcaretSymbol");
		click(getDriver().findElement(By.xpath(
				"//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/span[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/img[1]")),
				"YearcaretSymbol");
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//span[contains(text(),'2021 Q3')]")), "Quarter");
		defaultContent();
		return this;
	}

	// HCO selection
	public IpfqrSubmission clickCmsCertificationNumber() throws InterruptedException {
		iframeHandling();
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'AUTOM3:Automation Facility 3')]")),
				"CmsCertificationNumber");
		defaultContent();

		return this;

	}

	// Radio button- Patient Class
	public IpfqrSubmission clickPatientClass() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//div[contains(text(),'Inpatient')]")), "PatientClass");
		defaultContent();
		return this;
	}

	// Run Document
	public IpfqrSubmission clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr108']")), "RunDocument");
		defaultContent();
		Thread.sleep(20000);
		return this;
	}

	// Population Sampling Report
	public IpfqrSubmission clickPopSampReport() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "PopSampReport");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// Measure results Report
	public IpfqrSubmission clickMeasureResult() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout2")), "MeasureResult");
		defaultContent();
		Thread.sleep(3000);
		return this;
	}

	// PatientDetail Hbips Report
	public IpfqrSubmission clickPatientDetailHbips() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout3")), "PatientDetailHbips");
		defaultContent();
		Thread.sleep(3000);
		return this;
	}

	// PatientDetail IMM Report
	public IpfqrSubmission clickPatientDetailImm() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout4")), "PatientDetailImm");
		defaultContent();
		Thread.sleep(3000);
		return this;
	}

	// PatientDetail MET Report
	public IpfqrSubmission clickPatientDetailMet() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout5")), "PatientDetailMet");
		defaultContent();
		Thread.sleep(3000);
		return this;
	}

	// PatientDetail Sub Report
	public IpfqrSubmission clickPatientDetailSub() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout6")), "PatientDetailSub");
		defaultContent();
		Thread.sleep(3000);
		return this;
	}

	// PatientDetail Tob Report
	public IpfqrSubmission clickPatientDetailTob() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout7")), "PatientDetailTob");
		defaultContent();
		Thread.sleep(3000);
		return this;
	}

	// PatientDetail Tob Report
	public IpfqrSubmission clickPatientDetailTr() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout8")), "PatientDetailTr");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}
	//Assert verification
    public IpfqrSubmission assertIpfqrSubmission() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Population-Sampling");
        defaultContent();
        Thread.sleep(2000);
        return this;
    }
    
    //Back to Reports Home
    public IpfqrSubmission backToReportsHome() throws InterruptedException {
        Thread.sleep(2000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(1000);
        return this;
    }
}
