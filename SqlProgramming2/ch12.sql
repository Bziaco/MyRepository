select rownum, bno, btitle
from (select rownum, bno, btitle from board order by bno);

select rownum, bno, btitle
from (select rownum, bno, btitle from board order by bno desc);
