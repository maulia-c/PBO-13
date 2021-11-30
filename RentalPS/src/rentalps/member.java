/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalps;

import java.util.ArrayList;
import static java.util.Collections.binarySearch;

/**
 *
 * @author Maulia
 */
public class member{
    String member;
    
    ArrayList<String> id = new ArrayList<String>();
    
    
    String[][] data = {
        {"Mr.X","silver"},{"Mr.Y","gold"},{"Mr.Z","platinum"}
    };
    
    
    int indexmember(){
        id.add("M001");
        id.add("M002");
        id.add("M003");

        int index = binarySearch(id, member);
        return index;
    }

    
    int jenismember(){
        int i = indexmember();
        String x = data[i][1];
        int a = 0;
        if (x == "silver") {
            a=1;
        } else if (x == "gold"){
            a=2;
        } else if (x == "platinum"){
            a=3;
        }
        System.out.println("ID Member       : " + id.get(i));
        System.out.println("Nama Member     : " + data[i][0]);
        System.out.println("Jenis Member    : " + data[i][1]);
        return a;
    }
}
