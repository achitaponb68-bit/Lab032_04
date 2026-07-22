package com.example.lab4;

import java.util.ArrayList;
import java.util.List;

public class  CheckListNote extends Note {
    private List<String> checkList;

    public CheckListNote(String title, String content) {
        super(title,content);
        this.checkList = new ArrayList<>();
    }
    public List<String> getCheckList(){
        return checkList;
    }
    public void setCheckList(List<String> checkList){
        this.checkList = checkList;
    }
    @Override
    public String getSummary(){
        return "[" + formatDate() + "]" + getTitle()+ " (เช็คลิสต์): มีทั้งหมด " + checkList.size() + " รายการ";
    }
}
