package com.hoaxify.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//    List<User> findByUsernameContaining(String username);
//    User findByUsernameAndDisplayName(String username, String displayName);
    User findByUsername(String username);

}
