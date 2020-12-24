
-- sql developer에서 system / admin 으로 접속
system / admin

-- user 만들기
CREATE USER c##mydbms IDENTIFIED BY admin;

-- user 권한주기
GRANT CONNECT, RESOURCE, DBA TO c##mydbms;