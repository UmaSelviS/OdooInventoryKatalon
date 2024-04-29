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

WebUI.callTestCase(findTestCase('Login to Odoo Inventory ERP System'), [('Email') : 'vinita.gaikwad07@gmail.com', ('Password') : 'Test@123'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/homeMenuPage/inventoryLink'))

WebUI.click(findTestObject('Object Repository/inventoryPage/configurationMenu'))

WebUI.click(findTestObject('Object Repository/inventoryPage/warehousesSubMenu'))

WebUI.click(findTestObject('Object Repository/warehousesPage/newButton'))

String s1 = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz'

Random rand = new Random()

StringBuilder sb = new StringBuilder()

for (int j = 1; j <= 10; j++) {
    sb.append(s1.charAt(rand.nextInt(s1.length())))
}

WebUI.setText(findTestObject('Object Repository/warehouseConfigurationPage/warehouseNameText'), sb.toString())

WebUI.setText(findTestObject('Object Repository/warehouseConfigurationPage/shortNameText'), sb.toString())

WebUI.setText(findTestObject('Object Repository/warehouseConfigurationPage/addressText'), '345 rose st')

WebUI.click(findTestObject('Object Repository/warehouseConfigurationPage/resupplyFromMainWarehouseCheckbox'))

WebUI.click(findTestObject('Object Repository/warehouseConfigurationPage/saveManuallyButton'))

WebUI.click(findTestObject('Object Repository/warehouseConfigurationPage/actionsMenu'))

WebUI.mouseOver(findTestObject('Object Repository/warehouseConfigurationPage/archiveSetting'))

WebUI.click(findTestObject('Object Repository/warehouseConfigurationPage/archiveSetting'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/warehouseConfigurationPage/archiveButton'))

WebUI.closeBrowser()

