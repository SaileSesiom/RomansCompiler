package romanscompiler;

/**
 * --Números romanos del 1 al 9.
 * --[I, V, X]
 *
 * --Unidades----------
 * W -> IP|VF
 * P -> IH|V|X|Ɛ
 * F -> IG|Ɛ
 * G -> IH|Ɛ
 * H -> I|Ɛ
 * --------------------
 *
 * Versión 1.4.1
 * @author Saile Sesiom
 * https://github.com/SaileSesiom/RomansCompiler
 * https://play.google.com/store/apps/details?id=tech.saile_sesiom.romansvalidator
 */
public class RomansCompiler {    
    String token;

    public RomansCompiler() {
    }
    
    /**
     * Invoca a la primera regla de control de unidades.
     *
     * @param token: cadena de caracteres a evaluar.
     */    
    public void isRoman(String token){
        this.token = token.toUpperCase();
        reglaW(0, token.length(), token.toUpperCase().toCharArray());
    }

    /**
     * Método recursivo de la regla W: [W -> IP|VF]
     * Es el comienzo para el control de unidades.
     *
     * @param i: comienzo o consecutivo de la iteración.
     * @param n: cantidad de caracteres.
     * @param lexema: arreglo que contiene el lexema en caracteres.
     *                       [l, e, x, e, m, a]
     */
    private void reglaW(int i, int n, char[] lexema){
        if(i < n){
            switch(lexema[i]){
                case 'I':
                    reglaP(i + 1, n, lexema);
                    break;
                case 'V':
                    reglaF(i + 1, n, lexema);
                    break;
                default:
                    System.out.println(token + " = INVALID");
                    //mensaje = "INVALID";
                    break;
            }
        }
        else{
            System.out.println("\" \"" + " = INVALID");
            //mensaje = "INVALID";
        }
    }

    /**
     * Método recursivo de la regla P: [P -> IH|V|X|Ɛ]
     * Es parte del control de unidades.
     *
     * @param i: comienzo o consecutivo de la iteración.
     * @param n: cantidad de caracteres.
     * @param lexema: arreglo que contiene el lexema en caracteres.
     *                       [l, e, x, e, m, a]
     */
    private void reglaP(int i, int n, char[] lexema){
        if(i < n){
            switch(lexema[i]){
                case 'I':
                    reglaH(i + 1, n, lexema);
                    break;
                case 'V':
                    if(i + 1 == n){
                        System.out.println(token + " = VALID");
                        //mensaje = "VALID";
                    }
                    else{
                        System.out.println(token + " = INVALID");
                        //mensaje = "INVALID";
                    }
                    break;
                case 'X':
                    if(i + 1 == n){
                        System.out.println(token + " = VALID");
                        //mensaje = "VALID";
                    }
                    else{
                        System.out.println(token + " = INVALID");
                        //mensaje = "INVALID";
                    }
                    break;
                default:
                    System.out.println(token + " = INVALID");
                    //mensaje = "INVALID";
                    break;
            }
        }
        else{
            System.out.println(token + " = VALID");
            //mensaje = "VALID";
        }
    }

    /**
     * Método recursivo de la regla F: [F -> IG|Ɛ]
     * Es parte del control de unidades.
     *
     * @param i: comienzo o consecutivo de la iteración.
     * @param n: cantidad de caracteres.
     * @param lexema: arreglo que contiene el lexema en caracteres.
     *                       [l, e, x, e, m, a]
     */
    private void reglaF(int i, int n, char[] lexema){
        if(i < n){
            switch(lexema[i]){
                case 'I':
                    reglaG(i + 1, n, lexema);
                    break;
                default:
                    System.out.println(token + " = INVALID");
                    //mensaje = "INVALID";
                    break;
            }
        }
        else{
            System.out.println(token + " = VALID");
            //mensaje = "VALID";
        }
    }

    /**
     * Método recursivo de la regla G: [G -> IH|Ɛ]
     * Es parte del control de unidades.
     *
     * @param i: comienzo o consecutivo de la iteración.
     * @param n: cantidad de caracteres.
     * @param lexema: arreglo que contiene el lexema en caracteres.
     *                       [l, e, x, e, m, a]
     */
    private void reglaG(int i, int n, char[] lexema){
        if(i < n){
            switch(lexema[i]){
                case 'I':
                    reglaH(i + 1, n, lexema);
                    break;
                default:
                    System.out.println(token + " = INVALID");
                    //mensaje = "INVALID";
                    break;
            }
        }
        else{
            System.out.println(token + " = VALID");
            //mensaje = "VALID";
        }
    }

    /**
     * Método recursivo de la regla G: [H -> I|Ɛ]
     * Final del control de unidades.
     *
     * @param i: comienzo o consecutivo de la iteración.
     * @param n: cantidad de caracteres.
     * @param lexema: arreglo que contiene el lexema en caracteres.
     *                       [l, e, x, e, m, a]
     */
    private void reglaH(int i, int n, char[] lexema){
        if(i < n){
            switch(lexema[i]){
                case 'I':
                    if(i + 1 == n){
                        System.out.println(token + " = VALID");
                        //mensaje = "VALID";
                    }
                    else{
                        System.out.println(token + " = INVALID");
                        //mensaje = "INVALID";
                    }
                    break;
                default:
                    System.out.println(token + " = INVALID");
                    //mensaje = "INVALID";
                    break;
            }
        }
        else{
            System.out.println(token + " = VALID");
            //mensaje = "VALID";
        }
    }
}

