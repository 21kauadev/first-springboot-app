package com.kaua.first_string_app.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaua.first_string_app.entities.User;

// camada de recursos -> os controllers rest

@RestController
@RequestMapping(value = "/users") // rota
public class UserResource {

    // ResponseEntity -> tipo específico do Spring pra retornar respostas de
    // requisições WEB.

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Maria", "maria@gmail.com", "99999999", "12345");

        // ok -> método indica que tá tudo certo
        // body -> corpo da requisição sendo passado o objeto user
        return ResponseEntity.ok().body(user);
    }
}
