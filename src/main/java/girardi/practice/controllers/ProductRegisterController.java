package girardi.practice.controllers;

import girardi.practice.dtos.ProductDTO;
import girardi.practice.entities.ProductEntity;
import girardi.practice.services.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("product-register/v1")
public class ProductRegisterController {

    private ProductService productService;


    @PostMapping("/product")
    public ResponseEntity<ProductEntity> saveProduct(@RequestBody ProductDTO productDTO) {
        ProductEntity productEntity = ProductEntity.builder().build();

        BeanUtils.copyProperties(productDTO, productEntity);
        Optional<ProductEntity> optionalProductEntity = productService.saveProduct(productEntity);

        if (optionalProductEntity.isPresent()) {
            return new ResponseEntity(optionalProductEntity.get(), HttpStatus.CREATED);

        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);

    }

    @GetMapping("/product")
    public void getProduct() {

    }

    @PutMapping("/update-product")
    public void updateProduct() {

    }

    @DeleteMapping("/delete-product")
    public void deleteProduct() {

    }

}
