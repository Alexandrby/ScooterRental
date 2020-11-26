package com.senla.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "user")
public class User extends AbstractEntity {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer user_id;

    @NonNull
    private String login;
    @NonNull
    private String password;

 /*   @OneToOne(mappedBy = "discount",cascade = CascadeType.ALL)
    @JsonIgnore
    private Profile profile;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;*/

    @Override
    public String toString() {
        return "LoginData{" +
                "LoginId=" + user_id +
                ", Login='" + login + '\'' +
                ", Password='" + password + '\'' +
                '}';
    }
}
