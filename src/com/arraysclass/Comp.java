package com.arraysclass;

import java.util.Comparator;

public class Comp implements Comparator {
	public int compare(Object ee, Object ff)  {
		Elem e = (Elem)ee;
		Elem f = (Elem)ff;
		if(e.x == f.x && e.y == f.y)
			return 0;
		else if(e.x < f.x || e.x ==f.x && e.y < f.y)
			return -1;
		else 
			return 1;
	}

}
