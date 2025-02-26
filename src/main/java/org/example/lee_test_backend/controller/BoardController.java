package org.example.lee_test_backend.controller;


import lombok.RequiredArgsConstructor;
import org.example.lee_test_backend.dto.req.BoardReqDto;
import org.example.lee_test_backend.dto.res.BoardResDto;
import org.example.lee_test_backend.repository.BoardRepository;
import org.example.lee_test_backend.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {


    private final BoardService boardService;
    //Todo     Board 목록 조회 : 게시글의 번호, 제목, 작성자, 댓글의 수를 출력


    @PostMapping("/register")
    public void boardRegister(@RequestBody BoardReqDto dto) {
        boardService.boardCreate(dto);
    }


    //Todo       Board 상세 조회 : 게시글의 제목, 내용, 작성자, 댓글 목록을 출력

//    //Todo       Board 작성 : 제목, 내용, 작성자를 입력

}
