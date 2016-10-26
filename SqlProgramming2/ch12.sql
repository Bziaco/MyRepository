--행 순번 붙이기
select rownum, bno, btitle
from (select rownum, bno, btitle from board order by bno);

select rownum, bno, btitle
from (select rownum, bno, btitle from board order by bno desc);

--최근 삽입된 행 5개를 가져와라
select rownum, bno, btitle
from (select rownum, bno, btitle from board order by bno desc)
where rownum<=5; --rownum은 순번을 매길때마다 where의 조건을 검사함

--아직 조건을 만족하기 위한 rownum이 나오질 않았기에 조건이 성립이 안됨
select rownum, bno, btitle
from (select rownum, bno, btitle from board order by bno desc)
where rownum>500;

--행의 순번이 11번~20번까지를 가져와라
select rn, bno, btitle
from (
  select rownum as rn, bno, btitle
  from (select rownum, bno, btitle from board order by bno desc)
  where rownum<=20
)
where rn>=11;

--1페이지에 10개씩 구성하고 n번째 페이지를 가져와라
select rn, bno, btitle
from (
  select rownum as rn, bno, btitle
  from (select rownum, bno, btitle from board order by bno desc)
  where rownum<=(n*10)
)
where rn>=((n-1)*10+1);