
CREATE PROCEDURE Person.up_getNamesByType
	@Type nchar(2) = 'EM',
	@FirstName nvarchar(50)=NULL
AS

BEGIN

SET NOCOUNT ON;
SELECT FirstName FROM Person.Person
WHERE PersonType = @Type AND (@Firstname is NULL OR Firstname =@FirstName)

END

GO

EXEC Person.up_getNamesByType @Type ='SC'