package org.example;

import entities.Evento;
import entities.TipoEvento;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Evento even1 = new Evento("Peppino di Capri", LocalDate.of(2022, 10, 26), "Nostalgia BOOMER", TipoEvento.PUBBLICO, 200000);
        Evento even2 = new Evento("Matrimonio", LocalDate.of(2021, 8, 15), "Roviniamo Estati", TipoEvento.PRIVATO, 200);
    }
}
