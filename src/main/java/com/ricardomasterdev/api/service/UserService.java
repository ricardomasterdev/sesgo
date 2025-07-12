package com.ricardomasterdev.api.service;

import com.ricardomasterdev.api.entity.User;
import com.ricardomasterdev.api.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User salvar(User user) {
        return repo.save(user);
    }

    public List<User> listar() {
        return repo.findAll();
    }

    public User buscarPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    public User atualizar(Long id, User user) {
        user.setId(id);
        return repo.save(user);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}
