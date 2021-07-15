SELECT 
    title, name, address
FROM
    tbl_book_loans bl
        JOIN
    tbl_borrower bwr ON bl.cardNo = bwr.cardNo
        JOIN
    tbl_book bk ON bk.bookId = bl.bookId
        JOIN
    tbl_library_branch lb ON lb.branchId = bl.branchId
WHERE
    dueDate LIKE CONCAT(CURRENT_DATE(), '%')
        AND branchName = 'Sharpstown';