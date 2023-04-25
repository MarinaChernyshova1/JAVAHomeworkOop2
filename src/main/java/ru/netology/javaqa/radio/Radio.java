package ru.netology.javaqa.radio;

public class Radio {
    public int currentRadioStationNumber;

    public void setToMaxStationNumber() {

        currentRadioStationNumber = 9;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber <= 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void switchRadioStationForward() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void switchRadioStationBack() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = 9;
        }
    }

    public int soundVolume;

    public void setToMaxVolume() {
        soundVolume = 100;
    }

    public int getSoundVolume() {

        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 100) {
            return;
        }


        soundVolume = newSoundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        } else {
            soundVolume = 100;
        }
    }

    public void reduceVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        } else {
            soundVolume = 0;
        }
    }
}





