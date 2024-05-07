import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.cucumber.keyword.internal.CucumberGlueGenerator as CucumberGlueGen
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
class NewTestListener {
/**
* Executes before every test case starts.
* @param testCaseContext related information of the executed test case.
*/
@BeforeTestCase
def beforeTestCase(TestCaseContext testCaseContext) {
CucumberKW.GLUE = ['stepDefinition']
CucumberGlueGen.addDefaultPackages();
}
}
