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
class NoValue implements MaybeValue {

    public NoValue() {
    }

    public Boolean hasValue() {
       return false;
    }
    
}
