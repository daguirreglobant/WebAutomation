package com.globant;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Friend {
    @BeforeClass
    public void checkLoggedIn(){
        System.out.println("Check if Im logged in");
    }

    @BeforeClass
    public void checkMyProfile(){
        System.out.println("Check if Im in my Profile");
    }

    @Test
    public void goToFriends(){
        System.out.println("Check (test) if Im going to my friends");
    }

    @Test
    public void selectFriend(){
        System.out.println("Check (test) if I can select a friend");
    }

    @Test
    public void deleteFriend(){
        System.out.println("Check (test) if I can delete a friend");
    }
}
