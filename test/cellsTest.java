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
public class cellsTest {
    
    @Before
    public void setup(){
       put("a3",plus("a1","b1"));   
    }
    @Test
    public void cell_has_no_value_if_depends_on_empty_cells(){
     assertFalse(get("a3").hasValue());
    }
    @Test
    public void value_test(){
        put("a1",20);
        put("b1",20);
        assertEquals(new SomeValue(40), get("a3"));
    }
    /*   
    @Test(expected=NullPointerException.class)
    public void test_launch_exception() throws NullPointerException{
        put("b10",10);
         put("b11",10);
    }*/
    public cellsTest() {
    }

    
}
