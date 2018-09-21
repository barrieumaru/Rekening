package be.vives.ti;

public class ZichtRekening extends Rekening {


    public ZichtRekening(String reknr, String naam) {
        super(reknr, naam);
    }

    @Override
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

          setSaldo(getSaldo()-teNemenBedrag); // dit wordt niet gecontrolleerd aangezien dat een rekening onder 0 mag gaan



    }

    @Override
    public String toString(){

        return "ZichtRekening \n" + super.toString();
    }
}
