package be.vives.ti;

public class Rekening {
    private String reknr;
    private String naam;
    private double saldo;

    public Rekening(String reknr, String naam) {
        this.reknr = reknr;
        this.naam = naam;
        saldo = 0.0;
    }
    public double berekenRent(){
        return  0.0;

    }

    public String getReknr() {
        return reknr;
    }

    public void setReknr(String reknr) {
        this.reknr = reknr;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void storten(double nieuwSaldo){
        if(nieuwSaldo > 0) {
            saldo += nieuwSaldo;
        }
        else {
            System.out.println("Bedrag moet positief zijn");
        }
    }

    public void opnemen(double teNemenBedrag){
        saldo-=teNemenBedrag;

    }

    @Override
    public String toString() {
        return "Rekening{" +
                "reknr='" + reknr + '\'' +
                ", naam='" + naam + '\'' +
                ", saldo= " + saldo +
                '}';
    }
}
