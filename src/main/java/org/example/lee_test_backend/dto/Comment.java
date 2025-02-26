package org.example.lee_test_backend.dto;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Comment {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idx;


    private String content;
    private String writer;




    @ManyToOne
    @JoinColumn(name = "board_idx")
    private Board board;

}
