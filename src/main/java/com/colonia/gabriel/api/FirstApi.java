package com.colonia.gabriel.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colonia.gabriel.model.Celular;

@RestController
public class FirstApi {
    @GetMapping("/api/produto") 
    public Celular getCelular() {
        return new Celular(1,"Motorola",1394.48f);
    }

    @GetMapping("/api/produtos")
    public List<Celular> getCelulares() {
        return Arrays.asList(
            new Celular(2, "Apple", 999.98f),
            new Celular(3, "Xiaomi", 897.34f)
        );
    }


}
