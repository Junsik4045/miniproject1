package com.miniproject.entity;

import java.util.List;

public interface BoardService {

    public void insert(BoardDao boardDto);
    public void update(BoardDao boardDto);
    public void remove(int board_no);
    public BoardDao getBoard(int board_no);
    public List<BoardDao> getBoardList();
    public List<BoardDao> getBoardSearchList();
}
