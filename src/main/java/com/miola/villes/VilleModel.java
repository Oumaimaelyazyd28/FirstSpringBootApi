package com.miola.villes;

import com.miola.endroits.EndroitModel;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "villes")
public class VilleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank
    private String ville_name;

    @OneToMany(mappedBy = "ville", cascade = CascadeType.ALL)
    private List<EndroitModel> endroits;
}
