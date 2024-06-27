package com.example.dependecy_injection_tutorial;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void getInfo(){
        System.out.println("User Info: Akash Tiwari, Age: 30");
    }
}
