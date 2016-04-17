package com.ivan.jmp.springweb.tld;

import com.ivan.jmp.springweb.entity.MovieSession;

import java.util.List;

/**
 * Created by Иван on 17.04.2016.
 */
public class Functions {

    public static boolean isBooked(int spot, List<MovieSession> movieSessions) {
        for (MovieSession movieSession : movieSessions) {
            if (movieSession.getSpot() == spot) {
                return true;
            }
        }
        return false;
    }

}
