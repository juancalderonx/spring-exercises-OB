package Ejercicio1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo beanSaludo = (Saludo) context.getBean("saludoObj");

        beanSaludo.imprimirSaludo();

    }

}
