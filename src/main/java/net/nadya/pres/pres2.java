package net.nadya.pres;
import net.nadya.dao.Idao;
import net.nadya.metier.Imetier;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    static void main() throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("config.txt"));

        String DaoClassName= scanner.nextLine();
        Class cDao= Class.forName(DaoClassName);
        Idao d=(Idao) cDao.newInstance();

        String metierClassName= scanner.nextLine();
        Class cMetier= Class.forName(metierClassName);
        //Imetier metier=(Imetier) cDao.getConstructor(Idao.class).newInstance(d);
        Imetier metier=(Imetier) cDao.getConstructor().newInstance();
        Method setDao=cMetier.getDeclaredMethod("setDao",Idao.class);
        setDao.invoke(metier,d);
        System.out.println("res="+metier.calcul());





    }
}
