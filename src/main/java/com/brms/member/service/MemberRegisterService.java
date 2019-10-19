package com.brms.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.brms.member.Member;

public class MemberRegisterService {

    @Autowired
    private MemberDao memberDao;

    public MemberRegisterService(){

    }

    public void register(Member member){
        memberDao.insert(member);
    }

}
