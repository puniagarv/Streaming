package com.streaming.app.spring_stream_backend.Entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document(collection = "course-db")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    private ObjectId id;

    @NonNull
    @Indexed(unique = true)
    private String courseName;

    // upload date of the video
    private LocalDateTime dateTime;

    // video related to the course
    @DBRef
    private List<Video> courseVideo = new ArrayList<>();

}
