/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import spreadsheet.SomeValue;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import spreadsheet.Expression;
import static spreadsheet.Spreadsheet.*;

/**
 *
 * @author rtv1
 */
public class cellsTest2 {
    
    @Before
    public void setup(){
       //put("a3",plus(1.0,1.0)); 
       put("a2",plus("a0","a1"));
    }
    @Test
    public void cell_has_no_value_if_depends_on_empty_cells(){
     assertFalse(get("a2").hasValue());
    }
    @Test
    public void value_test(){
        put("a0",1.0);
        put("a1",1.0);
        //assertEquals(new SomeValue(2.0), get("a3"));
        assertEquals(new SomeValue(4.0), get("a2"));
    }
    public cellsTest2() {
    }

    
}
