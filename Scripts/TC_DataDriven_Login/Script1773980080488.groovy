import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com')

WebUI.click(findTestObject('Page_CURA/btn_MakeAppointment'))

WebUI.setText(findTestObject('Page_CURA/txt_Username'), username)
WebUI.setText(findTestObject('Page_CURA/txt_Password'), password)

WebUI.click(findTestObject('Page_CURA/btn_Login'))

if (expected_result == 'success') {
    WebUI.verifyElementPresent(findTestObject('Page_CURA/h2_MakeAppointment'), 10)
} else {
    WebUI.verifyElementPresent(findTestObject('Page_CURA/txt_LoginFailed'), 10)
}

WebUI.closeBrowser()