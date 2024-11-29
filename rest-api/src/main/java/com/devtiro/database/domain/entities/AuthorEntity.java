package com.devtiro.database.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "authors")
public class AuthorEntity {

/*

    use Long object, so it can have null value
    (otherwise it will store 0, which can be confusing)
    same goes with String and Integer

*/
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_seq")
    private Long id;

    private String name;

    private Integer age;

}
