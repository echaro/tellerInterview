# tellerInterview

My approach in this case was:

with the string I am getting, remove all the dashes, so I have the full string, and covnvert to upperCase.
Then we get the amount of groups we can have based on the parameter k
and we get the remining (it is the start group, which can have few letter less)
from there: if the remaiining group is at least 1, we create the group in the first part, and append a -

and then, with the remaning characteres, we get the next k elements according the index, and point it to the next index and append the -

finally we just return the stringBuilder.to String

Why using stringBuilder: because it is mutable, 
