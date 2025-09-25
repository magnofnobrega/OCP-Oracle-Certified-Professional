// Objetivo: mostrar respostas do Exercício 2 – Primitivos e Wrappers

public class Resposta02 {

    public static void main(String[] args) {
        System.out.println("=== Respostas do Exercício 2 – Primitivos e Wrappers ===\n");

        // Situação 1: Número inteiro de xícaras servidas
        int numeroDeXicaras = 5;                // primitivo
        Integer numeroDeXicarasObj = Integer.valueOf(5); // wrapper
        System.out.println("Número de xícaras (primitivo): " + numeroDeXicaras);
        System.out.println("Número de xícaras (wrapper): " + numeroDeXicarasObj);

        // Situação 2: Quantidade exata de café em ml
        double quantidadeCafe = 120.5;               // primitivo
        Double quantidadeCafeObj = Double.valueOf(120.5); // wrapper
        System.out.println("Quantidade de café (primitivo): " + quantidadeCafe);
        System.out.println("Quantidade de café (wrapper): " + quantidadeCafeObj);

        // Situação 3: Escolha do cliente sobre açúcar
        boolean comAcucar = true;             // primitivo
        Boolean comAcucarObj = Boolean.TRUE;  // wrapper
        System.out.println("Cliente quer açúcar? (primitivo): " + comAcucar);
        System.out.println("Cliente quer açúcar? (wrapper): " + comAcucarObj);

        // Situação 4: Lista digital que guarda os pedidos
        java.util.List<Integer> pedidos = new java.util.ArrayList<>();
        pedidos.add(numeroDeXicarasObj);   // adicionando wrapper à lista
        pedidos.add(10);                   // autoboxing do int para Integer
        System.out.println("Lista de pedidos (caixas digitais): " + pedidos);

        // Demonstração de Autoboxing e Unboxing
        Integer xicarasBoxed = numeroDeXicaras;  // autoboxing
        int xicarasUnboxed = numeroDeXicarasObj; // unboxing
        System.out.println("Autoboxing: " + xicarasBoxed);
        System.out.println("Unboxing: " + xicarasUnboxed);

        // Linha final para orientar o leitor
        System.out.println("\nDepois, revise o código e tente criar suas próprias variações com primitivos, wrappers e listas.");
    }
}