package entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "request_book" )
public class RequestBook {

    @Id
    @Column(name = "book_id", columnDefinition = "char(5)" )
    private String bookId;
    @Column(name = "book_date", columnDefinition = "date")
    private Date bookDate;
    @Column(name = "book_name", columnDefinition = "varchar(255)")
    private String bookName;
    @Column(name = "book_action_date", columnDefinition = "date")
    private Date bookActionDate;
    @Column(name = "action_state", columnDefinition = "varchar(20)")
    private String actionState;
    @Column(name = "protocol_id", columnDefinition = "char(5)")
    private String protocolId;
    @Column(name = "ec", columnDefinition = "varchar(20)")
    private String ec;

}
