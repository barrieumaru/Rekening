package be.vives.ti;

import java.util.ArrayList;

/**
 * @ Barrie Umaru
 * 21-09-2018 22:47
 *
 *
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ArrayList<Rekening> r = new ArrayList<>();
        //Zichtrekening en Spaarrekening maken aan de hand van super klas Rekening
        for( int i =0; i<8; i+=2){
            r.add(new ZichtRekening("0" + i,"klant " + i));
            r.add(new SpaarRekening("0" + (i+1), "klant " + i,0.20));

    }
        // geld op alle rekeningen opstorten
        r.get(0).storten(200);
        r.get(1).storten(300);
        r.get(2).storten(250);
        r.get(3).storten(350);
        r.get(4).storten(450);
        r.get(5).storten(650);
        r.get(6).storten(150);
        r.get(7).storten(550);

        // geld op aantal rekeningen afhalen

        r.get(3).opnemen(200);
        r.get(1).opnemen(100);
        r.get(5).opnemen(300);
        r.get(6).opnemen(40);

    // 10€ storten naar alle rekeningen
        for(Rekening st: r){
            st.storten(10);
            if (st instanceof SpaarRekening)
                    st.berekenRent();
        }



        // neem 5€ voor de kosten beheer

        for(Rekening k: r){

            k.opnemen(5);
        }

        /**
        Druk alle renten uit
        for (Rekening rente: r){
            rente.berekenRent();

        }
         **/
    // Alle rekeningen afdrukken
        for(Rekening re: r){
            System.out.println(re);

        }



    }

}
