package Springbasic.core.discount;

import Springbasic.core.member.Member;

public interface DiscountPolicy {

    // @resturn 할일 대상 금액
    int discount(Member member, int price);

}
