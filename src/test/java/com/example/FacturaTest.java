package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FacturaTest {
    @Test
    public void Test_registrar_producto_sinIVA_y_demas(){
        //Arrange
        Factura factura = new Factura();
        //Act
        factura.anadirproductos(10000);
        //Assert
        assertEquals(10000, factura.valor);
    }

    @Test
    public void Test_eliminar_producto(){
        //Arrange
        Factura factura  = new Factura();
        factura.valor=10000;
        //Act
        factura.eliminarproductos(10000);
        //Assert
        assertEquals(0, factura.valor);
    }

    @Test
    public void Test_calculartotal_valormenorquecero(){
        //Arrange
        Factura factura = new Factura();
        //Act
        double resultado= factura.calculartotal(-100, 19 , 15 , 4.14, 2.5);
        //Assert
        assertEquals(-1, resultado);
    }

    @Test
    public void Test_calculartotal_validos(){
        //Arrange
        Factura factura = new Factura();
        //Act
        double resultado= factura.calculartotal(10000000, 19 , 15 , 41400, 2.5);
        //Assert
        assertEquals(11323600, resultado, 0.00);
    }










    
}
