package ru.bolgov.radius.students.web.screens.student;

import com.haulmont.cuba.gui.screen.*;
import ru.bolgov.radius.students.entity.Student;

@UiController("students_Student.browse")
@UiDescriptor("student-browse.xml")
@LookupComponent("studentsTable")
@LoadDataBeforeShow
public class StudentBrowse extends StandardLookup<Student> {
}