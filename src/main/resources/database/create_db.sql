create table USUARIOS(
	ID INTEGER not null AUTO_INCREMENT,
	EMAIL varchar(255) not null,
	PASSWORD varchar(255) not null,
	USERNAME varchar(50) not null,
	NOMBRE varchar(100),
	APELLIDO varchar(100),
	PRIMARY KEY(ID)
);

create table CLIENTES( 
	ID INTEGER not null,
	APODO varchar(50),
	TELEFONO INTEGER not null,
	PRIMARY KEY(ID)
);

alter table CLIENTES add constraint CLI$USR foreign key (ID) references USUARIOS (ID);

create table TURNOS(
	ID Integer not null AUTO_INCREMENT,
	FECHA_ATENCION datetime not null,
	DETALLE varchar(255),
	ESTADO varchar(255) not null,
	CLIENTE_ID INTEGER,
	PRIMARY KEY(ID)
);

alter table TURNOS add constraint TURN$CLI foreign key (CLIENTE_ID) references CLIENTES(ID);

create table ITEMSTURNO(
	ID INTEGER not null AUTO_INCREMENT,
	CANTIDAD INT not null,
	TURNO_ID INTEGER not null,
	PRIMARY KEY(ID)
);

alter table ITEMSTURNO add constraint ITURN$TURN foreign key (TURNO_ID) references TURNOS(ID);

create table ITEMSCATALOGO(
	ID INTEGER not null AUTO_INCREMENT,
	PRECIO DOUBLE not null,
	ITEMTURNO_ID INTEGER not null,
	PRIMARY KEY(ID)
);

alter table ITEMSCATALOGO add constraint ICATA$ITURN  foreign key (ITEMTURNO_ID) references ITEMSTURNO(ID);

create table SERVICIOS(
	ID INTEGER not null,
	TIPO varchar(255) not null,
	ANOTACIONES varchar(255),
	PRIMARY KEY(ID)
);

alter table SERVICIOS add constraint SERV$ICATA foreign key (ID) references ITEMSCATALOGO(ID);

create table PRODUCTOS(
	ID INTEGER not null,
	MARCA varchar(50) not null,
	NOMBRE varchar(150) not null,
	VENCIMIENTO DATE not null,
	TONO DOUBLE,
	VOLUMEN DOUBLE,
	DETALLE varchar(255),
	SERVICIO_ID INTEGER,
	PRIMARY KEY(ID)
);

alter table PRODUCTOS add constraint PROD$ICATA foreign key (ID) references ITEMSCATALOGO(ID);

alter table PRODUCTOS add constraint PROD$SERV foreign key (SERVICIO_ID) references SERVICIOS(ID);
