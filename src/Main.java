public class Main {
    public static void main(String[] args) {
/*
   ��������� ������ ������ � ���������, ��������� ��������� ������.
   ��� ����� �������
   �������� � ������� ������ ��������� ������ �����. ��� ��� ���������� � ������� ������ ���������� ������� �� X:
   x     x
    x   x
     x x
      x
     x x
    x   x
   x     x
*/
        char[][] ltFigure = {
                {'X', ' ', ' ', ' ', ' ', ' ', 'X' },
                {' ', 'X', ' ', ' ', ' ', 'X', ' ' },
                {' ', ' ', 'X', ' ', 'X', ' ', ' ' },
                {' ', ' ', ' ', 'X', ' ', ' ', ' ' },
                {' ', ' ', 'X', ' ', 'X', ' ', ' ' },
                {' ', 'X', ' ', ' ', ' ', 'X', ' ' },
                {'X', ' ', ' ', ' ', ' ', ' ', 'X' },
        };

        for (int i = 0; i < ltFigure.length; i++) {
            for (int j = 0; j < ltFigure[i].length; j++) {
                if (j == ltFigure[i].length - 1) {
                    System.out.println(ltFigure[i][j]);
                } else {
                    System.out.print(ltFigure[i][j]);
                }
            }
        }
    }
}