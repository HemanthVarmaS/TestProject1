package com.example.testproject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EmployeeListActivity : AppCompatActivity() {
    var employeeIdList = arrayListOf<String>("b17123","b17124","b17125","b17126","b17127","b17128","b17129","b17130")
    var employeeNameList = arrayListOf<String>("One","Two","Three","Four")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_list)

    }
}