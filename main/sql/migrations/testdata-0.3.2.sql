--liquibase formatted sql

-- changeset testdata:1 context:WITH_TEST_DATA
INSERT INTO Priorities
	VALUES (2, 'MindreViktigt', 'Det är helt enkelt mindre skitgöraviktigt att klara av det här.');
-- rollback DELETE FROM Priorities WHERE id=2;

-- changeset testdata:2 context:WITH_TEST_DATA
INSERT INTO Priorities
	VALUES (3, 'LagomViktigt', 'Det är helt enkelt lagom skitgöraviktigt att klara av det här.');
-- rollback DELETE FROM Priorities WHERE id=3;

-- changeset testdata:3 context:WITH_TEST_DATA
INSERT INTO Priorities
	VALUES (4, 'InteSåViktigt', 'Det är helt enkelt inte så skitgöraviktigt att klara av det här.');
-- rollback DELETE FROM Priorities WHERE id=4;

-- changeset testdata:4 context:WITH_TEST_DATA
INSERT INTO Priorities
	VALUES (5, 'InteAllsViktigt', 'Det är helt enkelt inte alls skitgöraviktigt att klara av det här.');
-- rollback DELETE FROM Priorities WHERE id=5;

-- changeset testdata:5 context:WITH_TEST_DATA
INSERT INTO Classifications
	VALUES(0, 'Okänt', 'Svårt att veta')
-- rollback DELETE FROM Classifications WHERE id=0;

-- changeset testdata:6 context:WITH_TEST_DATA
INSERT INTO Classifications
	VALUES(2, 'Våld mot tjänsteman', 'Fuck aina liksom')
-- rollback DELETE FROM Classifications WHERE id=2;

-- changeset testdata:7 context:WITH_TEST_DATA
INSERT INTO Classifications
	VALUES(3, 'Helikopterrån', 'Typiskt avancerade grejer')
-- rollback DELETE FROM Classifications WHERE id=3;

-- changeset testdata:8 context:WITH_TEST_DATA
INSERT INTO Classifications
	VALUES(4, 'Mord', 'Lite värre än misshandel')
-- rollback DELETE FROM Classifications WHERE id=4;

-- changeset testdata:9 context:WITH_TEST_DATA
INSERT INTO Classifications
	VALUES(5, 'Tidelag', 'Finns ju människor')
-- rollback DELETE FROM Classifications WHERE id=5;

-- changeset testdata:10 context:WITH_TEST_DATA
INSERT INTO Statuses
	VALUES (0, 'Inrapporterad', 'Jävligt inrapporterat');
-- rollback DELETE FROM Priorities WHERE id=0;

-- changeset testdata:11 context:WITH_TEST_DATA
INSERT INTO Statuses
	VALUES (2, 'Utredning avslutad', 'Inga problem att lösa det här');
-- rollback DELETE FROM Priorities WHERE id=2;

-- changeset testdata:12 context:WITH_TEST_DATA
INSERT INTO Users(user_name, real_name)
	VALUES('nisse777', 'Nisse ');
-- rollback DELETE FROM Users WHERE userName='nisse777';

-- changeset testdata:13 context:WITH_TEST_DATA
INSERT INTO Users(user_name, real_name)
	VALUES('pelle88', 'Pelle my man');
-- rollback DELETE FROM Users WHERE userName='pelle88';


-- TODO: Add test data for the permissions and image tables.
