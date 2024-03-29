-- // Create Changelog

-- Default DDL for changelog table that will keep
-- a record of the migrations that have been run.

CREATE TABLE ${changelog} (
  ID NUMERIC(20,0) NOT NULL,
  APPLIED_AT VARCHAR(25) NOT NULL,
  DESCRIPTION VARCHAR(255) NOT NULL
);

ALTER TABLE ${changelog}
ADD CONSTRAINT PK_${changelog}
PRIMARY KEY (id);

-- //@UNDO

DROP TABLE ${changelog};
