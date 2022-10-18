package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBOperationRunner implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    public DBOperationRunner() {
    }

    @Override
    public void run(String... args) throws Exception {
        Role ROLE_USER=new Role();
        ROLE_USER.setName(ERole.ROLE_USER);
        Role ROLE_MODERATOR=new Role();
        ROLE_MODERATOR.setName(ERole.ROLE_MODERATOR);
        Role ROLE_ADMIN=new Role();
        ROLE_ADMIN.setName(ERole.ROLE_ADMIN);
        roleRepository.save(ROLE_ADMIN);
        roleRepository.save(ROLE_USER);
        roleRepository.save(ROLE_MODERATOR);
    }
}
