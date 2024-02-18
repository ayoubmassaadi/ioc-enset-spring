package ext;

import dao.IDao;

public class DoaImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteurs");
        double temp = 1000;
        return temp;
    }
}
