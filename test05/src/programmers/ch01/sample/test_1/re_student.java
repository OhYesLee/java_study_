package programmers.ch01.sample.test_1;

import java.util.Scanner;

public class re_student {
    public static void main(String[] args) {
        		/*
		 	학생 성적 관리
		 	String student[][];

		 	-------메뉴-------
		 	1. 학생 정보 추가		insert	(ex : 이름, 나이, 영어, 수학)
		 	2. 학생 정보 삭제		delete	빈문자열로 초기화
		 	3. 학생 정보 검색		search	이름으로 검색
		 	4. 학생 정보 수정		update	이름으로 검색 후 수정
		 	5. 학생 정보 모두 출력	findAll

		 	------------
		 	6. 과목의 총점	(ex : 1.영어, 2.수학)
		 	7. 과목의 평균

		 	--------------
		 	8. 성적순으로 정렬해서 출력
		*/
        Scanner sc = new Scanner(System.in);
        String student[][] = new String[20][4];
        // 배열 초기화
        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student[i].length; j++) {
                student[i][j] = "";
            }
        }
        int choice;

        while (true) {
            System.out.println("-------메뉴-------");
            System.out.println("1. 학생 정보 추가");
            System.out.println("2. 학생 정보 삭제");
            System.out.println("3. 학생 정보 검색");
            System.out.println("4. 학생 정보 수정");
            System.out.println("5. 학생 정보 모두 출력");
            System.out.println("6. 과목의 총점");
            System.out.println("7. 과목의 평균");
            System.out.println("8. 성적순으로 정렬해서 출력");
            System.out.println("메뉴 번호를 입력해주세요.");
            System.out.print(">>> ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:        // insert
                    insert(student);
                    break;
                case 2:
                    delete(student);
                    break;
                case 3:
                    find(student);
                    break;
                case 4:
                    update(student);
                    break;
                case 5:
                    findAll(student);
                    break;
                case 6:
                    subjectTotal(student);
                    break;
                case 7:
                    subjectAvg(student);
                    break;
                case 8:
                    sortGrade(student);
                    break;
            }
        }

    }

    // create, insert ...
    static void insert(String student[][]) {
        Scanner sc = new Scanner(System.in);

        // 빈 공간 찾기
        int findIndex = -1;
        for (int i = 0; i < student.length; i++) {
            if (student[i][0].equals("")) {
                findIndex = i;
                break;
            }
        }
        System.out.println("findIndex : " + findIndex);

        // 입력
        System.out.println("이름 : ");
        String name = sc.next();

        System.out.println("나이 : ");
        String age = sc.next();

        System.out.println("영어 : ");
        String eng = sc.next();

        System.out.println("수학 : ");
        String math = sc.next();

        // 할당
        student[findIndex][0] = name;
        student[findIndex][1] = age;
        student[findIndex][2] = eng;
        student[findIndex][3] = math;

        System.out.println("입력 완료 : " + student[findIndex][0]);
    }

    // delete
    static void delete(String student[][]) {
        Scanner sc = new Scanner(System.in);

        // 학생 찾기
        System.out.println("삭제할 학생의 이름을 입력해주세요.");
        String find = sc.next();
        for (int i = 0; i < student.length; i++) {
            if (student[i][0].equals(find)) {
                // 정보 ""로 초기화
                System.out.println(student[i][0] + "학생의 모든 정보가 삭제되었습니다.");
                for (int j = 0; j < student[i].length; j++) {
                    student[i][j] = "";
                }
                break;
            }
        }
    }

    // find
    static void find(String student[][]) {
        Scanner sc = new Scanner(System.in);

        // 학생 찾기
        System.out.println("검색할 학생의 이름을 입력해주세요.");
        String find = sc.next();
        for (int i = 0; i < student.length; i++) {
            if (student[i][0].equals(find)) {
                System.out.println(student[i][0] + "학생의 정보\t나이 : " + student[i][1] + "살, 영어 : " + student[i][2] + "점, 수학 : " + student[i][3] + "점");
                break;
            }
        }
    }

    // update
    static void update(String student[][]) {
        Scanner sc = new Scanner(System.in);
        // 학생 찾기
        System.out.println("수정할 학생의 이름을 입력해주세요.");
        String find = sc.next();
        for (int i = 0; i < student.length; i++) {
            if (student[i][0].equals(find)) {
                System.out.println(student[i][0] + "학생의 정보 수정");
                System.out.println("이름 : ");
                String name = sc.next();

                System.out.println("나이 : ");
                String age = sc.next();

                System.out.println("영어 : ");
                String eng = sc.next();

                System.out.println("수학 : ");
                String math = sc.next();
                student[i][0] = name;
                student[i][1] = age;
                student[i][2] = eng;
                student[i][3] = math;
                break;
            }
        }
    }

    // findAll
    static void findAll(String student[][]) {
        String info[] = {"이름", "나이", "영어", "수학"};
        for (int i = 0; i < student.length; i++) {
            if (!student[i][0].equals("")) {
                System.out.print((i + 1) + "번  ");
                for (int j = 0; j < student[i].length; j++) {
                    System.out.print(info[j] + " : " + student[i][j] + ", ");
                }
                System.out.println();
            }
        }
    }

    // subjectTotal
    static void subjectTotal(String student[][]) {
        double engMax = 0;
        double mathMax = 0;
        double eng, math;
        for (int i = 0; i < student.length; i++) {
            if (!student[i][0].equals("")) {
                eng = Double.parseDouble(student[i][2]);
                engMax += eng;
                math = Double.parseDouble(student[i][3]);
                mathMax += math;
            }
        }
        System.out.println("영어 총점 : " + engMax + ", 수학 총점 : " + mathMax);
    }

    // subjectAvg
    static void subjectAvg(String student[][]) {
        double engTotal = 0;
        double mathTotal = 0;
        double engAvg = 0;
        double mathAvg = 0;
        double eng = 0, math = 0;
        int studentNum = 0;
        for (int i = 0; i < student.length; i++) {
            if (!student[i][0].equals("")) {
                eng = Double.parseDouble(student[i][2]);
                engTotal = engTotal + eng;
                math = Double.parseDouble(student[i][3]);
                mathTotal = mathTotal + math;
                studentNum++;
            }
        }
        System.out.println(studentNum);
        engAvg = engTotal / studentNum;
        mathAvg = mathTotal / studentNum;
        System.out.println("영어 평균 : " + engAvg + ", 수학 평균 : " + mathAvg);
    }

    //sortGrade
    static void sortGrade(String student[][]) {
        Scanner sc = new Scanner(System.in);
        String sort[][] = new String[student.length][student[0].length];
        int num = 0;
        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student[i].length; j++) {
                sort[i][j] = student[i][j];
            }
        }
        System.out.println("오름차순(1) / 내림차순(2) 선택해주세요.");
        int str = sc.nextInt();
        boolean updown = (str == 1) ? true : false;
        System.out.println(updown);
        if (updown) {
            System.out.println("오름차순입니다.");
        } else {
            System.out.println("내림차순입니다.");
        }
        for (int i = 0; i < sort.length; i++) {
            for (int j = 0; j < i; j++) {
                if (!sort[i][0].equals("")) {
                    int max1 = Integer.parseInt(sort[j][2]) + Integer.parseInt(sort[j][3]);
                    int max2 = Integer.parseInt(sort[(j + 1)][2]) + Integer.parseInt(sort[(j + 1)][3]);
                    // 내림차순
                    if (updown) {
                        if (max1 < max2) {
                            String[] temp = sort[j];
                            sort[j] = sort[(j + 1)];
                            sort[(j + 1)] = temp;
                            i--;
                        }
                    }
                    //내림차순
                    else {
                        if (max1 > max2) {
                            String[] temp = sort[j];
                            sort[j] = sort[(j + 1)];
                            sort[(j + 1)] = temp;
                            i--;
                        }
                    }
                }
            }
        }

        String info[] = {"이름", "나이", "영어", "수학"};
        for (int i = 0; i < sort.length; i++) {
            if (!sort[i][0].equals("")) {
                System.out.print((i + 1) + "번\t");
                for (int j = 0; j < sort[i].length; j++) {
                    System.out.print(info[j] + " : " + sort[i][j] + ", ");
                }
                System.out.println();
            }
        }

    }
}

