/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukllaundryy;

/**
 *
 * @author asus
 */
public class Test {
    public static void main(String[] args) {
        
        JenisLaundry daftarJenisLaundry = new JenisLaundry();
        Client daftarClient = new Client();
        Petugas petugas1 = new Petugas();
        Transaksi transaksiLaundry = new Transaksi();
        Laporan laporanLaundry = new Laporan();
        
        laporanLaundry.laporan(daftarJenisLaundry);
        laporanLaundry.laporan(daftarClient);
        laporanLaundry.laporan(transaksiLaundry, daftarJenisLaundry);
        
        transaksiLaundry.prosesTransaksi(daftarClient, transaksiLaundry, daftarJenisLaundry);
        
        laporanLaundry.laporan(daftarJenisLaundry);
        laporanLaundry.laporan(daftarClient);
        laporanLaundry.laporan(transaksiLaundry, daftarJenisLaundry);
    }
}
