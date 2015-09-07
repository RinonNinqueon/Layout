/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rinon.ninqueon.layout;

import java.awt.GridBagConstraints;

/**
 *
 * @author stepa
 */
public enum GridBagConstraintsFill
{
    NONE (GridBagConstraints.NONE), HORIZONTAL (GridBagConstraints.HORIZONTAL), VERTICAL (GridBagConstraints.VERTICAL), BOTH (GridBagConstraints.BOTH);
    
    private final int value;
    
    GridBagConstraintsFill(int  value)
    {
        this.value = value;
    }
    
    public int getValue()
    {
        return value;
    }
}
