package com.javarush.dto;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "city", schema = "world")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String district;

    private Integer population;

    @Override
    public String toString() {
        return "City{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
