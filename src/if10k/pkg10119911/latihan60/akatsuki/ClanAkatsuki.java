/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119911.latihan60.akatsuki;

/**
 *
 * @author tegar
 */ 
public class ClanAkatsuki {
    protected String nama;
    protected String clan;
    protected String pasangan;
    
    
    public ClanAkatsuki(String nama, String clan, String pasangan){
        this.nama=nama;
        this.clan=clan;
        this.pasangan=pasangan;
       }
    
    public void tampilAnggota(){
        System.out.println("Nama : "+nama);
        System.out.println("Clan : "+clan);
        System.out.println("pasangan : "+pasangan);
    } 
}
