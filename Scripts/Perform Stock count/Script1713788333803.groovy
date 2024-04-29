import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://freelance25.odoo.com/web/login?redirect=%2Fodoo%3Fcids%3D1')

WebUI.setText(findTestObject('Object Repository/Page_Odoo/input_Email_login-nivetha'), 'nivethasivakumar1998@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Odoo/form_Email                                 _7af9c3'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Odoo/input_Password_password'), 'XUXZO0J2IMUaiSjEDiaJnA==')

WebUI.click(findTestObject('Object Repository/Page_Odoo/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Home/img_Dashboards_o_app_icon rounded-3'))

WebUI.click(findTestObject('Object Repository/Page_Inventory Overview/span_Reporting'))

WebUI.click(findTestObject('Object Repository/Page_Inventory Overview/a_Stock'))

WebUI.click(findTestObject('Object Repository/Page_Stock/td_0.00'))

WebUI.click(findTestObject('Object Repository/Page_Computer Accessories Wireless Headphones/a_Inventory'))

WebUI.click(findTestObject('Object Repository/Page_Computer Accessories Wireless Headphones/a_General Information'))

WebUI.click(findTestObject('Object Repository/Page_Computer Accessories Wireless Headphones/span_0.00'))

WebUI.closeBrowser()

WebUI.acceptAlert()

