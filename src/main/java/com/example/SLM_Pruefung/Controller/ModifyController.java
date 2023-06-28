package com.example.SLM_Pruefung.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SLM_Pruefung.*;

@RestController
@RequestMapping("/api")
public class ModifyController {

    @GetMapping("/modify")
    public String modifyString(String string){
        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);

            if (i % 2 == 1) {
                currentChar = Character.toUpperCase(currentChar);
            }

            modifiedString.append(currentChar);
        }

        return modifiedString.toString();
    }
}
