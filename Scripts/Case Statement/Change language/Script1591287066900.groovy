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

WebUI.callTestCase(findTestCase('Test Cases/Data Type/Login user accounts'), [('username') : username, ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Change email/button_hambugerMenu'));

WebUI.click(findTestObject('Object Repository/Change fullname/button_Account Settings'))

String lang = language;

WebUI.click(findTestObject('Object Repository/Change language/button_Display'))
WebUI.click(findTestObject('Object Repository/Change language/button_EditLanguage'))
WebUI.click(findTestObject('Object Repository/Change language/div_English'))


switch(lang){
	case 'Nederlands (Alpha)':
	WebUI.setText(findTestObject('Object Repository/Change language/div_enterLanguage'),'Nederlands (Alpha)')
	break;
	case '한국어 (Alpha)':
	WebUI.setText(findTestObject('Object Repository/Change language/div_enterLanguage'),'한국어 (Alpha)')
	break;
	case 'Pусский (Alpha)':
	WebUI.setText(findTestObject('Object Repository/Change language/div_enterLanguage'),'Pусский (Alpha)')
	break;
	default:
	WebUI.setText(findTestObject('Object Repository/Change language/div_enterLanguage'),'English')
}

//WebUI.sendKeys(findTestObject('Object Repository/Change language/div_enterLanguage'), Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Object Repository/Change language/button_Save'))
