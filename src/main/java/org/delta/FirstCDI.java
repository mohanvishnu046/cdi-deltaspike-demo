package org.delta;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FirstCDI {
    public String sayHello(){
        return "Saying Hello from CDI app ";
    }

}
