import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl('https://www.projects.headerguru.com/eastwaymedical/book-appointment/')

WebUI.click(findTestObject('New user'))

WebUI.click(findTestObject('Appointment Date'))

WebUI.click(findTestObject('Appointment month'))

WebUI.click(findTestObject('Appointment date2'))

WebUI.click(findTestObject('Appointment time'))

WebUI.setText(findTestObject('First name'), 'Name')

WebUI.setText(findTestObject('second Name'), 'Last')

WebUI.sendKeys(findTestObject('Email Adrress'), 'chebetmadison71@gmail.com')

WebUI.sendKeys(findTestObject('phone Number'), '704 360 8893')

WebUI.click(findTestObject('Dob'))

WebUI.click(findTestObject('Dob month'))

WebUI.click(findTestObject('Dob year'))

WebUI.click(findTestObject('Dob date 2'))

WebUI.click(findTestObject('Gender'))

WebUI.click(findTestObject('Provider'))

WebUI.click(findTestObject('Reason for visit'))

WebUI.click(findTestObject('Book appointment'))

