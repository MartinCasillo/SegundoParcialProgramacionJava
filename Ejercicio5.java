public class Ejercicio5 {
    public static void main(String[] args){
        Producto[] miArray = new Producto[3];

        miArray[0] = new Producto("Lapiz",12000,"Color Negro, Durabilidad Extra , Comodo En Uso");
        miArray[1] = new Producto("Boligoma",12000,"Pegamento Extra, Secado Rapido, Doble Cantidad");
        miArray[2] = new Producto("Carpeta",12000,"Ganchos Dobles , Material Duro, Tamaño Adaptativo");

        for(Producto productos : miArray){
            System.out.println( "Descripcion del : " + productos.getNombre() + " ---> "+ productos.getDescripcion());
        }
    }
}


class Producto{
   private String nombre;
   private double precio;
   public String descripcion;


    public Producto(String nombre, double precio,String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
