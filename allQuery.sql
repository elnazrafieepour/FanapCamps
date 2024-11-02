
--Query1:
SELECT * FROM public."user" WHERE first_name ILIKE '%s' And last_name ILKIE '%e';

--Query2:
SELECT   
    c.NAME,  
    STRING_AGG(p.NAME, ', ') AS product_list
FROM   
    company c  
LEFT JOIN   
    product_company pc ON c.id = pc.company_id  
LEFT JOIN   
    product p ON pc.product_id = p.id  
GROUP BY   
     c.NAME  
ORDER BY   
    COUNT(p.id) DESC, c.id ASC;
    

--problem:
--Query3:
SELECT 
    u.username, 
    a.city, 
    a.country, 
    a.code
FROM 
    USER u
JOIN 
    address a ON u.address_id = a.id
    
    

--Query4:
SELECT   
    p.NAME AS product_name,  
    p.price AS product_price,  
    p.category AS product_category,  
    c.NAME AS company_name,  
    a.city AS company_city,  
    CASE   
        WHEN p.price > avg_table.avg_price THEN 'expensive'  
        ELSE 'not expensive'  
    END AS price_category  
FROM product p  
LEFT JOIN
     product_company pc ON p.id = pc.product_id
LEFT JOIN
     company c ON pc.company_id = c.id
LEFT JOIN
     address a ON c.address_id = a.id 
CROSS JOIN (  
    SELECT AVG(price) AS avg_price FROM product  
) AS avg_table  
ORDER BY p.id;