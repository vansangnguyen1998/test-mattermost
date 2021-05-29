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

WebUI.click(findTestObject('Object Repository/Change email/button_hambugerMenu'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - hello Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/Change Password/button_Security'))

WebUI.click(findTestObject('Object Repository/Change Password/button_Edit'))

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/input_currentPassword'), current_password)

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/input_newPassword'), new_password)

WebUI.setEncryptedText(findTestObject('Object Repository/Change Password/input_confirmPassword'), new_pwd_repeat)

WebUI.click(findTestObject('Object Repository/Change Password/button_Save'))

