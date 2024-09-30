package com.streaming.app.spring_stream_backend.Entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "video-stream")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Video {
    @Id

    private ObjectId id;

    // title of the video
    private String title;

    // content type of the video
    private String contentType;

  //     description of the video
    private String videoDes;

    // path where video data is present
    private String path;

    // length of the video
    private Long duration;

    // upload date of the video
    private LocalDateTime uploadDate;

    @DBRef
    Course course;

}
