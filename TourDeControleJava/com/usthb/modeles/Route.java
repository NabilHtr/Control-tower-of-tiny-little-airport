package com.usthb.modeles;

import java.util.Scanner;

public class Route  {
	public static final String r="R";
	private static  int numseqr= -2 ;
	private byte[][] occupationr = new byte [24][60];
    public boolean intersection;
    public int aR;
    
public Route( String r, boolean intersection) {

	  for (byte i=0 ; i<occupationr.length ; i++)
		{
			for (byte j=0 ; j<occupationr[i].length ; j++)
			{
				 this.occupationr[i][j] = 0;
			}
		}
	  this.intersection = intersection ;
		Route.numseqr++;
		aR = numseqr;
     
	}




public Route saisie_r()    
{
	
   boolean b;
	
	Scanner sccaj = new Scanner(System.in);
	System.out.println("cette route est elle en intersection avec une piste ? Tapez : 1 pour oui ou 0 pour non\n");
	int inter = sccaj.nextInt();
	if (inter == 1)
		{b = true;}
	else {b = false;}
		
		return new Route(r,b);
	
}

public void affichttlesroutes(int hr , int mr)
{
	if (hr<0||mr<0||hr>24||mr>60)   
		System.out.println("ERREUR");
	
	else if (this.intersection == true)
	{
		System.out.println("la route "+this.aR+" est en Intersection avec une Piste !");
	}
	else
	{
	System.out.println("Cette route est libre :\n"
			+Route.r+" "+this.aR);
	}
}


	
public void affichlistroute(int h, int m)
{
	if (h<0||m<0||h>24||m>60)   
		System.out.println("ERREUR");
		else if (this.occupationr[h][m] == 1 )
		{
			System.out.println("La Route est deja occupée a cette heure");
		}
		else if (this.intersection = true)
		{
			System.out.println("cette route est en Intersection avec une Piste !");
		}
	if(this.occupationr[h][m]==0)
	System.out.println("Les Routes libres sont :\n"
			+Route.r+" "+this.aR);
	this.occupationr[h][m]=1;	

}

}
