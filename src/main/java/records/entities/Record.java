package records.entities;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table (name = "record")
public class Record {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @Column(name = "date")
    private Date date;
    @Column(name = "task")
    private Integer task;
    @Column(name = "client")
    private String client;
    @Column(name = "address")
    private String address;
    @Column(name = "utp")
    private Integer utp;
    @Column(name = "category")
    private Integer category;
    @Column(name = "sum")
    private Integer sum;
    @Column(name = "description")
    private String description;
}
