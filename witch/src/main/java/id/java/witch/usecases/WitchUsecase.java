package id.java.witch.usecases;

import org.springframework.stereotype.Component;

import id.java.witch.models.Person;

@Component
public class WitchUsecase{


    public int sumFibonacci(int n){

        int a = 0, b = 0, sumf = 1;
        if (n <= 0)
          sumf = 0;
        int curr = 1;
        for(int i = 1; i < n; i++){
            a = b;
            b = curr;
            curr = a+b;
            sumf += curr;
        }
        return sumf;
    }
    

    public Double rataRata (Person person){

        int size = person.getPeople().size();
        int jeda = 0;
        Double res = 0.0;
        

        for(int i=0; i<size; i++){
            jeda = person.getPeople().get(i).getYearOfDeath() - person.getPeople().get(i).getAgeOfDeath();
            // find prima number + 1
            if(jeda<0){
                return res = -1*0.0;
            }
            int fibo = sumFibonacci(jeda);
            res = res + fibo;
        }
        
        res = res/size;
        return res;

    }

}
