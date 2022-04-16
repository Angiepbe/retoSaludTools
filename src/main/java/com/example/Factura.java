 package com.example;

import java.util.Scanner;

public class Factura extends Producto{
    private int numfactura, idpagador;
    private String nombrepagador;
    private double IVA ,reteIVA,ICA , retefuente, preciototal, valortotalfact,totalreten;

    Scanner leer = new Scanner(System.in);
    Producto listaproductos[] = new Producto[2];


    public Factura() {
    }


    public Factura(int numfactura, int idpagador, String nombrepagador, double iVA, double reteIVA, double iCA,
            double retefuente, double preciototal, double valortotalfact, double totalreten, Scanner leer,
            Producto[] listaproductos) {
        this.numfactura = numfactura;
        this.idpagador = idpagador;
        this.nombrepagador = nombrepagador;
        IVA = iVA;
        this.reteIVA = reteIVA;
        ICA = iCA;
        this.retefuente = retefuente;
        this.preciototal = preciototal;
        this.valortotalfact = valortotalfact;
        this.totalreten = totalreten;
        this.leer = leer;
        this.listaproductos = listaproductos;
    }

    public Factura(int idproducto, double valor, String descripcion, int numfactura, int idpagador,
            String nombrepagador, double iVA, double reteIVA, double iCA, double retefuente, double preciototal,
            double valortotalfact, double totalreten, Scanner leer, Producto[] listaproductos) {
        super(idproducto, valor, descripcion);
        this.numfactura = numfactura;
        this.idpagador = idpagador;
        this.nombrepagador = nombrepagador;
        IVA = iVA;
        this.reteIVA = reteIVA;
        ICA = iCA;
        this.retefuente = retefuente;
        this.preciototal = preciototal;
        this.valortotalfact = valortotalfact;
        this.totalreten = totalreten;
        this.leer = leer;
        this.listaproductos = listaproductos;
    }

    public int getNumfactura() {
        return numfactura;
    }

    public void setNumfactura(int numfactura) {
        this.numfactura = numfactura;
    }

    public int getIdpagador() {
        return idpagador;
    }

    public void setIdpagador(int idpagador) {
        this.idpagador = idpagador;
    }

    public String getNombrepagador() {
        return nombrepagador;
    }

    public void setNombrepagador(String nombrepagador) {
        this.nombrepagador = nombrepagador;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double iVA) {
        IVA = iVA;
    }

    public double getReteIVA() {
        return reteIVA;
    }

    public void setReteIVA(double reteIVA) {
        this.reteIVA = reteIVA;
    }

    public double getICA() {
        return ICA;
    }

    public void setICA(double iCA) {
        ICA = iCA;
    }

    public double getRetefuente() {
        return retefuente;
    }

    public void setRetefuente(double retefuente) {
        this.retefuente = retefuente;
    }

    public double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(double preciototal) {
        this.preciototal = preciototal;
    }

    public double getValortotalfact() {
        return valortotalfact;
    }

    public void setValortotalfact(double valortotalfact) {
        this.valortotalfact = valortotalfact;
    }

    public double getTotalreten() {
        return totalreten;
    }

    public void setTotalreten(double totalreten) {
        this.totalreten = totalreten;
    }


    public void anadirproductos(double preciototal){
       valor += preciototal;
       /*for(int i=0; i<listaproductos.length;i++){
           System.out.println("Ingresa el ID del producto");
           idproducto= leer.nextInt();
           System.out.println("Ingresa nombre o descripcion del producto");
           descripcion= leer.next();
           System.out.println("Ingresa el valor del producto");
           valor= leer.nextDouble();
           listaproductos[i] = new Producto(idproducto,valor, descripcion);
           
       }
       
       for(int i=0; i<listaproductos.length;i++){
           System.out.println("\nIDProducto:"+listaproductos[i].getIdproducto()
           +"\nNombre Producto:"+listaproductos[i].getDescripcion()
           +"\nValor Producto"+listaproductos[i].getValor());
       }

       valor += preciototal;
       System.out.println(preciototal);*/
    
    }

    public void eliminarproductos(double preciototal){
        valor -= preciototal;
    }

    public double calculartotal(double valor, double IVA, double reteIVA, double ICA, double reteFuente ){
         if (valor <0 || IVA<0 || reteIVA <0 || ICA<0 || reteFuente <0){
             return -1; 
         }
         else{
             IVA=valor*(IVA/100);
             valortotalfact= valor+IVA;
             totalreten=(IVA*(reteIVA/100))+(valor*(reteFuente/100))+ICA;
             preciototal= valortotalfact-totalreten;
             return preciototal;
         }
        
    }
    
}
