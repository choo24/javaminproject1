package com.kh.app.member.view;

import com.kh.app.member.controller.MemberController;

import com.kh.app.util.ScannerUtil;

public class MemberMenu {

    MemberController ds = new MemberController();
    public boolean startService() throws Exception{
        //선택지 보여주기
        displayMenu();

        //입력받기
        String input = ScannerUtil.SC.nextLine();

        if("9".equals(input)){
            return true;
        }
        //선택지에 따라 로직 실행
        processService(input);

        return false;
    }

    private void processService(String input) throws Exception {
        switch (input) {
            case "1" : ds.join(); break;
            case "2" : ds.login();break;
            case "3" : break;
            case "4" : break;
            default :
                System.out.println("잘못 입력하셨습니다");
        }

    }

    private void displayMenu(){
        System.out.println("======= 사조참지조 프로그램 ======");
        System.out.println("======= pc방 관리 프로그램 ======");
        System.out.println("1. 회원가입");
        System.out.println("2. 로그인");
        System.out.println("3. 개인정보 수정");
        System.out.println("4. 사람 찾기");
        System.out.println("5. 관리자 모드");
        System.out.println("9. 종료");
    }


}
