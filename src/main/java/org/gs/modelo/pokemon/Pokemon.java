package org.gs.modelo.pokemon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {

    private Long id;
    private String name;
    private Integer base_experience;
    private List<Abilitie> abilities;

}
