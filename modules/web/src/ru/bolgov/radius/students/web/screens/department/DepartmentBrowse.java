package ru.bolgov.radius.students.web.screens.department;

import com.haulmont.cuba.gui.screen.*;
import ru.bolgov.radius.students.entity.Department;

@UiController("students_Department.browse")
@UiDescriptor("department-browse.xml")
@LookupComponent("departmentsTable")
@LoadDataBeforeShow
public class DepartmentBrowse extends StandardLookup<Department> {
}