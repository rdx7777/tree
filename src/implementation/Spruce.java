package implementation;

import java.util.ArrayList;
import java.util.List;

import abstraction.Branch;
import abstraction.Leaf;
import abstraction.Tree;
import abstraction.Trunk;

public class Spruce extends Tree {

    public Spruce(Long id, Trunk trunk, List<Branch> branches) {
        super(id, trunk, branches);
    }

    public void growUp() {
        branches.add(new Branch((long) branches.size() + 1, new ArrayList<>()));
        for (Branch branch : branches) {
            List<Leaf> leaves = branch.getLeaves();
            int size = leaves.size();
            for (int i = size; i < size + 10000; i++) {
                leaves.add(new Needle((long) i));
            }
        }
    }
}
