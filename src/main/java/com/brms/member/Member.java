package com.brms.member;

public class Member  {

    private String mId;
    private String mPw;
    private String mName;

    public Member(String mId, String mPw, String mName){
        this.mId = mId;
        this.mPw = mPw;
        this.mName = mName;
    }

    public String getmId(){
        return this.mId;
    }

    public void setmId(String mId){
        this.mId = mId;
    }

    public String getmPw(){
        return this.mPw;
    }

    public void setmPw(String mPw){
        this.mPw = mPw;
    }

    public String getName(){
        return this.getName();
    }

    public void setName(String mName){
        this.mName = mName;
    }
}
