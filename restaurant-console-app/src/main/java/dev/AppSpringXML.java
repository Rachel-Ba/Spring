package dev;

import dev.dao.PlatDaoFichier;
import dev.dao.PlatDaoMemoire;
import dev.ihm.Menu;
import dev.service.PlatServiceVersion1;
import dev.service.PlatServiceVersion2;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Scanner;

public class AppSpringXML
{
	  public static void main(String[] args) 
	  {
	  // Création du contexte Spring
	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-config-memoire.xml");
	  
	  // récupération du bean Menu
	  Menu menu = context.getBean(Menu.class);
	  menu.afficher();
	  
	  // fermeture du Scanner
	  context.getBean(Scanner.class).close();
	  
	  // fermeture du contexte Spring
	  context.close();
	  }
	}
