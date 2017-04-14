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
public class StopsProblem {

    private final int[] peopleWeightArray;
    private final int[] targetFloorArray;
    private final int floors;
    private final int maximunCapacity;
    private final int weightLimit;

    private final int anwser;

    public StopsProblem(int[] peopleWeightArray, int[] targetFloorArray, int floors, int maximunCapacity, int weightLimit, int anwser) {
        this.peopleWeightArray = peopleWeightArray;
        this.targetFloorArray = targetFloorArray;
        this.floors = floors;
        this.maximunCapacity = maximunCapacity;
        this.weightLimit = weightLimit;
        this.anwser = anwser;
    }

    public int[] getPeopleWeightArray() {
        return peopleWeightArray;
    }

    public int[] getTargetFloorArray() {
        return targetFloorArray;
    }

    public int getFloors() {
        return floors;
    }

    public int getMaximunCapacity() {
        return maximunCapacity;
    }

    public int getWeightLimit() {
        return weightLimit;
    }

    public int getAnwser() {
        return anwser;
    }

}
