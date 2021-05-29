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

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b (11)'), 
    'sang517119')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6 (11)'), 
    'vUvz7GjrNAzvejq/0Nt9cQ==')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/button_Sign in (3)'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/span_surveybot, trinhnhatsinh'))

WebUI.setText(findTestObject('Object Repository/Page_surveybot, trinhnhatsinh - team9 Mattermost/textarea_Write to surveybot, trinhnhatsinh__d4d020 (1)'), 
    'H')

WebUI.setText(findTestObject('Object Repository/Page_surveybot, trinhnhatsinh - team9 Mattermost/textarea_H (1)'), 'He')

WebUI.setText(findTestObject('Object Repository/Page_surveybot, trinhnhatsinh - team9 Mattermost/textarea_He'), 'Hel')

WebUI.setText(findTestObject('Object Repository/Page_surveybot, trinhnhatsinh - team9 Mattermost/textarea_Hel'), 'Hell')

WebUI.setText(findTestObject('Object Repository/Page_surveybot, trinhnhatsinh - team9 Mattermost/textarea_Hell'), 'Hello')

WebUI.setText(findTestObject('Object Repository/Page_surveybot, trinhnhatsinh - team9 Mattermost/textarea_Hello'), 'HelloA')

WebUI.setText(findTestObject('Object Repository/Page_surveybot, trinhnhatsinh - team9 Mattermost/textarea_HelloA'), 'Hello')

WebUI.setText(findTestObject('Object Repository/Page_surveybot, trinhnhatsinh - team9 Mattermost/textarea_Hello'), 'Hello ')

WebUI.setText(findTestObject('Object Repository/Page_surveybot, trinhnhatsinh - team9 Mattermost/textarea_Hello_1'), 'Hello A')

WebUI.setText(findTestObject('Object Repository/Page_surveybot, trinhnhatsinh - team9 Mattermost/textarea_Hello A'), 'Hello Al')

WebUI.setText(findTestObject('Object Repository/Page_surveybot, trinhnhatsinh - team9 Mattermost/textarea_Hello Al'), 'Hello All')

