package binarysearchtree;

import java.util.Scanner;

public class BinarySearchTree {

    public static int[] bst = new int[16];
    public static Scanner scan = new Scanner (System.in);
    public static int elemen;
    public static int pilih;
    
    public static void main(String[] args) {
        for(int i = 1; i < 16; i++){
            bst[i] = 0;
        }
        menu();
    }
    
    public static void menu(){
        System.out.println("\n Program Binary Search Tree");
        System.out.println("-----------------------------");
        System.out.println("[1]Insert node");
        System.out.println("[2]View Result");
        System.out.println("[3]Exit");
        System.out.println("-----------------------------");
        System.out.print("Your Choice = ");
        pilih = scan.nextInt();
        
        switch(pilih){
            case 1: insert(); break;
            case 2 : view(); break;
            case 3 : System.exit(0);
        }
        
        
    }
    
    public static void insert(){
        if(bst[1] == 0){
            //input root
            System.out.print("\nInput root : ");
            bst[1] = scan.nextInt();
            menu();
        }
        
        System.out.print("\nInput nodes : ");
        elemen = scan.nextInt();
        int posisi = 1;
         while(posisi < 16 && bst[posisi] != 0){
            if(elemen > bst[posisi]){ 
                posisi = (2 * posisi) + 1;
            }else{
                posisi = 2 * posisi;
            }
        }
        if(posisi > 16){
            System.out.println("Tree penuh !!");
            System.out.println("Keluar Ya... dadah....");
            System.exit(0);
        }
        //kalo uda ketemu posisinya
        bst[posisi] = elemen;
        menu();
    }
    
    public static void view(){
        System.out.print("Array BST adalah : ");
        for(int i = 1; i < 16; i++){
            System.out.print(bst[i]+" ");
        }
        menu();
    }
    
    
}
