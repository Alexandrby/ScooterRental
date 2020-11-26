package com.senla.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "RentStory")
public class RentStory  {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer rentStory_id;
    @NonNull
    private Integer rent_duration;
    @NonNull
    private Integer money;
    @NonNull
    private String paid_way;
    @ManyToOne( cascade = CascadeType.PERSIST)
    @JoinColumn(name = "profile_id")
    @JsonIgnore
    private User user;
    @NonNull
    @ManyToOne(optional = false, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "scooter_id")
    private Scooter scooter;

    @Override
    public String toString() {
        return "<br />" + "RentStory{" +
                "rentStoryId=" + rentStory_id +
                ", scooter=" + scooter +
                ", rentDuration=" + rent_duration +
                ", Money=" + money +
                ", paidWay='" + paid_way + '\'' +
                '}';
    }
}
