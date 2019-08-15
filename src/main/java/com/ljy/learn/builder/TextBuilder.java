package com.ljy.learn.builder;

/**
 * @author : 夕
 * @date : 2019/8/15
 */

//具体的建造者，实现Builder定义的接口
public class TextBuilder extends Builder {

    public StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("================\n");
        buffer.append("[ " + title + " ]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("+ " + str + "\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append(" ." + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("==================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
