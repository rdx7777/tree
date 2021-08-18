package abstraction;

import java.util.List;

public class Branch {

    private Long id;
    private List<Leaf> leaves;

    public Branch(Long id, List<Leaf> leaves) {
        this.id = id;
        this.leaves = leaves;
    }

    public List<Leaf> getLeaves() {
        return leaves;
    }
}
