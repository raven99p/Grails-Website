CREATE TABLE users(
	id bigserial PRIMARY KEY NOT NULL,
	username VARCHAR(50) NOT NULL,
	password VARCHAR(50) NOT NULL,
	is_active BOOLEAN NOT NULL
);
