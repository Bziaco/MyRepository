-- 1.1 문장과 절
select * from emp;
-- 1.2 특정 데이터만 보기
select empno, ename from emp;
-- 1.3 산술 연산자
select enmae, sal, sal*12 from emp;
-- 1.4 NULL도 데이터이다
select ename, sal, comm, sal*12+comm from emp;
select ename, sal, comm, sal*12+nvl(comm, 0) from emp;
-- 1.5 컬럼 이름에 별칭 지정하기
select ename as 이름, sal as 월급, comm 보너스, sal*12+nvl(comm, 0) as 연봉 from emp;
-- 1.6 Concatenation 연산자(문자열 결합 ||)
select (empno || '-' || ename) as 이름 from emp;
select ename || '의 직급은' || job || '입니다.' as 직급 from emp;
-- 1.7 DISTINCT 키워드 (중복 제거)
-- 사원이 있는 부서 번호는?
select distinct deptno as 부서번호 from emp;

---------------------------------------------------------------------
--조건절 작성
select ename from emp where deptno=20;