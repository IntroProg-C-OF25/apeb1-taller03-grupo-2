public class ejercicio7 {
    public static void main(String[] args) {
        double a; 
        a = (Math.sqrt(81)+9)/3;
        boolean b;
        b = a == 9;
        boolean c;
        c = 10 > 1;
        boolean d;
        d = b ||c;
        double e; 
        e = ((100/25)+Math.sqrt(100));
        /*en la variable e tenemos un dato real por la cual al tener ya un dato booleano no es compatible
        intercambie el dato and(&&) por el dato de cadena que nos muestra los datos no compatibles
        */
        String  respuesta;
        System.out.println("respuesta = " + d+" && " +e);       
         
    }
}
