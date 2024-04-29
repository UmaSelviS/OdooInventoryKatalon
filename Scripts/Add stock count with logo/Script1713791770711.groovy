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

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Odoo/input_Password_password'), 'XUXZO0J2IMUaiSjEDiaJnA==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Odoo/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Home/a_Inventory'))

WebUI.click(findTestObject('Object Repository/Page_Inventory Overview/span_Products'))

WebUI.click(findTestObject('Object Repository/Page_Inventory Overview/a_Products'))

WebUI.click(findTestObject('Object Repository/Page_Products/button_New'))

WebUI.setText(findTestObject('Object Repository/Page_New/textarea_Product Name_name_0'), 'juice ')

WebUI.click(findTestObject('Object Repository/Page_New/img_Print Labels_image_1920'))

WebUI.click(findTestObject('Object Repository/Page_New/i_Print Labels_fa fa-pencil fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_New/div_Internal Notes                         _fd2164'))

WebUI.click(findTestObject('Object Repository/Page_New/p_Reset Size_oe-hint oe-command-temporary-hint'))

WebUI.setText(findTestObject('Object Repository/Page_New/div_Reset Size_description_0'), '<p style="outline: rgb(255, 0, 0) solid 2px;">added to check if logo addition is working</p>')

WebUI.setText(findTestObject('Object Repository/Page_New/input__list_price_0'), '3.00')

WebUI.setText(findTestObject('Object Repository/Page_New/input__standard_price_0'), '1.50')

WebUI.click(findTestObject('Object Repository/Page_New/div_3.00'))

WebUI.click(findTestObject('Object Repository/Page_New/div_Product NameCan be SoldCan be Purchased_109859'))

WebUI.setText(findTestObject('Object Repository/Page_New/input__standard_price_0'), '2.00')

WebUI.click(findTestObject('Object Repository/Page_New/div_Product NameCan be SoldCan be Purchased_bf7f83'))

WebUI.click(findTestObject('Object Repository/Page_New/button_Send message'))

WebUI.closeBrowser()

