package com.senla.entity;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@Entity
@Table(name = "city")
public class City extends AbstractEntity {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column (name = "city_id")
    private Integer cityId;

    @NotNull
    @Column(name = "city_name")
    private String cityName;

    @OneToMany(mappedBy = "city",orphanRemoval = true)
    private List<RentPoint> rentPointList;

    @Override
    public String toString() {
        return "City{" +
                "CityName='" + cityName + '\'' +
                '}';
    }
}
