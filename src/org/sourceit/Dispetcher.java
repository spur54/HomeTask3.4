package org.sourceit;

import com.sun.xml.internal.bind.v2.util.FatalAdapter;

public class Dispetcher {

    public static void main(String[] args){
        int race[]={200, 322, 400, 500, 605};
        Voditel Maxim=new Voditel();
        Voditel Farazh=new Voditel();
        Voditel Bohdan=new Voditel();
        Avtomobil Zhiguli=new Avtomobil();
        Avtomobil Deo=new Avtomobil();
        Avtomobil Nissan=new Avtomobil();

        Maxim.rabota(race[0],Zhiguli);
        Farazh.setStatus(false);
        Farazh.rabota(race[2],Nissan);
    }
}
