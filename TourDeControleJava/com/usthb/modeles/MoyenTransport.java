package com.usthb.modeles;
import java.util.ArrayList;
import java.util.Scanner;;
public class MoyenTransport {


	protected long numserie;
	protected String matricule,modele,entrepriseprp;
    protected String type;
	public static int numseqMT = -3 ;
    public int aMT;
	public int mtocc = 0;
    
	public long getNumserie() {
		return numserie;
	}




	public String getMatricule() {
		return matricule;
	}




	public String getModele() {
		return modele;
	}




	public String getEntrepriseprp() {
		return entrepriseprp;
	}
   

	public String getType() {
		return type;
	}
	



	public MoyenTransport(String type, String matricule, String modele, String entrepriseprp, long numserie  )
	{
		
		this.type = type;
		this.matricule = matricule;
		this.modele = modele;
		this.entrepriseprp = entrepriseprp;
		this.numserie = numserie;
		MoyenTransport.numseqMT++;
		aMT=numseqMT;
		
	}
	
	   
	   
	   
	public static MoyenTransport saisie_mt( )
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quelle est le type de votre moyen de transport ?\n"
				+ "1. Avion\n"
				+ "2. Vehicule\n"
				+ "3. Bus\n"
				+ "Alors?\n");
		int chx = sc.nextInt();
		switch(chx)
		{
		case 1 : 
			MoyenTransport temp0 = Avion.saisie_avi();
        return temp0;
			
		   
			
			
		case 2 : Scanner sccc = new Scanner(System.in);
		String typeveh = null;
		System.out.println("Quel est le type du vehicule ?\n "
				+ "1. Voiture\n"
				+ "2. Cam\n"
				+ "Alors?\n");
		int choix2 = sccc.nextInt();
		switch(choix2)
		{
		case 1 : typeveh = "Voiture";break;
		case 2 : typeveh = "Cam";break;
		
		}
		System.out.println("Quel est le matricule du vehicule ?\n ");
	    String matr2 = sccc.next();
		System.out.println("Quel est le numero de serie du vehicule ?\n ");
		    long numserie2 = sccc.nextLong();
		System.out.println("Quel est le modele du vehicule ?\n ");
			String numS2 = sccc.next();		
		System.out.println("Quel est l'entreprise proprio de ce vehicule ?\n ");			
		    String entr = sccc.next();
		System.out.println("Quel est le motif de son utilisation ?\n ");					
		    String motf = sccc.next();
		    MoyenTransport temp = new MoyenTransport(typeveh, matr2, numS2, entr, numserie2);
		
		return temp;
		
		case 3 :
			Scanner scB = new Scanner(System.in);
			 String typebus = "BUS";
			
			System.out.println("Quel est le matricule du bus ?\n ");
		    String matr3 = scB.next();
			System.out.println("Quel est le numero de serie du bus ?\n ");
			    long numserie3 = scB.nextLong();
			System.out.println("Quel est le modele du bus ?\n ");
				String numS3 = scB.next();	
			System.out.println("Quel est l'entreprise proprio de ce bus ?\n ");			
			    String entr3 = scB.next();
			System.out.println("Quel est le nombres de sieges de ce Bus ?\n ");					
			    int nbS = scB.nextInt();
					
			    MoyenTransport temp2 = new MoyenTransport(typebus, matr3, numS3, entr3, numserie3);
		
			    
		return temp2;
			
		
		}
		return null;
		
	
		
	}




	
	
	
	
	
	
	
	
}
