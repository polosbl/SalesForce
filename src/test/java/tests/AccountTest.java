package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest {

    @Test
    public void createAccountTest() {
        loginPage
                .openPage(LOGIN_URL)
                .login(LOGIN, PASSWORD);
        newAccountModalPage
                .openPage(ACCOUNT_CREATION_MODAL_URL)
                .createAccount("Account 1", "www.tut.by", "Customer", "Apparel", "Save");
        accountListPage
                .openPage(ACCOUNTS_LIST_URL);
        Assert.assertEquals(accountListPage.getAccountNameFromRowNumber("1"), "Account 1");
    }

    //TODO: Implement Page Factory (java.lang.NullPointerException)
    @Test
    public void createAccountPageFactoryTest() {
        loginPage
                .openPage(LOGIN_URL)
                .loginPageFactory(LOGIN, PASSWORD);
        newAccountModalPage
                .openPage(ACCOUNT_CREATION_MODAL_URL)
                .createAccount("Account 1", "www.tut.by", "Customer", "Apparel", "Save");
        accountListPage
                .openPage(ACCOUNTS_LIST_URL);
        Assert.assertEquals(accountListPage.getAccountNameFromRowNumber("1"), "Account 1");
    }
}
