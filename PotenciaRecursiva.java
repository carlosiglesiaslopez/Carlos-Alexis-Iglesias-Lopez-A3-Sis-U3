public class PotenciaRecursiva {
    
    public static double potencia(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        if (exponente < 0) {
            return 1 / potencia(base, -exponente);
        }
        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        double base = 2;
        int exp = 3;
        double res = potencia(base, exp);
        System.out.println(base + " elevado a " + exp + " es: " + res);
    }
}
