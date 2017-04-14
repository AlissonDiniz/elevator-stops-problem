/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevatorstopsproblem;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alisson Diniz
 */
public class StopsProblemTest {
    
    @Test
    public void problemDefaultTest(){
        int[] weightArray = new int[]{60,80,40};
        int[] floorArray = new int[]{2,3,5};
        //Trip1: 3, Trip2: 2 = 5
        int totalStops = 5;
        StopsProblem problem = new StopsProblem(weightArray, floorArray, 5, 2, 200, totalStops);
        Solution solution = new Solution(problem);
        assertEquals(problem.getAnwser(), solution.run());
    }
    
    @Test
    public void queueWithSameTarget(){
        int[] weightArray = new int[]{80,58,60,76,75,80,65};
        int[] floorArray = new int[]{2,2,3,5,6,6,8};
        //Trip1: 2, Trip2: 3, Trip3: 2, Trip4: 2 = 9 
        int totalStops = 9;
        StopsProblem problem = new StopsProblem(weightArray, floorArray, 10, 2, 160, totalStops);
        Solution solution = new Solution(problem);
        assertEquals(problem.getAnwser(), solution.run());
    }
    
    @Test
    public void problemWithWeightOverflow(){
        int[] weightArray = new int[]{80,58,60,76,85,80,65};
        int[] floorArray = new int[]{2,2,3,5,6,6,8};
        //Trip1: 2, Trip2: 3, Trip3: 2, Trip4: 3 = 10 
        int totalStops = 10;
        StopsProblem problem = new StopsProblem(weightArray, floorArray, 10, 2, 160, totalStops);
        Solution solution = new Solution(problem);
        assertEquals(problem.getAnwser(), solution.run());
    }
    
}
