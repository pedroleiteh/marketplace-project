package tech.pedroleite.marketplace.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import tech.pedroleite.marketplace.domain.User;
import tech.pedroleite.marketplace.repository.UserRepository;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Alex Poatan Pereira", "poatan@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Carlos Prates", "prates@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
