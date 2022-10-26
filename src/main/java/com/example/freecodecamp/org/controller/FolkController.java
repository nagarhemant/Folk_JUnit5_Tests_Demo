package com.example.freecodecamp.org.controller;

import com.example.freecodecamp.org.entity.Folk;
import com.example.freecodecamp.org.service.FolkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/folks")
public class FolkController {

    @Autowired
    private FolkService service;

    @PostMapping("add_folk")
    public Folk addFolk(@RequestBody Folk folk){
        return service.addFolk(folk);
    }
    @GetMapping("get_folk")
    public List<Folk>getAll(){
        return service.getAll();

    }
    @PutMapping("update_folk")
    public Folk update(@RequestParam String name,@RequestParam Integer id){
        return service.update("Kamesh Varun",3);
    }
    @DeleteMapping("delete_folk/{id}")
    public String delete(@PathVariable Integer id){
        return service.delete(4);
    }




}
