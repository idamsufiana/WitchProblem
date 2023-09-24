package id.java.witch.Usecases;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import id.java.witch.models.Person;
import id.java.witch.models.Person.People;
import id.java.witch.usecases.WitchUsecase;


@RunWith(SpringRunner.class)
@SpringBootTest
class WitchUsecaseTest {

    @Autowired
    WitchUsecase witchUsecase;

    
    People orang = new People();
    List<People> list = new ArrayList<>();

    @Test
    void encodeRequestBody() throws ParseException {
        orang.setAgeOfDeath(10);
        orang.setYearOfDeath(12);
        list.add(0, orang);
        orang.setAgeOfDeath(14);
        orang.setYearOfDeath(17);
        list.add(1, orang);
        Person request = new Person();
        request.setData(list);

        Double hasilTest = witchUsecase.rataRata(request);
        Assert.assertEquals(4.5, hasilTest, 0);
    }



    
}
