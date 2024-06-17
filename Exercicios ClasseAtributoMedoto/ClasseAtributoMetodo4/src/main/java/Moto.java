public class Moto {

   public String marca ;
   public String modelo;
   public int cilindradas;

   @Override //sobrescrevendo um metodo
   public String toString() {
      return "Moto{" +
              "marca='" + marca + '\'' +
              ", modelo='" + modelo + '\'' +
              ", cilindradas=" + cilindradas +
              '}';
   }
}
