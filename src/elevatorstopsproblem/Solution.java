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
public class Solution {
    
    private final StopsProblem problem;

    public Solution(StopsProblem problem) {
        this.problem = problem;
    }
    
    public int run(){
        Queue queue = new Queue(this.problem.getPeopleWeightArray(), this.problem.getTargetFloorArray());
        Elevator elevator = new Elevator(this.problem.getMaximunCapacity(), this.problem.getWeightLimit());
        return elevator.stopsToQueue(queue);
    }
    
}
