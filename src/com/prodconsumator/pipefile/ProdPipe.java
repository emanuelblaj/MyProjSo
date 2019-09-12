package com.prodconsumator.pipefile;

import java.io.IOException;
import java.io.PipedOutputStream;

public class ProdPipe extends Thread{ 
	PipedOutputStream pos;
	
	ProdPipe(PipeFiles f) {
		pos = f.pos;
		
	}
	public void run() {
		byte b;
		try {
			for(b = 10; b < 100; b++) {
				sleep((int) (200* Math.random()));
				System.out.print(" P" + b);
				pos.write(b);
			}
		}
		catch (IOException e) {
			
		}
		catch(InterruptedException e) {
			
		}
	}

}
