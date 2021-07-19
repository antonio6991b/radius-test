-- begin STUDENTS_DEPARTMENT
create table STUDENTS_DEPARTMENT (
    ID integer not null,
    --
    NUMBER_ integer not null,
    NAME varchar(500),
    --
    primary key (ID)
)^
-- end STUDENTS_DEPARTMENT
-- begin STUDENTS_STUDENT
create table STUDENTS_STUDENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    LAST_NAME varchar(255),
    FIRST_NAME varchar(255),
    PATRONYMIC varchar(255),
    BIRTH_DATE date,
    DEPARTMENT_NAME integer not null,
    --
    primary key (ID)
)^
-- end STUDENTS_STUDENT
