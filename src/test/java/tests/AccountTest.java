package tests;

import objects.Account;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest {

    @Test
    public void createAccountTest() {
        //create account precondition
        Account account = new Account(
                "Account 1",
                "www.tut.by",
                "Customer",
                "Apparel",
                "Save",
                "test 1",
                "111");
        loginPage
                .openPage(LOGIN_URL)
                .login(LOGIN, PASSWORD);
        newAccountModalPage
                .openPage(ACCOUNT_CREATION_MODAL_URL)
                .createAccount(account);
        accountListPage
                .openPage(ACCOUNTS_LIST_URL);
        Assert.assertEquals(accountListPage.getAccountNameFromRowNumber("1"), "Account 1");
    }
}
