package implementation;

import java.util.List;

import abstraction.Branch;
import abstraction.Leaf;
import abstraction.Tree;
import abstraction.Trunk;

public class Spruce extends Tree {

    public Spruce(Long id, Trunk trunk, List<Branch> branches, List<Leaf> leaves) {
        super(id, trunk, branches, leaves);
    }

    public void growUp() {
        branches.add(new Branch((long) branches.size() + 1));
        int size = leaves.size();
        for (int i = size; i < size + 10000; i++) {
            leaves.add(new Needle((long) i));
        }
    }
}
