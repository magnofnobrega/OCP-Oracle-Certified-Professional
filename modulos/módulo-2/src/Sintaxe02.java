// Guia detalhado linha a linha – Exercício 2 – Primitivos e Wrappers

// Importando classes necessárias para usar listas dinâmicas
import java.util.List;       // Traz a interface List do pacote java.util
import java.util.ArrayList;  // Traz a classe ArrayList do pacote java.util

public class Sintaxe02 {

    public static void main(String[] args) {

        // ---------- Tipos primitivos ----------
        int numeroDeXicaras = 5;       
        // int → tipo primitivo que guarda números inteiros
        // numeroDeXicaras → nome da variável
        // = → operador de atribuição
        // 5 → valor armazenado

        double quantidadeCafe = 120.5;  
        // double → tipo primitivo que guarda números com casas decimais
        // quantidadeCafe → nome da variável
        // = → operador de atribuição
        // 120.5 → valor armazenado

        boolean comAcucar = true;      
        // boolean → tipo primitivo que guarda true/false
        // comAcucar → nome da variável
        // = → operador de atribuição
        // true → valor armazenado

        // ---------- Classes Wrapper ----------
        Integer numeroDeXicarasObj = Integer.valueOf(5);
        // Integer → classe wrapper para int
        // numeroDeXicarasObj → nome da variável
        // = → operador de atribuição
        // Integer.valueOf(5) → método que cria um objeto Integer com valor 5

        Double quantidadeCafeObj = Double.valueOf(120.5);
        // Double → classe wrapper para double
        // quantidadeCafeObj → nome da variável
        // = → operador de atribuição
        // Double.valueOf(120.5) → cria objeto Double com valor 120.5

        Boolean comAcucarObj = Boolean.TRUE;
        // Boolean → classe wrapper para boolean
        // comAcucarObj → nome da variável
        // = → operador de atribuição
        // Boolean.TRUE → constante que representa true como objeto

        // ---------- Autoboxing e Unboxing ----------
        Integer xicarasBoxed = numeroDeXicaras;  
        // autoboxing: int → Integer automaticamente

        int xicarasUnboxed = numeroDeXicarasObj; 
        // unboxing: Integer → int automaticamente

        // ---------- Lista Dinâmica ----------
        List<Integer> pedidos = new ArrayList<>();
        // List<Integer> → tipo da variável: lista de Integer
        // pedidos → nome da lista
        // = → operador de atribuição
        // new ArrayList<>() → cria uma nova lista dinâmica vazia

        pedidos.add(5);
        // add(5) → adiciona o valor 5 dentro da lista

        // ---------- Saída no console ----------
        System.out.println("Número de xícaras (int): " + numeroDeXicaras);
        System.out.println("Número de xícaras (Integer): " + numeroDeXicarasObj);
        System.out.println("Pedidos na lista: " + pedidos);
    }
}
