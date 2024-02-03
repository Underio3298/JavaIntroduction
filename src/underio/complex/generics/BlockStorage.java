package underio.complex.generics;

import java.util.ArrayList;
import java.util.List;

public class BlockStorage<B extends Block> {
    private List<B> blocks;

    public BlockStorage() {
        this.blocks = new ArrayList<>();
    }
}
