package testcases.General;

import org.testng.annotations.Test;

import pages.CmsSummary;
import pages.LoginPage;
import utils.DataInputProvider;

public class TestCase_02 {

	@Test

	public void loginWDC(int iRowNumber, String sDataSheetName) throws Exception, InterruptedException {

		// 1. Login to MSTR
		new LoginPage().typeUsername(DataInputProvider.getCellData_ColName(iRowNumber, "username", sDataSheetName))
				.clickNext().typePassword(DataInputProvider.getCellData_ColName(iRowNumber, "password", sDataSheetName))
				.clickSignIn();

		// 2. Navigate to CMS Summary Report
		new CmsSummary().clickCmsSummary().clickQtrcaretSymbol().clickCmsCertificationNumber().clickPatientClass()
				.clickRunDocument().clickCannotCalculate().clickReport();

	}
}
