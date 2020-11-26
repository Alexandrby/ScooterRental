package com.senla.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer city_id;

    @NonNull
    private String city_name;

    @OneToMany(mappedBy = "city",orphanRemoval = true)
    private List<RentPoint> rentPointList;

    @Override
    public String toString() {
        return "City{" +
                "CityName='" + city_name + '\'' +
                '}';
    }
}
