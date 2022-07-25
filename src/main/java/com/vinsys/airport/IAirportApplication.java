package com.vinsys.airport;
import com.vinsys.airport.exceptions.InvalidInputException;

public interface IAirportApplication {
    String[] findAirportBy(String str) throws InvalidInputException;
}
