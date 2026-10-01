public class InvertirStringRecursivo {
    
    public static String invertir(String texto) {
        
        if (texto.length() <= 1) {
            return texto;
        }
        return texto.charAt(texto.length() - 1)
                + invertir(texto.substring(0, texto.length() - 1));
    }

    public static void main(String[] args) {
        String textoOriginal = "Recursividad";
        String textoInvertido = invertir(textoOriginal);
        System.out.println("Original: " + textoOriginal);
        System.out.println("Al revés: " + textoInvertido);
    }
}

