package com.senla.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "discount")
public class Discount  extends AbstractEntity{

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer discount_id;

    @NonNull
    private Integer discount_rate;

    @OneToOne(mappedBy = "discount")
    @JsonIgnore
    private Profile profile;

    @Override
    public String toString() {
        return "Discount{" +
                "DiscountId=" + getDiscount_id() +
                ", DiscountRate=" + discount_rate +
                '}';
    }
}