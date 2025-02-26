package org.example.lee_test_backend.dto.res;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.lee_test_backend.dto.Board;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardPageResDto {



        private int page;
        private int size;
        private long totalElements;
        private int totalPages;
        private boolean hasNext;
        private boolean hasPrevious;

        private List<BoardResDto> boardResDtoList;

        public static BoardPageResDto from(Page<Board> coursePage) {
            return BoardPageResDto.builder()
                    .page(coursePage.getNumber())
                    .size(coursePage.getSize())
                    .totalElements(coursePage.getTotalElements())
                    .totalPages(coursePage.getTotalPages())
                    .hasNext(coursePage.hasNext())
                    .hasPrevious(coursePage.hasPrevious())
                    .boardResDtoList(coursePage.stream().map(BoardResDto::from).collect(Collectors.toList()))
                    .build();
        }

}
