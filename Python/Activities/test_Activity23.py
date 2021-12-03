import pytest


def test_sum(num_list):
    sum = 0
    for num in num_list:
        sum = sum + num
    assert sum == 175