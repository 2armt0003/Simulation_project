/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation_project;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author bebo
 */
public class processes {
   
    
    
    
    //fun to calculate cumulative , take list  of probailites
    public void calucCumulative(Info info){
        System.out.println(info.probaility.size());
        for(int i = 0; i < info.probaility.size(); i++){
            double  sum = 0;
            for(int k =i ; k >=0 ; k--){
                sum+= info.probaility.get(k);
            }
            sum = Math.round(sum*100.0)/100.0;
            info.cumulativeProbaility.add(i, sum);
        }
        
    }//end fun
    
    //fun to calculate cumulative , take list  of probailites
    public void calucIntervalsNum(Info info){
        
        for(int i = 0; i < info.cumulativeProbaility.size(); i++){
            int intr = (int) (info.cumulativeProbaility.get(i) * 100) ;
            info.intervalRandomNum.add(i, intr);
            String range;
            if(i == 0)
                 range =   " 1 to " + info.intervalRandomNum.get(i) ;
            else
                range = (info.intervalRandomNum.get(i-1)+1) + " to " + info.intervalRandomNum.get(i) ;
            
            info.intervalRandomNumRange.add(i, range);
            
        }
        
    }//end fun
    
    //fun to simulated daly demand  , take list  of randm num and num of days to simulate 
    public void calucSimulatedDalyDemand(Info info){
        
        double sum = 0; 
        
        for(int i = 0; i < info.numOfDays; i++){
            Random rand = new Random();
           int randNumber = rand.nextInt((100 - 0) + 1) + 0;
           info.randmNumber.add(randNumber);
           System.out.println(randNumber);
            
           for(int k = 0;  k < info.demand.size(); k++){
               if(k == 0){
                   if(randNumber >= 0 && randNumber <= info.intervalRandomNum.get(k)){
                       sum+= info.demand.get(k);
                       info.SimulatedDalyDemand.add(info.demand.get(k));
                       
                       
                       
                   }
                   
               }else{
                   System.out.println(k);
                    if(randNumber > info.intervalRandomNum.get(k-1)&& randNumber <= info.intervalRandomNum.get(k))
                    {sum+=  info.demand.get(k);
                       info.SimulatedDalyDemand.add(info.demand.get(k));}
                    else 
                        continue;
                   
               }
           
        
            }
          
           
        }
        info.avarageDemand = sum / (double)info.numOfDays ;
        
        double sumexp = 0;
        for(int i = 0 ; i< info.demand.size(); i++){
            sumexp += info.demand.get(i) * (double)info.probaility.get(i);
                
         }
        
        info.ecpectedDemand = sumexp ;
    }//end fun
    
    
    
}
