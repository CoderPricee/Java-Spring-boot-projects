GO
CREATE PROCEDURE Person.up_getNamesByTypeFirstName
	@Type nchar(2) = 'EM'
AS
SELECT FirstName FROM Person.Person WHERE PersonType = @Type
GO

EXEC Person.up_getNamesByTypeFirstName @Type ='SC'