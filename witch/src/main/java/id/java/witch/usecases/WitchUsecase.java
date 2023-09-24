package id.java.witch.usecases;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import id.java.witch.models.Person;

@Component
public class WitchUsecase{

    HashMap<Integer, Integer> prima = new HashMap<>();

    public void generatePrima(){

        prima.put(1, 1);
        int urut = 1;

        for (int i=2; i<=100; i++)
        {
            int Check=0;
            for (int j=1; j<=i; j++)
            {
                if (i%j==0)
                {
                    Check = Check+1;
                }
            }
            if (Check==2)
            { 
                urut++;
                prima.put(urut, i);
            }
        }

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
            int prima = Prima(jeda);
            res = res + prima;
        }
        
        res = res/size;
        return res;

    }

    public int Prima(int nourut){

        return prima.get(nourut);
    }
}
