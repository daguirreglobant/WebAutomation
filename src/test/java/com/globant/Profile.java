package com.globant;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Profile {

    @BeforeClass
    public void checkLoggedIn(){
        System.out.println("Check if im logged in");
    }

    @Test
    public void goToProfile(){
        System.out.println("Check (test) if im going to my profile page");
    }

    @Test
    public void editProfile(){
        System.out.println("Check (test) if I can edit my profile");
    }

    @Test
    public void changeProfilePhoto(){
        System.out.println("Check (test) if I can change my profile photo");
    }

}
