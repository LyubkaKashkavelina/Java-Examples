package com.company;

public class Main {

    public static void main(String[] args) {
	int n = 121;
	int s = 1;
	int d = 2;
	while(n>=d)
    {
      if(n%d==0)
      {
          s = s+d;
          d = d+1;
      }



    }
        System.out.print("The number is " + s);

    }
}
