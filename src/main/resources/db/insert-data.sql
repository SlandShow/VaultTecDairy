/* Insertion of all data */

INSERT INTO content (
  id,
  content_text
)
VALUES (
  1,
  'Oh, welcome here.'
);

INSERT INTO entry (
  id,
  entry_date,
--   user_id,
  title,
  content_id
)
VALUES (
  1,
  '2018-11-30 12:00:00',
--   null,
  'My first mark',
  1
);

INSERT INTO content (
  id,
  content_text
)
VALUES (
  2,
  'Second mark...'
);

INSERT INTO entry (
  id,
  entry_date,
--   user_id,
  title,
  content_id
)
VALUES (
  2,
  '2019-01-02 12:00:00',
--   null,
  'My second mark',
  2
);