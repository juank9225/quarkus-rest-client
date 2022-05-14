package org.gs.modelo.pokemon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Abilitie {
    private Ability ability;
    private Boolean is_hidden;
    private Integer slot;
}
