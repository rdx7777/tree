package application;

import java.util.ArrayList;

import abstraction.Branch;
import abstraction.Tree;
import abstraction.Trunk;
import implementation.Oak;
import implementation.Spruce;

public class Main {

    public static void main(String[] args) {
        Tree oak = new Oak(0L, new Trunk("Main oak trunk"), new ArrayList<>());
        growUpAndPrintDetails(oak);
        Tree spruce = new Spruce(1L, new Trunk("Main spruce trunk"), new ArrayList<>());
        growUpAndPrintDetails(spruce);
    }

    private static void growUpAndPrintDetails(Tree tree) {
        tree.growUp();
        tree.growUp();
        tree.growUp();
        tree.growUp();
        tree.growUp();
        System.out.println(tree.getBranches().size());
        for (Branch branch : tree.getBranches()) {
            System.out.println(branch.getLeaves().size());
        }
        System.out.println();
    }
}
