package com.example.lab7;
import com.google.errorprone.annotations.*;

import static com.google.common.truth.Truth.*;
import org.junit.Test;

public class MainActivityTest {
    //create one JUnit test here
    @Test
    public void firstNameOfTest() {
        String firstname = "user";
        String real = MainActivity.getUsername();
        assertThat(firstname).isEqualTo(real);
    }

    @Test
    public void lastNameOfTest() {
        String lastname = "test";
        String real = MainActivity.getLastname();
        assertThat(lastname).isEqualTo(real);

    }
    @Test
    public void passwordOfTest() {
        String password = "admin";
        String real = MainActivity.getPassword();
        assertThat(password).isEqualTo(real);
    }

    @Test
    public void emailOfTest() {
        String email = "email@gmail.com";
        String real = MainActivity.getEmailID();
        assertThat(email).isEqualTo(real);

    }

}
