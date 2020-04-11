package thuc_hanh;

import java.util.Random;

class b7b_ArrayExample {
    public Integer[] creatRandom() {
        Random randomNum = new Random();
        Integer[] arr = new Integer[50];
        System.out.println("Elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomNum.nextInt(50);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        return arr;
    }
}
