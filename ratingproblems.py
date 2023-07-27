numJudge, votedJudge = map(int, input().split())
sum_ratings = 0
for i in range(votedJudge):
    sum_ratings += int(input())
min_rating = (sum_ratings - 3 * (numJudge - votedJudge)) / numJudge
max_rating = (sum_ratings + 3 * (numJudge - votedJudge)) / numJudge
print("{:.4f} {:.4f}".format(min_rating, max_rating))