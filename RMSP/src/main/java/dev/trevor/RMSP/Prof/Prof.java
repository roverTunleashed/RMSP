package dev.trevor.RMSP.Prof;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "professors")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prof {
    @Id
    private ObjectId id;
    private String name;
    private String Faculty;
    private int quantity;

//    Prof(String profName, String faculty, int profAge){
//        this.name = profName;
//        this.Faculty = faculty;
//        this.quantity = profAge;
//    }
//    @Override
//    public String toString() {
//        return "Prof{name='" + name + "', Faculty='" + Faculty + "'}";
//    }

}
