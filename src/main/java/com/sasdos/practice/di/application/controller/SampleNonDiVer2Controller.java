package com.sasdos.practice.di.application.controller;

import com.sasdos.practice.di.application.domain.Student;
import com.sasdos.practice.di.application.model.RegistStudentRequest;
import com.sasdos.practice.di.application.model.RegistStudentResponse;
import com.sasdos.practice.di.application.service.SampleNonDiSerivce;
import com.sasdos.practice.di.application.service.SampleNonDiVer2Serivce;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleNonDiVer2Controller {

    public ResponseEntity<RegistStudentResponse> registStudent(RegistStudentRequest body) throws Exception {

        // リクエストBodyの項目で、Studentオブジェクトを生成
        Student student = new Student(body.getNumber(),body.getNumber(),body.getFurigana());

        // Studentオブジェクトを元にDB登録
        // Service層を利用するので、インスタンス化実施
        SampleNonDiVer2Serivce serviceInstance = new SampleNonDiVer2Serivce();

        // 登録件数取得
        // ここでは、repository層の実態を渡してあげる必要が出てきます。ん。。。これは依存クラスが多ければ多いほど、呼び元（今回だとController)
        // の負担が肥大化する　＋　クラス間の依存性がいびつな形になります。
        // int result = serviceInstance.registStudent(student);

        // Responseを返却する（登録件数に応じた返却値を、Studentクラスに定義してる）
        // コンパイル通すため、１固定で返すよう修正
        return ResponseEntity.ok(new RegistStudentResponse(student.resultMessage(1)));
    }
}
