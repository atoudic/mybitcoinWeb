package fr.bitcoinerie.domain;

import fr.bitcoinerie.web.domain.MyUser;
import org.junit.Assert;
import org.junit.Test;

public class MyUserTest {

    @Test
    public void fullname() {
        MyUser myuser = new MyUser("John", "Doe");

        Assert.assertEquals(myuser.getPrenom(), "John");
        Assert.assertEquals(myuser.getNom(), "Doe");
    }
}
