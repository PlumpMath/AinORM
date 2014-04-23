--liquibase formatted sql

-- changeset tableRename:1
ALTER TABLE DeploymentImages
	RENAME TO Deployment_images;
-- rollback ALTER TABLE deployment_images RENAME TO DeploymentImages;

-- changeset tableRename:2
ALTER TABLE CaseImages
	RENAME TO Case_images;
-- rollback ALTER TABLE Case_images RENAME TO CaseImages;

-- changeset tableRename:3
ALTER TABLE CaseImages
	RENAME TO Case_images;
-- rollback ALTER TABLE Case_Images RENAME TO CaseImages;

-- changeset tableRename:4
ALTER TABLE PermissionsOnCases
	RENAME TO Permissions_on_cases;
-- rollback ALTER TABLE Permissions_on_cases RENAME TO PermissionsOnCases;

-- changeset tableRename:5
ALTER TABLE PermissionsOnDeployments
	RENAME TO Permissions_on_deployments
-- rollback ALTER TABLE Permissions_on_deployments RENAME TO PermissionsOnDeployments; 