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

WebUI.click(findTestObject('Object Repository/CreateUser/Page_Databox/a_KN        Account'))

WebUI.click(findTestObject('Object Repository/CreateUser/Page_Databox/a_User Management'))

WebUI.click(findTestObject('Object Repository/CreateUser/Page_Databox/a_New user'))

WebUI.setText(findTestObject('Object Repository/CreateUser/Page_Databox/input_name'), 'user 2')

WebUI.setText(findTestObject('CreateUser/Page_Databox/input_email'), 'mihael+user2katalon@databox.com')

WebUI.click(findTestObject('Object Repository/CreateUser/Page_Databox/a_Send invitation'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CreateUser/Page_Databox/strong_User 2'), 10)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/CreateUser/Page_Databox/span_icon icon-databox-logo'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CreateUser/Page_Databox/strong_Start here to create yo'), 10)

