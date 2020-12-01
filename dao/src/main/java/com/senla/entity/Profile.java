package com.senla.entity;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@Entity
@Table (name = "profile")
public class Profile extends AbstractEntity  {

  @Id
  @GeneratedValue(generator = "increment")
  @GenericGenerator(name = "increment", strategy = "increment")
  @Column(name = "profile_id")
  private Integer profileId;

  @NotNull
  private String role;

  @NotNull
  @Column(name = "first_name")
  private String firstName;

  @NotNull
  @Column(name = "second_name")
  private String secondName;

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
