package net.nadya.pres;

import net.nadya.metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSpringAnnotation {

    static void main() {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext("net.nadya");
        Imetier metier=(Imetier)applicationContext.getBean(Imetier.class);
        System.out.println("res="+metier.calcul());
        
    }
}
