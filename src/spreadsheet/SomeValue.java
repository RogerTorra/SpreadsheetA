/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spreadsheet;

/**
 *
 * @author rtv1
 */
public class SomeValue extends Expression implements MaybeValue {
    double value;
    String expression;
    public SomeValue(String a, String b) {
        super(a, b);
    }

    public SomeValue(double value) {
        this.value = value;
    }
    public SomeValue(String value) {
        this.expression = value;
    }

    public String toString() {
        return "SomeValue{" + "value=" + value + '}';
    }

    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.value) ^ (Double.doubleToLongBits(this.value) >>> 32));
        return hash;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SomeValue other = (SomeValue) obj;
        if (Double.doubleToLongBits(this.value) != Double.doubleToLongBits(other.value)) {
            return false;
        }
        return true;
    }

    @Override
    public Boolean hasValue() {
        if(value != 0){
             return true;
        }
        return false;
    }
    @Override
    public String getValue(){
        if(value != 0){
            return Double.toString(value);
        }else{
            return expression;
        }
        
    }
    
}
