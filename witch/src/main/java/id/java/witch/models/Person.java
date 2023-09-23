package id.java.witch.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Person{

    @JsonProperty("people")
    private List<person> people;

    @Data
    public static class person {

    @JsonProperty("Age Of Death")
    private Integer AgeOfDeath;
    @JsonProperty("Year Of Death")
    private Integer YearOfDeath;
    
    }

}

