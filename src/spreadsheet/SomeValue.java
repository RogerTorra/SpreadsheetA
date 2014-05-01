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
public class SomeValue implements MaybeValue {
    double value;
    public SomeValue(double value) {
        this.value = value;
    }

    public SomeValue() {
        throw new UnsupportedOperationException("Not supported yet.");
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

    public Boolean hasValue() {
        return true;
    }
    
}
