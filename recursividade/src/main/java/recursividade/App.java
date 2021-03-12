package recursividade;

public class App {

    // MÉTODOS RECURSIVOS IMPLEMENTADOS

    public static int fatorial(int n) throws Exception{
        if(n <= 0){
            throw new Exception("Valor é igual ou menor a zero");
        }else if(n == 1){
            return 1;
        }else{
            return n * fatorial(n-1);
        }
    }

    public static int fibonacci(int indice) throws Exception{
        if(indice < 2){
            return indice;
        }else{
            return fibonacci(indice-1) + fibonacci(indice-2);
        }
    }

    public static boolean palindrome(String palavra) throws Exception{
        if(palavra.length() < 1){
            throw new Exception("Palavra Errada!");
        }else if(palavra.length() < 3){
            if(palavra.length() == 1){
                return true;
            }else if(palavra.charAt(0) == palavra.charAt(1)) {
                return true;
            }else{
                return false;
            }
        }else{
            if(palavra.charAt(0) == palavra.charAt(palavra.length()-1)){
                return palindrome(palavra.substring(1, palavra.length()-1));
            }else{
                return false;
            }
        }
    }

    public static int somatorioAteZero(int n) throws Exception{
        if(n <= 0){
            throw new Exception("Número Negativo");
        }else if(n == 1){
            return 1;
        }else{
            return n + somatorioAteZero(n-1);
        }
    }

    public static int somatorioEntreNumeros(int valorInicial, int valorFinal) throws Exception{
        int resultado = valorInicial+1;
        if (valorInicial >= valorFinal){
            throw new Exception("Valor Inicial maior ou igual ao Final");
        }else if (resultado == valorFinal ){
            return 0;
        }else{
            return resultado + somatorioEntreNumeros(resultado, valorFinal);
        }
    }




    public static void main( String args[] ) throws Exception{
        System.out.println("\n ✅ TESTE DE FATORIAL: " + fatorial(8));
        System.out.println("\n ✅ TESTE DE FIBONACCI: " + fibonacci(3));
        System.out.println("\n ✅ TESTE DE PALINDROME: " + palindrome("anna"));
        System.out.println("\n ✅ TESTE DE SOMATÓRIO ATÉ ZERO: " + somatorioAteZero(5));
        System.out.println("\n ✅ TESTE DE SOMATÓRIO ENTRE NÚMEROS: " + somatorioEntreNumeros(3, 5));
    }
}
