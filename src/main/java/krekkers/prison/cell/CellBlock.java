package krekkers.prison.cell;

import java.util.HashMap;

public class CellBlock {

    HashMap<Integer, Cell> cellMap;
    int cellBlockId;
    String displayName;
    public CellBlock(int cellBlockId){
        this.cellBlockId = cellBlockId;
    }

    /**
     * Gets the cell out of the cellblock
     * @param id id of cell.
     * @return Cell or null
     */
    public Cell getCell(int id){
        return cellMap.getOrDefault(id, null);
    }

}
