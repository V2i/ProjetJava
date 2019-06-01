package maze;

import graph.*;

import java.util.ArrayList;


public class TestMaze{

    public static void main(String[] args) {
        
        Cell c1 = new Cell(CellType.Dbox, 0, 0, null);
        Cell c2 = new Cell(CellType.Ebox, 1, 0, null);
        Cell c3 = new Cell(CellType.Ebox, 2, 0, null);
        Cell c4 = new Cell(CellType.Ebox, 0, 1, null);
        Cell c5 = new Cell(CellType.Wbox, 1, 1, null);
        Cell c6 = new Cell(CellType.Ebox, 2, 1, null);
        Cell c7 = new Cell(CellType.Ebox, 0, 2, null);
        Cell c8 = new Cell(CellType.Ebox, 1, 2, null);
        Cell c9 = new Cell(CellType.Abox, 2, 2, null);

        ArrayList<Vertex> cells = new ArrayList<Vertex>();
        cells.add(c1);
        cells.add(c2);
        cells.add(c3);
        cells.add(c4);
        cells.add(c5);
        cells.add(c6);
        cells.add(c7);
        cells.add(c8);
        cells.add(c9);

        Maze maze = new Maze(cells, 3, 3);
        System.out.println(maze);
        maze.saveMaze();


        Maze loadedMaze = new Maze();
        loadedMaze.loadMaze();
        System.out.println(loadedMaze);

    }
}