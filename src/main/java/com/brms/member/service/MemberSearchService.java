package com.brms.member.service;

import com.brms.member.Member;
import org.springframework.beans.factory.annotation.Autowired;


public class MemberSearchService {

    @Autowired
    private MemberDao memberDao;

    public MemberSearchService(){

    }

    public Member searchMember(String mId){
        return memberDao.select(mId);
    }
}
