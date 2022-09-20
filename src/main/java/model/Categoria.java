package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class Categoria implements Serializable {

    private Long id;
    private String nome;
    private String descricao;
    private LocalDateTime created;
    private LocalDateTime updated;
}
