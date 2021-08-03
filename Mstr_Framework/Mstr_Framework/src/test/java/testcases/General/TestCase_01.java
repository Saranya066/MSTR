package testcases.General;

import org.testng.annotations.Test;

import pages.AbstractorActivity;
import pages.CmsPatientLevel;
import pages.CmsSummary;
import pages.FacilityMeasureSetProgress;
import pages.FacilityMeasureStatus;
import pages.FacilityMeasureSummary;
import pages.FacilityRates;
import pages.FacilityRatesByMeasure;
import pages.HospitalComparativeAggregated;
import pages.HospitalComparativeNonAggregated;
import pages.IpfqrSubmission;
import pages.IqrSubmission;
import pages.IrrPatientDataElementAgreement;
import pages.IrrPatientLevelCategoryAssignment;
import pages.IrrSummaryCategoryAssignment;
import pages.IrrSummaryDataElementAggrement;
import pages.OqrSubmission;
import pages.PatientDataExtract;
import pages.PhysicianComparativeAggregated;
import pages.PhysicianComparativeNonAggregated;
import pages.HospitalMissedOpportunity;
import pages.PhysicianMissedOppurtunity;
import pages.JointCommHbips;
import pages.JointCommPatLevel;
import pages.JointCommSumm;
import pages.LoginPage;
import pages.ProfileAudit;
import pages.RespPhysComAggregated;
import pages.RespPhysComNonAggregated;
import pages.SepsisBundlePerformance;
import pages.TjcSubmission;
import pages.UnitComparartiveNonAggregated;
import utils.DataInputProvider;

//import org.openqa.selenium.support.PageFactory;

public class TestCase_01 {

	@Test

