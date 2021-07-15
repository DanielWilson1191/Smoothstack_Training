SELECT 
    branchName, noOfCopies, title
FROM
    tbl_library_branch lb
        JOIN
    tbl_book_copies bc ON lb.branchId = bc.branchId
        JOIN
    tbl_book bk ON bc.bookId = bk.bookId
WHERE
    title = 'The Lost Tribe'
        AND branchName = 'Sharpstown';