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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://doanccdnc.herokuapp.com/login')

WebUI.callTestCase(findTestCase('Internal/Login succeed'), [('username') : username, ('password') : password], FailureHandling.STOP_ON_FAILURE)

if (username.length() > 12) {
    WebUI.click(findTestObject('Object Repository/Time format 12/button_abcd_style--none sidebar-header-drop_b74a95'))

    WebUI.click(findTestObject('Object Repository/Time format 12/button_Account Settings'))

    WebUI.click(findTestObject('Object Repository/Time format 12/button_Display'))

    WebUI.click(findTestObject('Object Repository/Time format 12/span_12-hour clock (example 400 PM)'))

    WebUI.click(findTestObject('Object Repository/Time format 12/label_24-hour clock (example 1600)'))

    WebUI.click(findTestObject('Object Repository/Time format 12/button_Save'))
}

