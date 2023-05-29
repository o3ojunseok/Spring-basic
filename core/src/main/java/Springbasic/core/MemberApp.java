package Springbasic.core;

import Springbasic.core.member.Grade;
import Springbasic.core.member.Member;
import Springbasic.core.member.MemberService;

public class MemberApp {
    public static void main(String[] args) {
//        MemberService memberService = new MemberServiceImpl(memberRepository);


        // 직접 memberService를 생성하는것이 아닌, appconfig에서 불러온다.
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
