import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('homeMenuPage/inventorylink'))

WebUI.click(findTestObject('inventoryPage/OperationsLink'))

WebUI.click(findTestObject('Operations_page/Scrap_link'))

WebUI.click(findTestObject('newScrapOders_page/NewScrap_btn'))

WebUI.click(findTestObject('Object Repository/Page_New/input_Product_product_id_0'))

WebUI.click(findTestObject('Object Repository/Page_New/a_CAT-6 Lan cables'))

WebUI.click(findTestObject('Object Repository/Page_New/input_Scrap Location_scrap_location_id_0'))

WebUI.click(findTestObject('Object Repository/Page_New/a_WH2Scrap'))

WebUI.click(findTestObject('Object Repository/Page_New/span_Validate'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_SP00008/p_Scrap created'), 'Scrap created')

WebUI.click(findTestObject('Object Repository/Page_SP00008/a_Scrap Orders'))

WebUI.verifyElementText(findTestObject('Object Repository/Scrap Orders_page/Done_textverification'), 'Done')

WebUI.closeBrowser()

