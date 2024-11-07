package ar.edu.utn.frc.tup.lciii;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResultadoDistritoDTO {

    /**
     * Identificador del distrito
     */
    private Long id;

    /**
     * Nombre del distrito
     */
    private String nombre;

    /**
     * Cantidad de votos escrutados.
     * Igual a la suma de todas las votos a nivel distrito.
     */
    private Integer votosEscrutados;

    /**
     * Porcentaje de votantes del districto sobre el total de votantes del padrón nacional
     * Este porcentaje se expresa como un número decimal entre 0 y 1
     */
    private BigDecimal porcentajePadronNacional;

    /**
     * Lista de nombres de las secciones que componen el distrito
     */
    private List<String> secciones;

    /**
     * Nombre de la agrupación ganadora en el distrito
     */
    private String agrupacionGanadora;

    /**
     * Lista de resultados de las agrupaciones en el distrito
     */
    private List<ResultadoAgrupacionDTO> resultadosAgrupaciones;
}
