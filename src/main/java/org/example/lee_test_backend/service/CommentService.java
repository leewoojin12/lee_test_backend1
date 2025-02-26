package org.example.lee_test_backend.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.lee_test_backend.dto.Board;
import org.example.lee_test_backend.dto.req.CommentReqDto;
import org.example.lee_test_backend.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    private final BoardService boardService;


    @Transactional
    public void commentRegister(Long boardIdx ,  CommentReqDto dto) {
        Board board = boardService.getBoardIdx(boardIdx);

        board.increaseCommentCount();

        commentRepository.save(dto.commentRegister(board));
    }
}
