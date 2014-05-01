package spreadsheet;


import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rtv1
 */
public class Sheet {
    int rows, cols;
    Map<String, Cell> Cells;
    public Sheet(int size) {
        this.rows = size;
        this.cols = size;
        Cells = new HashMap<>();
    }
    public void setCell(String name,double value) throws NullPointerException{
        Cell nCell = new Cell(value);
        if(validateSize()){
            Cells.put(name,nCell);
        }else{
            throw new NullPointerException();
        }
    }
    public void setCell(String name, Expression value){
       // Cell nCell = new Cell(value);
        
    }
    
    
     void setCell(String name) {
        Cell nCell = new Cell();
        Cells.put(name,nCell);
    }
    public Cell getCell(String name){
        return Cells.get(name);
    }
    
    public void clear(){
        Cells.clear();
    }

    private Boolean validateSize() {
        if(Cells.size() > rows*cols){
            return false; 
        }
        return true;
    }
   
}
