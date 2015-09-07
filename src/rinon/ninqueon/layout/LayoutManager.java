/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rinon.ninqueon.layout;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stepa
 */
public class LayoutManager
{
    private static HashMap<String, Layout> layouts;
    
    public LayoutManager()
    {
        layouts = new HashMap<>();
    }
    
    public int openFile(String path)
    {
        FileInputStream fis = null;
        BufferedReader br = null;
        try
        {
            fis = new FileInputStream(path);
            br = new BufferedReader(new InputStreamReader(fis));
            String line;
            
            while ((line = br.readLine()) != null)
            {
		if (line.startsWith("#"))
                    continue;
                String lines[] = line.split("\t");
                
                if (lines.length < 15)
                    continue;
                
                Layout l = new Layout();
                l.className = lines[0];
                l.fill = GridBagConstraintsFill.valueOf(lines[1]);
                l.anchor = GridBagConstraintsAnchor.valueOf(lines[2]);
                l.gridx = Integer.parseInt(lines[3]);
                l.gridy = Integer.parseInt(lines[4]);
                l.weightx = Double.parseDouble(lines[5]);
                l.weighty = Double.parseDouble(lines[6]);
                l.gridwidth = Integer.parseInt(lines[7]);
                l.gridheight = Integer.parseInt(lines[8]);
                l.setInsets(Integer.parseInt(lines[9]), Integer.parseInt(lines[10]), Integer.parseInt(lines[11]), Integer.parseInt(lines[12]));
                l.setPreferredSize(Integer.parseInt(lines[13]), Integer.parseInt(lines[14]));
                
//                System.out.println("Adding '" + l.className + "'");
                layouts.put(l.className, l);
            }
        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(LayoutManager.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
        catch (IOException ex)
        {
            Logger.getLogger(LayoutManager.class.getName()).log(Level.SEVERE, null, ex);
            return 3;
        }
        finally
        {
            try
            {
                br.close();
                fis.close();
            }
            catch (IOException ex)
            {
                Logger.getLogger(LayoutManager.class.getName()).log(Level.SEVERE, null, ex);
                return 2;
            }
        }
        return 0;
    }
    
    public static Layout getLayout(String name)
    {
//        System.out.println("Search for UI item '" + name + "'");
        return layouts.get(name);
    }
}
