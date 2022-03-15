package PresentationSpringAnnotation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Presentation {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext("Dao", "Metier");
        IMetier metier = (IMetier) context.getBean("Metier");
        System.out.println("Resultat: " + metier.calcul());
    }
}
