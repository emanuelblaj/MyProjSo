package com.prodconsumator;

import java.util.Random;

public class Time extends Random{
	int delay() {
		return (int) (100.0f * nextFloat());
	}

}
