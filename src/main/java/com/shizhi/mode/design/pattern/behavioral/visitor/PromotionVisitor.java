package com.shizhi.mode.design.pattern.behavioral.visitor;

import com.shizhi.mode.design.pattern.behavioral.visitor.item.Book;
import com.shizhi.mode.design.pattern.behavioral.visitor.item.Clothing;

//访问者接口
public interface PromotionVisitor {
    void visit(Book book);
    void visit(Clothing clothing);
}
