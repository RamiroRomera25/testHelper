package ar.edu.utn.frc.tup.lciii;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResultadosDTO {

    private CargoDTO cargo;
    /**
     * Cantidad de votos escrutados.
     * Igual a la suma de todas las votos a nivel nacional.
     */
    private Integer votosEscrutados;

    /**
     * Lista de nombres de las distritos que componen el padrón nacional
     */
    private List<String> distritos;

    /**
     * Nombre de la agrupación ganadora en el distrito
     */
    private String agrupacionGanadora;

    /**
     * Lista de resultados de las agrupaciones a nivel nacional
     */
    private List<ResultadoAgrupacionDTO> resultadosNacionales;

}
