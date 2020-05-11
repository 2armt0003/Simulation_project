/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation_project;

import java.util.ArrayList;

/**
 *
 * @author bebo
 */
public class Info {
    public ArrayList<Integer> demand = new ArrayList<Integer>();
    
    public ArrayList<Integer> randmNumber = new ArrayList<Integer>();
    
    public ArrayList<Integer> SimulatedDalyDemand = new ArrayList<Integer>();
   
    public ArrayList<Double> probaility = new ArrayList<Double>();
  
    
    public int  avarageDemand;
    public int ecpectedDemand;
    
    public ArrayList<Double> cumulativeProbaility = new ArrayList<Double>();
    public ArrayList<Integer> intervalRandomNum = new ArrayList<Integer>();
    
    public int numOfDays;
}
