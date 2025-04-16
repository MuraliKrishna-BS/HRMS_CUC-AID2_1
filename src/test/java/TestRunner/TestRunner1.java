package TestRunner;

import org.junit.runner.*;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= 
		
		//"Features",
		"Features/AttendanceVerification.feature",
		//"Features/PendingforApproval.feature",
		glue="StepDefinition",
		plugin = {"progress", "html:target/cucumber-report.html", 
				"json: json_output/cucumber.jason", 
				"junit: junit_xml_output/cucumber.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/rerun.txt"},
	//monochrome= true
	dryRun=false
		)





public class TestRunner1 {

}
