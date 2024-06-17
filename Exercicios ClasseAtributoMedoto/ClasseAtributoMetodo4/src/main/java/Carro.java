public class Carro {

    public String marca ;
    public String modelo;
    public int cilindradas;

    @Override // sobrescrevendo um metodo
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindradas=" + cilindradas +
                '}';
    }
}
