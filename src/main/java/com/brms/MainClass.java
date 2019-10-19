package com.brms;

import com.brms.book.Book;
import com.brms.book.service.BookRegisterService;
import com.brms.book.service.BookSearchService;
import com.brms.member.Member;
import com.brms.member.service.MemberRegisterService;
import com.brms.member.service.MemberSearchService;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        String[] bNum = {"123", "456", "789"};
        String[] bTitle = {"HTML", "CSS", "JAVA"};

        String[] mIds = {"rabiit", "hippo", "raccoon"};
        String[] mPws = {"950327", "950328", "950329"};
        String[] mNames = {"오동진", "주용우", "박종운"};

        // 스프링 컨테이너 생성
        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext("classpath:bookApplicationContext.xml");

        // 더미 도서 목록 등록
        BookRegisterService bookRegisterService =
                ctx.getBean("bookRegisterService", BookRegisterService.class);

        for (int i = 0; i < bNum.length; i++) {
            Book book = new Book(bNum[i], bTitle[i], true, null);
            BookRegisterService.register(book);
        }

        // 더미 도서 목록 출력
        BookSearchService bookSearchService =
                ctx.getBean("bookRegisterService", BookSearchService.class);
        System.out.println("nbNum / tbTitle / tbCanRen / tbLenderId");
        System.out.println("---------------------------------------");
        for (int i = 0; i < bNum.length ; i++) {
            Book book = bookSearchService.searchBook(bNum[i]);

            System.out.print(book.getbNum() + "\t");
            System.out.print(book.getbTitle() + "\t");
            System.out.print(book.isbCanRental() + "\t");
            System.out.print(book.getbMember() + "\n");

        }

        // 더미 회원 목록 등록
        MemberRegisterService memberRegisterService =
                ctx.getBean("memberRegisterService", MemberRegisterService.class);
        for (int i = 0; i < mIds.length ; i++) {
            Member member = new Member(mIds[i], mPws[i], mNames[i]);
            MemberRegisterService.register(member);
        }

        // 더미 회원 목록 출력
        MemberSearchService memberSearchService =
                ctx.getBean("memberSearchSerivce", MemberSearchService.class);
        System.out.println("nmId / tmPw / tmName ");
        System.out.println("----------------------------------------");
        for (int i = 0; i < mIds.length; i++) {
            Member member = memberSearchService.searchMember(mIds[i]);
            System.out.print(member.getmId() + "\t");
            System.out.print(member.getmPw() + "\t");
            System.out.print(member.getName() + "\n");
            
        }

        // 도서 대여 목록 등록

        // 도서 대여 목록 출력

    }}

