select student_no, student_name, entrance_date from tb_student order by entrance_date;

select professor_name, professor_ssn from tb_professor where char_length(professor_name) != 3; 

select professor_name as '교수이름' , (100 - cast(left(professor_ssn, 2) as signed) + 26) as '나이' from tb_professor where substr(professor_ssn,8,1) = '1'; 

select right(professor_name, 2) as '이름' from tb_professor;

select student_no, student_name from tb_student where (YEAR(entrance_date) - (1900 + CAST(LEFT(student_ssn, 2) AS SIGNED))) > 19;

SELECT DAYNAME('2020-12-25') AS '요일';

select student_no, student_name from tb_student  where left(STUDENT_NO, 1) != 'A';

select round(avg(point),1) as 평점 from tb_grade where STUDENT_NO = 'A517178'; 

select department_no as '학과번호', count(*) as '학생 수' from tb_student group by DEPARTMENT_NO;

select count(*) from tb_student where COACH_PROFESSOR_NO is null;

SELECT SUBSTR(TERM_NO, 1, 4) AS "년도", ROUND(AVG(POINT), 1) AS "년도 별 평점"
FROM TB_GRADE WHERE STUDENT_NO = 'A112113' GROUP BY SUBSTR(TERM_NO, 1, 4) ORDER BY 1;

select department_no as '학과코드', count(*) from tb_student where ABSENCE_YN = 'Y' group by DEPARTMENT_NO;

select student_name as '동일이름', count(*) as '동명인 수' from tb_student group by student_name having count(*) > 1;

-- ////////////////////
select count(*) as '학생 수' from tb_student where department_no = '003' and entrance_date LIKE '2001%'group by DEPARTMENT_NO;

select category as '계열', department_name as '학과이름', capacity as '정원' from tb_department where category = '공학' and CAPACITY between 20 and 30 order by department_name;

select category as '계열', count(*) as '학과 수' from tb_department where instr(category, '학') > 0 group by category; 

-- 002
select professor_name as '교수 이름', left(professor_ssn, 2) as '출생년도', professor_address as '주소' 
from tb_professor where DEPARTMENT_NO = '002'
order by left(professor_ssn, 2);

select department_no as '학과번호', student_name as '학생이름', if(absence_yn='Y', '휴학', '정상') as '휴학여부' 
from tb_student
where department_no = '001' and instr(student_address, '서울') > 0;