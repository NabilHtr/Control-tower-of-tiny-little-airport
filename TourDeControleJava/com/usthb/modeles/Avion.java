package com.usthb.modeles;
import java.util.ArrayList;
import java.util.Scanner;

public class Avion extends MoyenTransport {
	
	
	private static final String avi="AVI";
	private String compagnie,typeav;
	private int carburant,nbvgr;
	public static ArrayList <Avion> l;
	public static int numseq=-1;
	public int test;
	public int avionocc = 0;

	  
	
	
	 public Avion(String avi, String matricule, String modele,String typeav ,String entrepriseprp, long numserie, String compagnie, int carburant, int nbvgr) {
		super( matricule, modele, entrepriseprp, compagnie, numserie);

	this.typeav = typeav;
	this.compagnie = compagnie;
	this.carburant = carburant;
	this.nbvgr = nbvgr;
	Avion.numseq++;
	test=numseq;
	}
	
	

	
	 public static Avion saisie_avi()     /*Cette methode retourne un objet Avion qui contient les informations que l'utilisateur va saisir */
		{
			
		
			Scanner scaj = new Scanner(System.in);
			String typeavaj = null;
			System.out.println("Quel est le type de l'avion QUE VOUS VOULEZ SAISIR ?\n "
					+ "1. Airbus\n"
					+ "2. Boeing\n"
					+ "3. ATR\n"
					+ "Alors?\n");
			int chxaj = scaj.nextInt();
			switch(chxaj)
			{
			case 1 : typeavaj = "Airbus";break;
			case 2 : typeavaj = "BOEING";break;
			case 3 : typeavaj = "ATR";break;
			}
			Scanner sccaj = new Scanner(System.in);
			System.out.println("Quel est le matricule de l'avion ?\n ");
		    String matr = sccaj.next();
			System.out.println("Quel est le numero de serie de l'avion ?\n ");
			    long numserie = sccaj.nextLong();
			System.out.println("Quel est le modele de l'avion ?\n ");
				String numS = sccaj.next();		
			System.out.println("Quel est la compagnie aérienne auquel il appartient ?\n ");			
			    String comp = sccaj.next();
			System.out.println("Quel est l'entreprise proprio de l'avion ?\n ");
				String entr = sccaj.next();
		
			System.out.println("Quel est sa charge en carburant ?\n ");					
			    int crb = sccaj.nextInt();
			System.out.println("Quel est le nombre de voyageurs dans l'avion ?\n ");					
			    int nbr = sccaj.nextInt();
			    
			 
			   return new Avion(avi,matr,numS,typeavaj,entr, numserie,comp,crb,nbr);
		
			
			
		}

	 
	 

	
	public static Avion ajout_avi()
	{
		
	
		Scanner scaj = new Scanner(System.in);
		String typeavaj = null;
		System.out.println("Quel est le type de l'avion QUE VOUS VOULEZ AJOUTER ?\n "
				+ "1. Airbus\n"
				+ "2. Boeing\n"
				+ "3. ATR\n"
				+ "Alors?\n");
		int chxaj = scaj.nextInt();
		switch(chxaj)
		{
		case 1 : typeavaj = "Airbus";
		case 2 : typeavaj = "BOEING";
		case 3 : typeavaj = "ATR";
		}
		Scanner sccaj = new Scanner(System.in);
		System.out.println("Quel est le matricule de l'avion ?\n ");
	    String matr = sccaj.next();
		System.out.println("Quel est le numero de serie de l'avion ?\n ");
		    long numserie = sccaj.nextLong();
		System.out.println("Quel est le modele de l'avion ?\n ");
			String numS = sccaj.next();
		System.out.println("Quel est l'entreprise proprio de l'avion ?\n ");
			String entr = sccaj.next();
			
		System.out.println("Quel est la compagnie aérienne auquel il appartient ?\n ");			
		    String comp = sccaj.next();
		System.out.println("Quel est sa charge en carburant ?\n ");					
		    int crb = sccaj.nextInt();
		System.out.println("Quel est le nombre de voyageurs dans l'avion ?\n ");					
		    int nbr = sccaj.nextInt();
	
		   Avion test2 = new Avion(avi,matr,numS,typeavaj,entr,numserie,comp,crb,nbr);
	
		return test2;
		
	}
	
	
	

	public static String getAvi() {
		return avi;
	}



	public String getCompagnie() {
		return compagnie;
	}



	public int getCarburant() {
		return carburant;
	}



	public int getNbvgr() {
		return nbvgr;
	}

	


	public String getTypeav() {
		return typeav;
	}


	
}
