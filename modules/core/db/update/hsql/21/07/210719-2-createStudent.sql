alter table STUDENTS_STUDENT add constraint FK_STUDENTS_STUDENT_ON_DEPARTMENT_NAME foreign key (DEPARTMENT_NAME) references STUDENTS_DEPARTMENT(ID);
create index IDX_STUDENTS_STUDENT_ON_DEPARTMENT_NAME on STUDENTS_STUDENT (DEPARTMENT_NAME);
