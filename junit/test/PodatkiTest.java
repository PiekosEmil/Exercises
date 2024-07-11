package junit.test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static junit.Podatki.obliczPodatek;

public class PodatkiTest {

    @Test
    public void podatekDla1500000() {
        //given
        int przychod = 150000;

        //when
        obliczPodatek(przychod);

        //then
        Assertions.assertEquals(35470.06, obliczPodatek(150000));
    }

    @Test
    public void podatekDla10000() {
        //given
        int przychod = 10000;

        //when
        obliczPodatek(przychod);

        //then
        Assertions.assertEquals(1243.98, obliczPodatek(10000));
    }

    @Test
    public void podatekDla1000() {
        //given
        int przychod = 1000;

        //when
        obliczPodatek(przychod);

        //then
        Assertions.assertEquals(0, obliczPodatek(1000));
    }
}
