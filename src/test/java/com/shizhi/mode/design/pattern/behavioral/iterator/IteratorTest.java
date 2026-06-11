package com.shizhi.mode.design.pattern.behavioral.iterator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class IteratorTest {
    @Test
    public void test(){
        FixedTaskList fixed = new FixedTaskList(2);
        fixed.add(new Task("紧急修复"));
        fixed.add(new Task("发布版本"));

        FlexibleTaskList flexible = new FlexibleTaskList();
        flexible.add(new Task("需求评审"));
        flexible.add(new Task("技术分享"));

        List<TaskList> allTaskLists = new ArrayList<>();
        allTaskLists.add(fixed);
        allTaskLists.add(flexible);

        List<String> allTitles = new ArrayList<>();
        for (TaskList list : allTaskLists) {
            TaskIterator it = list.createIterator();
            while (it.hasNext()) {
                allTitles.add(it.next().getTitle());
            }
        }

        System.out.println("4:" +allTitles.size());
        System.out.println("紧急修复:"+ allTitles.get(0));
        System.out.println("发布版本:"+ allTitles.get(1));
        System.out.println("需求评审:"+allTitles.get(2));
        System.out.println("技术分享:"+ allTitles.get(3));
    }
}
