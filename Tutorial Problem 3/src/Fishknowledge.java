import javax.swing.*;
public class Fishknowledge {
	public static void main(String[] args) {
		boolean hasFur;
		boolean hasScales;
		int blood = JOptionPane.showConfirmDialog(null, "Does the vertebrate have cold blood?");
	    boolean coldBlood = (blood == JOptionPane.YES_OPTION);
	    
	    int moist = JOptionPane.showConfirmDialog(null, "Does the vertebrate have moist covering?");
	    boolean moistCovering = (moist == JOptionPane.YES_OPTION);
	    
	    int fins = JOptionPane.showConfirmDialog(null, "Does the vertebrate have fins?");
	    boolean hasFins = (fins == JOptionPane.YES_OPTION);
	    
	    if (moistCovering == false) {
	    	int scales = JOptionPane.showConfirmDialog(null, "Does the vertebrate have scales?");
	    	hasScales = (scales == JOptionPane.YES_OPTION);
	    }
	    if (moistCovering == false && hasScales == false) {
	    	int fur = JOptionPane.showConfirmDialog(null, "Does the vertebrate have Fur or?");
	    	hasFur = (fur == JOptionPane.YES_OPTION);
	    }
	    if (coldBlood == true && moistCovering == true)
	    	System.out.print("The vertebrate is an amphibian");
	    
	    else if (coldBlood == true && hasScales == true && hasFins == false)
	    	System.out.print("The vertebrate is a reptile");
	    
	    else if (coldBlood == true && hasScales == true && hasFins == true)
	    	System.out.print("The vertebrate is a fish");
	    
	    else if (coldBlood == false && hasFur == true)
	    	System.out.print("The vertebrate is a mammal");
	    
	    else 
	    	System.out.print("The vertebrate is a bird");
	    
	    
	    
		
	}

}
