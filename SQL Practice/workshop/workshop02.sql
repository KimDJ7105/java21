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