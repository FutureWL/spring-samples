package io.github.futurewl.repository;

import io.github.futurewl.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void hello() {
        // User user = userRepository.findFirstByOrderByUsernameAsc();
        User user = userRepository.findTopByOrderByUsernameDesc();
        System.out.println(user);
    }

}