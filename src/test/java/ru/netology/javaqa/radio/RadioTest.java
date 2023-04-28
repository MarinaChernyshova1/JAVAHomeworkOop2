package ru.netology.javaqa.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSwitchRadioStationForward() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        radio.switchRadioStationForward();

        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchRadioStationOnLast() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        radio.switchRadioStationForward();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldChoiceRadioStationOutOfRange() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(12);


        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldChoiceStationBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-5);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldSwitchRadioStationBeforeStart() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.switchRadioStationBack();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchRadioStationOnBack() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(3);

        radio.switchRadioStationBack();

        int expected = 2;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }




    @Test
    public void shouldIncreaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);


        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(5);
        radio.reduceVolume();

        int expected = 4;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReduceVolumeMin() {
        Radio radio = new Radio();

        radio.setSoundVolume(0);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    //@Test
   // public void shouldReduceVolumeUnderMin() {
     //   Radio radio = new Radio();

       // radio.setSoundVolume(-1);
       // radio.reduceVolume();

     //   int expected = 0;
      //  int actual = radio.getSoundVolume();

      //  Assertions.assertEquals(expected, actual);

   // }


}
