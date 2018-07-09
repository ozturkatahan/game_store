package com.example.game_store;

import com.example.game_store.Entity.User;
import com.example.game_store.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class GameStoreApplication implements CommandLineRunner {


    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(GameStoreApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if (userRepository.count() == 0) {
            User user = new User();
            user.setName("ozturkatahan");
            user.setPassword(encoder.encode("123qwe"));
            userRepository.save(user);
        }


    }

}
