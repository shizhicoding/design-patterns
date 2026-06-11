package com.shizhi.mode.design.pattern.behavioral.iterator;


import java.util.LinkedList;

//链表版任务列表
public class FlexibleTaskList implements TaskList{
    private final LinkedList<Task> tasks=new LinkedList<>();

    public void add(Task task){
        tasks.add(task);
    }
    @Override
    public TaskIterator createIterator() {
        return new FlexibleIterator();
    }

    //链表迭代器实现
    private class FlexibleIterator implements TaskIterator{
        private int index=0;
        @Override
        public boolean hasNext() {
            return index<tasks.size();
        }

        @Override
        public Task next() {
            return tasks.get(index++);
        }
    }
}
