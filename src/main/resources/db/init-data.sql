/* ==== DDL ==== */

-- Role table --
CREATE TABLE role (
  id INT NOT NULL,
  role_type VARCHAR NULL,
  PRIMARY KEY(id)
);

-- User table --
CREATE TABLE user (
  id INT NOT NULL,
  first_name VARCHAR(50) NULL,
  last_name VARCHAR(50) NULL,
  login VARCHAR(255) NULL,
  password VARCHAR(255) NULL,
  PRIMARY KEY(id)
);

-- UserRole table --
CREATE TABLE user_role (
  user_id INT NOT NULL,
  role_id INT NULL,
  FOREIGN KEY(user_id) REFERENCES user(id),
  FOREIGN KEY(role_id) REFERENCES role(id)
);

-- Content table --
CREATE TABLE content (
  id INT NOT NULL,
  content_text VARCHAR(1000) NULL,
  PRIMARY KEY(id)
);

-- Entry table --
CREATE TABLE entry (
  id INT NOT NULL,
  entry_date TIMESTAMP NULL,
  user_id INT NULL,
  title VARCHAR(50) NULL,
  content_id INT NULL,
  PRIMARY KEY(id),
  FOREIGN KEY(content_id) REFERENCES content(id),
  FOREIGN KEY(user_id) REFERENCES user(id)
);

