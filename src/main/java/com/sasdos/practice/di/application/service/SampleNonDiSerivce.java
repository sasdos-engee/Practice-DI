package com.sasdos.practice.di.application.service;

import com.sasdos.practice.di.application.domain.Student;
import com.sasdos.practice.di.application.repository.SampleNonDiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public class SampleNonDiSerivce {

    public int registStudent(Student student) throws Exception {

        // 不適切な名前じゃないかチェック(今回の例では、気にしないで）
        // 実際の業務だと、この層に業務ロジック入るので、ちょっと付け加えてみた程度です。
        checkName(student.getName());

        // 名前チェックが終わったので、DB登録を呼び出す。
        // DI使わないので、ここでインスタンス化。
        SampleNonDiRepository repositoryInstance = new SampleNonDiRepository();

        // 登録件数を返す
        return repositoryInstance.registStudent(student);
    }

    //　不適切名前チェック
    private void checkName(String name) throws Exception {
        if(name == "不適切な名前"){
            throw new Exception();
        }
    }

}
