package ar.edu.utn.frc.tup.lciii;

/**
 * Hello Java!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IllegalAccessException {
        ResultadosDTO res = new ResultadosDTO();
        RandomDataForObject.generateRandomValues(res);
        System.out.println(res);
    }
}
