package id.java.witch.usecases;

import org.springframework.stereotype.Component;

import id.java.witch.models.Person;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
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
    

    public Double rataRata (Person request){

        int size = request.getData().size();
        int jeda = 0;
        Double res = 0.0;

        try{

            for(int i=0; i<size; i++){
            jeda = request.getData().get(i).getYearOfDeath() - request.getData().get(i).getAgeOfDeath();
            // find prima number + 1
            if(jeda<0){
                return res = -1.0;
            }
            int fibo = sumFibonacci(jeda);
            res = res + fibo;
            }
        
        res = res/size;

        }catch(ArithmeticException e){
            log.info("Specific Exception "+e);
            
        }catch(Exception e){
            log.info("Exception occurred");
        }

        return res;

    }

}
