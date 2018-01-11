package com.kodcu.math;

public class DortIslem {

    
    public static double topla(double a , double b) {
	return (a + b) ;
    }

    public static double cikart(double a , double b) {
	return (a - b) ;
    }

    public static double carp(double a , double b) {
    	return (a * b) ; 
    }

    public static double bol(double a , double b) {
	if  ( (a != 0) && (b != 0) )  {
	    return (a / b) ;
	} else {
	    return 0 ;
	}
    }  
}

