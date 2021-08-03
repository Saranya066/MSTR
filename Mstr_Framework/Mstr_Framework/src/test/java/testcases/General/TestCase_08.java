package testcases.General;

import org.testng.annotations.Test;

import pages.JointCommPatLevel;
import pages.LoginPage;
import utils.DataInputProvider;

public class TestCase_08 {

	@Test

	public void loginWDC(int iRowNumber, String sDataSheetName) throws Exception, InterruptedException {

		// 1. Login to MSTR
		new LoginPage().typeUsername(DataInputProvider.getCellData_ColName(iRowNumber, "username", sDataSheetName))
				.clickNext().typePassword(DataInputProvider.getCellData_ColName(iRowNumber, "password", sDataSheetName))
				.clickSignIn();

		// 2. Navigate to Joint Commission Patient Level Report
		new JointCommPatLevel().clickJointCommPatLevel().clickQtrcaretSymbol().clickHco().clickPatientClass()
				.clickRunDocument().clickCannotCalculate().clickMissingMeasureData().clickPatient();

	}
}
