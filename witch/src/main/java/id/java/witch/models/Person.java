package id.java.witch.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Person{

    @JsonProperty("People")
    private List<People> data;


    @Data
    @Accessors(chain = true)
    public static class People{
        @JsonProperty("Age Of Death")
        private Integer AgeOfDeath;
        @JsonProperty("Year Of Death")
        private Integer YearOfDeath;
    }
    

}

