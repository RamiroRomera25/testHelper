package ar.edu.utn.frc.tup.lciii;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResultadoVotosDTO {
    private Long id;
    private Long distritoId;
    private Long seccionId;
    private Long cargoId;
    private Long agrupacionId;
    private String votosTipo;
    private Integer votosCantidad;
}
