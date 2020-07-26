package com.sasdos.practice.di.application.controller;

import com.sasdos.practice.di.application.domain.Student;
import com.sasdos.practice.di.application.model.RegistStudentRequest;
import com.sasdos.practice.di.application.model.RegistStudentResponse;
import com.sasdos.practice.di.application.service.SampleDiSerivce;
import com.sasdos.practice.di.application.service.SampleNonDiSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleDiController {

    @Autowired
    private SampleDiSerivce sampleDiSerivce;

    public ResponseEntity<RegistStudentResponse> registStudent(RegistStudentRequest body) throws Exception {

        // リクエストBodyの項目で、Studentオブジェクトを生成
        Student student = new Student(body.getNumber(),body.getNumber(),body.getFurigana());

        /*
        サービスクラスのインスタンス生成がなくなった。
         */

        //登録件数取得
        int result = sampleDiSerivce.registStudent(student);

        // Responseを返却する（登録件数に応じた返却値を、Studentクラスに定義してる）
        return ResponseEntity.ok(new RegistStudentResponse(student.resultMessage(result)));
    }
}
