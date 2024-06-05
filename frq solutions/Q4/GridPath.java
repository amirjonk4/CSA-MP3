import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A (uncomment first)
  public Location getNextLoc(int row, int col) {
    boolean hasRight = (col + 1 < grid[0].length);
    boolean hasBelow = (row + 1 < grid.length);

    // If both neighbors exist
    if (hasRight && hasBelow) {
        if (grid[row][col + 1] < grid[row + 1][col]) {
            return new Location(row, col + 1);
        } else {
            return new Location(row, row + 1);
        }
    }
    // If only the neighbor to the right exists
    else if (hasRight) {
        return new Location(row, col + 1);
    }
    // If only the neighbor below exists
    else if (hasBelow) {
        return new Location(row + 1, col);
    }
    // Should not reach here 
    return null;
    
  }

  
  // PART B
  public int sumPath(int row, int col) {
    int sum = 0;
    while (row < grid.length - 1 || col < grid[0].length - 1) {
        sum += grid[row][col];
        Location next = getNextLoc(row, col);
        row = next.getRow();
        col = next.getCol();
    }
    //last element
    sum += grid[row][col];
    return sum;
    
  }

  //array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
