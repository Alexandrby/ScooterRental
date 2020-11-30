package com.senla.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Data
@NoArgsConstructor
@Entity
@Table(name = "SeasonTicket")
public class SeasonTicket extends AbstractEntity{

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer seasonTicketId;
    private Integer hoursLeft;
    private Integer costPerHour;

    @OneToOne (mappedBy = "seasonTicket",cascade = CascadeType.ALL)
    @JsonIgnore
    private Profile profile;

    @Override
    public String toString() {
        return "SeasonTicket{" +
                "HoursLeft=" + hoursLeft +
                ", CostPerHour=" + costPerHour +
                '}';
    }
}
