# COMP5111 (Spring 2021) Assignment 2

## Task1 Test Case Generation with Evosuite

### Command
java -jar .\lib\evosuite-1.0.6.jar -projectCP .\raw-classes -prefix comp5111.assignment.cut -Dcriterion line:branch -Dalgorithm=MIO -Dmax_initial_tests=10 -Dstopping_condition=TIMEDELTA -Dstrategy=RANDOM -Drandom_seed=1
java -jar .\lib\evosuite-1.0.6.jar -projectCP .\raw-classes -prefix comp5111.assignment.cut -Dcriterion line:branch -Dalgorithm=MIO -Dmax_initial_tests=10 -Dstopping_condition=TIMEDELTA -Dstrategy=RANDOM -Drandom_seed=2
java -jar .\lib\evosuite-1.0.6.jar -projectCP .\raw-classes -prefix comp5111.assignment.cut -Dcriterion line:branch -Dalgorithm=MIO -Dmax_initial_tests=10 -Dstopping_condition=TIMEDELTA -Dstrategy=RANDOM -Drandom_seed=3
java -jar .\lib\evosuite-1.0.6.jar -projectCP .\raw-classes -prefix comp5111.assignment.cut -Dcriterion line:branch -Dalgorithm=MIO -Dmax_initial_tests=10 -Dstopping_condition=TIMEDELTA -Dstrategy=RANDOM -Drandom_seed=4
java -jar .\lib\evosuite-1.0.6.jar -projectCP .\raw-classes -prefix comp5111.assignment.cut -Dcriterion line:branch -Dalgorithm=MIO -Dmax_initial_tests=10 -Dstopping_condition=TIMEDELTA -Dstrategy=RANDOM -Drandom_seed=5