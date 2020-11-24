package com.lesson.l5.online;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[] {123,234,345,232,5433,44,13,55,32};
        //Чтобы использовать бинарный поиск, нам нужно отсортировать массив

        int key = 234;
        int last=array.length-1;
        System.out.println(binarySearchRecursion(array,0,last,key));
    }

    public static int binarySearchRecursion(int[] array, int startIndex, int endIndex, int elementToFind) {

        //O(log n)
        if (endIndex>=startIndex) {
            int  middleIndex = startIndex +(endIndex-startIndex)/2;
            if(array[middleIndex] == elementToFind) {
                return middleIndex;
            }
            if(array[middleIndex]>elementToFind) {
                return binarySearchRecursion(array,startIndex,middleIndex-1,elementToFind);
            }
            else {
                return binarySearchRecursion(array,middleIndex+1,endIndex,elementToFind);}
        }
        return -1;
    }

     /* public static void binarySearch(int arr[], int firstIndex, int lastIndex, int key) {
     // O( n log n )
        int mid = (firstIndex + lastIndex) / 2;
        while (firstIndex <= lastIndex) {
            if (arr[mid] < key) {
                firstIndex = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                lastIndex = mid - 1;
            }
            mid = (firstIndex + lastIndex) / 2;
        }
        if (firstIndex > lastIndex) {
            System.out.println("Element is not found!");
        }
    }*/
}
