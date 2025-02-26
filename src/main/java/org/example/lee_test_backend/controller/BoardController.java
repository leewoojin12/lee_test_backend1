package org.example.lee_test_backend.controller;


import lombok.RequiredArgsConstructor;
import org.example.lee_test_backend.dto.req.BoardRegisterReqDto;
import org.example.lee_test_backend.dto.res.BoardPageResDto;
import org.example.lee_test_backend.dto.res.BoardResDto;
import org.example.lee_test_backend.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {


    private final BoardService boardService;


    @PostMapping("/register")
    public void boardRegister(@RequestBody BoardRegisterReqDto dto) {
        boardService.boardCreate(dto);
    }




    @GetMapping("/list")
    public ResponseEntity<BoardPageResDto> list(int page, int size) {
        BoardPageResDto response = boardService.list(page, size);

        return ResponseEntity.ok(response);
    }

    //Todo       Board 상세 조회 : 게시글의 제목, 내용, 작성자, 댓글 목록을 출력

    @GetMapping("/{boardIdx}")
    public ResponseEntity<BoardResDto> read(@PathVariable Long boardIdx) {
        BoardResDto response = boardService.read(boardIdx);

        return ResponseEntity.ok(response);
    }

}
