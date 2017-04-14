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
public class Queue {

    private final List<Passenger> passengers;

    public Queue(int[] peopleWeightArray, int[] targetFloorArray) {
        this.passengers = new ArrayList<>();
        for (int index = 0; index < targetFloorArray.length; index++) {
            this.passengers.add(new Passenger(peopleWeightArray[index], targetFloorArray[index]));
        }
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

}
