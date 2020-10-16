package entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Entity
@Table(name = "response_book")
public class ResponseBook {

    @Id
    @Column(name = "book_id", columnDefinition = "char(5)")
    private String bookId;
    @Column(name = "book_date", columnDefinition = "date")
    private Date bookDate;
    @Column(name = "book_name", columnDefinition = "varchar(255)")
    private String bookName;
    @Column(name = "book_action_date", columnDefinition = "date")
    private Date bookActionDate;
    @Column(name = "res_department", columnDefinition = "varchar(20)")
    private String resDepartment;
    @Column(name = "protocol_id", columnDefinition = "char(5)")
    private String protocolId;
    @Column(name = "source_book_id", columnDefinition = "char(5)")
    private String sourceBookId;
    
}

