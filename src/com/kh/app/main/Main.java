package com.kh.app.main;

import com.kh.app.jdbc.JdbcTemplate;
import com.kh.app.member.view.MemberMenu;

import java.sql.Connection;

public class Main {

    public static String LoginMemberNick;


    public static void main(String [] args) throws Exception{

        Connection conn = JdbcTemplate.getConnection();

        MemberMenu mm = new MemberMenu();
        while(true){
            boolean isFinish = mm.startService();
            if(isFinish){break;}
        }
        System.out.println("===== 프로그램 종료 =====");

    }
}
