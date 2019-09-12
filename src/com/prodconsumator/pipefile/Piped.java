package com.prodconsumator.pipefile;

public class Piped {
	public static void main(String[] args) {
		PipeFiles f = new PipeFiles();
		ProdPipe p = new ProdPipe(f);
		ConsPipe c = new ConsPipe(f);
		c.start();
		p.start();
	}
}
