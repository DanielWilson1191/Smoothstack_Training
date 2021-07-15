SELECT 
    name, address, COUNT(dateOut) AS cnt
FROM
    tbl_borrower
        LEFT JOIN
    tbl_book_loans ON tbl_borrower.cardNo = tbl_book_loans.cardNo
GROUP BY name
HAVING cnt > 5;