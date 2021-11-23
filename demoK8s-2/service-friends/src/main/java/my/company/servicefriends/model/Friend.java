package my.company.servicefriends.model;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "friend")
@Entity
public class Friend {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    public Friend(String userName) {
        this.name = userName;
    }

    public Friend() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}