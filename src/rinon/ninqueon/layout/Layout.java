package rinon.ninqueon.layout;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 *
 * @author stepa
 */
public class Layout
{
    public String className;
    public Insets insets;
    public GridBagConstraintsFill fill;
    public GridBagConstraintsAnchor anchor;
    public int gridx, gridy;
    public double weightx, weighty;
    public int gridwidth, gridheight;
    public Dimension preferredSize;
    
    public Layout()
    {
        
    }
    
    public void setInsets(int top, int left, int bottom, int right)
    {
        insets = new Insets(top, left, bottom, right);
    }
    
    public void setPreferredSize(int width, int height)
    {
        if (width == 0 || height == 0)
            preferredSize = null;
        else
            preferredSize = new Dimension(width, height);
    }
    
    public GridBagConstraints getGridBagConstraints()
    {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = insets;
        gbc.fill = anchor.getValue();
        gbc.anchor = anchor.getValue();
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.weightx = weightx;
        gbc.weighty = weighty;
        gbc.gridwidth = gridwidth;
        gbc.gridwidth = gridheight;
        return gbc;
    }
}
