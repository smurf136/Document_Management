package entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "protocols")
public class Protocols implements Serializable{

    @Id
    @Column(name = "protocol_id", columnDefinition = "char(5)")
    private String protocolId;
    @Column(name = "protocol_name")
    private String protocolName;

}
