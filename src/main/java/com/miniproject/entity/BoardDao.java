package com.miniproject.entity;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;



public class BoardDao implements BoardService{

    /*@Autowired
    private SqlSessionFactory sqlSessionFactory;*/


    @Override
    public BoardDao getBoard(int board_no) {
        return null;
    }

    @Override
    public List<BoardDao> getBoardList() {
        return null;
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
