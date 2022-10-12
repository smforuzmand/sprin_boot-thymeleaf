package se.lexicon.sprin_bootthymeleaf.model.dto;


import lombok.*;

import java.time.LocalDate;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryView {


    private int id;
    private String name;
    private LocalDate createDate;

}
