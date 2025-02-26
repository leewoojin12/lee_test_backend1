package org.example.lee_test_backend.dto;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Board {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idx;


    private String title;
    private String content;
    private String writer;
    private int commentCount;


    @OneToMany(mappedBy = "board")
    private List<Comment> commentList = new ArrayList<>();

    public void increaseCommentCount() {
        this.commentCount++;
    }
}
