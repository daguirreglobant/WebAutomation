package com.globant;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class Session {
    @BeforeSuite
    public void checkURL(){
        System.out.println("Check if I'm in FB");
    }

    @BeforeClass
    public void CheckPreviousLogin(){
        System.out.println("Check if Im not already logged in");
    }

    @Test
    public void Login(){
        System.out.println("Checked (test) of log in");
    }

    @Test
    public void Logout(){
        System.out.println("Checked (test) of log out");
    }
}
