package org.delta;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
//        Injector injector = Guice.createInjector(new AppModule());
//        UserService userService = injector.getInstance(UserService.class);
//        userService.sayHello();
//        userService.createUser("Alice");
//            User alice = userService.getUserByName("Alice");
//            System.out.println("User fetched: " + alice.getName());
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            UserService userService = container.select(UserService.class).get();

            userService.sayHello();
            userService.createUser("Alice");

            User alice = userService.getUserByName("Alice");
            System.out.println("User fetched: " + alice.getName());
        }
    }
}


//public class Main {
//    public static void main(String[] args) {
//        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
//            UserService userService = container.select(UserService.class).get();
//            System.out.println(userService);
//        }

//        Weld weld = new Weld();
//        try (WeldContainer container = weld.initialize()) {
//            UserService userService = container.select(UserService.class).get();
//            userService.createUser("Alice");
//
//            User alice = userService.getUserByName("Alice");
//            System.out.println("User fetched: " + alice.getName());
//        }
//    }
//}
class Mainq {
    public static void main(String[] args) {
        SeContainer container = SeContainerInitializer.newInstance().initialize();

        UserService userService = container.select(UserService.class).get();
        userService.createUser("Alice");

        User alice = userService.getUserByName("Alice");
        System.out.println("User fetched: " + alice.getName());

        container.close();
    }
}


