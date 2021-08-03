package testcases.General;

import org.testng.annotations.Test;

import pages.JointCommHbips;
import pages.LoginPage;
import utils.DataInputProvider;

public class TestCase_07 {

	@Test

	public void loginWDC(int iRowNumber, String sDataSheetName) throws Exception, InterruptedException {

		// 1. Login to MSTR
		new LoginPage().typeUsername(DataInputProvider.getCellData_ColName(iRowNumber, "username", sDataSheetName))
				.clickNext().typePassword(DataInputProvider.getCellData_ColName(iRowNumber, "password", sDataSheetName))
				.clickSignIn();

		// 2. Navigate to Joint commission HBIPS set Report
		new JointCommHbips().clickJointCommHbips().clickQuarter().clickHco().clickRunDocument().clickPopulation()
				.clickMeasureResults().clickPatientdetail();

	}
}
