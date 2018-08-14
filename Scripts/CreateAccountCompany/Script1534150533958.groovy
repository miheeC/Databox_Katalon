import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app.databox.com/')

WebUI.click(findTestObject('Object Repository/CreateAccountCompany/Page_Databox/a_Sign up'))

WebUI.setText(findTestObject('Object Repository/CreateAccountCompany/Page_Databox  Create Account  Get S/input_name'), 'Katalon Name Test')

WebUI.setText(findTestObject('Object Repository/CreateAccountCompany/Page_Databox  Create Account  Get S/input_email'), 
    'mihael+katalontest@databox.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateAccountCompany/Page_Databox  Create Account  Get S/input_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Object Repository/CreateAccountCompany/Page_Databox  Create Account  Get S/input_company'), 
    'Test Company Name Katalon')

WebUI.click(findTestObject('Object Repository/CreateAccountCompany/Page_Databox  Create Account  Get S/span_Create your Account'))

WebUI.click(findTestObject('Object Repository/CreateAccountCompany/Page_Databox  Create Account  Get S/label_Company Account'))

WebUI.click(findTestObject('Object Repository/CreateAccountCompany/Page_Databox  Create Account  Get S/button_Continue'))

WebUI.click(findTestObject('Object Repository/CreateAccountCompany/Page_Databox/a_I want to skip the onboardin'))

