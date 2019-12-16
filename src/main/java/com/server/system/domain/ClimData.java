package com.server.system.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Data
public class ClimData implements Serializable {

    @Id
    @Size(max = 8)
    private String fecha;
    private Double temp;
}
