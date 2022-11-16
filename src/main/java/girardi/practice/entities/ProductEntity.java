package girardi.practice.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_product", nullable = false)
    private String name;

    @Column(name = "value_product", nullable = false)
    private BigDecimal value;

    @Column(name = "quantity_product", nullable = false)
    private Long quantity;

    @Column(name = "details_product")
    private String details;


}
