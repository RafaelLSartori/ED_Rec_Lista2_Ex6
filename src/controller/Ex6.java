package controller;

public class Ex6 {
    public Ex6() {
        super();
    }

    public int[] invertevetor(int[] vet, int inicio, int tamanho) {
        int aux;
        if(inicio > tamanho){
            return vet;
        } else {
            aux = vet[inicio];
            vet[inicio] = vet[tamanho];
            vet[tamanho] = aux;
            return invertevetor(vet, inicio + 1, tamanho - 1);
        }
    }
}