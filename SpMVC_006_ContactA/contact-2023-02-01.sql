CREATE database myPMS;
use myPMS;
CREATE TABLE tbl_contact(
	uid  varchar(10),
	name  varchar(20),
	tel varchar(20),
	addr varchar(125),
	hobby varchar(125)
);

insert into tbl_contact(uid,name,tel,addr,hobby) values("U0002","홍길동","010-1111-1111","광주","취미");
select * from tbl_contact;