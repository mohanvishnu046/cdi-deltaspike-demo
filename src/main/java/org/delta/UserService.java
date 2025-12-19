package org.delta;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import org.springframework.stereotype.Service;

@ApplicationScoped
//@RequestScoped
//@Service
public class UserService {

    @Inject
    private UserRepository userRepository;

//    @Inject  // Guice will inject the dependency
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
    public void sayHello() {
        System.out.println("Hello from Guice UserService");
    }
    public void createUser(String name) {
        User user = new User();
        user.setName(name);
        userRepository.save(user);  // Transaction is handled automatically
    }

    public User getUserByName(String name) {
        return userRepository.findByName(name);
    }
}
