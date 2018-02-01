package hilos;

public class Main {
	
	public static void main(String[] args) {
		int i = 0;
		Hilo hilo1 = new Hilo();
		Hilo hilo2 = new Hilo();
		hilo1.start();
		while(i < 10) {
			hilo2.interrupt();
			i++;
			System.out.println(hilo1.getState());
		}
		
		hilo1.interrupt();
		hilo2.start();
		
	}

}
