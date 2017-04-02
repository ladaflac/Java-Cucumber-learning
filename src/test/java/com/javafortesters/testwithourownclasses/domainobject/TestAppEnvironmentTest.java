package com.javafortesters.testwithourownclasses.domainobject;

import com.javafortesters.domainobject.environment.TestAppEnv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lada on 20.3.2016.
 */
public class TestAppEnvironmentTest {
    @Test
    public void canGetUrlStatically(){
        assertEquals("Returns Hard Coded URL",
                "http://192.123.0.3:67",
                TestAppEnv.getUrl());
    }
    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Returns domain", "192.123.0.3", TestAppEnv.DOMAIN);
        assertEquals("Returns port", "67", TestAppEnv.PORT);
    }
    }
