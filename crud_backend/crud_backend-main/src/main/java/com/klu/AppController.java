package com.klu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AppController {

    @Autowired
    private Service service;

    @PostMapping("/products")
    public String insertProduct(@RequestBody Product product) {
        return service.insertData(product);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return service.displayData();
    }

    @PutMapping("/products")
    public String updateProduct(@RequestBody Product product) {
        return service.updateData(product);
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteData(id);
    }
}
