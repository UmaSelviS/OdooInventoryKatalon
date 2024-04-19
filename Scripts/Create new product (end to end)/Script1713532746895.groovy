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

WebUI.navigateToUrl('https://freelance25.odoo.com/web/login?redirect=%2Fodoo%2Faction-268%3Fcids%3D1')

WebUI.setText(findTestObject('Object Repository/Page_Odoo/input_Email_login'), 'khayati0308@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Odoo/input_Password_password'), 'US8zkPuVayvEXuGpxZiGdw==')

WebUI.click(findTestObject('Object Repository/Page_Odoo/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Products/button_New'))

WebUI.setText(findTestObject('Object Repository/Page_New/textarea_Product Name_name_0'), 'burger')

WebUI.setText(findTestObject('Object Repository/Page_New/input__list_price_0'), '50')

WebUI.setText(findTestObject('Object Repository/Page_New/input__standard_price_0'), '20')

WebUI.click(findTestObject('Object Repository/Page_New/p_Reset Size_oe-hint oe-command-temporary-hint'))

WebUI.uploadFile(findTestObject('Object Repository/Page_New/div_Reset Size_description_0'), '<p style="outline: rgb(255, 0, 0) solid 2px;">testing reference</p>')

String s1 = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789'

Random rand = new Random()

StringBuilder sb = new StringBuilder()

for (int j = 1; j <= 10; j++) {
    sb.append(s1.charAt(rand.nextInt(s1.length())))
}

//WebUI.comment(sb.toString())
WebUI.setText(findTestObject('Object Repository/Page_New/input_Barcode_barcode_0'), sb.toString())

WebUI.click(findTestObject('Object Repository/Page_New/i_New_fa fa-cloud-upload fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_burger/span_Products'))

WebUI.click(findTestObject('Object Repository/Page_burger/a_Products'))

WebUI.closeBrowser()

