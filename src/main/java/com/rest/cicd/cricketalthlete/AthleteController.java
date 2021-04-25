package com.rest.cicd.cricketalthlete;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AthleteController {


    @GetMapping("/athletes")
    List<Athlete> getAllAthletes() {

        List<Athlete> athletes = new ArrayList<Athlete>();

        Athlete sachin = new Athlete();
        sachin.setFirstName("Sachin");
        sachin.setLastName("Tendulkar");
        sachin.setRuns(11002);
        athletes.add(sachin);


        Athlete sourav = new Athlete();
        sourav.setFirstName("Sourav");
        sourav.setLastName("Ganguly");
        sourav.setRuns(10002);
        athletes.add(sourav);

        return athletes;
    }


}
