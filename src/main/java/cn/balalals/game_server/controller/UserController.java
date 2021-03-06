package cn.balalals.game_server.controller;

import cn.balalals.game_server.domain.MyUser;
import cn.balalals.game_server.domain.MyUserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final MyUserRepository myUserRepository;

    UserController(MyUserRepository myUserRepository) {
        this.myUserRepository = myUserRepository;
    }
    @GetMapping
    List<MyUser> getAllUsers() {
        return myUserRepository.findAll();
    }
    @PostMapping
    void createUser() {
        MyUser myUser = new MyUser();
        myUserRepository.save(myUser);
    }
}
