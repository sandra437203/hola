public class articulo {
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setPrecio21(int precio21) {
        this.precio21 = 21;
    }

    public articulo(String nombre, int precio, int cuantosQuedan) {
        this.nombre = nombre;
        this.precio = precio;
        this.precio21 = 21;
        this.cuantosQuedan = cuantosQuedan;
    }

    private double precio;

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getPrecio21() {
        return precio21;
    }

    private int precio21;

    private int cuantosQuedan;

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }
    public double iva(){
        return (this.precio  * 0.21);
    }
    public double getPVP(){
        return (this.precio * (1 + 21 /100));
    }

    public double getPVPDesdescuetno(int descuento){
        double pvpConDescuento = getPVP() * (1 - descuento / 100.0);
        return pvpConDescuento;
    }
    public String imprimir(){

        return(getNombre() + " - precio  " + getPrecio() +" - iva  " + getPrecio21() );

    }
    public boolean vender(int x) {
        if (x <= 0) {
            System.out.println("La cantidad a vender debe ser mayor que 0.");
            return false;
        }
        if (cuantosQuedan >= x) {
            cuantosQuedan -= x;
            System.out.println("Se vendieron " + x + " unidades del artículo.");
            return true;
        } else {
            System.out.println("No hay suficiente stock para vender " + x + " unidades.");
            return false;
        }
    }
    public boolean almacenar(int x) {
        if (x <= 0) {
            System.out.println("La cantidad a almacenar debe ser mayor que 0.");
            return false;
        }
        if (cuantosQuedan + x <= 100) {
            cuantosQuedan += x;
            System.out.println("Se almacenaron " + x + " unidades del artículo.");
            return true;
        } else {
            System.out.println("No se puede almacenar " + x + " unidades. Superaría el límite de 100.");
            return false;
        }
    }

}
