public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
         double salarioMinimo = 2500;

         short numeroCurto = 1;
         int numeroNormal = numeroCurto;
         long numeroCurto2 = (short) numeroNormal;
         
              // Final deixa a variavel em caixa alta 
              // Não sendo possivel alterar o valor
         final int numero = 5;

         System.out.println(numero);

    }
}
