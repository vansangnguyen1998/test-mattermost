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

for(def row = 1; row <= findTestData("craete-public-channels").getRowNumbers() - 1; row++ ) {

	def uuid = UUID.randomUUID().toString()
	
	WebUI.openBrowser('')
	
	WebUI.navigateToUrl('https://doanccdnc.herokuapp.com/')
	
	WebUI.setText(findTestObject('Object Repository/Page_Mattermost1/input_All team communication in one place, _dcc84b (2)'), 
	    'sang517119')
	
	WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost1/input_All team communication in one place, _a3edc6 (2)'), 
	    'vUvz7GjrNAzvejq/0Nt9cQ==')
	
	WebUI.click(findTestObject('Object Repository/Page_Mattermost1/span_Sign in (2)'))
	if(WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mattermost1/label_Enter a valid email or username andor_ef8acb'),
		0) == true) {
	
	}else {

	
	WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/span_ (1)'))
	
	WebUI.setText(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/input_Name_newChannelName'), findTestData(
	        'craete-public-channels').getValue('Name', row) + uuid)
	
	WebUI.setText(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/textarea_channel'), findTestData('craete-public-channels').getValue(
	        'Purpose', row) + uuid)
	
	WebUI.setText(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/textarea_channel_1'), findTestData('craete-public-channels').getValue(
	        'Header', row) + uuid)
	
	WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/span_Create Channel'))
	
	WebUI.setText(findTestObject('Object Repository/Page_channels - team9 Mattermost/textarea_Hi channel'), 'Hi channels')
	
	WebUI.closeBrowser()
	}
}
