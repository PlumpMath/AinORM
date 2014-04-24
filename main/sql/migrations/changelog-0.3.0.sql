--liquibase formatted sql

-- changeset columnRename:1
ALTER TABLE Users
	RENAME COLUMN userName TO user_name;
-- rollback ALTER TABLE Users RENAME user_name TO userName;
-- changeset columnRename:2
ALTER TABLE Users
	RENAME COLUMN realName TO real_name; 
-- rollback ALTER TABLE Users RENAME real_name TO realName;

-- changeset columnRename:3
ALTER TABLE Deployments
	RENAME modificationTime TO modification_time;
-- rollback ALTER TABLE Deployments RENAME modification_time TO modificationTime;
-- changeset columnRename:4
ALTER TABLE Deployments
	RENAME firstRevision TO first_revision;
-- rollback ALTER TABLE Deployments RENAME RENAME first_revision TO firstRevision;  
-- changeset columnRename:5
ALTER TABLE Deployments
	RENAME deletionTime TO deletion_time;
-- rollback ALTER TABLE Deployments RENAME RENAME deletion_time TO deletionTime;  

-- changeset columnRename:6
ALTER TABLE Cases
	RENAME deviceID TO device_id;
-- rollback ALTER TABLE Cases RENAME device_id TO deviceID;
-- changeset columnRename:7
ALTER TABLE Cases
	RENAME caseID TO case_id;
-- rollback ALTER TABLE Cases RENAME case_id TO caseID;
-- changeset columnRename:8
ALTER TABLE Cases
	RENAME modificationTime TO modification_time;
-- rollback ALTER TABLE Cases RENAME modification_time TO modificationTime;
-- changeset columnRename:9
ALTER TABLE Cases
	RENAME firstRevisionCaseID TO first_revision_case_id;
-- rollback ALTER TABLE Cases RENAME first_revision_case_id TO firstRevisionCaseID;
-- changeset columnRename:10
ALTER TABLE Cases
	RENAME firstRevisionDeviceID TO first_revision_device_id;
-- rollback ALTER TABLE Cases RENAME first_revision_device_id TO firstRevisionDeviceID;
-- changeset columnRename:11
ALTER TABLE Cases
	RENAME deletionTime TO deletion_time;
-- rollback ALTER TABLE Cases RENAME deletion_time TO deletionTime;
-- changeset columnRename:12
ALTER TABLE Cases
	RENAME timeOfCrime TO time_of_crime;
-- rollback ALTER TABLE Cases RENAME time_of_crime TO timeOfCrime;

-- changeset columnRename:13
ALTER TABLE DeploymentImages 
	RENAME imageID TO image_id;
-- rollback ALTER TABLE DeploymentImages image_id TO imageID;
-- changeset columnRename:14
ALTER TABLE DeploymentImages
	RENAME deploymentID TO deployment_id;
-- rollback ALTER TABLE DeploymentImages RENAME deployment_id TO doploymentID; 


-- changeset columnRename:15
ALTER TABLE CaseImages
	RENAME imageID TO image_id;
-- rollback ALTER TABLE CaseImages image_id TO imageID;
-- changeset columnRename:16
ALTER TABLE CaseImages 
	RENAME caseID TO case_id;
-- rollback ALTER TABLE CaseImages RENAME case_id TO caseID;
-- changeset columnRename:17
ALTER TABLE CaseImages 
	RENAME deviceID TO device_id;
-- rollback ALTER TABLE CaseImages RENAME device_id TO deviceID;

-- changeset columnRename:18
ALTER TABLE Devices
	RENAME lastSEEN TO last_seen;
-- rollback Devices RENAME last_seen TO lastSEEN 

-- changeset columnRename:19
ALTER TABLE Devices 
	ADD COLUMN ip inet;
-- rollback ALTER TABLE Devices REMOVE COLUMN ip;
 
-- changeset columnRename:20
ALTER TABLE PermissionsOnCases
	RENAME deviceID TO device_id;
-- rollback ALTER TABLE PermissionsOnCases RENAME device_id TO deviceID;
-- changeset columnRename:21
ALTER TABLE PermissionsOnCases
	RENAME caseID TO case_id;
-- rollback ALTER TABLE PermissionsOnCases RENAME case_id TO caseID;
-- changeset columnRename:22
ALTER TABLE PermissionsOnCases
	RENAME userID TO user_id;
-- rollback ALTER TABLE PermissionsOnCase RENAME user_id TO userID;
-- changeset columnRename:23
ALTER TABLE PermissionsOnCases
	RENAME addData TO add_data;
-- rollback ALTER TABLE PermissionsOnCase RENAME add_data TO addData;
-- changeset columnRename:24
ALTER TABLE PermissionsOnCases
	RENAME changePermissions TO change_permissions;
-- rollback ALTER TABLE PermissionsOnCase RENAME change_permissions TO changePermissions;

-- changeset columnRename:25
ALTER TABLE PermissionsOnDeployments
	RENAME deploymentID TO deployment_id;
-- rollback ALTER TABLE PermissionsOnDeployments RENAME deployment_id TO deploymentID;
-- changeset columnRename:26
ALTER TABLE PermissionsOnDeployments
	RENAME userID TO user_id;
-- rollback ALTER TABLE PermissionsOnDeployments RENAME user_id TO userID;
-- changeset columnRename:27
ALTER TABLE PermissionsOnDeployments
	RENAME addData TO add_data;
-- rollback ALTER TABLE PermissionsOnDeployments RENAME add_data TO addData;
-- changeset columnRename:28
ALTER TABLE PermissionsOnDeployments
	RENAME changePermissions TO change_permissions;
-- rollback ALTER TABLE PermissionsOnDeployments RENAME change_permissions TO changePermissions;
 