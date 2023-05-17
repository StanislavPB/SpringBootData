package springdata.demo;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;



@Data
@NoArgsConstructor
@Entity
@Table(name = "vagatable_table")
public class Vegetable {

    @Id
    @Column(name = "id_vegetable")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;

    @Column(name = "vegetable_name")
    private String vegetableName;

    @Column(name = "provider_code")
    private Integer providerCode;




}
