/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spreadsheet;
/**
 *
 * @author Roger_Torra
 */
public class Expression {
    
    MaybeValue result;
    
    public void add(Expression exp){}
    public void get(Expression exp){}
    
    public double eval(){
        return 40;
    }
    public Expression(String a, String b) {
        this.result = null;
    }
    public Expression() {
        this.result = null;
    }
    public Expression plus(String a,String b){
        return null;
    }
}
