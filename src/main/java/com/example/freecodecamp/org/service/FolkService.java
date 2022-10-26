package com.example.freecodecamp.org.service;

import com.example.freecodecamp.org.entity.Folk;
import com.example.freecodecamp.org.repository.FolkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FolkService {

    @Autowired
    private FolkRepository repo;

    public Folk addFolk(Folk folk){
        return repo.save(folk);
    }

    public List<Folk>getAll(){
        return repo.findAll();

    }

    public Folk update(String name, Integer id){
        Folk folk=repo.findById(id).get();
        folk.setName("Kamesh Varun");
        return repo.save(folk);
    }


    public String delete(Integer id){
        repo.deleteById(id);
        return "deleted";

    }


}
