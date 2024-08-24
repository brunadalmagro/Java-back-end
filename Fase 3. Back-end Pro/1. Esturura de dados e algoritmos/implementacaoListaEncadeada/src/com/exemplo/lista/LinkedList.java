package com.exemplo.lista;

public class LinkedList {
    private Node head; // Referência para o primeiro nó da lista
    private int size;  // Número de elementos na lista

    public LinkedList() {
        this.head = null; // Inicializa a lista vazia
        this.size = 0;    // Inicializa o tamanho como 0
    }

    // Adiciona um nó ao final da lista
    public void push(Node node) {
        if (head == null) {
            head = node; // Se a lista estiver vazia, o novo nó se torna o primeiro nó
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Navega até o final da lista
            }
            current.next = node; // Adiciona o novo nó ao final
        }
        size++; // Incrementa o tamanho da lista
    }

    // Remove e retorna o nó do final da lista
    public Node pop() {
        if (head == null) {
            throw new IllegalStateException("Lista vazia!");
        }
        if (head.next == null) {
            Node temp = head;
            head = null; // Lista fica vazia após remover o único nó
            size--;
            return temp;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next; // Navega até o penúltimo nó
        }
        Node temp = current.next;
        current.next = null; // Remove a referência do último nó
        size--;
        return temp;
    }

    // Insere um nó na posição especificada
    public void insert(int index, Node node) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice fora dos limites!");
        }
        if (index == 0) {
            node.next = head;
            head = node; // Insere no início da lista
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next; // Navega até o nó anterior ao índice
            }
            node.next = current.next; // Ajusta a referência para o próximo nó
            current.next = node; // Insere o novo nó na posição
        }
        size++; // Incrementa o tamanho da lista
    }

    // Remove o nó na posição especificada
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fora dos limites!");
        }
        if (index == 0) {
            head = head.next; // Remove o nó da frente
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next; // Navega até o nó anterior ao índice
            }
            current.next = current.next.next; // Ajusta a referência para o próximo nó
        }
        size--; // Decrementa o tamanho da lista
    }

    // Retorna o nó na posição especificada
    public Node elementAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fora dos limites!");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next; // Navega até o nó na posição especificada
        }
        return current; // Retorna o nó encontrado
    }

    // Retorna o número de elementos na lista
    public int size() {
        return size;
    }

    // Imprime todos os elementos da lista
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next; // Navega para o próximo nó
        }
        System.out.println("null"); // Indica o final da lista
    }

    // Método principal para testar a lista encadeada
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(new Node(10));
        list.push(new Node(20));
        list.push(new Node(30));

        System.out.println("Lista após push:");
        list.printList(); // Deve imprimir "10 -> 20 -> 30 -> null"

        System.out.println("Elemento na posição 1: " + list.elementAt(1).value); // Deve imprimir "20"

        list.insert(1, new Node(25)); // Insere 25 na posição 1

        System.out.println("Lista após insert:");
        list.printList(); // Deve imprimir "10 -> 25 -> 20 -> 30 -> null"

        list.remove(2); // Remove o nó na posição 2 (que contém 20)

        System.out.println("Lista após remove:");
        list.printList(); // Deve imprimir "10 -> 25 -> 30 -> null"

        System.out.println("Elemento removido pelo pop: " + list.pop().value); // Deve imprimir "30"

        System.out.println("Lista final:");
        list.printList(); // Deve imprimir "10 -> 25 -> null"
    }
}
