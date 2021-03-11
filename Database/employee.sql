CREATE TABLE employee(
	id bigserial PRIMARY KEY NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	first_name VARCHAR(50) NOT NULL,
	afm varchar(9) not null,
	dob DATE NOT null,
	dept_id int,
	CONSTRAINT dept_id
      FOREIGN KEY(dept_id) 
	  REFERENCES dept(id)
);
