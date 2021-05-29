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

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b (9)'), 
    findTestData('Create-Team-Data').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6 (9)'), 
    findTestData('Create-Team-Data').getValue(2, 1))

WebUI.click(findTestObject('Object Repository/Page_Mattermost/button_Sign in (2)'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/button_iter1998_style--none sidebar-header-_aca5ec'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/a_Create a Team'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/input_Team Name_teamNameInput'), findTestData(
        'Create-Team-Data').getValue(3, 1))

WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/span_Finish'))

WebUI.closeBrowser()

