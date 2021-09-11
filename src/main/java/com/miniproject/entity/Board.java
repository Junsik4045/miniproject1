package com.miniproject.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Board {
    private int board_no;
    private int comment_no;
    private int file_no;
    private String category;
    private String title;
    private String content;
    private LocalDateTime regDate;
    private int vote;
    private int subscribe;
    private String writer;
    private String header;

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Board){
            Board board = (Board)obj;
            return board_no == board.getBoard_no();
        }
        return false;
    }

    @Override
    public int hashCode(){
        return board_no;
    }

    @Override
    public String toString(){
        return "board_no : "+board_no+
                "comment_no : "+comment_no+
                "file_no : "+file_no+
                "category : "+category+
                "title : "+title+
                "content : "+content+
                "regDate : "+regDate.toString()+
                "vote : "+vote+
                "subscribe : "+subscribe+
                "writer : "+writer+
                "header : "+header;
    }

}
