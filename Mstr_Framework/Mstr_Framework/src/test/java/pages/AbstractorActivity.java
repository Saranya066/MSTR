package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class AbstractorActivity extends WebDriverServiceImpl {

	public AbstractorActivity clickAbstractorActivity() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[129]/div[1]")),
				"AbstractorActivity");

		Thread.sleep(10000);
		return this;
	}
	
	// Hospital selection
		public AbstractorActivity clickHospital() throws InterruptedException {
			windowHandling();
			iframeHandling();
			// Double click on element
			doubleClick(getDriver().findElement(By.xpath("//tbody/tr[2]/td[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[7]/div[1]/span[1]")),
					"Hospital");
			defaultContent();

			return this;
		}

// Quarter button selection
	public AbstractorActivity clickQtrcaretSymbol() throws InterruptedException {

		iframeHandling();
		click(getDriver().findElement(By.xpath(
				"//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/span[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/img[1]")),
				"QtrcaretSymbol");
		// double click the Quarter option:Q3 2021
		doubleClick(getDriver().findElement(By.xpath("//span[contains(text(),'2021 Q3')]")), "Quarter");
		defaultContent();
		return this;
	}

	

	// Run Document
	public AbstractorActivity clickRunDocument() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.xpath("//input[@id='id_mstr158']")), "RunDocument");
		defaultContent();
		Thread.sleep(60000);
		return this;
	}

	// Summary report
	public AbstractorActivity clickSummary() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout1")), "Summary");
		defaultContent();
		Thread.sleep(5000);
		return this;
	}

	// Detail report
	public AbstractorActivity clickDetail() throws InterruptedException {
		iframeHandling();
		click(getDriver().findElement(By.id("tbLayout2")), "Detail");
		defaultContent();
		Thread.sleep(3000);
		return this;
	}
	
	//Assert verification
    public AbstractorActivity assertAbstractorActivity() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
       
       assertVerification(getDriver().findElement(By.xpath("//span[@id='tbLayout2']")), "Detail");
        defaultContent();
        return this;
    }
    
    //Back to Reports Home
    public AbstractorActivity backToReportsHome() throws InterruptedException {
        Thread.sleep(3000);
        iframeHandling();
        click(getDriver().findElement(By.xpath("//a[contains(text(),'Back to Reports Home')]")), "Back to Reports Home");
        
        defaultContent();
        Thread.sleep(3000);
        return this;
    }

	


}
