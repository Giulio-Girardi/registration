package girardi.practice.services;

import girardi.practice.entities.ProductEntity;
import girardi.practice.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public Optional<ProductEntity> saveProduct(ProductEntity productEntity) {
        return Optional.ofNullable(productRepository.save(productEntity));
    }


}
