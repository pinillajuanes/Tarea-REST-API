package com.inventario.donpedro.logic;
import java.util.List;
import com.inventario.donpedro.controller.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class InventoryManager {

    private List<ProductDTO> products;
    private int nextProductId = 1;

    public InventoryManager() {
        products = new ArrayList<>();
    }

    public ProductDTO createProduct(ProductDTO productDTO) {
        productDTO.setId(nextProductId++);
        products.add(productDTO);
        return productDTO;
    }

    public ProductDTO getProductById(int id) {
        for (ProductDTO productDTO : products) {
            if (productDTO.getId() == id) {
                return productDTO;
            }
        }
        return null;
    }

    public List<ProductDTO> getAllProducts() {
        return products;
    }

    public ProductDTO updateProduct(ProductDTO updatedProductDTO) {
        for (int i = 0; i < products.size(); i++) {
            ProductDTO existingProductDTO = products.get(i);
            if (existingProductDTO.getId() == updatedProductDTO.getId()) {
                products.set(i, updatedProductDTO);
                return updatedProductDTO;
            }
        }
        return null;
    }

    public boolean deleteProduct(int id) {
        for (ProductDTO productDTO : products) {
            if (productDTO.getId() == id) {
                products.remove(productDTO);
                return true;
            }
        }
        return false;
    }
}