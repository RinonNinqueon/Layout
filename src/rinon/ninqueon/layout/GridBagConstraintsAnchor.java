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
public enum GridBagConstraintsAnchor
{
    NORTH (GridBagConstraints.NORTH), EAST (GridBagConstraints.EAST), WEST (GridBagConstraints.WEST), SOUTH (GridBagConstraints.SOUTH), NORTHEAST (GridBagConstraints.NORTHEAST),
        SOUTHEAST (GridBagConstraints.SOUTHEAST), NORTHWEST (GridBagConstraints.NORTHWEST), SOUTHWEST (GridBagConstraints.SOUTHWEST),
        FIRST_LINE_START (GridBagConstraints.FIRST_LINE_START), PAGE_START (GridBagConstraints.PAGE_START), FIRST_LINE_END (GridBagConstraints.FIRST_LINE_END), 
        LINE_START (GridBagConstraints.LINE_START), CENTER (GridBagConstraints.CENTER), LINE_END (GridBagConstraints.LINE_END), 
        LAST_LINE_START (GridBagConstraints.LAST_LINE_START), PAGE_END (GridBagConstraints.PAGE_END), LAST_LINE_END (GridBagConstraints.LAST_LINE_END), ; 
    
    private final int value;
    
    GridBagConstraintsAnchor(int  value)
    {
        this.value = value;
    }
    
    public int getValue()
    {
        return value;
    }
}
