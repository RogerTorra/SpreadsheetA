/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spreadsheet;
import static spreadsheet.Spreadsheet.*;
/**
 *
 * @author Roger_Torra
 */
public class Expression {
    
    MaybeValue result;
    
    public void add(Expression exp){}
    public void getExp(Expression exp){}
    
    public String eval(){
        return result.getValue();
    }
    public Expression(String a, String b) {
        this.result = new SomeValue(a + "+" + b);
    }
    public Expression(double a, double b) {
        this.result = new SomeValue(a+b);
    }
    public Expression() {
        this.result = null;
    }
}
