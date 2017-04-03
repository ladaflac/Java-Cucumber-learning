package com.javafortesters.domainentities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lada on 10.4.2016.
 *
 * proba za git 2.4.2017. 
 */
public class UserTest {

    @Test
    public void canConstructANewUser() {
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();
        assertEquals("default username expected","username",user.getUsername());
        assertEquals("default password expected","password",user.getPassword());
    }
}
