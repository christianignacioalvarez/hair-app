-- 1. Borrar restricciones y tabla PRODUCTOS
drop table PRODUCTOS drop constraint PROD$SERV;
drop table PRODUCTOS drop constraint PROD$ICATA;
drop table PRODUCTOS;

-- 2. Borrar restricciones y tabla SERVICIOS
drop table SERVICIOS drop constraint SERV$ICATA;
drop table SERVICIOS;

-- 3. Borrar restricciones y tabla ITEMSTURNO
drop table ITEMSTURNO drop constraint ITURN$TURN;
drop table ITEMSTURNO drop constraint ITURN$ICATA;
drop table ITEMSTURNO;

-- 4. Borrar restricciones y tabla ITEMSCATALOGO
drop table ITEMSCATALOGO;

-- 5. Borrar restricciones y TURNOS
alter table TURNOS drop constraint TURN$CLI;
drop table TURNOS;

-- 6. Borrar restricciones, tablas CLIENTES y USUARIOS
alter table CLIENTES drop constraint CLI$USR;
drop table CLIENTES;

drop table USUARIOS;