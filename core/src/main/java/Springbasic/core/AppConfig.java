package Springbasic.core;

import Springbasic.core.discount.FixDiscountPolicy;
import Springbasic.core.member.MemberService;
import Springbasic.core.member.MemberServiceImpl;
import Springbasic.core.member.MemoryMemberRepository;
import Springbasic.core.order.OrderService;
import Springbasic.core.order.OrderServiceImpl;

// 어플리케이션에 대한 환경 구성 모음
public class AppConfig {

    // appconfig 를 통해서 memberService를 불러 쓴다
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }
    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