	public void loginWDC(int iRowNumber, String sDataSheetName) throws Exception, InterruptedException {

		// 1. Login to MSTR
		new LoginPage().typeUsername(DataInputProvider.getCellData_ColName(iRowNumber, "username", sDataSheetName))
				.clickNext().typePassword(DataInputProvider.getCellData_ColName(iRowNumber, "password", sDataSheetName))
				.clickSignIn();
		
		
		
		new CmsPatientLevel().clickCmsPatientLevel().clickQtrcaretSymbol().clickCmsCertificationNumber()
	.clickPatientClass().clickCFGPopulation().clickPatientStatus().clickAbstractorVerified().clickRunDocument().clickCannotCalculate().clickMissingMeasure().clickPatient().assertCmsPatientLevel().backToReportsHome();

//		// 2. Navigate to CMS Patient Level Report
////		new CmsPatientLevel().clickCmsPatientLevel().clickQtrcaretSymbol().clickCmsCertificationNumber()
////				.clickPatientClass().clickCFGPopulation().clickCannotCalculate().clickMissingMeasure().clickPatient().assertCmsPatientLevel().backToReportsHome();
//
//		// 3. Navigate to CMS Summary Report
//		new CmsSummary().clickCmsSummary().clickQtrcaretSymbol().clickCmsCertificationNumber().clickPatientClass()
//				.clickRunDocument().clickCannotCalculate().clickReport().assertCmsSummary().backToReportsHome();
//
//	// 4. Navigate to Facility Measure Status Report
//		new FacilityMeasureStatus().clickFacilityMeasureStatus().clickQtrcaretSymbol().clickPatientClass()
//				.clickRunDocument().clickCoverPage().assertFacilityMeasureStatus().backToReportsHome();
//
//		// 5. Navigate to Facility Measure Progress set Report
//		new FacilityMeasureSetProgress().clickFacilityMeasureStatus().clickQtrcaretSymbol().clickRunDocument()
//				.clickCoverPage().assertFacilityMeasureSetProgress().backToReportsHome();
//
//		// 6. Navigate to FacilityRates set Report
//		new FacilityRates().clickFacilityMeasureStatus().clickQtrcaretSymbol().clickRunDocument()
//				.clickRateBasedMeasure().clickMissingMeasure().clickContinuousMeasures().clickHbipseventMeasures().assertFacilityRates().backToReportsHome();
//
//		// 7. Navigate to Joint commission HBIPS set Report
//		new JointCommHbips().clickJointCommHbips().clickQuarter().clickHco().clickRunDocument().clickPopulation()
//				.clickMeasureResults().clickPatientdetail().assertJointCommHbips().backToReportsHome();
//
//		// 8. Navigate to Joint Commission Patient Level Report
//		new JointCommPatLevel().clickJointCommPatLevel().clickQtrcaretSymbol().clickHco().clickPatientClass()
//				.clickRunDocument().clickCannotCalculate().clickMissingMeasureData().clickPatient().assertJointCommPatLevel().backToReportsHome();
////
//		 //9. Navigate to Joint Commission Summary Report
//		new JointCommSumm().clickJointCommSumm().clickQtrcaretSymbol().clickHco().clickPatientClass().clickRunDocument()
//				.clickReport().assertJointCommSumm().backToReportsHome();
////
//		// 10. Navigate to Patient Data Extractor Report
//		 new PatientDataExtract().clickPatientDataExtract().clickHospital().clickTime().clickRunDocument().backToReportsHome();
//// SUBMISSION REPORTS
//		
//		// 11. Navigate to Ipfqr Submission Report
//		new IpfqrSubmission().clickIpfqrSubmission().clickQtrcaretSymbol().clickCmsCertificationNumber()
//				.clickRunDocument().clickPopSampReport().clickMeasureResult().clickPatientDetailHbips()
//				.clickPatientDetailImm().clickPatientDetailMet().clickPatientDetailSub().clickPatientDetailTob()
//				.clickPatientDetailTr().assertIpfqrSubmission().assertIpfqrSubmission().backToReportsHome();
//
////		// 12. Navigate to Iqr Submission Report
//		new IqrSubmission().clickIqrSubmission().clickCmsCertificationNumber().clickQuarter().clickRunDocument()
//				.clickSummary().clickPatientDetail().assertIqrSubmission().backToReportsHome();
////		// 13. Navigate to Oqr Submission Report
//		new OqrSubmission().clickOqrSubmission().clickCmsCertificationNumber().clickQuarter().clickRunDocument()
//				.clickSubmission().clickSupplementalInfo().clickOp29().clickOp30().clickOp33().assertOqrSubmission().backToReportsHome();
//
////		// 14. Navigate to Tjc Submission Report
//		new TjcSubmission().clickTjcSubmission().clickCmsCertificationNumber().clickQuarter().clickRunDocument()
//				.clickDetail().assertTjcSubmission().backToReportsHome();
//
////Inter Rater realibility Reports		
//
//		// 15. Navigate to IRR - Patient Level Category Assignment Agreement Rate Report
//		new IrrPatientLevelCategoryAssignment().clickIrrPatientLevelCategoryAssignment().clickHospital().clickQuarter()
//				.clickRunDocument().clickReport().assertIrrPatientLevelCategoryAssignment().backToReportsHome();
//
//		// 16. Navigate to IRR - Patient Level Data Element Agreement Rate Report
//		new IrrPatientDataElementAgreement().clickIrrPatientDataElementAgreement().clickHospital().clickQuarter()
//				.clickRunDocument().clickReport().assertIrrPatientDataElementAgreement().backToReportsHome();
//
//		// 17. Navigate to IRR - Summary Category Element Agreement Rate Report
//		new IrrSummaryCategoryAssignment().clickIrrSummaryCategoryAssignment().clickHospital().clickQuarter()
//				.clickRunDocument().clickReport().assertIrrSummaryCategoryAssignment().backToReportsHome();
//
//		// 18. Navigate to IRR - Summary Date Element Agreement Rate Report
//		new IrrSummaryDataElementAggrement().clickIrrSummaryDataElementAggrement().clickHospital().clickQuarter()
//				.clickRunDocument().clickReport().assertIrrSummaryDataElementAggrement().backToReportsHome();
//
////Performance reports
//
//		// 19. Navigate to  Physician Comparative Aggregated  Report
//		new PhysicianComparativeAggregated().clickPhysicianComparativeAggregated().clickQtrcaretSymbol().clickHospital()
//				.clickPhysicianQtr().clickPatientClass().clickRunDocument().clickAllComparative().clickAllTrendedGraph()
//				.clickAllTrendedData().assertPhysicianComparativeAggregated().backToReportsHome();
//
//		// 20. Navigate to  Physician Comparative Non Aggregated Report
//		new PhysicianComparativeNonAggregated().clickPhysicianComparativeNonAggregated().clickQtrcaretSymbol()
//				.clickHospital().clickPhysicianQtr().clickPatientClass().clickRunDocument().clickAllComparative()
//				.clickAllTrendedGraph().clickAllTrendedData().assertPhysicianComparativeNonAggregated().backToReportsHome();
//
//		// 21. Navigate to Patient Missed Opportunity Report
//		new PhysicianMissedOppurtunity().clickPhysicianMissedOppurtunity().clickQtrcaretSymbol().clickHospital()
//				.clickPatientClass().clickPhysicianQtr().clickRunDocument().clickReport().assertPhysicianMissedOppurtunity().backToReportsHome();
//
//////		// 22. Navigate to Hospital Comparative Aggregated  Report
//		new HospitalComparativeAggregated().clickHospitalComparativeAggregated().clickQtrcaretSymbol()
//				.clickCmsCertificationNumber().clickPatientClass().clickRunDocument().clickAllComparative()
//				.clickAllTrendedGraph().clickAllTrendedData().clickComparative().assertHospitalComparativeAggregated().backToReportsHome();
//    // 23. Navigate to Hospital COmparative non aggregated Report
//		new HospitalComparativeNonAggregated().clickHospitalComparativeNonAggregated().clickQtrcaretSymbol()
//		.clickHospital().clickPatientClass().clickRunDocument().clickAllComparative().clickAllTrendedGraph().clickAllTrendedData().assertHospitalComparativeNonAggregated().backToReportsHome();
//		// 24. Navigate to Hospital Missed Opportunity Report
//		new HospitalMissedOpportunity().clickHospitalMissedOpportunity().clickQtrcaretSymbol().clickHospital()
//				.clickPatientClass().clickRunDocument().clickReport().assertHospitalMissedOpportunity().backToReportsHome();
//
//		// 25. Navigate to Responsible Physician Comparative Aggregated Report
//		new RespPhysComAggregated().clickRespPhysComAggregated().clickQtrcaretSymbol().clickHospital()
//				.clickPhysicianQtr().clickPatientClass().clickRunDocument().clickAllComparative().clickAllTrendedGraph()
//				.clickAllTrendedData().clickPhysComparative().assertRespPhysComAggregated().backToReportsHome();
//
//		// 26. Navigate to Responsible Physician Comparative Non Aggregated Report
//		new RespPhysComNonAggregated().clickRespPhysComNonAggregated().clickQtrcaretSymbol().clickHospital()
//				.clickPhysicianQtr().clickPatientClass().clickRunDocument().clickComparative().clickAllTrendedGraph()
//				.clickPhysTrendedData().assertRespPhysComAggregated().backToReportsHome();
//
//		// 27. Navigate to Sepsis Bundle Performance Report
//		new SepsisBundlePerformance().clickSepsisBundlePerformance().clickQtrcaretSymbol().clickFacilityHospital()
//				.clickRunDocument().clickSepBundlePerform().clickSepsisbundle().assertSepsisBundlePerformance().backToReportsHome();
//
//		
//		
//		// 28. Navigate to Unit Comparative Non Aggregated Report
//		new UnitComparartiveNonAggregated().clickUnitComparartiveNonAggregated().clickQtrcaretSymbol().clickHospital()
//				.clickPhysicianQtr().clickPatientClass().clickRunDocument().clickAllComparative().clickAllTrendedGraph()
//				.clickAllTrendedData().assertUnitComparartiveNonAggregated().backToReportsHome();
//		
//		
////		// 29. Navigate to Facility Measure Summary Report
//		new FacilityMeasureSummary().clickFacilityMeasureSummary().clickQtrcaretSymbol()
//				.clickPatientClass().clickRunDocument().clickReport().assertFacilityMeasureSummary().backToReportsHome();
//		
//		// 30. Navigate to Facility rates by measure Report
//				new FacilityRatesByMeasure().clickFacilityRatesByMeasure().clickQtrcaretSymbol()
//				.clickFacilityGrpHospital().clickRunDocument().clickCoverRatesByMeasure().assertFacilityRatesByMeasure().backToReportsHome();
//		
//		// 31. Navigate to Abstractor Activity  Report
//		new AbstractorActivity().clickAbstractorActivity().clickHospital().clickQtrcaretSymbol()
//		.clickRunDocument().clickSummary().clickDetail().assertAbstractorActivity().backToReportsHome();
//		
//		
//	
//		// 32. Navigate to Profile Audit  Report
//				new ProfileAudit().clickProfileAudit().clickHospital().clickQtrcaretSymbol()
//				.clickRunDocument().clickFaciityDetail().clickSamplingPreference().clickSubmissionpreference().assertProfileAudit().backToReportsHome();
//


	}

}
