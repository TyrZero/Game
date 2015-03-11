package main;
import monkrens.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import static java.lang.System.*;

public class MonkrensMain implements Runnable {
	public static void main(String[] args)throws IOException {
		SwingUtilities.invokeLater(new MonkrensMain());
	}
	
	public void run() {
		try{
			initGame();
			
		}catch(Exception e){
			err.println("Unidentified Exception");
			e.printStackTrace(System.err);
			System.exit(0);
		}
	}
	
	private void initGame() throws IOException {
		Scanner in = new Scanner(System.in);
		out.println("Choose a Monkren");
		Monkren mon = new Monkren(in.nextLine());
		while(true){
			
		}
	}
}