package com.accenture.tcf.codingassessment.flowcontrol.activity01;

public class NumberUtil {

	static boolean hasSame;

	public  boolean lastDigit(int a, int b, int c) {

	    char lastX = Integer.toString(a).charAt(Integer.toString(a).length()-1);
	    char lastY = Integer.toString(b).charAt(Integer.toString(b).length()-1);
	    char lastZ = Integer.toString(c).charAt(Integer.toString(c).length()-1);

	    if(lastX == lastY){
	    	hasSame = true;
	    }
	    else if(lastX == lastZ){
	    	hasSame = true;
	    }
	    else if(lastY == lastZ){
	    	hasSame = true;

	    }else{
	    	hasSame = false;
	    }
		return hasSame;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberUtil num = new NumberUtil();
       	num.lastDigit(22, 23, 12);

	}

}
