package com.senla.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "rentpoint")
public class RentPoint  extends AbstractEntity {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer rent_point_id;
    @NonNull

    private String address;
    @NonNull
    private String phone;

    @OneToMany(mappedBy = "rentPoint", cascade = CascadeType.ALL)
    private List<com.senla.entity.Scooter> scooterList;

    @NonNull
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id")
    private com.senla.entity.City city;

    @Override
    public String toString() {
        return "RentPoint{" +
               ", Address='" + address + '\'' +
                ", Phone='" + phone + '\'' +
                '}';
    }
}
