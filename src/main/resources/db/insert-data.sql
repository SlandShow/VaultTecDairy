/* Insertion of all data */

INSERT INTO role (id, role_type) VALUES (1, 'ADMIN');
INSERT INTO role (id, role_type) VALUES (2, 'USER');

INSERT INTO user (id, first_name, last_name, login, password) VALUES (
  1,
  'Super',
  'User',
  'super-user@admin',
  '$2a$10$qtH0F1m488673KwgAfFXEOWxsoZSeHqqlB/8BTt3a6gsI5c2mdlfe'
);

INSERT INTO user_role (user_id, role_id) VALUES (1, 1);

INSERT INTO content (
  id,
  content_text
)
VALUES (
  1,
  'Asylum Information 112
Asylum Number - 112
Start of construction - November 2068
Completion - June 2074
The total number of inhabitants - 85
Total duration - Unlimited
Computer control system - Think Machine 3600r
The main source of energy is Shue Power, a geothermal
An additional source of energy is Extra Shue Power, a geothermal
Non-standard equipment
Robots 147c, variation "guardian" - 12
Hypersensitivity modules - 85
For a list of liquid nutrients, see Help # 943-B2
The Superintendent - Doctor Stanislas Bron
Additional staff ...
Remarkable analytics: In accordance with the peculiarities of the “Asylum 112” project and the high-level automation of all systems, only one administrator was needed in the shelter.'
);

INSERT INTO entry (
  id,
  entry_date,
  user_id,
  title,
  content_id
)
VALUES (
  1,
  '2068-11-30 12:00:00',
   1,
  'Vault 112',
  1
);

INSERT INTO content (
  id,
  content_text
)
VALUES (
  2,
  'Welcome to Vault 112, resident! According to the sensors, you arrived 202.3 years late. Please change into the Shelter Overalls. If you lost your jumpsuit, I can give you a new one. You must be assigned to you a tranquility chaise longue.'
);

INSERT INTO entry (
  id,
  entry_date,
  user_id,
  title,
  content_id
)
VALUES (
  2,
  '2019-01-02 12:00:00',
   1,
  '112 Opening',
  2
);