/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevatorstopsproblem;

/**
 *
 * @author Alisson Diniz
 */
public class Passenger {

    private final int weight;
    private final int target;

    public Passenger(int weight, int target) {
        this.weight = weight;
        this.target = target;
    }

    public int getWeight() {
        return weight;
    }

    public int getTarget() {
        return target;
    }

}
