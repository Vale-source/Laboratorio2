package com.example.LogsHTTP;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rutas {

    @GetMapping("/ruta")
    String Ruta1(){
        return "Mensaje de Spring Controller";
    }
}
