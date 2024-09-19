package com.exemplo.pilha;

public class StackInt {
    private int[] stack;
    private int top;

    // Construtor para inicializar a pilha com um tamanho fixo
    public StackInt(int capacity) {
        stack = new int[capacity];
        top = -1; // Indica que a pilha está inicialmente vazia
    }
    
    public void push(int value) {
        if (top == stack.length - 1) {
            throw new StackOverflowError("Pilha cheia!"); // Se a pilha estiver cheia, lançamos um erro
        }
        stack[++top] = value; // Incrementamos `top` e adicionamos o valor na pilha
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia!"); // Se a pilha estiver vazia, lançamos um erro
        }
        return stack[top--]; // Retorna o valor no topo e decrementa `top`
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia!"); // Se a pilha estiver vazia, lançamos um erro
        }
        return stack[top]; // Retorna o valor no topo sem alterar `top`
    }

    public boolean isEmpty() {
        return top == -1; // Se `top` for -1, a pilha está vazia
    }

    public int size() {
        return top + 1; // O tamanho é `top + 1`, pois `top` começa em 0
    }

    public static void main(String[] args) {
        StackInt stack = new StackInt(5); // Criando uma pilha com capacidade de 5 elementos
        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.top()); // Deve imprimir 30
        System.out.println("Size: " + stack.size()); // Deve imprimir 3

        stack.pop();
        System.out.println("Top element after pop: " + stack.top()); // Deve imprimir 20

        System.out.println("Is empty: " + stack.isEmpty()); // Deve imprimir false
    }

}