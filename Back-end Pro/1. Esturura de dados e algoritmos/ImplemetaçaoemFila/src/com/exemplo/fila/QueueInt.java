package com.exemplo.fila;

public class QueueInt {
    // Array para armazenar os elementos da fila
    private int[] queue;
    // Índice do primeiro elemento (frente da fila)
    private int front;
    // Índice do último elemento (traseira da fila)
    private int rear;
    // Contador para o número de elementos na fila
    private int size;

    // Construtor para inicializar a fila com uma capacidade específica
    public QueueInt(int capacity) {
        queue = new int[capacity]; // Inicializa o array com a capacidade fornecida
        front = 0; // Inicializa o índice da frente como 0
        rear = -1; // Inicializa o índice da traseira como -1 (fila vazia)
        size = 0; // Inicializa o tamanho da fila como 0
    }

    // Método para adicionar um elemento à traseira da fila
    public void enqueue(int value) {
        if (size == queue.length) {
            // Se a fila estiver cheia, lança uma exceção
            throw new IllegalStateException("Fila cheia!");
        }
        // Atualiza o índice da traseira ciclicamente e adiciona o novo valor
        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++; // Incrementa o tamanho da fila
    }

    // Método para remover e retornar o elemento na frente da fila
    public int dequeue() {
        if (isEmpty()) {
            // Se a fila estiver vazia, lança uma exceção
            throw new IllegalStateException("Fila vazia!");
        }
        // Armazena o valor do elemento na frente da fila
        int value = queue[front];
        // Atualiza o índice da frente ciclicamente
        front = (front + 1) % queue.length;
        size--; // Decrementa o tamanho da fila
        return value; // Retorna o valor removido
    }

    // Método para retornar o elemento na traseira da fila sem removê-lo
    public int rear() {
        if (isEmpty()) {
            // Se a fila estiver vazia, lança uma exceção
            throw new IllegalStateException("Fila vazia!");
        }
        return queue[rear]; // Retorna o elemento na traseira da fila
    }

    // Método para retornar o elemento na frente da fila sem removê-lo
    public int front() {
        if (isEmpty()) {
            // Se a fila estiver vazia, lança uma exceção
            throw new IllegalStateException("Fila vazia!");
        }
        return queue[front]; // Retorna o elemento na frente da fila
    }

    // Método para retornar o número de elementos na fila
    public int size() {
        return size; // Retorna o tamanho atual da fila
    }

    // Método para verificar se a fila está vazia
    public boolean isEmpty() {
        return size == 0; // Retorna true se o tamanho for 0, indicando que a fila está vazia
    }

    // Método principal para testar a implementação da fila
    public static void main(String[] args) {
        // Cria uma fila com capacidade para 5 elementos
        QueueInt queue = new QueueInt(5);
        
        // Adiciona elementos à fila
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        // Imprime o elemento na frente da fila
        System.out.println("Elemento na frente: " + queue.front()); // Deve imprimir "10"
        // Imprime o elemento na traseira da fila
        System.out.println("Elemento na traseira: " + queue.rear()); // Deve imprimir "30"
        // Imprime o tamanho atual da fila
        System.out.println("Tamanho da fila: " + queue.size()); // Deve imprimir 3
        
        // Remove um elemento da frente da fila
        queue.dequeue();
        // Imprime o novo elemento na frente da fila após o dequeue
        System.out.println("Elemento na frente após dequeue: " + queue.front()); // Deve imprimir "20"
        // Imprime o tamanho da fila após o dequeue
        System.out.println("Tamanho da fila após dequeue: " + queue.size()); // Deve imprimir 2
    }
}
