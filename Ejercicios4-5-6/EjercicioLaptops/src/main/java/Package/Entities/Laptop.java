package Package.Entities;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "laptops")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Laptop {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private Double price;
    private Boolean warranty;

}
