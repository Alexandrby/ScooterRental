package com.senla.entity;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@Entity
@Table(name = "Scooter")
public class Scooter extends AbstractEntity {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer scooterId;

    @NonNull
    private String model;

    @Enumerated(EnumType.ORDINAL)
    private ScooterStatus status;

    @ManyToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "rent_point_id")
    private RentPoint rentPoint;

    @OneToMany(mappedBy = "scooter", orphanRemoval = true)
    private List<RentStory> rentStoryList;

    @Override
    public String toString() {
        return "Scooter{" +
                "model='" + model + '\'' +
                ", status=" + status +
                '}';
    }
}

