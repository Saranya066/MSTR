package testcases.General;

import org.testng.annotations.Test;

import pages.JointCommSumm;
import pages.LoginPage;
import utils.DataInputProvider;

public class TestCase_09 {

	@Test

	public void loginWDC(int iRowNumber, String sDataSheetName) throws Exception, InterruptedException {

		// 1. Login to MSTR
		new LoginPage().typeUsername(DataInputProvider.getCellData_ColName(iRowNumber, "username", sDataSheetName))
				.clickNext().typePassword(DataInputProvider.getCellData_ColName(iRowNumber, "password", sDataSheetName))
				.clickSignIn();

		// 9. Navigate to Joint Commission Summary Report
		new JointCommSumm().clickJointCommSumm().clickQtrcaretSymbol().clickHco().clickPatientClass().clickRunDocument()
				.clickReport();
	}
}
