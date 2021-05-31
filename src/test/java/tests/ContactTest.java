package tests;

import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    //TODO: Implement assertion
    @Test
    public void createContactTest() {
        loginPage.openPage(LOGIN_URL)
                .login(LOGIN, PASSWORD);
        newContactModalPage.openPage(CONTACT_CREATION_MODAL_URL)
                .createContact("last 1", "Acc", "Save");
    }
}
