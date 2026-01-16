package dev.nidhi.productcatalogservice.controllers;

import dev.nidhi.productcatalogservice.dtos.ProductDTO;
import dev.nidhi.productcatalogservice.dtos.ProductRequestDTO;
import dev.nidhi.productcatalogservice.dtos.ProductResponseDTO;
import dev.nidhi.productcatalogservice.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    /*
    1. Create Product
    2. Get Product by ID
    3. Get all Products
     */


    /*
       Get all Products
         GET, List<Product> /products
     */
    @GetMapping("/products")
    List<ProductResponseDTO> getAllProducts(){
        System.out.println("Get all Products called");
        List<ProductResponseDTO> products = List.of(new ProductResponseDTO());
        return products;
    }

    /*
       Get Product by ID
         GET, Product /products/{id}
     */

    @GetMapping("products/{id}")
    ProductResponseDTO getProductById(@PathVariable("id") Long id){
        ProductResponseDTO product = new ProductResponseDTO();
        return product;
    }

    /*
       Create Product
         POST, Product /product
     */

    @PostMapping("/products")
    ProductResponseDTO createProduct(@RequestBody ProductRequestDTO product) {
        ProductResponseDTO productReponse = new ProductResponseDTO();
        return productReponse;
    }

}
