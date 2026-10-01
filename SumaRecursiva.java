public class SumaRecursiva {
    
    public static int suma(int n) {
        if (n == 1) {
            return 1;
        }
        return n + suma(n - 1);
    }

    public static void main(String[] args) {
        int numero = 5; 
        int resultado = suma(numero);
        System.out.println("La suma de 1 hasta " + numero + " es: " + resultado);
    }
}

    
