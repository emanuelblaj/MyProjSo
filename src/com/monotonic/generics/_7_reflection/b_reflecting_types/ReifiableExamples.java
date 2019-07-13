package com.monotonic.generics._7_reflection.b_reflecting_types;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReifiableExamples {
	
	public static class StringList extends ArrayList<String> {
		
	}
	
	public static void main(String[] args) {
		final ParameterizedType arrayListOfString =(ParameterizedType) StringList.class.getGenericSuperclass(); 
		
		System.out.println(Arrays.toString(arrayListOfString.getActualTypeArguments()));
		
	}
 }
