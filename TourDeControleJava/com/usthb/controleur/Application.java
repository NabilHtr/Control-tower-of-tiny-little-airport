package com.usthb.controleur;
import java.util.ArrayList;
import java.util.Scanner;

import com.usthb.modeles.Avion;
import com.usthb.modeles.Code;
import com.usthb.modeles.MoyenTransport;
import com.usthb.modeles.Piste;
import com.usthb.modeles.Route;



public class Application {



	/*private static final Code AVI = null;*/

	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  ArrayList <Avion> liste = new ArrayList<Avion> () ;
		  ArrayList <MoyenTransport> listeMT = new ArrayList<MoyenTransport> () ;
		  ArrayList <Piste> listep = new ArrayList<Piste> () ;
		  ArrayList <Route> lister = new ArrayList<Route> () ;
		  
          Avion testaj = new Avion(null, null, null, null, null, 0, null, 0, 0);
          MoyenTransport testajMT = new MoyenTransport(null, null, null, null, 0);
          MoyenTransport saisMT = new MoyenTransport(null, null, null, null, 0);
		  Piste saisp = new Piste(null, null, 0, 0);
		  Piste saisp2 = new Piste(null, null, 0, 0);
		  Route saisr = new Route(null, false);
		  Route saisr2 = new Route(null, false);
		int boucle =1;
		int xi = 0;
		do
		{
        System.out.print("que voulez vous faire?\n"
				+ "1 . Saisie de moyens de transport\n"
				+ "2 . Saisie d’avions \n"
				+ "3 . Ajouter un moyen de transport \n"
				+ "4 . Ajouter un avion \n"
				+ "5 . Chercher une route libre à une horaire donnée  (Avec une saisie des Routes) \n"
				+ "6 . Chercher une piste libre à une horaire donnée  (Avec une saisie des Pistes) \n"
				+ "7 . Afficher la liste des moyens de transport, sélectionner un moyen,\n"
				+ " puis l’autoriser à utiliser une route libre à un horaire donné.\n"
				+ "8 . Afficher la liste des avions, sélectionner un Avion,\n"
				+ "puis l’autoriser à utiliser une Piste libre à un horaire donné.\n"
				+ "ALORS?\n"
				+ "Tapez 0 pour Quitter\n"
				);
		Scanner scx = new Scanner(System.in);
		int choix = scx.nextInt();
		
	
		
	switch(choix)	
	{
	   case 1 : /*L'utilisateur peut saisir plusieurs Moyens de Transports au debut*/
	   
		   if(listeMT.isEmpty() ==false)
	   { 
			   /*La saisie des MT se fait une seule fois au debut : je mets un message d'avertissement si l'utilisateur veut faire une deuxieme saisie de MT*/
		   System.out.println(" 'Attention' vous avez deja saisie des Moyens de Transport !\n");
	   }
		   
	   System.out.println("Combien de moyens de transports voulez vous saisir ?");
       int choixnbMT = scx.nextInt();
       for (int x=0;x<choixnbMT;x++) 
       {
 		  saisMT = MoyenTransport.saisie_mt(); /*La méthode saisie_mt se trouve dans la classe MoyenTransport et elle retourne un objet MT*/
          listeMT.add(saisMT);      /*a chaque objet MT créé on le rajoute à la liste 'listeMT' */
        }
		   
       
       break;
	   
	   
	   
	   case 2 : 
		   /*On fait le meme travail que dans la saisie des MT mais cette fois on a des objets de type Avion qui sont créés et qui sont ajoutés à la liste 'liste'*/
		   if(liste.isEmpty() ==false)
		   { 
			   System.out.println(" 'Attention' vous avez deja saisie des Avions !\n");
		   }  
		   
		   System.out.println("Combien d'avions voulez vous saisir ?"); 
	           int choixnbA = scx.nextInt();      
	           for (int y=0;y<choixnbA;y++)
	           {  testaj = Avion.saisie_avi();
	           liste.add(testaj);
	          
	       
	           }
	          
	          break;
	          
	   case 3 :  /*J'ai travaillé avec le principe suivant : on ne peut ajouter qu'un seul objet MT (ou Avion dans le case 4) apres la saisie de ces derniers (on doit commencer par la saisie des objets pour pouvoir en rajouter d'autres)*/
		      if(listeMT.isEmpty() )
		 System.out.println("vous n'avez pas encore saisie de Moyens de Transports\n\n");
		      
		      else 
		    	  testajMT = MoyenTransport.saisie_mt();
		         listeMT.add(testajMT);	
		   
		 break;       
	          
	          
	          
	  case 4 :
		      if(liste.isEmpty() )
		 System.out.println("vous n'avez pas encore saisie d'avions\n\n");
		      
		      else 
		    	  testaj = Avion.ajout_avi();
		         liste.add(testaj);	
		   
		 break;
	
	  case 5 :/*L'utilisateur doit d'abord saisir des routes (et des pistes dans le case 6) les rajouter dans des listes ensuite il donne une heure et des minutes, on parcours nos listes et on affiches nos objets avec les méthodes : affichttlesroutes et affichttlespistes*/
			 
		  if(lister.isEmpty())
		  {Scanner scxx = new Scanner(System.in);
		  System.out.println("combien de Route voulez vous saisir?\n");
		  int choixnbp = scxx.nextInt();
	       for (int xx=0;xx<choixnbp;xx++) 
	       {
	 	   saisr = saisr.saisie_r();
	       lister.add(saisr);      
	       }
	       }
		  else
		  {Scanner scxx2 = new Scanner(System.in);
		  Scanner scxx22 = new Scanner(System.in);
		  System.out.println("vous avez deja saisie des Routes \n"
		  		+ "voulez vous encore en saisire d'autres?\t(1 pour OUI ... 0 pour NON)\n");
		  int choixnvxp = scxx2.nextInt();
	     if (choixnvxp==1)
		  {
	    	 System.out.println("combien de Routes voulez vous rajouter?\n");
	    	 int choixnbp2 = scxx22.nextInt();
	    	 for (int xx2=0;xx2<choixnbp2;xx2++) 
		  
	       {
	 	   saisr2 = saisr2.saisie_r();
	         lister.add(saisr2);      
	       }
	      }
		  }
		  
		  
		  Scanner scxxhmr = new Scanner(System.in);
	      System.out.println("Donnez l'heure\n");
	      int choihh = scxxhmr.nextInt();
	      System.out.println("Donnez les minutes\n");
	      int choimm = scxxhmr.nextInt();
	      for(Route pr : lister)
	      pr.affichttlesroutes(choihh, choimm);
	      
		  
		  
		  
		 break; 	 
	
	  case 6 :
		
		  
		  if(listep.isEmpty())
		  {Scanner scxx = new Scanner(System.in);
		  System.out.println("combien de piste voulez vous saisir?\n");
		  int choixnbp = scxx.nextInt();
	       for (int xx=0;xx<choixnbp;xx++) 
	       {
	 	   saisp = saisp.saisie_p();
	       listep.add(saisp);      
	       }
	       }
		  else
		  {Scanner scxx2 = new Scanner(System.in);
		  Scanner scxx22 = new Scanner(System.in);
		  System.out.println("vous avez deja saisie des Pistes \n"
		  		+ "voulez vous encore en saisire d'autres?\t(1.OUI ... 0.NON)\n");
		  int choixnvxp = scxx2.nextInt();
	     if (choixnvxp==1)
		  {
	    	 System.out.println("combien de Pistes voulez vous rajouter?\n");
	    	 int choixnbp2 = scxx22.nextInt();
	    	 for (int xx2=0;xx2<choixnbp2;xx2++) 
		  
	       {
	 	   saisp2 = saisp2.saisie_p();
	         listep.add(saisp2);      
	       }
	      }
		  }
		  
		  Scanner scxxhm = new Scanner(System.in);
	      System.out.println("Donnez l'heure\n");
	      int choih = scxxhm.nextInt();
	      System.out.println("Donnez les minutes\n");
	      int choim = scxxhm.nextInt();
	      for(Piste ps : listep)
	      ps.affichttlespistes(choih, choim);
	       
		  
	      
	  break;
	       
	  
	
	  case 7:
		  if(listeMT.isEmpty())
			{
				System.out.println("vous n'avez pas encore saisie de Moyens de Transport! \n");
				
				
			}
			
		  else
		  {
			
			for (MoyenTransport ii : listeMT)
			{
			
				System.out.println(ii.getType()+ii.aMT+",\t"+ii.getEntrepriseprp()+",\t"+ii.getMatricule()+",\t"+ii.getModele()+",\t"+ii.getNumserie());
				
			}
		
			Scanner scselectmt = new Scanner(System.in);
			System.out.println("quel est le numero sequentiel du moyen de transport que vous voulez selectionner?\n");
			int selectmt = scselectmt.nextInt();
			for (MoyenTransport imt : listeMT)
			{
				if (selectmt == imt.aMT)
				  {
				  imt.mtocc = 1;
				  Scanner scxxhmmt = new Scanner(System.in);
			      System.out.println("Donnez l'heure\n");
			      int choihmt = scxxhmmt.nextInt();
			      System.out.println("Donnez les minutes\n");
			      int choimmt = scxxhmmt.nextInt();
			      for(Route rt : lister)
			      rt.affichlistroute(choihmt, choimmt);
				  
				  
				  
				  }
				
			
			}
  
		  
		  
		  }
			break;
	  
	  case 0:
			   
		  break;
	
	  case 8 : /*verifier le cas où l'utilisateur n'a pas saisie d'Avions (ou de MT dans le case 7) ensuite parcourir la liste pour afficher les objets, selectionner un objets avec son numéro sequentiel et l'affecter à une piste ou une route en mettant la variable qu'on a créé (avionocc , mtocc) à 1 puis on teste et on boucle en mettant en consideration l'heure et les minutes en utilisent les matrices occupation dans les 2 classes. */
		
	if(liste.isEmpty())
	{
		System.out.println("vous n'avez pas encore saisie d'Avions! \n");
		
		
	}
		
	else
	{	for (Avion i : liste)
		{
		      
		   if(i.avionocc == 0)  
			
			   System.out.println(Avion.getAvi()+i.test+",\t"+i.getMatricule()+",\t"+i.getTypeav()+",\t"+i.getNumserie()+",\t"+i.getModele()+",\t"+i.getCarburant()+",\t"+i.getCompagnie()+",\t"+i.getNbvgr());
			   
		}
		
		
		Scanner scselecta = new Scanner(System.in);
		System.out.println("quel est le numero sequentiel de l'avion que vous voulez selectionner?\n");
		int selecta = scselecta.nextInt();
		for (Avion j : liste)
		{
			if (selecta == j.test)
			  {
			  j.avionocc = 1;
			  Scanner scxxhmm = new Scanner(System.in);
		      System.out.println("Donnez l'heure\n");
		      int choiha = scxxhmm.nextInt();
		      System.out.println("Donnez les minutes\n");
		      int choima = scxxhmm.nextInt();
		      for(Piste ps : listep)
		      ps.affichlist(choiha, choima);
			  
			  
			  
			  }
			
		
		}
	}
		
	} 
		    System.out.println("Que voulez vous faire maintenant ?\n"
		    		+ "tapez .1. pour reafficher le menu \n"
		    		+ "taper .0. pour quitter \n ");     
		     boucle = scx.nextInt();
	if (boucle!=1) break;
		}
	while (boucle  == 1);
		
	
	    
		   
		   
		   
		   
		   
	
		
		

	
	
	
	}
}

