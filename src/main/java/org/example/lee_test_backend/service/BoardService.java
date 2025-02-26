package org.example.lee_test_backend.service;


import lombok.RequiredArgsConstructor;
import org.example.lee_test_backend.dto.Board;
import org.example.lee_test_backend.dto.req.BoardRegisterReqDto;
import org.example.lee_test_backend.dto.res.BoardPageResDto;
import org.example.lee_test_backend.dto.res.BoardResDto;
import org.example.lee_test_backend.repository.BoardRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {



    private final BoardRepository boardRepository;




    // 글 쓰기
    public void boardCreate(BoardRegisterReqDto dto) {


        boardRepository.save(dto.toEntity());


    }


    public BoardPageResDto list(int page, int size) {
        Page<Board> result = boardRepository.findAll(PageRequest.of(page, size));
        return BoardPageResDto.from(result);
    }

    public BoardResDto read(Long boardIdx) {
        Board board = boardRepository.findById(boardIdx).orElseThrow();
        return BoardResDto.from(board);

    }

    public Board getBoardIdx(Long boardIdx) {
        return boardRepository.findById(boardIdx).orElseThrow();
    }
}

