package com.AlgoritmosGulosos;

/*
Uma empresa quer implementar um novo sistema de backup onde arquivos são guardados em fitas de dados.

O ovo sistema deve seguir as duas seguintes regras:
    1 - Nunca colocar mais de dois arquivos na mesma fita.
    2 - Os arquivos não podem ser divididos entre múltiplas fitas.

É garantido que todas as teham o mesmo tamanho e que elas sempre serão capazes de guardar i maior arquivo.
Toda vez que este processo for executado, nós já sabermos o tamanho de cada arquivo e  a   capacidade da fitas.
Com isso em meente, desenhe uma solução que seja capaz d contar quantas fitas serão requeridas para guardar o backup da forma mais eficiente.
O parametro de  sua função será uma estrutura qque conterá o tamanho dos arqquivos  a capacidade das fitas.
Voce deve retornar a quantidade minima de fitas reequerida para  guardar os  arquivos.

|Exemplo:
    //  Fita 1: 70+20
    // Fita 2: 10
    Input: Tape   Size =  100; Files: 70, 10,  20
    Output: 2
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackupSystem {
    public interface Batch {
        int[] getFileSizes();

        int getTapeSize();
    }

    private static class NewBatch implements Batch {

        @Override
        public int[] getFileSizes() {
            return new int[]{
                    70, 10, 20, 40, 50, 60, 50, 100, 100
            };
        }

        @Override
        public int getTapeSize() {
            return 100;
        }
    }

    public int getMinimumTapeCount(final Batch batch) {
        // Primeiro, ordenamos o array de tamanhos de arquivos
        int[] sizes = batch.getFileSizes();
        Arrays.sort(sizes);

        int tapes = 0;
        List<Tape> list = new ArrayList<>();

        for (int i = sizes.length - 1; i > -1; i--) {
            boolean stored = false;

            for (Tape tape : list) {
                if (((tape.getStored() + sizes[i]) <= batch.getTapeSize()) && (tape.getNumberOfFiles() < 2)) {
                    tape.addStorage(sizes[i]);
                    tape.addFiles();
                    stored = true;
                    break;
                }
            }

            if (!stored) {
                tapes++;
                list.add(new Tape(sizes[i]));
            }
        }

        return tapes;
    }

    private class Tape {
        private int stored;
        private int numberOfFiles;

        public Tape(int stored) {
            this.stored = stored;
            this.numberOfFiles = 1;
        }

        //  Getters
        public int getStored() {
            return stored;
        }

        public void addStorage(int storage) {
            this.stored += storage;
        }

        public int getNumberOfFiles() {
            return numberOfFiles;
        }

        public void addFiles() {
            this.numberOfFiles++;
        }
    }

    public static void main(String[] args) {
        BackupSystem backupSystem = new BackupSystem();
        Batch batch = new NewBatch();

        System.out.println(backupSystem.getMinimumTapeCount(batch));
    }
}