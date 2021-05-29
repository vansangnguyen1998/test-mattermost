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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Internal/Login succeed'), [('username') : username, ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Town Square - hotpink Mattermost/btn_hambergerMenu'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - hotpink Mattermost/a_Create a New Team'))

WebUI.setText(findTestObject('Page_Town Square - hotpink Mattermost/input_Team Name_teamNameInput'), new_team)

WebUI.click(findTestObject('Object Repository/Page_Town Square - hotpink Mattermost/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - hotpink Mattermost/span_Finish'))

WebUI.closeBrowser()

