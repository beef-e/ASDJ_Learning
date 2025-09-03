import my_package.*;

public class Automobile {
    private String proprietario;
    private String targa;
    private String casa;
    TipoCarburante alimentazione;
    TipoCambio cambio;
    private int numeroPosti;
    private String immatricolazione;

    public Automobile(){
        proprietario = "";
        casa = "";
        immatricolazione = "";
        targa = "0000000";
        alimentazione = TipoCarburante.BENZINA;
        cambio = TipoCambio.MANUALE;
        numeroPosti = 5;
    }

    public Automobile(String proprietario, String targa, String casa, int posti, int annoImmatricolazione, String meseImmatricolazione, TipoCambio cambio, TipoCarburante carburante){
        this.proprietario=proprietario;
        this.casa=casa;
        this.cambio=cambio;
        this.alimentazione=carburante;
        this.numeroPosti=posti;
        if (targa.length()==7){
            this.targa=targa;
        }else{
            this.targa="0000000";
        }
        this.immatricolazione="" + meseImmatricolazione + "_" + Integer.toString(annoImmatricolazione);
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public String getCasa() {
        return casa;
    }

    public String getImmatricolazione() {
        return immatricolazione;
    }

    public String getProprietario() {
        return proprietario;
    }

    public String getTarga() {
        return targa;
    }

    public TipoCambio getCambio() {
        return cambio;
    }

    public TipoCarburante getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(TipoCarburante alimentazione) {
        this.alimentazione = alimentazione;
    }

    public void setCambio(TipoCambio cambio) {
        this.cambio = cambio;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public void setImmatricolazione(String immatricolazione) {
        this.immatricolazione = immatricolazione;
    }

    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    @Override
    public String toString(){
        String stringa="";
        stringa=stringa+"Nome Proprietario: " + this.proprietario;
        stringa=stringa+"\n";
        stringa=stringa+"Targa: " + this.targa;
        stringa=stringa+"\n";
        stringa=stringa+"Casa automobilistica: " + this.casa + "\n";
        stringa=stringa+"Tipo Carburante: " + this.alimentazione +"\n";
        stringa=stringa+"Tipo Cambio: " + this.cambio + "\n";
        stringa=stringa+"Posti: " + this.numeroPosti + "\n";
        stringa=stringa+"Immatricolazione: " + this.immatricolazione;
        return stringa;
    }

    @Override
    public boolean equals(Object obj){
        if (obj==this){
            return true;
        }
        if (obj instanceof Automobile){
            return true;
        }
        return false;
    }
}
