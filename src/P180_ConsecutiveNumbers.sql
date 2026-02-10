SELECT DISTINCT L1.num ConsecutiveNums
FROM Logs L1, Logs L2, Logs L3
WHERE L1.id + 1 = L2.id AND L1.num = L2.num
    AND L1.id + 2 = L3.id AND L1.num = L3.num;