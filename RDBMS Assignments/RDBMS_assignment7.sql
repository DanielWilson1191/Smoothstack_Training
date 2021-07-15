SELECT 
    title, noOfCopies
FROM
    tbl_author
        JOIN
    tbl_book ON tbl_author.authorId = tbl_book.authId
        JOIN
    tbl_book_copies ON tbl_book.bookId = tbl_book_copies.bookId
        JOIN
    tbl_library_branch ON tbl_book_copies.branchId = tbl_library_branch.branchId
WHERE
    authorName = 'Stephen King'
        AND branchName = 'Central';