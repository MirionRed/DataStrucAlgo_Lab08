/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash;

/**
 *
 * @author Red King
 */
public class LinearProbing {

    public static void main(String[] args) {
        int[] LinearProbing = new int[19];
        int[] numbers = {224562, 137456, 214562, 140145, 214576, 162145, 144467, 199645, 234534};
        for (int i = 0; i < numbers.length; i++) {
            int key = numbers[i] % 19;
            for (int j = key; j < LinearProbing.length; j++) {
                if (Integer.toString(LinearProbing[j]).equals("0")) {
                    LinearProbing[j] = numbers[i];
                    j = LinearProbing.length;
                }
            }
        }
        
        for(int i = 0; i < LinearProbing.length; i++){
            System.out.print(i + " - ");
            if(!Integer.toString(LinearProbing[i]).equals("0")){
                System.out.println(LinearProbing[i]);
            } else {
                System.out.println();
            }
        }
    }
}
