update tb_department
set capacity = round(capacity + capacity / 10 );
rollback;

update tb_student
set student_address = '서울시 종로구 숭인동 181-21'
where student_no = 'A413042';
select * from tb_student where student_no = 'A413042';
rollback;

update tb_student
set student_ssn = left(student_ssn, 6);
select * from tb_student;
rollback;

UPDATE tb_grade g
JOIN tb_student s ON g.student_no = s.student_no
JOIN tb_department d ON s.department_no = d.department_no
JOIN tb_class c ON g.class_no = c.class_no
SET g.point = 3.5
WHERE s.student_name = '김명훈'
  AND d.department_name = '의학과'
  AND c.class_name = '피부생리학'
  AND g.term_no = '200501';
rollback;

delete from tb_grade where student_no in (select student_no from tb_student
	where ABSENCE_YN = 'Y');
rollback;