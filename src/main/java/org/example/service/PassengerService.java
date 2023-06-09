package org.example.service;

import org.example.models.Passenger;
import org.example.models.Trip;

import java.util.List;
import java.util.Set;

public interface PassengerService {
    Passenger getById(long id);
    Set<Passenger> getAll();
    Set<Passenger> get(int offset, int perPage, String sort);
    Passenger save(Passenger passenger);
    Passenger update(Passenger passenger);
    void delete(long passengerId);
    List<Passenger> getPassengersOfTrip(long tripNumber);
    void registerTrip(Trip trip, Passenger passenger);
    void cancelTrip(long passengerId, long tripNumber);
}
