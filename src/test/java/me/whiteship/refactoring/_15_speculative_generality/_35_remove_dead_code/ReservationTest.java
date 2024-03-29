package me.whiteship.refactoring._15_speculative_generality._35_remove_dead_code;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

class ReservationTest {

    @Test
    void reservation() {
        Reservation reservation = new Reservation(LocalDateTime.of(2022, 1, 20, 19, 30));
        reservation.setAlarmBefore(30);
        assertEquals(LocalDateTime.of(2022, 1, 20, 19, 0), reservation.getAlarm());
    }

}