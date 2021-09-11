package com.miniproject.entity;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BoardDao implements BoardService{

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    private String namespace = "boardDB";


    @Override
    public BoardDao getBoard(int board_no) {
        return sqlSessionTemplate.selectOne(namespace+".selectBoard", board_no);
    }

    @Override
    public List<BoardDao> getBoardList() {
        return sqlSessionTemplate.selectList(namespace+".selectBoardAll");
    }

    @Override
    public List<BoardDao> getBoardSearchList() {
        return null;
    }

    @Override
    public void remove(int board_no) {

    }

    @Override
    public void update(BoardDao boardDto) {

    }

    @Override
    public void insert(BoardDao boardDto) {

    }
}
