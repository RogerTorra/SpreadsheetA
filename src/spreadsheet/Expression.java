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
        return result.getValue();
    }
    public Expression(String a, String b) {
        this.result = null;
    }
    public Expression(double a, double b) {
        this.result = new SomeValue(a+b);
    }
    public Expression() {
        this.result = null;
    }
}
