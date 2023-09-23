package id.java.witch.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.java.witch.models.Person;
import id.java.witch.usecases.WitchUsecase;

@RestController
@RequestMapping("Witch")
public class WitchController {

    @Autowired
    WitchUsecase witchUsecase;

    @GetMapping("/Hello")
    public String Hi(){
        return "Hello";
    }

    @PostMapping("/Hitung")
    public Double Hitung(@RequestBody Person person){

        witchUsecase.generatePrima();
        return witchUsecase.rataRata(person);
    }
    
}
