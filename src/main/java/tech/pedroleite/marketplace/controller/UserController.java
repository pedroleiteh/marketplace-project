package tech.pedroleite.marketplace.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.pedroleite.marketplace.domain.User;

@RestController
@RequestMapping(value = "users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Pedro", "119391931", "pedro@mail.com", "123456");
        return ResponseEntity.ok(u);
    }
}
