package com.infoshare.task2;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by marcinpankowski on 28.08.16.
 */
public class UserTest {

    @Test
    public void testUserNameLimit(){
        User user = new User();
        user.setId(100);
        user.setName("Jan");

        assertThat(user.getId(), is(100));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserSurnameLimit(){
        User user = new User();
        user.setSurname("sdfsdfsdfgsdfgsdfgsdfgsdfgsdfgsdfgsdfgsdfgsdfgsdfgsdfgsdfgsdfgsgdfg");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserBirthDate(){
        User user = new User();
        user.setDeteOfBirth(LocalDate.of(1100,1,1));
    }
}