create database abc;
use  abc;

CREATE TABLE `student` (
                           `id` int(10) NOT NULL AUTO_INCREMENT,
                           `name` varchar(50) DEFAULT NULL,
                           `academy` varchar(50) NOT NULL,
                           `age` int(10) DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ;

select * from student;

CREATE TABLE `news` (
                       `id` int(10) NOT NULL AUTO_INCREMENT,

                       `content` varchar(10) not null,
                       `title` varchar(10) not null ,

                       PRIMARY KEY (`id`)
);
select * from news;

create table if not exists videos(
          `id` int(10) NOT NULL AUTO_INCREMENT,
          `title` varchar(50) DEFAULT NULL,
          video longblob ,
           PRIMARY KEY (`id`)
);

select * from news;