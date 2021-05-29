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

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b (8)'), 
    'sang517119')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6 (8)'), 
    'vUvz7GjrNAzvejq/0Nt9cQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6 (8)'), 
    Keys.chord(Keys.ENTER))


if(WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/span_channel1'),
	0) == false) {

}else {
	WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/span_channel1'))
WebUI.click(findTestObject('Object Repository/Page_channel1 - team9 Mattermost/span_channel1_channelHeaderDropdownIcon'))

WebUI.click(findTestObject('Object Repository/Page_channel1 - team9 Mattermost/span_Archive Channel'))

WebUI.click(findTestObject('Object Repository/Page_channel1 - team9 Mattermost/span_Archive'))

}


WebUI.closeBrowser()