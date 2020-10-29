import re

s = "date: 2017/10/15"
pat = r"(\d{4})/(\d{1,2})/(\d{1,2})"
g = re.search(pat, s)
print( g.groups() )
print( g.group() )