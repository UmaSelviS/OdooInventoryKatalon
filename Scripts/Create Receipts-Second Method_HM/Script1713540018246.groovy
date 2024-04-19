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

WebUI.callTestCase(findTestCase('Login to Odoo Inventory ERP System'), [('Email') : Email, ('Password') : Password], FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementVisible(findTestObject('Create Receipts/Page/inventoryLink'))
WebUI.click(findTestObject('Create Receipts/Page/inventoryLink'))

//WebUI.verifyElementVisible(findTestObject('Object Repository/Create Receipts/Page_Inventory Overview/span_Receipts (1)'))
WebUI.click(findTestObject('inventoryPage/Dropdown'))

//WebUI.verifyElementVisible(findTestObject('Create Receipts Second Method/Page_Inventory Overview/newbuttonLink'))
WebUI.click(findTestObject('inventoryPage/newLink'))

//WebUI.verifyElementVisible(findTestObject('Object Repository/Create Receipts/Page/receiveFromdropdown (1)'))
WebUI.click(findTestObject('Create Receipts/Page/receiveFromdropdown (1)'))

WebUI.click(findTestObject('Create Receipts/Page/contactName'))

//WebUI.verifyElementVisible(findTestObject('Create Receipts/Page/addalineLink'))
WebUI.click(findTestObject('Create Receipts/Page/addalineLink'))

WebUI.click(findTestObject('Create Receipts/Page/productlistDropdown'))

WebUI.click(findTestObject('Create Receipts/Page/productName'))

WebUI.setText(findTestObject('Create Receipts/Page/inputDemandField'), '500')

WebUI.click(findTestObject('Create Receipts/Page/validateButton'))

