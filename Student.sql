insert into Student.studentdb(Studentid , StudentName , Gender , DOB , Address) values(1, 'Sampath Kumar','M' ,'1999/08/20', 'j p nagar' );
insert into Student.studentdb(Studentid ,StudentName , Gender , DOB , Address) values(2, 'Gayathri Madappa' ,'F' , '2000/01/09' , 'Yalachanhalli' );
insert into Student.studentdb(Studentid , StudentName , Gender , DOB , Address) values(3, 'Gayatri Angadi' ,'F' , '2001/09/20' , 'kopal' );
insert into Student.studentdb(Studentid , StudentName , Gender , DOB , Address) values(4, 'Pramod S H' ,'M' , '1999/07/25' , 'tumkur' );
insert into Student.studentdb(Studentid , StudentName , Gender , DOB , Address) values(5, 'Nivisha sahu' ,'F' , '1997/09/12' , 'chhattisgarh' );
select * from Student.studentdb;
select * from Student.studentdb where Gender = 'M';
select * from Student.studentdb where Address = 'j p nagar' and Gender = 'M';
select * from Student.studentdb order by Gender, StudentName desc;
select count(Studentid) from Student.studentdb;
select StudentName, Studentid, Gender
from Student.studentdb
where Gender = 'F';
update Student.studentdb
set StudentName = 'Gayatri Boat', Address = 'PG'
where Studentid = 2;