package etc;

import java.util.*;

/**
 * 리눅스 CMD 구현 (mkdir, cp, rm)
 */
public class test3 {
    private final static String MKDIR = "mkdir";
    private final static String CP = "cp";
    private final static String RM = "rm";
    private final static String ROOT = "/";

    /**
     * 디렉토리 추가
     * - 한 디렉토리 안에 같은 이름의 디렉토리가 2개 이상 있는 경우는 없음, 잘못된 경로가 주어지는 경우 없음
     * @param directoryList
     * @param targetDirectory
     */
    private static void addDirectory(List<String> directoryList, String targetDirectory) {
        // 디렉토리 길이는 1이상 20이하
        if (directoryList.size() > 20) {
            return;
        }
        // 디렉토리 이름 길이는 1이상 10이하
        if (targetDirectory.length() < 1 || targetDirectory.length() > 10) {
            return;
        }
        directoryList.add(targetDirectory);
    }
    /**
     * 디렉토리 삭제
     * - "rm /" 명령은 주어지지 않음
     * - 존재하지 않거나 잘못된 경우의 디렉토리를 삭제하는 경우 없음
     * @param directoryList
     * @param targetDirectory
     */
    private static void removeDirectory(List<String> directoryList, String targetDirectory) {
        Iterator iterator = directoryList.iterator();

        while (iterator.hasNext()) {
            String currentDirectory = iterator.next().toString(); // 배열 내 현재 element 디렉토리
            if (currentDirectory.startsWith(targetDirectory)) { // 하위 디렉토리 모두 삭제
                iterator.remove();
            }
        }
    }
    /**
     * 디렉토리 복사
     * - 자기 자신의 하위 디렉토리에 복사하는 명령은 주어지지 않는다.
     * - 복사하는 위치에 이름이 동일한 다른 디렉토리가 이미 있는 경우는 주어지지 않는다
     * @param directoryList
     * @param targetDirectory 이동할 디렉토리
     * @param moveBaseDirectory 이동 대상 디렉토리
     */
    private static void copyDirectory(List<String> directoryList, String targetDirectory, String moveBaseDirectory) {
        int targetIdx = getIndexOfMaxPathDirectory(directoryList, targetDirectory);
        String directoryPath = directoryList.get(targetIdx); // moveDirectory 시작 위치 구하기
        String[] pointDirectory = targetDirectory.split(ROOT); // 이동 시키려는 디렉토리 경로 분리 (예 : /a/b -> a, b)
        String moveDirectory = ROOT + pointDirectory[pointDirectory.length - 1]; // 이동 시키려는 디렉토리의 마지막 디렉토리 추출 (예 : /a/b -> /b)
        int startIdx = directoryList.get(targetIdx).indexOf(moveDirectory); // pointDirectory 부터 문자열 재추출 (예 : /a/b/c -> 2)
        String directoryFullPath = directoryPath.substring(startIdx); // 추가해야 할 디렉토리 풀 경로
        String[] directoryArr = directoryFullPath.split(ROOT);
        StringBuilder addDir = new StringBuilder();

        if (!moveBaseDirectory.equals(ROOT)) { // 이동하려는 디렉토리가 '/' 인 경우, 문자열 추가 없음
            addDir.append(moveBaseDirectory); // 이동하려는 디렉토리가 '/' 가 아닌 경우, 이동 대상 디렉토리 문자열 추가
        }

        for (int i = 1; i < directoryArr.length; i++) { // 이동할 경로에 이동 시킬 디렉토리 추가
            String dir = ROOT + directoryArr[i];
            directoryList.add(addDir.append(dir).toString());
        }
    }
    /**
     * 가장 긴 디렉토리 경로의 element 시작 위치 return
     * @param directoryList
     * @param targetDirectory
     * @return
     */
    private static int getIndexOfMaxPathDirectory(List<String> directoryList, String targetDirectory) {
        int targetIdx = 0;
        int count = 0;
        Iterator iterator = directoryList.iterator();

        while (iterator.hasNext()) {
            String currentDirectory = iterator.next().toString(); // 배열 내 현재 element 디렉토리
            if (currentDirectory.startsWith(targetDirectory)) { // targetDirectory 경로로 시작
                if (!currentDirectory.equals(targetDirectory)) { // 같은 경우, 마지막 디렉토리만 이동
                    // 가장 긴 경로의 디렉토리 index 체크
                    targetIdx = count;
                }
            }
            count++;
        }

        return targetIdx;
    }

    /**
     * Linux - Command 실행
     * @param directory
     * @param commands
     * @return
     */
    private static String[] solution(String[] directory, String[] commands) {
        List<String> directoryList = new ArrayList<>(Arrays.asList(directory));

        // command 동작
        for (String command : commands) {
            String[] operators = command.split(" ");
            String operator = operators[0]; // 커맨드 operation
            String targetDirectory = operators[1]; // 커맨드 directory

            switch (operator) {
                case MKDIR:
                    addDirectory(directoryList, targetDirectory); // 디렉토리 생성
                    break;
                case CP:
                    copyDirectory(directoryList, targetDirectory, operators[2]); // 디렉토리 복사
                    break;
                case RM:
                    removeDirectory(directoryList, targetDirectory); // 디렉토리 삭제
                    break;
                default:
            }
        }

        directoryList.sort(Comparator.naturalOrder()); // 재정렬

        return new String[]{ directoryList.toString() };
    }
    public static void main(String[] args) {
        String[] directory = { "/", "/hello", "/hello/tmp", "/root", "/root/abcd", "/root/abcd/etc", "/root/abcd/hello" };
        String[] command = { "mkdir /root/tmp", "cp /hello /root/tmp", "rm /hello" };
        System.out.println(Arrays.toString(solution(directory, command)));
        // [ /, /root, /root/abcd, /root/abcd/etc, /root/abcd/hello, /root/tmp, /root/tmp/hello, /root/tmp/hello/tmp ]

        String[] directory2 = { "/" };
        String[] command2 = { "mkdir /a", "mkdir /a/b", "mkdir /a/b/c", "cp /a/b /", "rm /a/b/c"};
        System.out.println(Arrays.toString(solution(directory2, command2)));
        // [ /, /a, /a/b, /b, /b/c ]

        String[] directory3 = { "/" };
        String[] command3 = { "mkdir /a", "mkdir /a/b", "mkdir /a/b/c", "rm /a/b/c"};
        System.out.println(Arrays.toString(solution(directory3, command3)));
        // [ /, /a, /a/b ]
    }
}
