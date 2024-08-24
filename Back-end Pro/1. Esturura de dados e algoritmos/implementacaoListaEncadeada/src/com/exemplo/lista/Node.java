//Armazena um valor inteiro e uma referência para o próximo nó (next).

package com.exemplo.lista;

public class Node {
    int value; // Valor armazenado no nó
    Node next; // Referência para o próximo nó

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
