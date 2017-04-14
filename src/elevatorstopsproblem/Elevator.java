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
public class Elevator {

    private final int initialStop = 1;
    private final int maximunCapacity;
    private final int weightLimit;

    public Elevator(int maximunCapacity, int weightLimit) {
        this.maximunCapacity = maximunCapacity;
        this.weightLimit = weightLimit;
    }

    public int stopsToQueue(Queue queue) {
        int totalStops = 0;
        for (Trip t : this.prepareTrips(queue.getPassengers())) {
            totalStops += this.tripStops(t);
        }
        return totalStops;
    }

    private int tripStops(Trip trip) {
        int stops = this.initialStop;
        int target = 0;
        for (Passenger p : trip.getPassengers()) {
            if (p.getTarget() != target) {
                stops++;
                target = p.getTarget();
            }
        }
        return stops;
    }

    private List<Trip> prepareTrips(List<Passenger> passengers) {
        List<Trip> trips = new ArrayList<>();
        Trip iteratorTrip = new Trip();
        for (Passenger p : passengers) {
            boolean exceedsWeight = (iteratorTrip.getWeight() + p.getWeight()) > this.weightLimit;
            boolean exceedsCapacity = (iteratorTrip.getPassengers().size() + 1) > this.maximunCapacity;
            if (!exceedsWeight && !exceedsCapacity) {
                iteratorTrip.getPassengers().add(p);
            } else {
                trips.add(iteratorTrip);
                iteratorTrip = new Trip();
                iteratorTrip.getPassengers().add(p);
            }
        }
        trips.add(iteratorTrip);
        return trips;
    }

}
