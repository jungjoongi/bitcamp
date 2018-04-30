# FK(foreign Key)
- 다른 테이블의 PK를 참조하는 컬럼이다.
```
/* 게시판 테이블 */
create table test1(
    no int not null primary key auto_increment,
    title varchar(255) not null,
    content text,
    rdt datetime not null
);
```
```
create table test2(
    fno int not null primary key auto_increment,
    filepath varchar(255),
    bno int not null 
);
```
```
insert into test1(title,rdt) values('aaa', now());
insert into test1(title,rdt) values('bbb', now());
insert into test1(title,rdt) values('ccc', now());
insert into test1(title,rdt) values('ddd', now());
insert into test1(title,rdt) values('eee', now());
insert into test1(title,rdt) values('fff', now());
insert into test1(title,rdt) values('ggg', now());
insert into test1(title,rdt) values('hhh', now());
insert into test1(title,rdt) values('iii', now());
insert into test1(title,rdt) values('jjj', now());
```

첨부파일 데이터 입력
````
insert into test2(filepath, bno) values('c:/download/a.gif', 1);
insert into test2(filepath, bno) values('c:/download/b.gif', 1);
insert into test2(filepath, bno) values('c:/download/c.gif', 1);
insert into test2(filepath, bno) values('c:/download/d.gif', 5);
insert into test2(filepath, bno) values('c:/download/e.gif', 5);
insert into test2(filepath, bno) values('c:/download/f.gif', 10);
````

## FK제약 조건이 없을 때
- 첨부파일 데이터를 입력할때 존재하지 않는 게시물 번호가 들어갈 수 있다.
- 그러면 첨부파일 데이터를 무효한 데이터가 된다.

insert into test2(filepath, bno) values('c:/download/x.gif', 100);


## FK(forein key) 제약 조건 설정
- 다른 테이블의 데이터와 연관된 데이터를 저장할 떄 무효한 데이터가 입력되지 않도록 하는 문법이다.
- 다른 테이블의 데이터가 참조하는 데이터를 임의로 지우지 못하도록 하는 문법이다.
- 그래서 데이터의 무결성(결함이 없는 상태)을 유지하게 도와주는 문법이다.

다른 테이블의 pk를 참조하는 컬럼으로 선언한다.
```
alter table 테이블명 
    add constraint 제약조건라벨명 foreign ket (컬럼명) references 테이블명(컬럼명);

예)
alter table test2
    add constraint test2_bno_fk foreign key (bno) references test1(no);
```
