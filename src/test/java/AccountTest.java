import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountTest {

    @Test
    public void validNameReturnsTrue() {
        Account account = new Account("Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void nameTooShortReturnsFalse() {
        Account account = new Account("A B");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void nameTooLongReturnsFalse() {
        Account account = new Account("ИмяФамилияОченьДлинное");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void nameWithoutSpaceReturnsFalse() {
        Account account = new Account("ТимотиШаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void nameWithSpaceAtStartReturnsFalse() {
        Account account = new Account(" Тимоти Шаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void nameWithSpaceAtEndReturnsFalse() {
        Account account = new Account("Тимоти Шаламе ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void nameWithMultipleSpacesReturnsFalse() {
        Account account = new Account("Тимоти Андерсон Шаламе");
        assertFalse(account.checkNameToEmboss());
    }

}