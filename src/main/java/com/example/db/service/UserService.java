/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.db.service;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.example.db.model.user.User;
import com.example.db.model.user.UserCredentialDto;
import com.example.db.model.user.UserVerificationResponseDto;
import com.example.db.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Luis
 */
@Service
public class UserService {

    UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User createUser(User user) {

        String bcryptHashPassword = BCrypt
                .withDefaults()
                .hashToString(4, user
                        .getPassword()
                        .toCharArray());
        
        user.setPassword(bcryptHashPassword);

        return repository.save(user);
    }
    
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    public UserVerificationResponseDto verifyUser(UserCredentialDto credential) {

        List<Object[]> results = repository.getUserByEmail(credential.getEmail());

        if (results.isEmpty()) {
            return new UserVerificationResponseDto(null, null, credential.getEmail(), false);
        }

        Object[] result = results.get(0);

        String storedPassword = (String) result[3];

        BCrypt.Result passResult = BCrypt
                .verifyer()
                .verify(credential
                        .getPassword()
                        .toCharArray(), storedPassword);

        return new UserVerificationResponseDto( (Long) result[0], (String) result[1], credential.getEmail(), passResult.verified);
    }

}
