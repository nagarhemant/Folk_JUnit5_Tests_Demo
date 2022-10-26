package com.example.freecodecamp.org;

import com.example.freecodecamp.org.controller.FolkController;
import com.example.freecodecamp.org.entity.Folk;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
public class FolkControllerTest {

    @Autowired
    FolkController folkController;

    @Test
    public void addFolkTest(){
        Folk folk=new Folk();
        assertFalse(folkController.getAll().isEmpty());

    }

    public void getFolkTest(){
        List<Folk>folks=folkController.getAll();

    }



}
