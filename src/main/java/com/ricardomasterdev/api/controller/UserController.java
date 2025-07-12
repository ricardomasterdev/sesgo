package com.ricardomasterdev.api.controller;

import com.ricardomasterdev.api.entity.User;
import com.ricardomasterdev.api.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public User criar(@RequestBody User user) {
        return service.salvar(user);
    }

    @GetMapping
    public List<User> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public User buscar(@PathVariable("id") Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public User atualizar(@PathVariable("id") Long id, @RequestBody User user) {
        return service.atualizar(id, user);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Long id) {
        service.deletar(id);
    }
}
