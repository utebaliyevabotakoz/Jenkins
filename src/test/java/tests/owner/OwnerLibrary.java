package tests.owner;

import config.WebDriverProvider;
import org.junit.Before;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OwnerLibrary {

    @Before
    static void before() {
        WebDriverProvider.config();
      }

    @Test
    @Tag("owner")
    void test1() {
        assertTrue(true);
    }

    @Test
    @Tag("owner")
    void test2() {
        assertTrue(true);
    }
}
