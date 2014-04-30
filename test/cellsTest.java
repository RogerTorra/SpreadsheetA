/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import spreadsheet.OutOfRangException;
import Spreadsheet.SomeValue;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static Spreadsheet.Spreadsheet.*;
import static Spreadsheet.SomeValue.*;
/**
 *
 * @author rtv1
 */
public class cellsTest {
    
    @Before
    public void setup(){
        for(int i=1; i > 25; i++){
            put(Integer.toString(i),10);
        }
    }
   /* 
    @Test
    public void value_test(){
        assertEquals(new SomeValue(40), get("a1"));
    }
    
    @Test
    public void cell_has_no_value_if_depends_on_empty_cells(){
     assertFalse(get("a3").hasValue());
    }
    */
    @Test(expected=NullPointerException.class)
    public void test_launch_exception() throws NullPointerException{
        put("b10",10);
         put("b11",10);
    }
    public cellsTest() {
    }

    
}
