/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalps;

/**
 *
 * @author Maulia
 */
public class silver{
 
    public int disc, sewa, poin, cashback,pulsa,banyakhari;
    
    int poin(){
        int totalpoin = poin*banyakhari;
        return totalpoin;
    }
    
    int totalsewa(){
        int totalsewa = (sewa*(100-disc)/100)*banyakhari;
        return totalsewa; 
    }
}
