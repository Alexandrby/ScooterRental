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

  @OneToOne(optional=false, cascade=CascadeType.ALL)
  @JoinColumn (name = "discount_id")
  private Discount discount;

  @OneToOne(optional=false, cascade = CascadeType.ALL)
  @JoinColumn(name = "profile_id")
  private User user;

  @OneToOne(optional=false, cascade = CascadeType.ALL)
  @JoinColumn(name = "profile_id")
  private SeasonTicket seasonTicket;

  @OneToMany(mappedBy = "profile", fetch = FetchType.LAZY)
  private List<RentStory> rentStoryList;

}
