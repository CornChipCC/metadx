package com.ktds.metadx.board.mapper;

import java.util.List;

import com.ktds.metadx.board.dto.BoardDTO;
import com.ktds.metadx.board.dto.PageRequestDTO;

public interface BoardMapper {
    List<BoardDTO> getList(PageRequestDTO pageRequestDTO);
    int getListCount(PageRequestDTO pageRequestDTO);

    int insertPost(BoardDTO boardDTO);
    BoardDTO detailPost(Long bno);
}
