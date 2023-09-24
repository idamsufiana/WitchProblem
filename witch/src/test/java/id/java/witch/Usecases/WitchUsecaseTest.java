package id.java.witch.Usecases;

import java.util.ArrayList;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import id.java.witch.models.Person;
import id.java.witch.models.Person.People;
import id.java.witch.usecases.WitchUsecase;


@SpringBootTest
@EnabledOnOs({OS.WINDOWS})
class WitchUsecaseTest {

    @Autowired
    WitchUsecase witchUsecase;
    Person request = new Person();

    @Test
    void Hitung(){
        request.setData(
                new ArrayList<People>() {{
                    add(new People().setAgeOfDeath(10).setYearOfDeath(12));
                    add(new People().setAgeOfDeath(13).setYearOfDeath(17));
                }}
        );
        Assertions.assertEquals(4.5, witchUsecase.rataRata(request), 0);
    }



    
}
