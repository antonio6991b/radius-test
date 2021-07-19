package ru.bolgov.radius.students.web.screens.department;

import com.haulmont.cuba.gui.screen.*;
import ru.bolgov.radius.students.entity.Department;

@UiController("students_Department.edit")
@UiDescriptor("department-edit.xml")
@EditedEntityContainer("departmentDc")
@LoadDataBeforeShow
public class DepartmentEdit extends StandardEditor<Department> {
}