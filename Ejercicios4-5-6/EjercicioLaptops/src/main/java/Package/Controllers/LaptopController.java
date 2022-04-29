package Package.Controllers;

import Package.Entities.Laptop;
import Package.Repositories.LaptopRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor @Getter @Setter
public class LaptopController {

    private LaptopRepository laptopRepository;

    //Find all laptops and return laptops list
    @GetMapping("/api/laptops")
    public List<Laptop> findAllLaptops(){
        return laptopRepository.findAll();
    }

    //Find laptop by ID
    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findLaptopById(@PathVariable Long id){

        Optional<Laptop> laptopOption = laptopRepository.findById(id);

        if(laptopOption.isPresent()){
            return ResponseEntity.ok(laptopOption.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    //Receive a laptop object in JSON format from Postman
    @PostMapping("/api/laptops")
    public Laptop createLaptop(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }

}
