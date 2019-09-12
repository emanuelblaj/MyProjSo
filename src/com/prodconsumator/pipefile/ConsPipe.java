package com.prodconsumator.pipefile;

import java.io.IOException;
import java.io.PipedInputStream;

public class ConsPipe extends Thread {
	PipedInputStream pis;
	
	ConsPipe(PipeFiles f) {
		pis = f.pis;
	}
	public void run() {
		int b = 77;
		try {
			do { b = pis.read();
			System.out.print( " I" + b);
			} while(b < 99);
		}
		catch (IOException e) {
			
		}
	}

}
