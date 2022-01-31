package com.example.HelloWorld;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class Randomizer {
    public String detectMotherfucker(String name) {
        int hash = Objects.hash(name);
        if (hash % 3 == 0) {
            return "Sorry, " + name + " but you are motherfucker :(";
        }
        else {
            return "Congratulations! " + "You aren't motherfucker, " + name + "! ^_^\nYou are pidor";
        }
    }
}
