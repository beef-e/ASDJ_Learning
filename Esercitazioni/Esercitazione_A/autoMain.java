import my_package.TipoCambio;
import my_package.TipoCarburante;

public class autoMain {
    public static void main(String[] args) {
        Automobile auto1 = new Automobile();
        System.out.println(auto1.toString());

        auto1.setAlimentazione(TipoCarburante.BENZINA);
        auto1.setCambio(TipoCambio.AUTOMATICO);
        auto1.setCasa("Biffi");
        auto1.setImmatricolazione("Aprile_2045");
        auto1.setProprietario("Giammaria Biffi");
        auto1.setNumeroPosti(2);
        auto1.setTarga("AA123BB");

        System.out.println(auto1.toString());

        Automobile auto2=new Automobile("Giammaria Biffi 2", "BB456CC", "BMW", 3, 2022, "DICEMBRE", TipoCambio.AUTOMATICO, TipoCarburante.BENZINA);
        System.out.println(auto2.toString());

        System.out.println(auto1.equals(auto2));
    }
}
