SELECT 
    branchName, COUNT(dateOut)
FROM
    tbl_library_branch lb
        JOIN
    tbl_book_loans bl ON lb.branchId = bl.branchId
GROUP BY branchName;