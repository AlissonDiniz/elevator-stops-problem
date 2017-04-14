/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevatorstopsproblem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alisson Diniz
 */
public class Trip {

    private final List<Passenger> passengers;

    public Trip() {
        this.passengers = new ArrayList<>();
    }

    public int getWeight() {
        int weight = 0;
        for(Passenger p: this.passengers){
            weight += p.getWeight();
        }
        return weight;
    }
    
    public List<Passenger> getPassengers() {
        return passengers;
    }

}
