package org.example.lee_test_backend.dto.res;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.lee_test_backend.dto.Board;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardResDto {


    private long idx;
    private String title;
    private String content;
    private String writer;


    public static BoardResDto from(Board board) {
        return BoardResDto.builder()
                .idx(board.getIdx())
                .title(board.getTitle())
                .content(board.getContent())
                .writer(board.getWriter())
                .build();



    }









}
