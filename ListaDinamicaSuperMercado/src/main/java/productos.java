/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Behendolrf
 */
public class productos {
        private float precio;
        private int cantidad;
        private String nombre_producto;
        float total=0;
            
        public productos(float precio, String nombre_producto, int cantidad){
            this.precio=precio;
            this.cantidad=cantidad;
            this.nombre_producto=nombre_producto;
            
        }
        public float setTotal_Producto(){
            total=cantidad*precio;
            return total;
        }
        public int getCantidad(){
            return cantidad;
        }
        public String getNombre_Producto(){
            return nombre_producto;
        }
        public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
}
