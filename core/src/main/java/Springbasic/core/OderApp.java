package Springbasic.core;

import Springbasic.core.member.Grade;
import Springbasic.core.member.Member;
import Springbasic.core.member.MemberService;
import Springbasic.core.order.Order;
import Springbasic.core.order.OrderService;

public class OderApp {
    public static void main(String[] args) {
//        MemberService memberService = new MemberServiceImpl(memberRepository);
//        OrderService orderService = new OrderServiceImpl(memberRepository);

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order =" + order);
        System.out.println("order.calculatePrice =" + order.calculatePrice());
    }
}
