package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@Table(name = "score")
public class Score implements Serializable {

    @Serial
    private static final long serialVersionUID = 18L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * class id
     */
    private Integer cid;


    private Integer sid;

    private Integer score;

}
