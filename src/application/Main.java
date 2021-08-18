package application;

import java.util.ArrayList;

import abstraction.Tree;
import abstraction.Trunk;
import implementation.Oak;
import implementation.Spruce;

public class Main {

    public static void main(String[] args) {
        Tree oak = new Oak(0L, new Trunk("Main oak trunk"), new ArrayList<>(), new ArrayList<>());
        growUpAndPrintDetails(oak);
        Tree spruce = new Spruce(0L, new Trunk("Main spruce trunk"), new ArrayList<>(), new ArrayList<>());
        growUpAndPrintDetails(spruce);
    }

    private static void growUpAndPrintDetails(Tree tree) {
        tree.growUp();
        tree.growUp();
        tree.growUp();
        tree.growUp();
        tree.growUp();
        System.out.println(tree.getBranches().size());
        System.out.println(tree.getLeaves().size());
        System.out.println();
    }
}
