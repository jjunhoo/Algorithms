-- 1. 1개월 이내에 가입한 유저들의 최근 구매 이력을 유저당 5개씩 출력
SET @currcount = NULL, @currvalue = NULL;

SELECT result.purchase_id, result.user_id, result.created_at, result.updated_at
  FROM (
        SELECT x.*,
              @currcount := IF(@currvalue = x.user_id, @currcount + 1, 1) AS rank,
              @currvalue := x.user_id AS tmp
          FROM (
                SELECT *
                  FROM purchase
                 WHERE purchase.purchase_id IN (
                        SELECT purchase.purchase_id
                          FROM user
                         INNER JOIN purchase
                            ON user.user_id = purchase.user_id
                         WHERE user.created_at BETWEEN DATE_ADD(NOW(), INTERVAL -1 MONTH) AND NOW())
                  ) x
          ) result
WHERE result.rank < 6;

-- 2. 필요한 인덱스의 구성 정보
CREATE INDEX userid_idx ON purchase (user_id);