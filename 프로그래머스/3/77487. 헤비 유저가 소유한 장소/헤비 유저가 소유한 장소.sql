SELECT 
    P.ID, 
    P.NAME, 
    P.HOST_ID
FROM 
    PLACES P
WHERE 
    P.HOST_ID IN (
        SELECT 
            HOST_ID
        FROM 
            PLACES
        GROUP BY 
            HOST_ID
        HAVING 
            COUNT(ID) >= 2)
ORDER BY 
    P.ID;