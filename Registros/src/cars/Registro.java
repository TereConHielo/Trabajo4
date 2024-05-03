
package cars;

public class Registro {
    public int ID;
    public String marca;
    public String modelo;
    public int anio;
    public String tipo;
    public int chasis;
    public String color;
    
    public Registro(int ID, String marca, String modelo, int anio, String tipo, int chasis, String color){
        this.ID = ID;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
        this.chasis = chasis;
        this.color = color;
    }
    
    public int getID(){
        return ID;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAnio(int anho){
        this.anio = anho;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setChasis(int chasis){
        this.chasis = chasis;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void info(){
                System.out.println("ID: " + ID);        
                System.out.println("Marca: "+ marca);
                System.out.println("Modelo: "+ modelo);
                System.out.println("Año: "+ anio);
                System.out.println("Tipo: "+ tipo);
                System.out.println("Chasis: "+ chasis);
                System.out.println("Color: "+ color);
    }
}