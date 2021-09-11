package com.miniproject.entity.board;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardDto implements Board{
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

    @Override
    public void board_no(int board_no) {
        setBoard_no(board_no);
    }

    @Override
    public void comment_no(int comment_no) {
        setComment_no(comment_no);
    }

    @Override
    public void file_no(int file_no) {
        setFile_no(file_no);
    }
}
