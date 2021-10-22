package com.usthb.modeles;

import java.util.Scanner;

public class Piste  {

	private static final String p="P";
	private static int numseqP= -2 ;
	private String orientation;
	private int longueur;
	private float pente;
	public  int[][] occupation = new int[24][60];
	public int a;
	public Piste(String p, String orientation, int longueur, float pente) {
 
		
		this.orientation = orientation;
		this.longueur = longueur;
		this.pente = pente;
		for (int i=0 ; i<occupation.length ; i++)
		{
			for (int j=0 ; j<occupation[i].length ; j++)
			{
				this.occupation[i][j] = 0;
			}
		}
		Piste.numseqP++;
        a = numseqP;
		
		
	}
	
	public Piste saisie_p()    
	{
		
	
		
		Scanner sccaj = new Scanner(System.in);
		System.out.println("Quel est l'orientation ?\n ");
	        String or = sccaj.next();
		System.out.println("Quel est la longueur ?\n ");
		    int longu = sccaj.nextInt();
		System.out.println("Quel est la pente ?\n ");
			float pente = sccaj.nextFloat();		
			   return new Piste(p, or, longu,pente);
			
		
	}
	
	
	/*public void verif (int h , int m)
	{
		if (h<0||m<0||h>24||m>60)
		System.out.println("ERREUR");
		else if (this.occupation[h][m] == 1 )
		{
			System.out.println("La piste est deja occupée a cette heure");
		}
		else 
	 {
			this.occupation[h][m] = 1;}
	 }*/
	
	
	public void affichttlespistes(int h, int m)
	{
		if (h<0||m<0||h>24||m>60)   
			System.out.println("ERREUR");
		
		else
    {
	System.out.println("Cette piste est libre :\n"
	+Piste.p+" "+this.a+"\tavec l'orientation  "+this.orientation+"\tla longueur  "+this.longueur+"\tla pente  "+this.pente);
		
	}}
	
	
	
	public void affichlist(int h, int m)
	{
		if (h<0||m<0||h>24||m>60)   
			System.out.println("ERREUR");
			else if (this.occupation[h][m] == 1 )
			{
				System.out.println("La piste"+this.a+"est deja occupée a cette heure");
			}
		

		if(this.occupation[h][m]==0)
		System.out.println("Cette piste est libre:\n"
				+Piste.p+" "+this.a+"\tavec l'orientation  "+this.orientation+"\tla longueur  "+this.longueur+"\tla pente  "+this.pente);
		this.occupation[h][m]=1;	
	
	}
	
	
	

	public static String getP() {
		return p;
	}

	

	public String getOrientation() {
		return orientation;
	}

	public int getLongueur() {
		return longueur;
	}

	public float getPente() {
		return pente;
	}
 
	
	
	
	  
	
}
