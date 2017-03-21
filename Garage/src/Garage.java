package com.simplon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicule> voitures = new ArrayList<Vehicule>();
    private File file = new File("Garage.txt");
    private FileWriter fw;
    private FileReader fr;
    private String listVoitures = "";

    public Garage(){
        try{
            fr = new FileReader(file);
            int i = 0;
            //Lecture des données
            while((i = fr.read()) != -1) listVoitures += (char)i;
            fr.close();
        } catch (FileNotFoundException e) {
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        try{
            fr = new FileReader(file);
            file.delete();
        } catch (FileNotFoundException e) {
            listVoitures = "Aucune voiture sauvegardée !\r\n";
            listVoitures += "########################\r\n# Garage OpenClassRoom #\r\n########################\r\n";
            return listVoitures;
        }
        return listVoitures;
    }

    public void addVoiture(Vehicule voit) {
        if(voitures.isEmpty())
        {
            try{
                fw = new FileWriter(file);
                listVoitures = "########################\r\n# Garage OpenClassRoom #\r\n########################\r\n";
                fw.write(listVoitures);
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            try{
                fw = new FileWriter(file);
                listVoitures += voit;
                fw.write(listVoitures);
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        voitures.add(voit);
    }
}
