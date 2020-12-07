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
    @Column(name = "season_ticket_id")
    private Integer seasonTicketId;
    @Column(name = "hours_left")
    private Integer hoursLeft;
    @Column(name = "price_per_hour")
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
