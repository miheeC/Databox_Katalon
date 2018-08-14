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

WebUI.setText(findTestObject('Object Repository/Test Test/Page_Databox/input_email (1)'), '(\'Object Repository/CreateUser/Page_Databox/a_Send invitation\'))')

WebUI.click(findTestObject('Object Repository/Test Test/Page_Databox/div_Sign in with Google (1)'))

WebUI.setText(findTestObject('Object Repository/Test Test/Page_Databox/input_email (1)'), 'mihael+katalontest@databox.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test Test/Page_Databox/input_password (1)'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Test Test/Page_Databox/button_Sign in (1)'))

WebUI.click(findTestObject('Object Repository/Test Test/Page_Databox/span_Goals (1)'))

WebUI.click(findTestObject('Object Repository/Test Test/Page_Databox/span_Databoards (1)'))

WebUI.click(findTestObject('Object Repository/Test Test/Page_Databox/a_Goals'))

WebUI.click(findTestObject('Object Repository/Test Test/Page_Databox/a_Databoards'))

