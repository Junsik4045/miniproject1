package com.miniproject.entity.board;

import java.util.List;

public interface BoardService {
    public void insert(BoardDto boardDto);
    public void update(BoardDto boardDto);
    public void delete(int board_no);
    public List<Board> getBoardOne(int board_no);
    public List<Board> getBoardList();
}
