package be.vives.ti;


public class ZichtRekening extends Rekening {


    public ZichtRekening(String reknr, String naam) {
        super(reknr, naam);
    }

    /**
     * Ik heb een controle bij deze methode gedaan
     * eigelijk het moest toen niet gecontroleerd worden
     * maar door de kwaliteit van de code heb ik dat toch gedaan
     * @param nieuwSaldo
     */
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
