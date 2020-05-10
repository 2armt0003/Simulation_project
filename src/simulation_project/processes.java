/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation_project;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;

/**
 *
 * @author bebo
 */
public class processes {
   
    
    //fun to calculate probaility , take list  of range of days of every demand (frequancy)
    public void calucProbaility(Info info){
        int sum = 0;
        for(int i = 0; i < info.frequancy.size(); i++){
            sum += info.frequancy.get(i);
        }
        double prob;
        for(int i = 0; i < info.frequancy.size(); i++){
         prob = info.frequancy.get(i) / sum ;
         info.probaility.add(prob);
        }
        
    }
    
}
