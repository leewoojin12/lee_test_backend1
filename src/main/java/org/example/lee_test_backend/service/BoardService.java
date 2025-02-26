package org.example.lee_test_backend.service;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.lee_test_backend.dto.Board;
import org.example.lee_test_backend.dto.req.BoardReqDto;
import org.example.lee_test_backend.dto.res.BoardResDto;
import org.example.lee_test_backend.repository.BoardRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {



    private final BoardRepository boardRepository;




    // 글 쓰기
    public void boardCreate(BoardReqDto dto) {


        boardRepository.save(dto.toEntity());


    }




}

