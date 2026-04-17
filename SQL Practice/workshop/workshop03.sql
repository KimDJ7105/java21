select student_name as '동일이름', count(*) as '동명인 수' from tb_student group by student_name having count(*) > 1;

select student_name as '학생이름', student_no as '학번', student_address as '거주지 주소'
from tb_student
where (instr(student_address, '강원') != 0 or instr(student_address, '경기') != 0 )and instr(student_no, 'A') = 0
order by student_name;

select professor_name, professor_ssn
from tb_professor join tb_department using(department_no) 
where DEPARTMENT_NAME = '법학과'
order by PROFESSOR_SSN;

select class_name, department_name
from tb_class join tb_department using(department_no);

select class_name, professor_name
from tb_class join tb_class_professor using (class_no)
join tb_professor using(professor_no)
order by class_name;