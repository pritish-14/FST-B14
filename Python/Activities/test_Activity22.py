import pytest

def test_addition():
    num1 = 10
    num2 = 15

    sum = num1+ num2
    assert sum == 25

def test_substraction():
    num1 = 50
    num2 = 35

    sub = num1 - num2
    assert sub == 15

@pytest.mark.activity
def test_multiplications():
    num1 = 5
    num2 = 4

    mul = num1 * num2
    assert mul == 20

@pytest.mark.activity
def test_Divisions():
    num1 = 10
    num2 = 2

    quot = num1 / num2
    assert quot == 10