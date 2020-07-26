package com.sasdos.practice.di.application.service;

import com.sasdos.practice.di.application.domain.Student;
import com.sasdos.practice.di.application.repository.SampleDiRepository;
import com.sasdos.practice.di.application.repository.SampleNonDiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleDiSerivce {

    @Autowired
    private SampleDiRepository sampleDiRepository;

    public int registStudent(Student student) throws Exception {

        // 不適切な名前じゃないかチェック(今回の例では、気にしないで）
        // 実際の業務だと、この層に業務ロジック入るので、ちょっと付け加えてみた程度です。
        checkName(student.getName());

        /*
        ここのインスタンス化が消えた。
         */

        // 登録件数を返す
        return sampleDiRepository.registStudent(student);
    }

    //　不適切名前チェック
    private void checkName(String name) throws Exception {
        if(name == "不適切な名前"){
            throw new Exception();
        }
    }

}
