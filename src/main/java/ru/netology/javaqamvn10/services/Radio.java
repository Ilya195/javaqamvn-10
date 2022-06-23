package ru.netology.javaqamvn10.services;

public class Radio {

    public int currentRadioStation;
    public int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {          // задает границы станций
        if (newCurrentRadioStation < 0) {
            return;
        } else if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation < 9) { // если нажать на кнопку некст, переключается на след
            currentRadioStation = currentRadioStation + 1;
        } else currentRadioStation = 0;
    }

    public void prevStation() {
        if (currentRadioStation > 0) { // если нажать на прев, переключает на предыдущ
            currentRadioStation = currentRadioStation - 1;
        } else currentRadioStation = 9;
    }

    public void volumePlus() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;   //увеличение громкости
        } else {
            currentVolume = 10;
        }
    }

    public void volumeMinus() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;    // уменьшение громкости
        } else {
            currentVolume = 0;
        }
    }
}
