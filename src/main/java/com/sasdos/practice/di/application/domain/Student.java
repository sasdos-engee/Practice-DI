package com.sasdos.practice.di.application.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    // 学籍番号
    private String number;

    // 氏名
    private String name;

    // ふりがな
    private String furigana;

    //コンストラクタ
    public Student(String number, String name, String furigana){
        //初期化
        this.number = number;
        this.name = name;
        this.furigana = furigana;
    }

    public String resultMessage(int count){
        return count == 1 ? name + "さんは正常に登録されました" : name + "さんの登録に失敗しました";
    }

}