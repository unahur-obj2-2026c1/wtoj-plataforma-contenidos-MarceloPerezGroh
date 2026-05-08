package contenidos;

import ar.edu.unahur.obj2.w2j.contenidos.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContenidoTest {
    @Test
    void dadoUnDocumental_seCalculaElCostoCorrectamente() {
        // Formato de nombre: given_when_then
        Documental documental = new Documental("Documental sobre la naturaleza", 10.0);
        Double costoEsperado = 10.0 + IDRA.getInstance().getValor();
        assertEquals(costoEsperado, documental.costo());
    }

    @Test
    void testCosto() {

    }

    @Test
    void testDoCosto() {

    }

    @Test
    void testGetCostoBase() {

    }

    @Test
    void testGetTitulo() {

    }

    @Test
    void testSetCosto() {

    }
}