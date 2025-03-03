package com.kaua.first_string_app.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.kaua.first_string_app.entities.User;
import com.kaua.first_string_app.repositories.UserRepository;

@Configuration
@Profile("test") // deve ser igual ao nome colocado no profile no app-test.properties
// rodanod a config somente no perfil de teste
public class TestConfig implements CommandLineRunner {

    // mecanismo de injeçao de dependencia implicito
    // testConfig irá depender de user repository

    // com essa annotation essa dependência será resolvida.
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Maria Brown", "maria@gmail.com", "9888888888", "123456");
        User user2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        // save all deve se passar uma lista como argumento.
        userRepository.saveAll(Arrays.asList(user1, user2));
    }

}
