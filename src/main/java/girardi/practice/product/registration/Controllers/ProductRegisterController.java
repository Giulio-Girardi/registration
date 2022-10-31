package girardi.practice.product.registration.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product-register/v1")
public class ProductRegisterController {


    @PostMapping("/product")
    public void saveProduct(){

    }

    @GetMapping("/product")
    public void getProduct(){

    }

    @PutMapping("/update-product")
    public void updateProduct(){

    }

    @DeleteMapping("/delete-product")
    public void deleteProduct(){

    }

}
