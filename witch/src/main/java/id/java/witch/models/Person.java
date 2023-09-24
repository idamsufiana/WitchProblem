package id.java.witch.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Person{

    @JsonProperty("People")
    private List<People> data;


    @Data
    public static class People{
        @JsonProperty("Age Of Death")
        private Integer AgeOfDeath;
        @JsonProperty("Year Of Death")
        private Integer YearOfDeath;
    }
    

}

