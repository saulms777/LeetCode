SELECT
    S.student_id,
    S.student_name,
    U.subject_name,
    COALESCE(E.attended, 0) attended_exams
FROM Students S CROSS JOIN Subjects U
    LEFT JOIN (
        SELECT *, COUNT(*) attended
        FROM Examinations
        GROUP BY student_id, subject_name
    ) E USING (student_id, subject_name)
ORDER BY student_id, subject_name;