package com.prodconsumator.pipefile;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeFiles extends PipedInputStream {
	PipedInputStream pis;
	PipedOutputStream pos;
	PipeFiles () {
		try {
			System.out.println(" " + PIPE_SIZE);
			pis = new PipedInputStream();
			pos = new PipedOutputStream();
			pis.connect(pos);
		} 
		catch(IOException e) {
			
		}
	}

}
