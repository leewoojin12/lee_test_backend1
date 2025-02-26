package org.example.lee_test_backend.dto.req;

import lombok.Getter;
import org.example.lee_test_backend.dto.Board;
import org.example.lee_test_backend.dto.Comment;


@Getter
public class CommentReqDto {


    private  String content;
    private String writer;




    public Comment commentRegister(Board board) {
        return Comment.builder()
                .content(content)
                .writer(writer)
                .board(board)
                .build();
    }

}
