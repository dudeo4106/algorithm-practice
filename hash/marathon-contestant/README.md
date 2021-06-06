# The contestant that did not complete the race
- References① : https://programmers.co.kr/learn/courses/30/lessons/42576
- References② : https://hsin.hr/coci/archive/2014_2015/contest2_tasks.pdf.

# Question
Many marathon runners participated in the marathon.<br />
All but one athlete completed the marathon.<br />
When given an array of participants with the names of the runners who participated in the marathon and an array completion with the names of the runners who finished, 
write a solution function to return the names of the runners who did not finish.

# Condition
- The number of runners who participated in the marathon race is more than one and less than 100,000.

- The length of the completion is 1 less than the length of the partition.

- Participants' names are composed of one to 20 lowercase alphabetic characters.

- Participants may have the same name.

# I/O Sample

|participant|completion|return|
|------|---|---|
|["leo", "kiki", "eden"]|["eden", "kiki"]|"leo"|
|["marina", "josipa", "nikola", "vinko", "filipa"]]|["josipa", "filipa", "marina", "nikola"]|"vinko"|
|["mislav", "stanko", "mislav", "ana"]|["stanko", "ana", "mislav"]|"mislav"|