package ru.bolgov.radius.students.web.screens.student;

import com.haulmont.cuba.gui.screen.*;
import ru.bolgov.radius.students.entity.Student;

@UiController("students_Student.edit")
@UiDescriptor("student-edit.xml")
@EditedEntityContainer("studentDc")
@LoadDataBeforeShow
public class StudentEdit extends StandardEditor<Student> {
}