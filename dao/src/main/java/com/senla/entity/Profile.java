package com.senla.entity;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table (name = "profile")
public class Profile extends AbstractEntity  {

  @Id
  @GeneratedValue(generator = "increment")
  @GenericGenerator(name = "increment", strategy = "increment")
  private Integer user_id;


  @NonNull
  private String first_name;

  @NonNull
  private String second_name;

  @OneToOne(targetEntity = Discount.class)
  @JoinColumn (name = "discount_id")
  private Discount discount;

  @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "user_id")
  private User user;

  @OneToMany(mappedBy = "profile", fetch = FetchType.LAZY)
  private List<RentStory> rentStoryList;

  @OneToOne(mappedBy = "profile",orphanRemoval = true)
  private SeasonTicket seasonTicket;



}
