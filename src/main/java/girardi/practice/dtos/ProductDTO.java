package girardi.practice.dtos;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Builder
@Data
public class ProductDTO {

    private static Long quantity;
    private String name;
    private BigDecimal value;
    private String details;


    public ProductDTO(String name, BigDecimal value, String details) {
        setName(name);
        setValue(value);
        setDetails(details);
        setQuantity(quantity + 1);
    }


    public static void setQuantity(Long quantity) {
        ProductDTO.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
