package ru.netology.javaqamvn10.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


        @Test
        public void shouldSetRadioStation() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(3);
            int expected = 3;
            int actual = radio.getCurrentRadioStation(); // Включает выбранную станцию

            Assertions.assertEquals(expected, actual);

        }

        @Test
        public void shouldMaxSetRadioStation() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(50);
            int expected = 0;
            int actual = radio.getCurrentRadioStation(); // Выбрана  несуществующая станция

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldMinSetRadioStation() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(-1);
            int expected = 0;
            int actual = radio.getCurrentRadioStation(); // Выбрана  несуществующая станция

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNextRadioStation() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(4);
            radio.nextStation(); // следующая станция позитивный
            int expected = 5;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNextRadioStationZero() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(0);
            radio.nextStation(); //  следующая станция при = 0
            int expected = 1;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNextRadioStation9() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(9);
            radio.nextStation(); // следующая станция, если 9
            int expected = 0;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNextRadioStation8() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(8);
            radio.nextStation(); // следующая станция, если 8
            int expected = 9;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNextRadioStation1() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(1);
            radio.nextStation(); // следующая станция, если 1
            int expected = 2;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNextRadioStationMinus() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(-1);
            radio.nextStation(); // следующая станция, если -1
            int expected = 1;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldPrevRadioStation() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(9);
            radio.prevStation(); // предыдущая станция
            int expected = 8;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldPrevRadioStation0() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(0);
            radio.prevStation(); // предыдущая станция, если 0
            int expected = 9;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);

        }

        @Test
        public void shouldVolumePlus() {
            Radio radio = new Radio();
            radio.currentVolume = 5;
            radio.volumePlus(); // звук +
            int expected = 6;
            int actual = radio.currentVolume;

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldVolumePlus10() {
            Radio radio = new Radio();
            radio.currentVolume = 10;
            radio.volumePlus(); // звук +, если 10
            int expected = 10;
            int actual = radio.currentVolume;

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldVolumeMinus() {
            Radio radio = new Radio();
            radio.currentVolume = 10;
            radio.volumeMinus(); // звук -
            int expected = 9;
            int actual = radio.currentVolume;

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldVolumeMinus0() {
            Radio radio = new Radio();
            radio.currentVolume = 0;
            radio.volumeMinus(); // звук -, если 0
            int expected = 0;
            int actual = radio.currentVolume;

            Assertions.assertEquals(expected, actual);
        }
    }

