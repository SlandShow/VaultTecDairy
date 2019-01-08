/* ==== DDL ==== */

-- Content table --
CREATE TABLE content (
  id INT NOT NULL,
  content_text VARCHAR(500) NULL,
  PRIMARY KEY(id)
);

-- Entry table --
CREATE TABLE entry (
  id INT NOT NULL,
  entry_date TIMESTAMP NULL,
--   user_id INT NULL,
  title VARCHAR(50) NULL,
  content_id INT NULL,
  PRIMARY KEY(id),
  FOREIGN KEY(content_id) REFERENCES content(id)
);
