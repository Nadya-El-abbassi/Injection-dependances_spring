package net.nadya.pres;

import net.nadya.dao.daoImpl;
import net.nadya.metier.metierImpl;

public class pres1 {
    static void main() {
        daoImpl d = new daoImpl();
        metierImpl metier = new metierImpl();
        metier.setDao(d);
        System.out.println("res="+metier.calcul());
    }
}
