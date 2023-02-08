CREATE database myPMS;
use myPMS;
CREATE TABLE tbl_contacts(
	c_uid	BIGINT	AUTO_INCREMENT	PRIMARY KEY,
	c_name	VARCHAR(20)	NOT NULL	,
	c_tel	VARCHAR(15)	NOT NULL	,
	c_addr	VARCHAR(125)		,
	c_hobby	VARCHAR(20)		
);

create table tbl_hobbies(
h_uid	BIGINT	AUTO_INCREMENT	PRIMARY KEY,
h_cuid	BIGINT	NOT NULL	,
h_name	VARCHAR(15)	NOT NULL	
);

drop table tbl_contacts;
drop table tbl_hobbies;

insert into tbl_contact(c_uid,c_name,c_tel,c_addr,c_hobby) values("C0001","홍길동","010-1111-1111","광주","취미");
select * from tbl_contact;