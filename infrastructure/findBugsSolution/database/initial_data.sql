CREATE TABLE dancers(dancer_id int auto_increment, first_name varchar(150), last_name varchar(150), preferred_dance varchar(150), primary key (dancer_id));

insert into dancers VALUES(1, 'Maria', 'Xiovskaya', 'STACCATO');
insert into dancers VALUES(2, 'Anna', 'Czerna', 'STACCATO');
insert into dancers VALUES(3, 'Olga', 'Leboda', 'LEGATO');
insert into dancers VALUES(4, 'Aleksandra', 'Krasnaya', 'STACCATO');
insert into dancers VALUES(5, 'Mykhail', 'Kovalski', 'STACCATO');
insert into dancers VALUES(6, 'Patryk', 'Czechon', 'LEGATO');

CREATE TABLE dance_play(dance_play_id int auto_increment, title varchar(150), primaballerina_id INT,
primary key (dance_play_id),
 FOREIGN KEY (primaballerina_id) REFERENCES dancers(dancer_id));
insert into dance_play VALUES(1, 'Swan Lake', 1);
insert into dance_play VALUES(2, 'Don Kichot', 2);
insert into dance_play VALUES(3, 'Bolero', null);
insert into dance_play VALUES(4, 'Nutcracker', 3);
insert into dance_play VALUES(5, 'Sleeping Beauty', 1);
insert into dance_play VALUES(6, 'Dracula', null);