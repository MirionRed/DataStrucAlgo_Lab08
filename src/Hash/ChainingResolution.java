/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash;

import java.util.LinkedList;

/**
 *
 * @author Red King
 */
public class ChainingResolution {

    public static void main(String[] args) {
        LinkedList[] ChainingResolution = new LinkedList[19];

        int[] numbers = {224562, 137456, 214562, 140145, 214576, 162145, 144467, 199645, 234534};
        for (int i = 0; i < numbers.length; i++) {
            int key = numbers[i] % 19;
            if (ChainingResolution[key] == null) {
                ChainingResolution[key] = new LinkedList();
            }
            ChainingResolution[key].add(numbers[i]);
        }

        for (int i = 0; i < ChainingResolution.length; i++) {
            System.out.print(i + " - ");
            if (ChainingResolution[i] != null) {
                for (int j = 0; j < ChainingResolution[i].size(); j++) {
                    System.out.print(ChainingResolution[i].get(j) + ", ");
                }
            }
            System.out.println();
        }
    }
}
