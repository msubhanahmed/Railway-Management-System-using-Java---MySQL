create database railwaysystem;
use railwaysystem;

create table passenger 
(
ID		integer 		primary key,
FName 	varchar(255),
LName 	varchar(255),
CNIC 	varchar(13) 	unique,
Email 	varchar(255),
Mobile 	varchar(11),
psd 	varchar(255)
);
create table station
(
	ID		integer			primary key,
	Name	varchar(255)	UNIQUE,
    PhoneNo	varchar(11)		UNIQUE
);
create table FreightTrain
(
	ID				integer			primary key,
    Name			varchar(255),
    FreightType 	varchar(255),
    MaxLoad			integer
);
create table PassengerTrain
(
	ID				integer			primary key,
    Name			varchar(255),
    MaxCapacity		integer
);
create table Ticket
(
	ID			integer 	primary key,
    TrainId		integer,
    validity	varchar(255),
    price		integer,
    seats		integer,
    PassengerID	integer,
    foreign key(TrainId) references PassengerTrain(ID)  on delete cascade,
    foreign key(PassengerID) references passenger(ID) on delete cascade
);
create table FreightBooking
(
	ID				integer 	primary key,
    TrainId			integer,
    validity		varchar(255),
    price			integer,
    registeredload	integer,
    PassengerID		integer,
    foreign key(TrainId) references FreightTrain(ID) on delete cascade
);
create table StationAdmin
(
	ID		integer primary key,
    Fname	varchar(255),
    Lname	varchar(255),
    email	varchar(255),
    phone	varchar(255),
    psd		varchar(255)
);
create table ScheduleEntry
(
	ID				integer		primary key,
    TrainID 		integer,
    SourceStation	integer,
    DestStation		integer,
    arrivaltime		varchar(255),
    depttime		varchar(255),
    foreign key(SourceStation)	references	Station(ID) on delete cascade,
    foreign key(DestStation)	references	Station(ID) on delete cascade
);

Insert Into StationAdmin values
(  200873 , "Muhammad" , "Subhan" , "i200873@nu.edu.pk" , "03010547875" , "f@st200873"),
(  200945 , "Jawad" , "Ahmed" , "i200945@nu.edu.pk" , "03314440989" , "f@st200945");

Insert Into Passenger values
( 202445 , "Rafay" , "Zubair" , "4220112345678" , "i202445@nu.edu.pk" , "03001234567" , "f@st202445"),
( 200660 , "Ubaid" , "Javed" , "4220112345679" , "i200660@nu.edu.pk" , "03001234567" , "f@st200660");

Insert Into PassengerTrain values
( 1000 , "Sir Syed Express 108UP" , 755 ),
( 1001 , "Sir Syed Express 108DN" , 755 ),
( 1002 , "Pakistan Express 109UP" , 800 ),
( 1003 , "Green Line 110UP" , 450 );

Insert Into FreightTrain values
( 2000 , "PakChina CPEC" , "Goods" , 2000 ),
( 2001 , "Baluchistan Coal Express" , "Coal & Minerals" , 3000 ),
( 2002 , "Punjab Oil Carriage" , "Flammable Liquid", 5000 ),
( 2003 , "KPK Mines Carrier" , "Minerals & Heavy Metals" , 450 );

Insert Into station values
( 3000 , "Lahore JN" , "03001234567"),
( 3001 , "Rawalpindi" , "03011234567"),
( 3002 , "Karachi Central" , "03021234567");

Insert Into ScheduleEntry values
(4000 , 1002 , 3002 , 3001 , "10-13-2022 16:48" , "10-14-2022 17:50");