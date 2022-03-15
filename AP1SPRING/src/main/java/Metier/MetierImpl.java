package Metier;

import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Metier")
public class MetierImpl implements IMetier {
    /*Couplage faible*/
    @Autowired
    private IDao dao;
    @Override
    public double calcul() {
        double t=dao.getData(); double res=t*66;
        return res;
    }
    /* Setter pour injection des dépendances*/
    public void setDao(IDao dao) { this.dao = dao; }
}
