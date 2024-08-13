package view;
import controller.Ex6;

public class Main {

	public static void main(String[] args) {
		Ex6 m = new Ex6();
		int vet10[] = {-12, -10, -7, -5, -3, 0, 1, 3, 5, 6};
		int vet11[] = {-12, -10, -7, -5, -3, 0, 1, 3, 5, 6, 8};
		int tamanho = vet10.length;
		int vet = m.invertevetor(vet10, 0, tamanho);
		
		for(int i = 0; i < tamanho; i++) {
			System.out.print(resp[i]);
		}
		
		
	}	
}
