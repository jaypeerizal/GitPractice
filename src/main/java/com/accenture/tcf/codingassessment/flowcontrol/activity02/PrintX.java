package com.accenture.tcf.codingassessment.flowcontrol.activity02;

public class PrintX {

	static boolean gow = true;
	static int sh;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 7;
		sh = size;

		for(int i = 0;i<7;i++){

			 gow=true;

			for(int c = 0;c<7;c++){

				if(gow){
				System.out.print("*");
				}
				else{
				System.out.print("*");
				  break;
				}

				sh = sh-2;
				for(int s = 1; s<=sh; s++){
					//space varies on a oddly decrease var
					System.out.print(" ");
					gow=false;

					//babawasan ko n lng space ko whooo

				}

				//next line dito
				//lagyan dpt ng space dito


				sh = sh-2;
			}


			System.out.println();
		}



		/*
		for(int i = 0;i<7;i++){


			//if here
					for(int j = 0;j<7;j++){

					  System.out.print("*");
				    }

					System.out.println();

			//after mag iterate no print for first and last = 1 then increment

	    }
		*/







	}

}
