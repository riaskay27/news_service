package ua.com.terminals.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="terminal")
public class Terminal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String house;

    @Column(nullable = false)
    private String status;

    public Terminal(String name, String city, String street,String house, String status) {
        this.name=name;
        this.city=city;
        this.street=street;
        this.house=house;
        this.status=status;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
