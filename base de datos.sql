/*CREATE DATABASE aventuraConversacional;*/

USE aventuraConversacional;



/*CREATE TABLE Usuario (

  idUsuario INT AUTO_INCREMENT PRIMARY KEY,

  nombre VARCHAR(100) NOT NULL,

 contraseña VARCHAR(100) NOT NULL,

 puntuacion INT DEFAULT 0

);*/
create table Protagonista(

idProtagonista int auto_increment,
nombre varchar(50) not null,
puntosVida int not null,
primary key(idProtagonista)
);

create table Final (
idFinal int auto_increment,
contexto varchar(100) not null,
idProtagonista int,
primary key(idFinal),
foreign key(idProtagonista) references Protagonista(idProtagonista)
);

create table ObjetoInventario(
idObjeto int auto_increment,
nombre varchar(100) not null,
descripcion varchar(100) not null,
primary key(idObjeto),
idProtagonista int,
foreign key(idProtagonista) references Protagonista(idProtagonista)
);

create table Puzzle(
idPuzzle int auto_increment,
nombre varchar(50) not null,
puntuacion int not null,
idProtagonista int,
primary key(idPuzzle),
foreign key(idProtagonista) references Protagonista(idProtagonista)
);
create table PersonajeSecundario(
idPersonajeSecundario int auto_increment,
nombre varchar(50) not null,
especie varchar(50) not null,
frase varchar(500) not null,
idProtagonista int,
primary key (idPersonajeSecundario),
foreign key(idProtagonista) references Protagonista(idProtagonista)
);
create table Enemigo (
idEnemigo int auto_increment,
nombre varchar(100) not null,
puntosVida int not null,
primary key(idEnemigo)
);
create table AtaqueProtagonista(
idAtaque int auto_increment,
nombre varchar(100) not null,
descripcion varchar(50) not null,
dañoAtaque int not null,
idProtagonista int,
primary key(idAtaque),
foreign key(idProtagonista) references Protagonista(idProtagonista)
);
create table AtaqueEnemigo(
idAtaque int auto_increment,
nombre varchar(100) not null,
descripcion varchar(50) not null,
dañoAtaque int not null,
idEnemigo int,
primary key(idAtaque),
foreign key(idEnemigo) references Enemigo(idEnemigo)
);

create table Escenario(
idEscenario int auto_increment,
nombreEscenario varchar(100) not null,
momentoAtmosferico varchar(100) not null,
momentoDia varchar(100) not null,
condicionTerreno varchar(100) not null,
primary key (idEscenario)


);

create table combate(
idBatalla int auto_increment,
nombreBatalla varchar(50) not null,
idProtagonista int,
idEnemigo int,
idEscenario int,
primary key(idBatalla),
foreign key(idProtagonista) references Protagonista(idProtagonista),
foreign key(idEnemigo) references Enemigo(idEnemigo),
foreign key(idEscenario) references Escenario(idEscenario)
);



