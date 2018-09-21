package be.vives.ti;

public class SpaarRekening extends Rekening {
private double rente;

    public SpaarRekening(String reknr, String naam, double rente) {
        super(reknr, naam);
        this.rente=rente;
    }
public double berekenRent(){
        double somRent;
        somRent= getSaldo()*rente/100;
        setSaldo(somRent+getSaldo());
        return somRent;

}
    public double getRente() {
        return rente;
    }

    public void setRente(double rente) {
        this.rente = rente;
    }

    public void storten(double nieuwSaldo){
        if(nieuwSaldo > 0) {
            setSaldo(nieuwSaldo+getSaldo());
        }
        else {
            System.out.println("Bedrag moet positief zijn");
        }
    }

    @Override
    public void opnemen(double teNemenBedrag){
        if(teNemenBedrag > 0 && teNemenBedrag <= getSaldo())
        {
            setSaldo(getSaldo()-teNemenBedrag);

        }
        else {
            System.out.println("Er is probleem met het ingevoerd bedrag " + teNemenBedrag);

        }

    }

    @Override
    public String toString(){

        return "SpaarRekening \n" + super.toString();
    }
}
