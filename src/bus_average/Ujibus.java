/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_average;

/**
 *
 * @author USER
 */
public class Ujibus {
    public static void main(String[] abc) {
        Bus_average Bus= new Bus_average(5);
        Bus.getPenumpang(17);
        Bus.getPenumpang(24);
        Bus.cetakPenumpang();
        //Penambahan penumpang
        Bus.cetakPenumpang();
        Bus.addpenumpang(2); //Tambah 2 penumpang
        //Penambahan penumpang
        Bus.cetakPenumpang();
        Bus.addpenumpang(1); //Tambah 1 penumpang
        //Penambahan penumpang
        Bus.cetakPenumpang();
        Bus.addpenumpang(2); //Tambah 2 penumpang
        Bus.cetakPenumpang();
        //Penambahan penumpang
        Bus.addpenumpang(2); //Tambah 2 penumpang
        Bus.cetakPenumpang();
    }
}
