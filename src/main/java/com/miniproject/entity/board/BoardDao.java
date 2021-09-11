package com.miniproject.entity.board;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class BoardDao implements BoardService{

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    private String namespace = "boardDB";

    @Override
    public List<Board> getBoardOne(int board_no) {
        return sqlSessionTemplate.selectList(namespace+".selectBoard", board_no);
    }

    @Override
    public List<Board> getBoardList() {
        return sqlSessionTemplate.selectList(namespace+".selectBoardAll");
    }

    @Override
    public void delete(int board_no) {
        sqlSessionTemplate.delete(namespace+".deleteBoard",board_no);
    }

    @Override
    public void update(BoardDto boardDto) {
        sqlSessionTemplate.update(namespace+".updateBoard",boardDto);
    }

    @Override
    public void insert(BoardDto boardDto) {
        sqlSessionTemplate.insert(namespace+".insertBoard",boardDto);
    }
}
