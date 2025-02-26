package org.example.lee_test_backend.dto.req;

import lombok.Getter;
import org.example.lee_test_backend.dto.Board;



@Getter
public class BoardRegisterReqDto {


    private String title;
    private String content;
    private String writer;




    public Board toEntity() {
        return Board.builder()
                .title(title)
                .content(content)
                .writer(writer)
                .build();
    }




}
