package ru.bolgov.radius.students.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Table(name = "STUDENTS_DEPARTMENT")
@Entity(name = "students_Department")
@NamePattern("%s|name")
public class Department extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 4401455412256182079L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false, unique = true)
    @PositiveOrZero(message = "Department number must be positive or zero")
    private Integer number;

    @Column(name = "NAME", length = 500)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

}