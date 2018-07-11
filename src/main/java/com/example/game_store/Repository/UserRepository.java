package com.example.game_store.Repository;

import com.example.game_store.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

    User findByName(String name);
}
