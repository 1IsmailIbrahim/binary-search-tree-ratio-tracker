package q2;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the ratio");
        float ratio = s.nextFloat();
        BST tree = new BST();
        
        while (BST.ratioAtTheMoment < ratio) {
            int i = s.nextInt();
            if (i == -1) {
                System.out.println("ratio=" + BST.total + "/" + BST.num + "=" + BST.ratioAtTheMoment);
                System.out.println("only few repetitions");
                continue;
            } else {
                tree.insert(i);
            }
            BST.ratioAtTheMoment = BST.total / BST.num;
        }
        
        if (BST.ratioAtTheMoment >= ratio) {
            System.out.println("ratio=" + BST.total + "/" + BST.num + "=" + BST.ratioAtTheMoment);
            System.out.println("many repetitions ");
        }
    }
}
