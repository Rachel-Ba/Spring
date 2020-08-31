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
	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-config-memoire.xml");
	  Scanner scanner = context.getBean(Scanner.class);
	  context.close();
  }
}
