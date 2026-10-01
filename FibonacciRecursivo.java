public class FibonacciRecursivo {
    
    public static int fibonacci(int n) {
        
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int posicion = 7; 
        int resultado = fibonacci(posicion);
        System.out.println("El término " + posicion + " de Fibonacci es: " + resultado);
    }
}