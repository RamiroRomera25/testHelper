package ar.edu.utn.frc.tup.lciii;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DistritoDTO {
    private Long id;
    private String nombre;
}
