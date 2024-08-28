package Accenture_PYQS;

import java.util.ArrayList;

public class filterPoitive {
    public static ArrayList<Integer> filterPositiveEle(int arr[]){
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                al.add(arr[i]);
            }
            
        }
        return al;
    }
    public static void main(String[] args) {
        int arr[] ={2,3,6,-4,-2,4};
        System.out.println(filterPositiveEle(arr));
    }
    }

