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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.prodURL)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/Logo_hp'), 0)

WebUI.click(findTestObject('DemoObjects/HomePage/span_Iniciar sesin_hp'))

WebUI.delay(4)

WebUI.setText(findTestObject('DemoObjects/HomePage/input_Correo electrnico_username_login'), 'sudha.addepalli6662@gmail.com')

WebUI.setEncryptedText(findTestObject('DemoObjects/HomePage/input_Contrasea_password_login'), 'R2dZ4hvJ2uivgdeNE3/vtQ==')

WebUI.click(findTestObject('DemoObjects/HomePage/button_Iniciar sesin_login'))

WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/span_HolaUser_hp'), 0)

WebUI.closeBrowser()

