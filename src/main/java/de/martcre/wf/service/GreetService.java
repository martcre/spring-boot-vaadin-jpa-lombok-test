package de.martcre.wf.service;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class GreetService implements Serializable {

    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "XOXO Hello anonymous user";
        } else {
            return "Hello xoxo 789" + name;
        }
    }

}
