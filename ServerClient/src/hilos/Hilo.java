package hilos;

public class Hilo extends Thread{
	
	public void run() {
		for(int i = 0; i<10; i++)
			System.out.println("Hola" + i);
	}

}
