package org.example.lee_test_backend.dto.res;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.lee_test_backend.dto.Board;
import org.example.lee_test_backend.dto.Comment;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentResDto {


    private String content;
    private String writer;

    public static CommentResDto from(Comment comment) {
        return CommentResDto.builder()
                .content(comment.getContent())
                .writer(comment.getWriter())
                .build();
    }
}
