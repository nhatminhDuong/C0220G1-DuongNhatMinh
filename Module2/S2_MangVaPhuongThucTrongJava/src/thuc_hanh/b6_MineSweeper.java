package thuc_hanh;

public class b6_MineSweeper {
    public static void main(String[] args) {
        String[][] map = {
                {"*", ".", "*", ".", "."},
                {".", "*", ".", ".", "."},
                {".", "*", ".", ".", "*"}
        };
        final int MAP_HEIGHT = map.length;
        final int MAP_WIDTH = map[0].length;
        String[][] mapReport = new String[MAP_HEIGHT][MAP_WIDTH];

        for (int y = 0; y < MAP_HEIGHT; y++) {
            for (int x = 0; x < MAP_WIDTH; x++) {
                String currentCell = map[y][x];
                if (currentCell.equals("*")) {
                    mapReport[y][x] = "*";
                } else {
                    final int[][] NEIGHBORS = {
                            {y - 1, x - 1}, {y - 1, x}, {y - 1, x + 1},
                            {y, x - 1}, {y, x + 1},
                            {y + 1, x - 1}, {y + 1, x}, {y + 1, x + 1}
                    };
                    int minesAround = 0;
                    for (int i = 0; i < NEIGHBORS.length; i++) {
                        int[] neighbor = NEIGHBORS[i];
                        int xNeighbor = neighbor[1];
                        int yNeighbor = neighbor[0];

                        boolean isOutOfMapNeighbor = xNeighbor < 0
                                || xNeighbor == MAP_WIDTH
                                || yNeighbor < 0
                                || yNeighbor == MAP_HEIGHT;
                        if (isOutOfMapNeighbor) continue;

                        boolean isMineOwnerNeighbor = map[yNeighbor][xNeighbor].equals("*");
                        if (isMineOwnerNeighbor) {
                            minesAround++;
                        }
                        mapReport[y][x] = String.valueOf(minesAround);
                    }
                }
            }
        }
        for (int y = 0; y < MAP_HEIGHT; y++) {
            for (int x = 0; x < MAP_WIDTH; x++) {
                String currentCellReport = mapReport[y][x];
                System.out.print(currentCellReport);
            }
            System.out.println();
        }
    }
}
