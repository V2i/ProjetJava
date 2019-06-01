package maze;
import graph.*;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.Serializable;


public class Maze implements Serializable {

    private GraphImpl graph;
    private int height;
    private int width;

    public Maze(){

    }

    public Maze(ArrayList<Vertex> cells, int height, int width) {
        this.height = height;
        this.width = width;
        this.graph = new GraphImpl(cells);
    }

    public String toString(){
        String res = "";
        int h = 1;
        int w = 0;
        for(Vertex vertex : this.graph.getListVertex()) {
            Cell cell = (Cell) vertex;
            if(cell.getType() == CellType.Dbox){
                res += "D";
            } else if(cell.getType() == CellType.Abox){
                res += "A";
            } else if(cell.getType() == CellType.Ebox){
                res += ".";
            } else if(cell.getType() == CellType.Wbox){
                res += "#";
            }
            w++;
            if (w == this.width) {
                res += "\n";
                w = 0;
                h++;
            } else {
                res += " ";
            }
        }
        return res;
    }

    public void saveMaze(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Veuillez saisir le nom du maze à sauvegarder avec l'extension: .ser :");
      String filename  = sc.nextLine();

      FileOutputStream fos = null;
      ObjectOutputStream out = null;
      try {
          fos = new FileOutputStream(filename);
          out = new ObjectOutputStream(fos);
          out.writeObject(this);
          out.close();

      } catch (Exception ex) {
          ex.printStackTrace();
      }
      System.out.println("Save done !");
    }

    public void loadMaze(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Veuillez saisir le nom du maze à charger avec l'extension: .ser :");
      String filename  = sc.nextLine();

      FileInputStream fis = null;
      ObjectInputStream in = null;
      Maze newMaze = new Maze();
      try {
          fis = new FileInputStream(filename);
          in = new ObjectInputStream(fis);
          newMaze = (Maze) in.readObject();
          in.close();
      } catch (Exception ex) {
          ex.printStackTrace();
      }
      this.width = newMaze.width;
      this.height = newMaze.height;
      this.graph = newMaze.graph;

      System.out.println("Load done !");
    }

}