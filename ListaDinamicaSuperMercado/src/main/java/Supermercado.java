
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Behendolrf
 */
public class Supermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<productos>productos=new ArrayList<productos>();
        productos objeto;
        String nombre_producto="";
        int cantidad=0, opcion=0,seleccion,resta_cantidad;
        float total=0, precio=0;
        
        

        while(opcion!=5){
        
            opcion =Integer.parseInt(JOptionPane.showInputDialog("MENU \n1.- Agregar \n2.- Total\n3.- Eliminar\n4.-Registro\n5.-Salir"));
            switch(opcion){
                case 1 -> {
                    nombre_producto=JOptionPane.showInputDialog("INGRESA EL NOMBRE DE TU PRODUCTO: ");
                    precio=Float.parseFloat(JOptionPane.showInputDialog("INGRESA EL PRECIO DEL PRODUCTO "));
                    cantidad=Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE SU PRODUCTO"));
                    objeto=new productos (precio, nombre_producto, cantidad);
                    productos.add(objeto);
                    JOptionPane.showMessageDialog(null, "TU REGISTRO ES DE "+cantidad+" "+nombre_producto.toUpperCase(Locale.ITALY)+" DE "+precio+"\n EN TOTAL:"+objeto.setTotal_Producto());
                break;
                }
                case 2 -> {
                    int contador=1;
                    for(productos i : productos){
                        total+= i.setTotal_Producto();
                        contador++;
                    }
                    JOptionPane.showMessageDialog(null,"TOTAL :"+total);
                break;    
                }
                case 3->{
                    objeto=new productos (precio, nombre_producto, cantidad);
                    String space="";
                    int indice=0;
                    for(productos i : productos){
                        cantidad=i.getCantidad();
                        space+=String.format("%d.- %s\n", indice+1, i.getNombre_Producto()+" :"+i.getCantidad());
			indice++;
                    }
		seleccion=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero del producto a eliminar\n"+space));
		seleccion-=1;
                resta_cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cuantos objetos de tu carrito quieres eliminar"));
                System.out.println(cantidad);
                productos.get(seleccion).setCantidad(productos.get(seleccion).getCantidad()-resta_cantidad);
                
                System.out.println(cantidad);

                
                if (cantidad<=0){
                    productos.remove(seleccion);
                    
                }
              
                
                break;
                }
                
                case 4->{
                    
                    String space=" ";
                    int indice=0;
                    for(productos i : productos){
                        cantidad=i.getCantidad();
                        space+=String.format("%d.- %s\n", indice+1, " "+i.getNombre_Producto()+" :"+i.getCantidad()+"( "+precio+" )");
			indice++;
                    }
                    JOptionPane.showMessageDialog(null, "REGISTRO\n"+space);
                break;
                }
                case 5->{
                    JOptionPane.showMessageDialog(null, "SEE YOU LATER ALLIGATOR");
                    opcion=5;
                break;
                }
            }
            if (opcion >5){
                JOptionPane.showMessageDialog(null, "NUMERO MALO HIJO");
            }
            
        
        }
    }
    
}
