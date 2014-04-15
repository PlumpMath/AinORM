--liquibase formatted sql

-- changeset columnRename:1
ALTER TABLE Users RENAME (
	userName TO user_name,
	realName TO real_name	
);
-- rollback ALTER TABLE Users RENAME ( user_name TO userName, real_name TO realName );

-- changeset columnRename:2
ALTER TABLE Deployments RENAME (
	modificationTime TO modification_time,
	firstRevision TO first_revision,
	deletionTime TO deletion_time
);
-- rollback ALTER TABLE Deployments RENAME ( modification_time TO modificationTime , first_revision TO firstRevision, deletion_time TO deletionTime );

-- changeset columnRename:3
ALTER TABLE Cases RENAME (
	deviceID TO device_id,
	caseID TO case_id,
	modificationTime TO modification_time,
	firstRevisionCaseID TO first_revision_case_id,
	firstRevisionDeviceID TO first_revision_device_id,
	deletionTime TO deletion_time,
	timeOfCrime TO time_of_crime
);
-- ALTER TABLE Cases RENAME ( device_id TO deviceID, case_id TO caseID, modification_time TO modificationTime, first_revision_case_id TO firstRevisionCaseID, first_revision_device_id TO firstRevisionDeviceID, deletion_time TO deletionTime, time_of_crim TO timeOfCrimee);

-- changeset columnRename:4
ALTER TABLE DeploymentImages RENAME (
	deviceID TO device_id,
	doploymentID TO deployment_id,
);
-- changeset ALTER TABLE DeploymentImages RENAME ( device_id TO deviceID, deployment_id TO doploymentID );


-- changeset columnRename:6
ALTER TABLE CaseImages RENAME (
	imageID TO image_id,
	caseID TO case_id,
	deviceID TO device_id
);
-- rollback ALTER TABLE CaseImages RENAME ( image_id TO imageID, case_id TO caseID,	device_id TO deviceID ); 

-- changeset columnRename:8
ALTER TABLE Devices RENAME (
	lastSEEN TO last_seen
);
-- rollback Devices RENAME ( last_seen TO lastSEEN );

-- changeset columnRename:9
ALTER TABLE Devices 
	ADD COLUMN ip inet NOT NULL;
-- rollback ALTER TABLE Devices REMOVE COLUMN ip;
	
-- changeset columnRename:10
ALTER TABLE PermissionsOnCases RENAME (
	deviceID TO device_id,
	caseID TO case_id,
	userID TO user_id,
	addData TO add_data,
	changePermissions TO change_permissions
);
-- rollback ALTER TABLE PermissionsOnCases RENAME (	device_id TO deviceID, case_id TO caseID, user_id TO userID, add_data TO addData, change_permissions TO changePermissions ); 

-- changeset columnRename:11
ALTER TABLE PermissionsOnDeployments RENAME (
	deploymentID TO deployment_id
	userID TO user_id
	addData TO add_data,
	changePermissions TO change_permissions	
);
-- rollback ALTER TABLE PermissionsOnDeployments RENAME ( deployment_id TO deploymentID, user_id TO userID, add_data, TO addData, change_permissions TO changePermissions );

