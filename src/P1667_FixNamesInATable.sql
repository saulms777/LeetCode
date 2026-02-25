SELECT
    user_id,
    CONCAT(
            UPPER(LEFT(name, 1)),
            LOWER(SUBSTR(name, 2, CHAR_LENGTH(name) - 1))
    ) name
FROM Users
ORDER BY user_id;