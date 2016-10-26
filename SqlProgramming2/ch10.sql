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

--Section04 Self  Join(==inner join_)
--101번 사원의 관리자 이름은?
select e2.first_name
from employees e1, employees e2
where e1.manager_id=e2.employee_id
and e1.employee_id=101;

--5.3 ANSI Outer Join
drop table lefttable;
drop table righttable;

create table member(
  mid varchar(10) primary key,
  mname varchar(10) not null
);
create table board(
  bno number(5) primary key,
  btitle varchar(100) not null,
  bwriter varchar(10) references member(mid)
);
insert into member values('user1','사용자1');
insert into member values('user2','사용자2');
insert into member values('user3','사용자3');
insert into member values('user4','사용자4');
insert into member values('user5','사용자5');

insert into board values(1,'제목1','user1');
insert into board values(2,'제목2','user2');
insert into board values(3,'제목3','user3');

select mid, mname, bno, btitle
from member
left outer join board
on member.mid=board.bwriter
where bno is null;

select bno, btitle, mid, mname
from member
right outer join board
on member.mid=board.bwriter
where bno is null;

--left outter join
select mid, mname, bno, btitle
from member, board
where member.mid=board.bwriter(+);    --존재하지 않으면 행을 하나 더 추가하되 널로 추가해라
--right outter join
select bno, btitle, mid, mname
from board, member
where member.mid(+)=board.bwriter;
