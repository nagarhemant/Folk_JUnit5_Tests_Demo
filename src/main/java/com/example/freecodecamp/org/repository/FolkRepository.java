package com.example.freecodecamp.org.repository;

import com.example.freecodecamp.org.entity.Folk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolkRepository extends JpaRepository<Folk, Integer> {

}
