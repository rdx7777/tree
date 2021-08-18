package abstraction;

import java.util.List;

public abstract class Tree {

    private Long id;
    private Trunk trunk;
    protected List<Branch> branches;

    public Tree(Long id, Trunk trunk, List<Branch> branches) {
        this.id = id;
        this.trunk = trunk;
        this.branches = branches;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public abstract void growUp();
}
