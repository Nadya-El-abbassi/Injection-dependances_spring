package net.nadya.metier;

import net.nadya.dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class metierImpl implements  Imetier{
    @Autowired
    @Qualifier("d2")
    private Idao dao ;//couplage faible

    public metierImpl(@Qualifier("d2") Idao dao) {
        this.dao = dao;
    }

    public metierImpl() {
    }

    @Override
    public double calcul() {
        double t= dao.getdata();
        double res=t *12*Math.PI/2*Math.cos(t);
        return res;
    }

    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
