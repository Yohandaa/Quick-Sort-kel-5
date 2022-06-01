package com.sda.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] nilai = {15,76,45,98,34};
        quickSort (nilai); 
    }
    public static void quickSort(int[]angka){
        System.out.println("== SEBELUM ==");
        for (int a :angka){
            System.out.print(a + " ");
        }
    
quickSortAlgoritm(angka, 0, angka.length-1);

       System.out.println("\n== SESUDAH ==");
       for (int a :angka){
           System.out.print(a + " ");
       }
   }

   public static void quickSortAlgoritm(int[] angka, int indexAwal, int indexAkhir){

    int i = indexAwal;
    int j = indexAkhir;
    int pivot = angka[indexAwal];
    //perulangan untuk mengecek apakah data masih bisa di cek atau tidak
    while (i <= j){
        //kalau nilai di sebelah kiri kurang dari nilai pivot
        while(angka[i] < pivot){
            i++;
        }
        //kalau nilai di sebelah kanan lebih dari nilai pivot
        while(angka[j] > pivot){
            j--;
        }
        
        if (i <= j){
            int tampungan = angka [i];
            angka [i] = angka [j];
            angka [j] = tampungan;
            i++;
            j--;
        }

    }//akhir pengecekan data
    if (indexAwal < j){
        quickSortAlgoritm(angka,indexAwal,j);
    }
    if (i < indexAkhir){
        quickSortAlgoritm(angka,i ,indexAkhir);
    }
   }
}
