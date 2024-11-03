# [Ruby V] All Kill - 18527 

[문제 링크](https://www.acmicpc.net/problem/18527) 

### 성능 요약

메모리: 110496 KB, 시간: 732 ms

### 분류

조합론, 수학

### 제출 일자

2024년 11월 3일 10:41:58

### 문제 설명

<p>You just finished participating in a programming contest with your friend. Unfortunately, you were unable to All Kill the contest (i.e., solve all of the problems), but you are now wondering if there might be some strategy that would have solved all of the problems.</p>

<p>Solving a problem has two phases, a thinking phase and a coding phase. Your friend is responsible for all the thinking while you are responsible for all the coding.</p>

<p>For each problem, you’ve computed exactly how long it would take for you to code. However, before you can code a problem in contest, your friend needs to get the idea to solve it first. You aren’t sure how to estimate the time when your friend gets a solution idea, so you model it like this: For every problem, your friend gets the idea of how to solve this problem at a uniformly random minute during the contest. Each of these is an independent random variable. You can only code one problem at a time, so there may be several problems queued up at any moment of time. You always prioritize coding the lowest numbered problems first. You do this minute-by-minute, so you will switch to coding a lower-numbered problem if your friend gets the idea for it before you’re finished coding a higher-numbered problem, but you would prefer not to do this. Context switching is an expensive operation, even in the human brain!</p>

<p>The contest strategy can be modeled as follows for each minute:</p>

<ul>
	<li>For each problem that doesn’t yet have an idea, your friend will get the idea to solve it with probability 1/(number of minutes remaining in contest). Your friend can get the idea to solve multiple problems in the same minute.</li>
	<li>Among the problems that still need code time and your friend has gotten the solution idea, you will take the lowest numbered one and spend the next minute coding it (if no problem satisfies the condition, you do nothing at this step).</li>
</ul>

<p>You would like to know the probability of these two events happening together:</p>

<ul>
	<li>Your team finishes coding all the problems by the end of the contest</li>
	<li>For each problem, the time spent coding that problem is a contiguous interval</li>
</ul>

<p>Let p be this probability, n be the number of problems in the contest and t be the number of minutes in the contest. It can be shown that p · t<sup>n</sup> is an integer. Output the value of (p · t<sup>n</sup>) (mod 998,244,353). Note that 998,244,353 is a large prime.</p>

### 입력 

 <p>The first line of input contains two space-separated integers n (1 ≤ n ≤ 10<sup>5</sup>) and t (1 ≤ t ≤ 10<sup>8</sup>), where there were n problems in the contest, and the contest lasted t minutes.</p>

<p>Each of the next n lines contains a single integer x (1 ≤ x ≤ 10<sup>3</sup>). These are the times to code each problem in minutes, in order. It is guaranteed that the sum of these times is less than or equal to t.</p>

### 출력 

 <p>Output a single integer, which is (p · t<sup>n</sup>) (mod 998,244,353), where p is the probability of the two events mentioned above happening together.</p>

