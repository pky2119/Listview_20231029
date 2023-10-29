package kr.ac.wku.listview_20231029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.wku.listview_20231029.datas.StudentData

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        화면이 켜질 때 학생 목록을 ArrayList에 수기로 추가 (임시 활용)

        mStudentList.add( StudentData("김땡땡", 1991, "010-1234-5678") )
        mStudentList.add( StudentData("이땡땡", 1992, "010-3456-7891") )
        mStudentList.add( StudentData("박땡땡", 1993, "010-2345-6789") )
        mStudentList.add( StudentData("최땡땡", 1994, "010-0123-4567") )
        mStudentList.add( StudentData("홍땡땡", 1995, "010-8901-2345") )
        mStudentList.add( StudentData("민땡땡", 1996, "010-6789-0123") )

    }
}