CREATE TABLE users(
    id bigserial NOT NULL,
    username VARCHAR(50) PRIMARY KEY NOT NULL,
    password VARCHAR(50) NOT NULL,
    is_active BOOLEAN NOT NULL
);