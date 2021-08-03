package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class ProfileAudit extends WebDriverServiceImpl {

	public ProfileAudit clickProfileAudit() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[151]/div[1]")),
				"ProfileAudit");

		Thread.sleep(10000);
		return this;
	}
	
	// Hospital selection
		public ProfileAudit clickHospital() throws InterruptedException {
			windowHandling();
			iframeHandling();
			// Double click on element
			doubleClick(getDriver().findElement(By.xpath("//tbody/tr[2]/td[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[5]/div[1]")),
					"Hospital");
			defaultContent();

			return this;
		}

// Quarter button selection
	public ProfileAudit clickQtrcaretSymbol() throws InterruptedException {

		iframeHandling();
		
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//div[contains(text(),'2021 Q3')]")), "Quarter");
		defaultContent();
		return this;
	}

	

	// Run Document
	public ProfileAudit clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr108']")), "RunDocument");
		defaultContent();
		Thread.sleep(60000);
		return this;
	}

	// Facility Detai report
	public ProfileAudit clickFaciityDetail() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "FaciityDetail");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// Sampling preference report
	public ProfileAudit clickSamplingPreference() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout2")), "SamplingPreference");
		defaultContent();
		Thread.sleep(3000);
		return this;
	}

	// Submission Preference report
		public ProfileAudit clickSubmissionpreference() throws InterruptedException {
			iframeHandling();
			click(getDriver().findElement(By.id("tbLayout3")), "Submissionpreference");
			defaultContent();
			Thread.sleep(5000);
			return this;
		}
		//Assert verification
	    public ProfileAudit assertProfileAudit() throws InterruptedException {
	        Thread.sleep(3000);
	        iframeHandling();
	       
	       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout1']")), "Facility Details");
	        defaultContent();
	        return this;
	    }
	    
	    //Back to Reports Home
	    public ProfileAudit backToReportsHome() throws InterruptedException {
	        Thread.sleep(3000);
	        iframeHandling();
	        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
	        
	        defaultContent();
	        Thread.sleep(3000);
	        return this;
	    }


}
