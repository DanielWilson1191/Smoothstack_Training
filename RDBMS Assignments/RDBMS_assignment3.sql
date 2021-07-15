SELECT 
    name, dateOut
FROM
    tbl_borrower
        LEFT JOIN
    tbl_book_loans ON tbl_borrower.cardNo = tbl_book_loans.cardNo
WHERE
    bookId IS NULL;