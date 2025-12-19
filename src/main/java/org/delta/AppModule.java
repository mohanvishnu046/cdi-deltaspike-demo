package org.delta;

import com.google.inject.AbstractModule;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.delta.UserRepository;
import org.delta.UserService;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(UserService.class);
    }
}
