package com.yuan.algorithm;

public class TestAlgorithm {
    public static void main(String[] args) {
        Struct struct = new Struct();
        int[] array = {2,4,6,8,13,15,16};
        int i = struct.search_bin(array, 4);
        System.out.println(i);
    }
}

//二分查找
class Struct{
    int search_bin(int[] a,int key){
        int low = 1;
        int high = a.length;
        while(low <= high){
            int mid=(low +high)/2;
            if(key == a[mid]){
                return mid;
            }else if (key < a[mid]) {
                high = mid -1;
            }
            else low= mid+1;
        }
        return 0;
    }
}