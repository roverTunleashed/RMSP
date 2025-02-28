package dev.trevor.RMSP.Prof;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "professors")
@Data
public class Prof {
    @Id
    private ObjectId id;
    private String faculty;
    private String picture;
    private String profName;
    //Should retrieve from S3 bucket containing images of profs
    private int rating;
    private String rmpLink;

    Prof(String faculty, String picture, String profName, int rating, String rmpLink){
        this.faculty = faculty;
        this.picture = picture;
        this.profName = profName;
        this.rating = rating;
        this.rmpLink = rmpLink;
    }

}
