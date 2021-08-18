package abstraction;

import java.util.List;

public abstract class Tree {

    private Long id;
    private Trunk trunk;
    protected List<Branch> branches;
    protected List<Leaf> leaves;

    public Tree(Long id, Trunk trunk, List<Branch> branches, List<Leaf> leaves) {
        this.id = id;
        this.trunk = trunk;
        this.branches = branches;
        this.leaves = leaves;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public List<Leaf> getLeaves() {
        return leaves;
    }

    public abstract void growUp();
}
