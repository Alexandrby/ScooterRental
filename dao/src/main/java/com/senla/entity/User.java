package com.senla.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;



@Data
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User extends AbstractEntity {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "user_id")
    private Integer userId;

    @NotNull
    private String login;
    @NotNull
    private String password;

    @NotNull
    private String role;

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    @JsonIgnore
    private Profile profile;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", login='" + login + '\'' +
                ", profile=" + profile +
                '}';
    }
}
