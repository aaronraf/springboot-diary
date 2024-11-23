package com.devtiro.database.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author {

/*

    use Long object, so it can have null value
    (otherwise it will store 0, which can be confusing)
    same goes with String and Integer

*/
    private Long id;

    private String name;

    private Integer age;

}
