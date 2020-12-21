/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author pabli
 */
public class Menu {

    private String ensaladilla;
    private String croquetas;
    private String cachopo;
    private String salmon;
    private String postre;
    private String cafe;
    private String productos;
    private Double precio;
    private Integer cantidad;

    public Menu() {
        this.cantidad = 1;
    }

    public String getEnsaladilla() {
        return ensaladilla;
    }

    public void setEnsaladilla(String ensaladilla) {
        this.ensaladilla = ensaladilla;
    }

    public String getCroquetas() {
        return croquetas;
    }

    public void setCroquetas(String croquetas) {
        this.croquetas = croquetas;
    }

    public String getCachopo() {
        return cachopo;
    }

    public void setCachopo(String cachopo) {
        this.cachopo = cachopo;
    }

    public String getSalmon() {
        return salmon;
    }

    public void setSalmon(String salmon) {
        this.salmon = salmon;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public String getCafe() {
        return cafe;
    }

    public void setCafe(String cafe) {
        this.cafe = cafe;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
