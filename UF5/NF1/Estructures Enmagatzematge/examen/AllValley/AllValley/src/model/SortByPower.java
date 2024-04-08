/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Comparator;

/**
 *
 * @author mabardaji
 */
public class SortByPower implements Comparator<KarateMember>{

    @Override
    public int compare(KarateMember o1, KarateMember o2) {
        int comparator = o2.getPower() - o1.getPower();
        return comparator;
    }
    
}
