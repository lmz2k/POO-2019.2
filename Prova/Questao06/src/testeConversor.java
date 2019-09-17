package br.edu.ifpb.persistencia.api;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class testeConversor {



    @Test
    public void TestarConversor(){

        Conversor c = new Conversor();

        assertEquals(c.decimalToBinario(50), "110010");
        assertEquals(c.decimalToHexa(50), "32");

        assertEquals(c.decimalToBinario(123123), "11110000011110011");
        assertEquals(c.decimalToHexa(123123), "1e0f3");

        assertEquals(c.decimalToBinario(210), "11010010");
        assertEquals(c.decimalToHexa(210), "d2");
    }




}
