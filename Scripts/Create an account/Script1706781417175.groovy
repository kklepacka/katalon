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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://prestashop-nightly-cloud.acceptance.squashtest.org/login?create_account=1')

WebUI.click(findTestObject('Object Repository/Page_Login/input_id_gender'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_firstname'), 'Dourade')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_lastname'), 'TheFish')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_email'), 'tilapia@thefish.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_password'), 'BzobWtSunYn5efi4Wgn+BA==')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_birthday'), '31/05/1970')

WebUI.click(findTestObject('Object Repository/Page_Login/input_optin'))

WebUI.click(findTestObject('Object Repository/Page_Login/input_customer_privacy'))

WebUI.click(findTestObject('Object Repository/Page_Login/input_newsletter'))

WebUI.click(findTestObject('Object Repository/Page_Login/input_psgdpr'))

WebUI.click(findTestObject('Object Repository/Page_Login/button_Enregistrer'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_PrestaShop/user_name'), 'Dourade TheFish')

WebUI.takeFullPageScreenshotAsCheckpoint('account_created')

WebUI.navigateToUrl('https://prestashop-nightly-cloud.acceptance.squashtest.org/administration/index.php?controller=AdminLogin&token=ceaaf8a997382e14db8065e2a862e5ff')

WebUI.setText(findTestObject('Object Repository/Page_PrestaShop (PrestaShop)/input_email'), 'user@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_PrestaShop (PrestaShop)/input_passwd'), 'wLrVf176BYjHVrP/dHqRyg==')

WebUI.click(findTestObject('Object Repository/Page_PrestaShop (PrestaShop)/button_Se connecter'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  PrestaShop/span_Customers'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  PrestaShop/a_Customers'))

WebUI.click(findTestObject('Object Repository/Page_Grez vos clients  PrestaShop/a_btn btn-link dropdown-toggle dropdown-tog_b028f2'))

WebUI.click(findTestObject('Object Repository/Page_Grez vos clients  PrestaShop/a_delete        Supprimer'))

WebUI.click(findTestObject('Object Repository/Page_Grez vos clients  PrestaShop/button_Supprimer'))

WebUI.closeBrowser()

