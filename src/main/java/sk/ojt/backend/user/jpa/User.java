package sk.ojt.backend.user.jpa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "user")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name = "user_name")
    private long userName;

}
