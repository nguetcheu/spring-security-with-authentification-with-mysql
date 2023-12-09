package com.openclassrooms.SpringSecurityAuth.Repository;

import com.openclassrooms.SpringSecurityAuth.Model.DBUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBUserRepository extends JpaRepository<DBUser, Integer> {
    public DBUser findByUsername(String username);
}
