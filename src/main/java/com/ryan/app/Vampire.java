package com.ryan.app;
import java.util.Arrays;



public class Vampire {
	public static void main(String args[]){
		int cnt = 1;
			for(int m = 10;m<100;m++){
				for(int n = 10;n<100;n++){
					if(m*n>1000 && m*n < 9999 && in(m,n,m*n)){
						System.out.println((cnt++)+" m:"+m+" n:"+n+" m*n: "+m*n);
						
					}
				}
			}
	}
	static boolean in(int f1,int f2,int f3){
		boolean res = true;
		
		int f12 = f1/10,f11 = f1%10;
		int f22 = f2/10,f21 = f2%10;
		
		int [] s = {f21,f11,f22,f12};
		Arrays.sort(s);
		
		int f34 = f3/1000,f33 = (f3-f34*1000)/100,f32 = (f3- f34*1000 - f33*100)/10,f31 =(f3- f34*1000 - f33*100 - f32*10);
		int [] t = {f34,f33,f32,f31};
		Arrays.sort(t);
		for(int i =0;i<4;i++){
			if(s[i]!=t[i]){
				return false;
			}
		}
		return res;
	}
}
