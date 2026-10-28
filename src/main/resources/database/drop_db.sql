drop table PRODUCTOS drop constraint PROD$SERV;

drop table PRODUCTOS drop constraint PROD$ICATA;

drop table PRODUCTOS;

drop table SERVICIOS drop constraint SERV$ICATA;

drop table SERVICIOS;

drop table ITEMSCATALOGO drop constraint ICATA$ITURN;

drop table ITEMSCATALOGO;

drop table ITEMSTURNO drop constraint ITURN$TURN;

drop table ITEMSTURNO;

alter table TURNOS drop constraint TURN$CLI;

drop table TURNOS;

alter table CLIENTES drop constraint CLI$USR;

drop table CLIENTES;

drop table USUARIOS;