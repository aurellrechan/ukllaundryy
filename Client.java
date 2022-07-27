/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukllaundryy;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class Client implements User {
    
    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    
    public Client(){
        
        //0
        this.namaClient.add("Rafli");
        this.alamat.add("Pakisjajar");
        this.telepon.add("085156677888");
        this.saldo.add(10000);
        
        //1
        this.namaClient.add("Alya");
        this.alamat.add("Tulungagung");
        this.telepon.add("081234555666");
        this.saldo.add(30000);
        
        //2
        this.namaClient.add("Adi");
        this.alamat.add("Kepanjen");
        this.telepon.add("081227826219");
        this.saldo.add(30000);
    }
    
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    
    public int getSaldo(int idClient){
        return this.saldo.get(idClient);
    }
    
    public void editSaldo(int idClient, int saldo){
        this.saldo.set(idClient, saldo);
    }
    
    public int getJmlClient(){
        return this.saldo.size();
    }

    @Override //untuk mendeklarasikan method di sub class dari class
    public void setNama(String namaClient) {
        this.namaClient.add(namaClient);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idPetugas) {
        return this.namaClient.get(idPetugas);
    }

    @Override
    public String getAlamat(int idPetugas) {
        return this.alamat.get(idPetugas);
    }

    @Override
    public String getTelepon(int idPetugas) {
        return this.telepon.get(idPetugas);
    }
    
}