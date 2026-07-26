-- schemas copied from :
-- org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
-- DEFAULT_USER_SCHEMA_DDL_LOCATION = "org/springframework/security/core/userdetails/jdbc/users.ddl";

-- DDL --
create table users(username varchar(50) not null primary key,password varchar(500) not null,enabled boolean not null);

create table authorities (username varchar(50) not null,authority varchar(50) not null,constraint fk_authorities_users foreign key(username) references users(username));

create unique index ix_auth_username on authorities (username,authority);

-- DML --
-- Insert  users
INSERT INTO users (username, password, enabled)
VALUES ('user', '{{noop}user', '1');

INSERT INTO users (username, password, enabled)
VALUES ('admin', '{bcrypt}$2a$12$FJ32ahdS/KMBDcYh19hGSuwo5zJW00oaqx9L7ygICnwg0M1VBVujO', '1');

-- Insert authorities for each user
INSERT INTO authorities (username, authority)
VALUES ('user', 'read');

INSERT INTO authorities (username, authority)
VALUES ('admin', 'admin');

-- ------------------------------------- CUSTOM TABLE --------------------------------------------- --
CREATE TABLE customer (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    pwd VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL
);

-- Insert customers
INSERT INTO customer (email, pwd, role)
VALUES ('user@example.com', '{noop}user', 'read');

INSERT INTO customer (email, pwd, role)
VALUES ('admin@example.com', '{bcrypt}$2a$12$FJ32ahdS/KMBDcYh19hGSuwo5zJW00oaqx9L7ygICnwg0M1VBVujO', 'admin');
