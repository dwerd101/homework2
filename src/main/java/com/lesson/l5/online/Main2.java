package com.lesson.l5.online;

public class Main2 {
    public static void main(String[] args) {

        //Поиск мин. значения
        int[] array = new int[] {123,234,345,232,5433,44,13,55,32};

        //123 =13,234,13=123,
        // int index = 2; temp = 123; array[i(0)]= 13; array[index]=temp;


      /*  int minIndex = 0;
        int minValue = array[0];

        for(int i=0; i<array.length; i++) {
            if(minValue>array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println(minValue);
        System.out.println(minIndex);*/


        //Сортировка выбором (Selection sort)

        for (int a:sortSelection(array)) {
            System.out.print(a+" ");
        }
    }

    public static int[] sortSelection(int[]array) {

        //swap
        //O(n)
        for(int i=0; i<array.length; i++) {
            int index = min(array,i);
            int temp = array[i];
            array[i] =  array[index];
            array[index]=temp;
        }
        return array;
    }

    private static int min(int[]array, int start) {

        //O(n)
        int minIndex = start;
        int minValue = array[start];

        for(int i=start+1; i<array.length; i++) {
            if(minValue>array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
