--Section03 Equi Join(=Inner Join)
--조인 대상이 되는 두 테이블에서 공통으로 존해하는 컬럼이 값이
--일치하는 행을 연결하여 결과르 생성하는 조인방법

--101번 사원의 부서 이름은?
select department_name 
from departments d,employees e 
where employee_id=101 
and d.department_id=e.employee_id;

--5.2ANSI Inner join 문법
select department_name 
from departments d
inner join employees e
on d.department_id=e.employee_id
where employee_id=101;

-------------------------------------------------------------------

--Sales 부서가 있는 도시는?
select department_name, city
from departments d, locations l
where d.location_id=l.location_id
and department_name='Sales';
--ANSI Inner join 문법
select department_name, city
from departments d
inner join locations l
on d.location_id=l.location_id
where department_name='Sales';

-----------------------------------------------------------------

--101번 사원의 부서번호와 부서이름은?
select d.department_id, department_name
from employees e, departments d
where e.department_id=d.department_id
and employee_id = 101;
--ANSI Inner join 문법
select d.department_id, department_name
from employees e
inner join departments d
on e.department_id=d.department_id
where employee_id = 101;
----------------------------------------------------------------------
--101번 사원의 근무 도시는?
select city
from employees e, departments d, locations l
where e.department_id=d.department_id 
and d.location_id=l.location_id
and employee_id=101;
--ANSI Inner join 문법
select city
from employees e
inner join departments d on e.department_id=d.department_id 
inner join locations l on d.location_id=l.location_id
where employee_id=101;
-----------------------------------------------------------------------
--101번 사원의 사번, fist_name, 부서번호, 부서이름, 나라, 도시는?
select employee_id, first_name, e.department_id, department_name, country_name, city
from employees e, departments d, countries c, locations l
where e.department_id=d.department_id
and d.location_id=l.location_id
and l.country_id=c.country_id
and employee_id=101;
--ANSI Inner join 문법
select employee_id, first_name, e.department_id, department_name, country_name, city
from employees e
inner join departments d on e.department_id=d.department_id
inner join locations l on d.location_id=l.location_id
inner join countries c on l.country_id=c.country_id
where employee_id=101;
