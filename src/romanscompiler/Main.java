package romanscompiler;

import javax.swing.JOptionPane;

/**
 * 
 * @author Saile Sesiom
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        RomansCompiler roman_compiler = new RomansCompiler();
        
        System.out.println("\nUnidades\n");
        
        roman_compiler.isRoman("iiii");
        roman_compiler.isRoman("iiv");
        roman_compiler.isRoman("ivi");
        roman_compiler.isRoman("viiii");
        roman_compiler.isRoman("iix");
        roman_compiler.isRoman("");
        roman_compiler.isRoman("i");
        roman_compiler.isRoman("ii");
        roman_compiler.isRoman("iii");
        roman_compiler.isRoman("iv");
        roman_compiler.isRoman("v");
        roman_compiler.isRoman("vi");
        roman_compiler.isRoman("vii");
        roman_compiler.isRoman("viii");
        roman_compiler.isRoman("ix");
    }
}
