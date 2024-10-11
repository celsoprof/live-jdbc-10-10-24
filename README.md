** SQL PARA CRIAR A TABELA NO BANCO

```CREATE TABLE TB_GAMES (
    id int primary key,
    title varchar2(100) not null,
    valor decimal(10,2) not null,
    description varchar(100)
);
