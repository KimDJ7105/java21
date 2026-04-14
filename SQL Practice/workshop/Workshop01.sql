USE workshop;
SELECT department_name as 학과명, category as 계열 FROM tb_department;

SELECT CONCAT(department_name,'의 정원은', capacity,'명 입니다.') as "학과별 정원" FROM tb_department;

SELECT DEPARTMENT_NO FROM tb_department WHERE department_name = '국어국문학과';
SELECT * FROM tb_student WHERE DEPARTMENT_NO = 001 AND student_ssn LIKE '_______2______' AND ABSENCE_YN = 'Y';

SELECT * FROM tb_student WHERE STUDENT_NO IN('A513079','A513090','A513091','A513110','A513119');

SELECT department_name, category FROM tb_department WHERE CAPACITY BETWEEN 20 AND 30;

SELECT PROFESSOR_NAME from tb_professor where DEPARTMENT_NO IS NULL;

SELECT * FROM tb_student WHERE DEPARTMENT_NO IS NULL;

SELECT CLASS_NO FROM tb_class WHERE PREATTENDING_CLASS_NO IS NOT NULL;

SELECT distinct CATEGORY FROM tb_department;

select * from tb_student;

SELECT student_no, student_name, student_ssn from tb_student where STUDENT_NO LIKE 'A2%' AND ABSENCE_YN = 'N' AND STUDENT_ADDRESS LIKE '%전주%';