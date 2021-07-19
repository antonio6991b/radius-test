package ru.bolgov.radius.students.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Table(name = "STUDENTS_STUDENT")
@Entity(name = "students_Student")
@NamePattern("%s|lastName")
public class Student extends StandardEntity {
    private static final long serialVersionUID = 1901007239744701207L;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "PATRONYMIC")
    private String patronymic;

    @Column(name = "BIRTH_DATE")
    @PastOrPresent(message = "Birth date can't be future")
    private LocalDate birthDate;

    @JoinColumn(name = "DEPARTMENT_NAME")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @NotNull
    private Department department;

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}