package r2s.com.demo.lab04.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "ADDRESS")
public class Address {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "PROVINCE")
    private String province;

    @Column(name = "DISTRICT")
    private String district;

    @Column(name = "STREET")
    private String street;

    @Column(name = "TYPE")
    private boolean type;

    @Column(name = "DF_ADDRESS")
    private boolean defaultAddress;

    @Column(name = "IS_DELETED")
    private boolean isDeleted;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID", referencedColumnName = "id")
    private User user;
}
