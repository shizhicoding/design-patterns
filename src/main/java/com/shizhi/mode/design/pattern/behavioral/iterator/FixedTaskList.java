package com.shizhi.mode.design.pattern.behavioral.iterator;

//数组版任务列表
public class FixedTaskList  implements TaskList {
    private final Task[] tasks;
    private int size=0;

    public FixedTaskList(int size){
        tasks=new Task[size];
    }

    public void add(Task task){
        tasks[size++]=task;
    }

    @Override
    public TaskIterator createIterator() {
        return new FixedIterator();
    }

    //数组迭代器实现
    public class FixedIterator implements TaskIterator{
        private int index=0;
        @Override
        public boolean hasNext() {
            return index<size;
        }

        @Override
        public Task next() {
            return tasks[index++];
        }
    }
}
