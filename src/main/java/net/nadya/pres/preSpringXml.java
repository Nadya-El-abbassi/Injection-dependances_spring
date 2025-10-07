package net.nadya.pres;

import net.nadya.metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class preSpringXml {
    static void main() {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        Imetier metier = (Imetier) springContext.getBean("metier");
        System.out.println("rest="+ metier.calcul());
    }
}
