package com.example;

public class Producto {

    public int idproducto;
    public double valor;
    public String descripcion;

    
    public Producto() {
        descripcion="";
        idproducto=0;
        valor=0;
        
    }


    public Producto(int idproducto, double valor, String descripcion) {
        this.idproducto = idproducto;
        this.valor = valor;
        this.descripcion = descripcion;
    }


    public int getIdproducto() {
        return idproducto;
    }


    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }


    public double getValor() {
        return valor;
    }


    public void setValor(int valor) {
        this.valor = valor;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

    
}
