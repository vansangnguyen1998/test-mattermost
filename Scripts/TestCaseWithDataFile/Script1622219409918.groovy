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

WebUI.navigateToUrl('https://doanccdnc.herokuapp.com/')

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b (1)'), 
    'sang517119')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6 (1)'), 
    'HeCM15nHKBI=')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Sign in (1)'))

WebUI.click(findTestObject('Object Repository/Page_Mattermost/label_Enter a valid email or username andor_ef8acb'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6 (1)'), 
    'vUvz7GjrNAzvejq/0Nt9cQ==')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/span_No, keep it as Away'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/div_At 1129 PM Friday, May 28, trinhnhatsin_79a4e0'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/div_At 1129 PM Friday, May 28, trinhnhatsin_79a4e0'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/div_At 1129 PM Friday, May 28, trinhnhatsin_79a4e0'))

