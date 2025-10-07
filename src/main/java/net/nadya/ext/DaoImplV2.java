package net.nadya.ext;

import net.nadya.dao.Idao;
import net.nadya.dao.daoImpl;
import org.springframework.stereotype.Component;
@Component("d2")

public class DaoImplV2 implements Idao {
    @Override
    public double getdata() {
        System.out.println("Version captures");
        double t = 12;
        return t;
    }
}
