package com.bzsomi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Kepregeny {

    public static ArrayList<Szuperhos> szereplok(String fajlNev){
        ArrayList<Szuperhos> hosok = new ArrayList<>();
        try{
            FileReader fr = new FileReader(fajlNev);
            BufferedReader bf = new BufferedReader(fr);
            String sor = bf.readLine();
            while (sor != null){
                String[] tomb = sor.split(" ");
                if (tomb[0].equals("Batman")){
                    Batman hos = new Batman();
                    for (int i = 0; i < Integer.parseInt(tomb[1]); i++) {
                        hos.kutyutKeszit();
                    }
                    hosok.add(hos);
                }else {
                    Vasember hos = new Vasember();
                    for (int i = 0; i < Integer.parseInt(tomb[1]); i++) {
                        hos.kutyutKeszit();
                    }
                    hosok.add(hos);
                }
                sor = bf.readLine();
            }
            bf.close();
            fr.close();
        }
        catch (FileNotFoundException ex){System.out.println("A fájl nem található");}
        catch (IOException ex){System.out.println("Belvasási hiba történt");}
        catch (Exception ex){System.out.println("Hiba történt");}

        return hosok;
    }

    public static void szuperhosok(ArrayList<Szuperhos> lista){
        for (Szuperhos hos: lista) {
            System.out.println(hos+"\n");
        }
    }

    public static void main(String[] args) {

        ArrayList<Szuperhos> hosok;
        hosok = szereplok("Heros.txt");
        szuperhosok(hosok);

    }
}
