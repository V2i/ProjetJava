package maze;

import graph.*;

import java.io.Serializable;


public class Cell extends Vertex implements Serializable{

    private CellType type;
    private int x;
    private int y;

    public Cell(CellType type, int x, int y, Object object){
        super(object);
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public CellType getType(){
        return this.type;
    }

    public void setType(CellType type){
        this.type = type;
    }

    public int getX(){
        return this.x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }

    public void setType(int y){
        this.y = y;
    }
} 