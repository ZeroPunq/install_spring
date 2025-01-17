package org.example.instalacion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
    @GetMapping("/Hola")
    public static String hola() {
        return "<h1>Hola Mundo</h1>";
    }
}
