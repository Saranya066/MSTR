package testcases.General;

import org.testng.annotations.Test;

import pages.FacilityMeasureSetProgress;
import pages.FacilityRates;
import pages.LoginPage;
import utils.DataInputProvider;

public class TestCase_06 {

	@Test

	public void loginWDC(int iRowNumber, String sDataSheetName) throws Exception, InterruptedException {

		// 1. Login to MSTR
		new LoginPage().typeUsername(DataInputProvider.getCellData_ColName(iRowNumber, "username", sDataSheetName))
				.clickNext().typePassword(DataInputProvider.getCellData_ColName(iRowNumber, "password", sDataSheetName))
				.clickSignIn();

		// 2. Navigate to FacilityRates set Report
		new FacilityRates().clickFacilityMeasureStatus().clickQtrcaretSymbol().clickRunDocument()
				.clickRateBasedMeasure().clickMissingMeasure().clickContinuousMeasures().clickHbipseventMeasures();

	}
}
