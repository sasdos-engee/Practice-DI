package com.sasdos.practice.di.application.repository;

import com.sasdos.practice.di.application.domain.Student;
import org.springframework.stereotype.Repository;

@Repository
public class SampleDiRepository {

    public int registStudent(Student student) {

        // この層で、DB接続、DB登録処理を実施
        // 実際には、ormapper使って頑張ったりの実装が入る。

        // 実際は、登録件数を返すイメージだが今回は固定値１で。
        return 1;

    }

}
