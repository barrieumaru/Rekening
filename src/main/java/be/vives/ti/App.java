package be.vives.ti;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ArrayList<Rekening> rekenings = new ArrayList<>();

        for(int i=0; i<6; i+=2){
           rekenings.add(new ZichtRekening("0" +i, "Klant " +i));
           rekenings.add(new SpaarRekening("0" +(i+1), "Klant " +i, 0.10));

        }

        for (Rekening s: rekenings){
            s.storten(10);
            if(s instanceof SpaarRekening)
              ((SpaarRekening) s).berekenRent();
        }


        rekenings.get(0).storten(50);
        rekenings.get(1).storten(250);


        for (Rekening r: rekenings){
            System.out.println(r);

        }

        for(Rekening re: rekenings){
            System.out.println();

        }
    }
}
