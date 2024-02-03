package underio.complex.generics;

import java.util.ArrayList;
import java.util.List;

public class BlockStorage<B extends Block> {
    private List<B> blocks;

    public BlockStorage() {
        this.blocks = new ArrayList<>();
    }

    public void addBlock(B block) {
        blocks.add(block);
        System.out.println("Added " + block + " to the block storage!");
    }

    public void displayBlocks() {
        System.out.println("Block/Blocks in our storage");
        for (B block : blocks) {
            System.out.println(" - " + block);
        }
    }
}
