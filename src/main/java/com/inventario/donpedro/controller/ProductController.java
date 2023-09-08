package com.inventario.donpedro.controller;

import com.inventario.donpedro.controller.dto.ProductDTO;
import com.inventario.donpedro.logic.InventoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final InventoryManager inventoryManager;

    @Autowired
    public ProductController(InventoryManager inventoryManager) {
        this.inventoryManager = inventoryManager;
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        List<ProductDTO> products = inventoryManager.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable int id) {
        ProductDTO product = inventoryManager.getProductById(id);
        if (product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO) {
        ProductDTO createdProduct = inventoryManager.createProduct(productDTO);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDTO> updateProduct(@PathVariable int id, @RequestBody ProductDTO updatedProductDTO) {
        updatedProductDTO.setId(id);
        ProductDTO updatedProduct = inventoryManager.updateProduct(updatedProductDTO);
        if (updatedProduct != null) {
            return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int id) {
        boolean deleted = inventoryManager.deleteProduct(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
