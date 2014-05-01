package spreadsheet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rtv1
 */
public class Spreadsheet {
    
    private static final Sheet SHEET = new Sheet(5);
    
    public static void put(String name,double value){
        SHEET.setCell(name,value);
    }
    public static void put(String name,Expression value){
        SHEET.setCell(name,value);
    }
     public static void put(String name){
        SHEET.setCell(name);
    }
    public static MaybeValue get(String name){
       return SHEET.getCell(name).getMvalue(); 
    }
    public static void clear(){
        SHEET.clear();
    }
    
    /*
     * Arithmetic Expressions
     */
    public static Expression plus(Double a, Double b){
        return null;
    }
    public static Expression plus(String a, String b){
        return new Expression(a,b);
    }
    public static Expression plus(Expression a, String b){
        return null;
    }
}
