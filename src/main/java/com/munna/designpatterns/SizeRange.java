package com.munna.designpatterns;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class SizeRange {

    private int id;
    private String name;
    private int age;
    private long size;
}

