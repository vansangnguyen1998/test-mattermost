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

for (def row = 1; row <= (findTestData('login-account').getRowNumbers() - 1); row++) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://doanccdnc.herokuapp.com/')

    WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b (7)'), 
        findTestData('updateProfile').getValue(1, row))

    WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6 (7)'), 
        findTestData('updateProfile').getValue(2, row))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6 (7)'), 
        Keys.chord(Keys.ENTER))
	if(WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mattermost/label_Enter a valid email or username andor_ef8acb'),
		0) == true) {
	
	}else {
    WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/button_sang517119_style--none sidebar-heade_79aa2d (1)'))

    WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/button_Account Settings (1)'))

    WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/button_Edit'))

    WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/div_First Name'))

    WebUI.setText(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/input_First Name_firstName (1)'), 
        findTestData('updateProfile').getValue(3, row))

    WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/div_First NameLast NameBy default, you will_1bec8f'))

    WebUI.setText(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/input_Last Name_lastName (1)'), 
        findTestData('updateProfile').getValue(4, row))

    WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/button_Save (1)'))

    WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/button_Edit_1'))

    WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/section_NicknameNicknameUse Nickname for a _f8f908'))

    WebUI.setText(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/input_Nickname_nickname (1)'), findTestData(
            'updateProfile').getValue(5, row))

    WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/button_Save (1)'))

    WebUI.click(findTestObject('Object Repository/Page_Town Square - team9 Mattermost/span_ (5)'))

    WebUI.closeBrowser()
	}
}

